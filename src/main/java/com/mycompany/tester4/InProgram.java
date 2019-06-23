/*
 * Copyright 2019 amr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycompany.tester4;


import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InProgram {

    
    private String program;
    private String[] chrome;
    private String[] firefox;
    private String[] calculator;
    private String[] netbeans;
    private HashSet<String> cs;
    private Runtime rn;

    public InProgram() {
        try {
            rn = Runtime.getRuntime();
        } catch (Exception e) {
        }
        String[] c = {"open new tab", "close tab", "open new window", "close window", "open incognito"};
        chrome = c;
        String[] f = {"open new tab", "close tab", "open new window", "close window", "open private"};
        firefox = f;
        String[] n = {"create new project", "open existing project", "save all", "save"};
        netbeans = n;
        String[] cc = {"plus",".", "point", "decimal", "octal", "hex", "binary", "advanced mode", "basic mode", "a", "b", "c", "d", "e", "f", "programming mode", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "=", "equals", "equal", "open bracket", "close bracket"};
        calculator = cc;

        cs = new HashSet<>(Arrays.asList(cc));
    }

    public void setProgram(String program) {
        this.program = program;
    }

    boolean isCmd(String s, String p) {
        if (p.equals("chrome")) {
            for (int i = 0; i < chrome.length; ++i) {
                if (s.equals(chrome[i])) {
                    return true;
                }
            }
        }

        if (p.equals("netbeans")) {
            for (int i = 0; i < netbeans.length; ++i) {
                if (s.equals(netbeans[i])) {
                    return true;
                }
            }
        }
        if (p.equals("firefox")) {
            for (int i = 0; i < firefox.length; ++i) {
                if (s.equals(firefox[i])) {
                    return true;
                }
            }
        }
        if (p.equals("calculator")) {

            for (int i = 0; i < calculator.length; ++i) {
                if (s.equals(calculator[i])) {
                    return true;
                }
            }
            try {
            rn = Runtime.getRuntime();
		
		    		String ts=s.replace("0","").replace("1","").replace("2","").replace("3","");
					ts=ts.replace("4","").replace("5","").replace("6","").replace("7","");
					ts=ts.replace("8","").replace("9","").replace(".","").replace("/","");
					ts=ts.replace("*","").replace("+","").replace("-","").replace(" ","");
                    if(ts.equals(""))
						rn.exec("xdotool type "+s.replace(" ",""));

						
                }
             catch (Exception ex) {
                return false;
            }
        }

        return false;
    }

    public boolean exe(String s, String p) {

        program = p;

        try {
            if (program.equals("chrome")) {
                if (s.equals(chrome[0])) {
                    rn.exec("xdotool key ctrl+t");
                }
                if (s.equals(chrome[1])) {
                    rn.exec("xdotool key ctrl+w");
                }
                if (s.equals(chrome[2])) {
                    rn.exec("xdotool key ctrl+n");
                }
                if (s.equals(chrome[3])) {
                    rn.exec("xdotool key alt+F4");
                }
                if (s.equals(chrome[4])) {
                    rn.exec("xdotool key ctrl+Shift+n");
                }
            }

            if (program.equals("firefox")) {
                if (s.equals(firefox[0])) {
                    rn.exec("xdotool key ctrl+t");
                }
                if (s.equals(firefox[1])) {
                    rn.exec("xdotool key ctrl+w");
                }
                if (s.equals(firefox[2])) {
                    rn.exec("xdotool key ctrl+n");
                }
                if (s.equals(firefox[3])) {
                    rn.exec("xdotool key alt+F4");
                }
                if (s.equals(firefox[4])) {
                    rn.exec("xdotool key ctrl+Shift+p");
                }

            }
            if (program.equals("calculator")) {
                if (s.contains("plus")) {
                    rn.exec("xdotool key plus");
                } else if (s.contains(".") || s.contains("point")) {
                    rn.exec("xdotool key period");
                } else if (s.contains("programming mode")) {
                    rn.exec("xdotool key alt+p");
                } else if (s.contains("advanced mode")) {
                    rn.exec("xdotool key alt+a");
                } else if (s.contains("basic mode")) {
                    rn.exec("xdotool key alt+b");
                } else if (s.contains("to hex")) {
                    rn.exec("xdotool key ctrl+h");
                } else if (s.contains("to decimal")) {
                    rn.exec("xdotool key ctrl+d");
                } else if (s.contains("to octal")) {
                    rn.exec("xdotool key ctrl+o");
                } else if (s.contains("to binary")) {
                    rn.exec("xdotool key ctrl+b");
                } else if (s.contains("-")) {
                    rn.exec("xdotool key minus");
                } else if (s.contains("+")) {
                    rn.exec("xdotool key plus");
                } else if (s.contains("*")) {
                    rn.exec("xdotool key asterisk");
                } else if (s.contains("/")) {
                    rn.exec("xdotool key slash");
                } else if (s.contains("=") || s.contains("equal")) {
                    rn.exec("xdotool key Return");
                } else if (s.contains("open bracket")) {
                    rn.exec("xdotool key parenleft");
                } else if (s.contains("close bracket")) {
                    rn.exec("xdotool key parenright");
                } else if (cs.contains(s)) {
                    rn.exec("xdotool key " + s);
                    res();
                }  
                if ("=+-*/equals".contains(s)) {
                    res();
                }
            }

            if (program.equals("netbeans")) {
                if (s.equals(netbeans[0])) {
                    rn.exec("xdotool key ctrl+Shift+n Return Return");
                }
                if (s.equals(netbeans[1])) {
                    rn.exec("xdotool key ctrl+Shift+n Return Return");
                }
                if (s.equals(netbeans[2])) {
                    rn.exec("xdotool key ctrl+Shift+s");
                }
                if (s.equals(netbeans[3])) {
                    rn.exec("xdotool key ctrl+s");
                }
                if (s.equals(netbeans[4])) {
                    rn.exec("xdotool key ctrl+Shift+s");
                    rn.exec("xdotool key alt+F4");
                }
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public void res() {
        try {
		
            rn = Runtime.getRuntime();
            rn.exec("sleep 0.1 && xdotool key ctrl+a ctrl+c");
            rn.exec("espeak " + GetStringFromClipboard());
        } catch (Exception e) {
        }
    }

    public void setClipboard(String s) {
        StringSelection data = new StringSelection(s);
        Clipboard cb = Toolkit.getDefaultToolkit()
                .getSystemClipboard();
        cb.setContents(data, data);

    }

    public String GetStringFromClipboard() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result = "";
        try {
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (Exception ex) {
        }
        return result;
    }

}
