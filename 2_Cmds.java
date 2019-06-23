
package com.mycompany.tester4;

import javax.mail.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//import com.restfb.DefaultFacebookClient;
//import com.restfb.FacebookClient;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.lang.Math.sqrt;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
//import sun.awt.DesktopBrowse;

import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.TwitterException;
import twitter4j.conf.ConfigurationBuilder;

public class Cmds
{

    String l = "";
    Boolean b = false;
    String st;
    Boolean bool = false;
    LinkedList<String> arr;
    static ArrayList<String> al;
    static ArrayList<String> all;
    static ArrayList<ArrayList<String>> col;
    static ArrayList<String> row;
    static String output = "";
    String out;
    String str = "";
    ArrayList<String> applist;
    HashSet<String> hs;
    Runtime n;
    static ArrayList<String> emails = new ArrayList<>();
    static boolean e = false;
    static String too = "";
    Desktop desktop;
    LocalDateTime date;
    LocalTime time;
    DateTimeFormatter t;
    Boolean i = false;
    static String to = "";
    static String subject = "";
    static String content = "";
    String username = "";
    String password = "";

    public Cmds()
    {
        time = LocalTime.now();
        date = LocalDateTime.now();
        t = DateTimeFormatter.ofPattern("HH mm ss");
        desktop = java.awt.Desktop.getDesktop();
        hs = new HashSet<>();
        st = "";
        output = "";
        out = "";
        applist = new ArrayList<>();
        fill_list();
        arr = new LinkedList<String>();
        n = Runtime.getRuntime();
    }

    public void fill_list()
    {
        //  a.exec("dpkg -l > aa");
        //a.exec("awk '{print $2 }' aa > newpack.txt");

        String currentS = "";
        String nextinput = "";
        try
        {
            currentS = new java.io.File(".").getCanonicalPath();
        }
        catch (Exception ex)
        {
        }
        try
        {
            File f = new File(currentS + "/newpack.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine())
            {

                nextinput = scan.nextLine();
                //applist.add(nextinput);
                hs.add(nextinput);
            }
        }
        catch (Exception ex)
        {
        }

    }

    public void res(String outputt)
    {

        Runtime a = Runtime.getRuntime();

        out = outputt.trim().toLowerCase();

        Boolean i = false;

        String prog = "-";
        out = out.toLowerCase();
        try
        {

            prog = a("xdotool getwindowfocus getwindowname").toLowerCase();
            prog = prog.toLowerCase();
            if (prog.contains("firefox"))
            {
                prog = "firefox";
            }
            else if (prog.contains("chrome"))
            {
                prog = "chrome";
            }
            else if (prog.contains("netbeans"))
            {
                prog = "netbeans";
            }
            else if (prog.contains("calculator"))
            {
                prog = "calculator";
            }
            else if (prog.contains("thunderbird"))
            {
                prog = "thunderbird";
            }
            else
            {
                prog = "-";
            }
        }
        catch (Exception ex)
        {
        }
        InProgram ip = new InProgram();
        ip.setProgram(prog);
        //String[] abc = " aa  aa ".split(" ");
        //System.out.println("*********88" + out);

        if (!i & out.equals("just exit"))
        {
            i = true;
            try
            {
                n.exec("xdotool key alt+F4");
            }
            catch (Exception ex)
            {
            }
        }
        boolean ext = true;
        if (out.split(" ").length <= 1)
        {
            ext = false;
        }
        out = out.toLowerCase();

        if (!i && out.toLowerCase().contains("in "))
        {
            i = true;
            try
            {

                int ii = -1;
                String te = a("xdotool search --name " + prog);
                if (te.equals(""))
                {
                    te = "-1";
                }
                ii = Integer.parseInt(te.split("\n")[0]);
                System.out.println(ii);
                if (ii == -1)
                {
                    n.exec("espeak -f notO.txt");
                    System.out.println("fff");
                }
                if (out.toLowerCase().contains("chrome"))
                {
                    n.exec("wmctrl -a chrome");
                }
                else if (out.toLowerCase().contains("firefox"))
                {
                    n.exec("wmctrl -a firefox");
                }
                else if (out.toLowerCase().contains("netbeans"))
                {
                    n.exec("wmctrl -a netbeans");
                }
                else if (out.toLowerCase().contains("calculator"))
                {
                    n.exec("wmctrl -a calculator");
                }
                //r.exec("sudo wmctrl -a 'Google Chrome'");
                //r.exec(cmd);
            }
            catch (Exception e)
            {
                System.err.println(e.toString());
            }
        }
        if (!i && !prog.equals("-") && ip.isCmd(out.toLowerCase(), prog))
        {
            System.out.println("Done!");
            try
            {
                if (ip.exe(out.toLowerCase(), prog))
                {
                    i = true;
                }
            }
            catch (Exception exs)
            {
            }
        }

        if (!i && out.contains("write ") && out.length() >= 6)
        {
            i = true;
            String te = out.substring(6);
            setClipboard(te);
            try
            {
                n.exec("xdotool key ctrl+v space");
            }
            catch (Exception e)
            {
            }

        }
        if (!i && out.contains("read"))
        {
            readthis();
            return;
        }

        if (out.equals("james check my emails") && !i)
        {
            chkemails();
            return;
        }
        if (e && out.equals("james show my emails"))
        {
            shwemails();
            return;
        }
        /*
        if (out.contains("james send"))
        {
            sendemail();
            return;

        }
         */

        try
        {
            n.exec("echo 144123 | sudo -S updatedb");
        }
        catch (Exception ex)
        {
        }

        if (out.equals("james exit") && !i)
        {

            System.exit(0);

        }
        if (out.equals("james shutdown computer") && !i)
        {
            okshutdown();
            return;
        }
        if (out.equals("james restart computer") && !i)
        {
            okrestart();
            return;
        }

        if (out.equals("james what is the time") || out.toLowerCase().equals("james what's the time") && !i)
        {
            oktime();
            return;
        }

        if ((out.equals("james what is the date") || out.toLowerCase().equals("james what's the date")) && !i)
        {
            okdate();
            return;
        }

        if (out.contains("james post") && !i)
        {
            okpost();
            return;
        }
        if (out.contains("james convert") && !i)
        {

            okconvert();
            return;
        }

        if (out.contains("james play") && !i) // && out.toLowerCase().contains("power point"))
        {
            oksong();
            return;
        }
        if (out.contains("james document") && !i) // && out.toLowerCase().contains("power point"))
        {
            okdoc();
            return;
        }

        if (out.contains("james create file") && !i)
        {
            okfile();
            return;
        }

        if (out.contains("james create folder") && !i)
        {
            okfolder();
            return;
        }

        if (out.contains("james") && out.toLowerCase().contains("copy") && out.toLowerCase().contains("to") && !i)
        {
            okcopy();
            return;

        }

        if (out.contains("james") && out.toLowerCase().contains("move") && out.toLowerCase().contains("to") && !i)
        {
            okmove();
            return;
        }
        if (out.contains("james remove") && !i)
        {
            //james remove filename.
            okremove();
            return;
        }

        if ((out.equals("james first option") || out.toLowerCase().equals("james second option")) && !i)
        {
            okoption();
            return;

        }

        if (out.contains("james search on youtube"))
        {
            youtubesearch();
            return;
        }

        if (out.equals("james close browser") && !i)
        {
            closeBrowser();
            return;
        }

        if (out.equals("james new tab") && !i)
        {
            try
            {
                n.exec("firefox -new-tab");
            }
            catch (Exception e)
            {
            }
            return;
        }
        if (out.contains("james close ") && !i)
        {
            okclose();
            return;
        }
        if (out.contains("james calculate"))
        {
            okcalc();
            return;
        }
        if (out.contains("james open") && !i)
        {
            okopen();
            return;
        }
        if (out.contains("james search ") && !i)
        {
            oksearch();
            return;
        }
        if (out.contains("james software ") && !i)
        {
            oksoft();
            return;
        }
        if (out.toLowerCase().equals("james send email"))
        {

            //send = true;
            s();
            return;
        }
        if (out.toLowerCase().contains("send to "))
        {
            to = out.toLowerCase().substring(7, out.length());
            ss();
            return;

        }
        if (out.toLowerCase().contains("subject is "))
        {
            i = true;
            subject = out.toLowerCase().substring(10, out.length());
            sss();
            return;
        }
        if (out.toLowerCase().contains("content is "))
        {
            i = true;
            content = out.toLowerCase().substring(10, out.length());
            ssss();
            return;
        }
        if (out.contains("james ") && out.split(" ").length > 1)
        {
            okrun();
            return;
        }

    }

    public int calculator(String a)
    {
        //System.out.println(a);
        ArrayList<String> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(a, " ");

        while (st.hasMoreTokens())
        {
            arr.add(st.nextToken());
        }
        //String []ar=a.split("[*-+/ ]");
        // System.out.println(ar.toString());

        int num1 = Integer.parseInt(arr.get(arr.size() - 3));
        int num2 = Integer.parseInt(arr.get(arr.size() - 1));

        char c = arr.get(arr.size() - 2).charAt(0);
        //System.out.println(num1+" "+ c+ " "+num2);
        String p = arr.get(arr.size() - 2);
        String sq = arr.get(arr.size() - 2) + arr.get(arr.size() - 3);

        int answer = 0;
        if (c == '+')
        {
            answer = num1 + num2;
        }
        else if (c == '-')
        {
            answer = num1 - num2;
        }
        else if (c == '/')
        {
            answer = num1 / num2;
        }
        else if (c == 'x')
        {
            answer = num1 * num2;
        }
        else if (c == '%')
        {
            answer = num1 % num2;
        }
        else if (p.toLowerCase().equals("power"))
        {
            answer = (int) Math.pow(num1, num2);
        }
        else if (sq.toLowerCase().equals("squareroot"))
        {
            answer = (int) sqrt(num2);
        }

        return answer;
    }

    public String a(String as)
    {
        String w = "";
        try
        {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(as);
            Reader in = new InputStreamReader(p.getInputStream());
            in = new BufferedReader(in);
            char[] buffer = new char[1024];
            int len = in.read(buffer);
            while (len != -1)
            {
                String s = new String(buffer, 0, len);
                w = s;//  System.out.println(s);
                len = in.read(buffer);
            }
        }
        catch (IOException ex)
        {
        }
        return w;
    }

    public void setClipboard(String sttt)
    {
        StringSelection data = new StringSelection(sttt);
        Clipboard cb = Toolkit.getDefaultToolkit()
                       .getSystemClipboard();
        cb.setContents(data, data);

    }

    public String GetStringFromClipboard()
    {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result = "";
        try
        {
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
        }
        catch (Exception ex)
        {
        }
        return result;
    }

    public void sendmail(String t, String s, String m)
    {
        try
        {
            ArrayList<String> ll = new ArrayList<>();
            File ff = new File("emails.txt");
            Scanner scan1 = new Scanner(ff);
            while (scan1.hasNextLine())
            {
                ll.add(scan1.nextLine());
            }

            for (int i = 0; i < ll.size(); i += 2)
            {
                if (ll.get(i).toLowerCase().trim().equals(t.toLowerCase().trim()))
                {
                    too = ll.get(i + 1);
                    //System.out.println(ll.get(i+1));
                }
            }
            // System.out.println(too);
            ArrayList<String> l = new ArrayList<>();
            File f = new File("login.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine())
            {
                l.add(scan.nextLine());
            }

            String host = "smtp.gmail.com";
            String user = l.get(0);
            String pass = l.get(1);
            String to = too;
            String from = l.get(0);
            String subject = s;
            String messageText = m;

            int response = JOptionPane.showConfirmDialog(null, "to: "
                           + to + "\n"
                           + "subject: " + s + "\n" + "message:" + m, "confirm",
                           JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION)
            {

                boolean sessionDebug = false;

                Properties props = System.getProperties();

                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", host);
                props.put("mail.smtp.port", "587");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.required", "true");

                java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                Session mailSession = Session.getDefaultInstance(props, null);
                mailSession.setDebug(sessionDebug);
                Message msg = new MimeMessage(mailSession);
                msg.setFrom(new InternetAddress(from));
                InternetAddress[] address = {new InternetAddress(to)};
                msg.setRecipients(Message.RecipientType.TO, address);
                msg.setSubject(subject);
                msg.setSentDate(new Date());
                msg.setText(messageText);

                Transport transport = mailSession.getTransport("smtp");
                transport.connect(host, user, pass);
                transport.sendMessage(msg, msg.getAllRecipients());
                transport.close();
                Runtime n = Runtime.getRuntime();
                n.exec("espeak " + "messagesent");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

    }

    public void showUnreadMails(Folder inbox)
    {
        try
        {
            FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
            Message msg[] = inbox.search(ft);
            System.out.println("MAILS: " + msg.length);
            emails.add(String.valueOf(msg.length));
            for (Message message : msg)
            {
                try
                {

                    emails.add(
                        //"DATE"+message.getSentDate().toString().replaceAll(" ","")
                        //+
                        "FROM" + message.getFrom()[0].toString().replaceAll(" ", "")
                        + "SUBJECT" + message.getSubject().toString().replaceAll(" ", "")
                        + "CONTENT" + message.getContent().toString().replaceAll(" ", ""));

                    //System.out.println("******************************************");
                }
                catch (Exception e)
                {
                    // TODO Auto-generated catch block
                    // System.out.println("No Information");
                }
            }

        }
        catch (MessagingException e)
        {
            System.out.println(e.toString());
        }
    }

    public void showAllMails(Folder inbox)
    {
        try
        {
            Message msg[] = inbox.getMessages();
            System.out.println("MAILS: " + msg.length);
            for (int i = msg.length - 1; i > msg.length - 5; i--)
            {
                Message message = msg[i];
                try
                {
                    System.out.println("DATE: " + message.getSentDate().toString());
                    System.out.println("FROM: " + message.getFrom()[0].toString());
                    System.out.println("SUBJECT: " + message.getSubject().toString());
                    System.out.println("CONTENT: " + message.getContent().toString());
                    System.out.println("******************************************");
                }
                catch (Exception e)
                {
                    System.out.println("No Information");
                }
            }
        }
        catch (MessagingException e)
        {
            System.out.println(e.toString());
        }
    }

    public void readthis()
    {

        try
        {
            n.exec("xdotool key ctrl+c");
            File ff = new File("readFile.txt");
            FileWriter fw = new FileWriter(ff);
            String tt = GetStringFromClipboard().replace("'", "").replace(" ", "-");
            fw.write(tt);
            fw.flush();
            fw.close();
            TimeUnit.MICROSECONDS.sleep(1000);
            n.exec("espeak -f readFile.txt");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void chkemails()
    {
        Properties props = System.getProperties();

        props.setProperty("mail.store.protocol", "imaps");
        try
        {
            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");

            ArrayList<String> l = new ArrayList<>();
            File f = new File("login.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine())
            {
                l.add(scan.nextLine());
            }
            store.connect("imap.gmail.com", l.get(0), l.get(1));
            System.out.println("ok");
            // IMAP host for yahoo.
            //store.connect("imap.mail.yahoo.com", "<username>", "<password>");

            // System.out.println(store);
            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_WRITE);

            BufferedReader optionReader = new BufferedReader(new InputStreamReader(System.in));
            //System.out.println("Press (U) to get only unread mails OR Press (A) to get all mails:");
            try
            {
                // char answer = (char) optionReader.read();

                showUnreadMails(inbox);

                optionReader.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }

        }
        catch (NoSuchProviderException e)
        {
            System.out.println(e.toString());
            System.exit(1);
        }
        catch (MessagingException e)
        {
            System.out.println(e.toString());
            System.exit(2);
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            if (emails.get(0).equals("0"))
            {
                n.exec("espeak " + "noemails");
            }
            else if (emails.get(0).equals("1"))
            {
                n.exec("espeak " + "oneemail");
                e = true;
            }
            else
            {
                n.exec("espeak " + "youhave" + emails.get(0) + "emails");
                e = true;
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void shwemails()
    {
        for (int k = 1; k <= emails.size() - 1; k++)
        {
            try
            {
                n.exec("espeak " + emails.get(k));
            }
            catch (Exception ex)
            {
            }
        }
        e = false;

    }

    public void youtubesearch()
    {
        ArrayList<String> arra = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(out.toLowerCase(), " ");
        while (st.hasMoreTokens())
        {
            arra.add(st.nextToken());
        }
        try
        {
            desktop.getDesktop().browse(new URI("https://youtube.com/results?search_query=" + out.toLowerCase().substring(20, out.length()).replaceAll(" ", "+")));
        }
        catch (Exception ex)
        {
        }
    }

    public void closeBrowser()
    {
        // ok close browser
        Runtime run = Runtime.getRuntime();
        try
        {
            run.exec("killall firefox");
        }
        catch (Exception e)
        {
        }
    }

    public void okpost()
    {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true).setOAuthConsumerKey("YPflO9Y6j2cTfg8vlzigkW813")
        .setOAuthConsumerSecret("glbCPMibPG6XpPA1PyB87FXrLq0Xa7PPf96USTy199VexWH4GT")
        .setOAuthAccessToken("1131322482747691008-otlRdsWRLjf4U8DdT6JGCS3fDg7x3h")
        .setOAuthAccessTokenSecret("wfWSdkGj2KZu6YPCxWFlCDU2DONCVnQRdRhDrcvMZHTrQ");
        int response = JOptionPane.showConfirmDialog(null, "post: " + out.substring(11, out.length()), "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION)
        {
            TwitterFactory tf = new TwitterFactory(cb.build());
            twitter4j.Twitter tw = tf.getInstance();
            try
            {
                Status state = tw.updateStatus(out.substring(11, out.length()));
            }
            catch (TwitterException ex)
            {
                Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
            }
            try
            {
                n.exec("espeak postedontwitter" + out.substring(11, out.length()));
            }
            catch (IOException ex) {}
        }
    }

    public void okremove()
    {
        try
        {
            ArrayList<String> arra = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(out.toLowerCase(), " ");
            while (st.hasMoreTokens())
            {
                arra.add(st.nextToken());
            }
            if (!arra.get(2).equals("folders"))
            {
                String path = a("locate " + arra.get(2) + ".txt");
                n.exec("rm " + path);

                System.out.println(path);
            }
            n.exec("espeak deleted");
        }
        catch (Exception ex)
        {
        }
    }

    public void oksong()
    {
        try
        {
            ArrayList<String> as = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(out.toLowerCase(), " ");
            while (st.hasMoreTokens())
            {
                as.add(st.nextToken());
            }
            String path = a("locate " + as.get(2) + ".mp3");
            n.exec("mpg123 " + path);
        }
        catch (Exception m)
        {
        }
    }

    public void okoption()
    {

        ArrayList<String> array = new ArrayList<>();
        try
        {

            Document d = Jsoup.connect(l).get();
            Elements w = d.getElementsByTag("cite");
            if (w.isEmpty())
            {
                return;
            }
            w.forEach(link
                      ->
            {
                try
                {
                    array.add(link.text());
                }
                catch (Exception s)
                {
                }
            });
            // System.out.println(l);
        }
        catch (Exception ex)
        {
        }
        try
        {
            if (out.toLowerCase().contains("first"))
            {

                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(array.get(0));
                System.out.println(array.get(0));
                desktop.browse(oURL);
            }
            else
            {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(array.get(1));
                //desktop.browse(oURL);
                System.out.println(array.get(1));
            }
        }
        catch (Exception e)
        {
        }
    }

    public void okcopy()
    {
        try
        {
            ArrayList<String> arra = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(out.toLowerCase(), " ");
            while (st.hasMoreTokens())
            {
                arra.add(st.nextToken());
            }
            String path = a("locate " + arra.get(2) + ".txt");
            System.out.println(path);
            if (arra.get(4).toLowerCase().equals("desktop"))
            {
                String path1 = a("realpath $USER");
                n.exec("cp " + path + " " + path1 + "/Desktop");
            }
            else if (arra.get(4).toLowerCase().equals("documents"))
            {
                String path2 = a("realpath $USER");
                String g = "cp ";
                g = path + " home";
                g += a("whoami");
                g += "/Documents";
                System.out.println(g);
                n.exec(g);
                // System.out.println("cp " + path +" " +g);

            }
            n.exec("espeak copied");
        }
        catch (Exception ex)
        {
        }
    }

    public void okdoc()
    {
        try
        {
            ArrayList<String> as = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(out.toLowerCase(), " ");
            while (st.hasMoreTokens())
            {
                as.add(st.nextToken());
            }

            if (as.get(3).equals("writer"))
            {
                String path = a("locate " + as.get(2) + ".odt");
                System.out.println(path);
                n.exec("libreoffice " + path);

            }
            else if (as.get(3).equals("impress"))
            {
                String path = a("locate " + as.get(2) + ".odp");
                n.exec("libreoffice " + path);
            }
            else if (as.get(3).equals("text"))
            {
                {
                    String path = a("locate " + as.get(2) + ".txt");
                    n.exec("xdg-open " + path);
                }
            }
            else if (as.get(3).equals("document"))
            {
                {
                    String path = a("locate " + as.get(2) + ".pdf");
                    n.exec("xdg-open " + path);
                }
            }
            n.exec("espeak openningDocument");

        }
        catch (IOException ex)
        {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void okfile()
    {
        try
        {
            String file = out.toLowerCase().substring(17, out.length()).trim();
            String path = a("realpath $USER");
            String p = path.split("/")[1] + "/" + path.split("/")[2] + "/";
            n.exec("touch " + "/" + p + file + ".txt");
            n.exec("espeak " + "created ");

        }
        catch (Exception ex)
        {
        }
    }

    public void okfolder()
    {
        Runtime rn = Runtime.getRuntime();
        try
        {
            String path = a("realpath $USER");
            String p = path.split("/")[1] + "/" + path.split("/")[2] + "/";

            rn.exec("mkdir " + "/" + p + out.toLowerCase().substring(20, out.length()));
            System.out.println("mkdir " + "/" + p + out.toLowerCase().substring(17, out.length()));
            rn.exec("espeak " + "created ");
        }
        catch (Exception ex)
        {
        }
    }

    public void okconvert()
    {
        String aa = "";

        try
        {
            //n.exec("qalc " + out.toLowerCase().split(" ")[2] + out.toLowerCase().split(" ")[3] + out.toLowerCase().split(" ")[5] +" >> convert.txt");
            aa = a("qalc " + out.toLowerCase().split(" ")[2] + " " + out.toLowerCase().split(" ")[3] + " " + out.toLowerCase().split(" ")[5]);
            String s = aa.trim().split("=")[1].replaceAll(" ", "/");

            n.exec("espeak " + s);

        }
        catch (Exception ex)
        {
        }
    }

    public void okdate()
    {
        String st = DateTimeFormatter.ofPattern("dd MM yyyy").format(date).replaceAll(" ", "/");
        String[] star = st.split("/");
        try
        {
            n.exec("espeak " + star[0] + "-" + star[1]);
        }
        catch (Exception ex)
        {
        }
    }

    public void oktime()
    {
        String ti = time.format(t).replaceAll(" ", "/");
        String[] star = ti.split("/");
        try
        {
            n.exec("espeak " + star[0] + "hours-" + "And" + star[1] + "minutes");
        }
        catch (Exception ex)
        {
        }
    }

    public void okrestart()
    {
        try
        {
            Process p = n.exec("shutdown -r now");
        }
        catch (IOException ex)
        {
        }
    }

    public void okshutdown()
    {
        try
        {
            Process p = n.exec("shutdown -h now");
        }
        catch (IOException ex)
        {
        }
    }

    public void okmove()
    {
        try
        {
            ArrayList<String> arra = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(out.toLowerCase(), " ");
            while (st.hasMoreTokens())
            {
                arra.add(st.nextToken());
            }
            String path = a("locate " + arra.get(2) + ".txt");

            if (!arra.get(4).toLowerCase().equals("desktop"))
            {
                String path1 = a("realpath $USER");
                n.exec("mv " + path + " " + path1 + "/Desktop");
            }
            else if (!arra.get(4).toLowerCase().equals("document"))
            {
                String path1 = a("realpath $USER");
                n.exec("mv " + path + " " + path1 + "/document");
            }
            n.exec("espeak moved");
        }
        catch (Exception ex)
        {
        }
    }

    public void okclose()
    {
        try
        {
            n.exec("wmctrl -c " + out.split(" ")[2]);
        }
        catch (Exception ex)
        {
        }

    }

    public void okcalc()
    {

        ArrayList<String> c = new ArrayList<>();
        StringTokenizer s = new StringTokenizer(out.trim(), " ");
        while (s.hasMoreTokens())
        {
            c.add(s.nextToken());
        }
        try
        {
            float l = Integer.parseInt(c.get(2));
            float q = Integer.parseInt(c.get(4));
            String m = c.get(3).toLowerCase();
            String calc = "";
            if (m.equals("divided") || m.equals("diveded by") || m.equals("/"))
            {
                m = "/";
                calc = "espeak ";
                calc += '"';
                String aa = a("qalc " + l + m + q);
                calc += aa + " ";
                calc += '"';
                calc = calc.replaceAll("/", "divided");

            }
            else if (m.equals("plus") || m.equals("+"))
            {
                m = "+";
                calc = "espeak ";
                calc += '"';
                String aa = a("qalc " + l + m + q);
                calc += aa + " ";
                calc += '"';

            }
            else if (m.equals("mins") || m.equals("-"))
            {
                m = "-";
                calc = "espeak ";
                calc += '"';
                String aa = a("qalc " + l + m + q);
                calc += aa + " ";
                calc += '"';
                calc = calc.replaceAll("-", "minus");

            }
            else if (m.equals("*") || m.equals("X") || m.equals("x") || m.equals("m") || m.equals("times") || m.equals("time") || m.equals("multiply") || m.equals("multiplied by"))
            {
                m = "*";
                calc = "espeak ";
                calc += '"';
                String aa = a("qalc " + l + m + q);
                calc += aa + " ";
                calc += '"';
                calc = calc.replaceAll("'*'", "times");

            }
            ArrayList<String> aa = new ArrayList<>();
            StringTokenizer aaa = new StringTokenizer(calc, " ");
            while (aaa.hasMoreTokens())
            {
                aa.add(aaa.nextToken());
            }
            System.out.println(aa.get(aa.size() - 2));
            n.exec("espeak " + aa.get(aa.size() - 2));
        }
        catch (Exception b)
        {
        }
    }

    public void okopen()
    {
        ArrayList<String> as = new ArrayList<>();
        Runtime run = Runtime.getRuntime();

        String w = "";
        StringTokenizer s = new StringTokenizer(out.trim(), " ");
        while (s.hasMoreTokens())
        {
            as.add(s.nextToken());
        }
        try
        {
            Desktop d = java.awt.Desktop.getDesktop();
            try
            {
                run.exec("espeak " + as.get(as.size() - 1));
            }
            catch (Exception m)
            {
            }
            URI oURL = new URI("https://" + as.get(as.size() - 1));
            d.browse(oURL);
        }
        catch (Exception e)
        {
        }
    }

    public void okrun()
    {
        try
        {
            /*
            gnome-calculator
            gnome-calendar
            gnome-control-center
            gnome-disks
            gnome-help
            gnome-software
            gnome-sudoku
            gnome-system-monitor
            gnome-terminal
            gnome-mahjongg

            rhythmbox
            gnome-screenshot
            gnome-todo
             */
            String ss = out.split(" ")[1];
            str = ss;
            if (str.equals("writer"))
            {
                n.exec("libreoffice --" + str);
            }
            else if (str.equals("impress"))
            {
                n.exec("libreoffice --" + str);
            }
            else if (str.equals("draw"))
            {
                n.exec("libreoffice --" + str);
            }
            else if (str.equals("calc"))
            {
                n.exec("libreoffice --" + str);
            }
            else if (str.equals("netbeans"))
            {
                n.exec("~/netbeans-8.2/bin/netbeans");
            }
            else if (str.equals("mine"))
            {
                n.exec("gnome-mines");
            }
            else if (str.equals("calculator"))
            {
                n.exec("gnome-calculator");
            }
            else if (str.equals("editor"))
            {
                n.exec("gedit");
            }
            else if (str.equals("transmission"))
            {
                n.exec("transmission-gtk");
            }
            else if (str.equals("calendar"))
            {
                n.exec("gnome-calendar");
            }
            else if (str.equals("settings"))
            {
                n.exec("gnome-control-center");
            }
            else if (str.equals("disks"))
            {
                n.exec("gnome-disks");
            }
            else if (str.equals("help"))
            {
                n.exec("gnome-help");
            }
            else if (str.equals("store"))
            {
                n.exec("gnome-software");
            }
            else if (str.equals("software"))
            {
                n.exec("gnome-software");
            }
            else if (str.equals("sudoku"))
            {
                n.exec("gnome-sudoku");
            }
            else if (str.equals("terminal"))
            {
                n.exec("gnome-terminal.real");
            }
            else if (str.equals("screenshot"))
            {
                n.exec("gnome-screenshot");
                return;
            }
            else if (str.equals("to") && out.contains("do"))
            {
                n.exec("gnome-todo");
            }
            else if (str.equals("control") && (out.contains("center") || out.contains("panel")))
            {
                n.exec("gnome-control-center");
            }
            else if (str.equals("files"))
            {
                n.exec("nautilus");
            }
            else if (str.equals("firefox"))
            {
                n.exec("firefox");
            }
            else if (str.equals("browser"))
            {
                n.exec("firefox");
            }
            else if (hs.contains(str))
            {
                n.exec(str);
            }
            else
            {
                n.exec("espeak " + "SorryCantUnderstandYou");
                return;
            }
            n.exec("espeak " + "Openning" + str);
        }
        catch (IOException ex)
        {
        }
    }

    public void oksearch()
    {
        try
        {
            n.exec("espeak " + "searching");
            try
            {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://www.google.com/search?client=ubuntu&channel=fs&q=" + out.replace("ok search ", "").replaceAll(" ", "+") + "&ie=utf-8&oe=utf-8");
                desktop.browse(oURL);
                l = oURL.toString();
            }
            catch (Exception e)
            {
            }

        }
        catch (IOException ex)
        {
        }
    }

    public void oksoft()
    {
        try
        {
            n.exec("gnome-software --search " + out.replace("james software ", ""));
        }
        catch (Exception ex)
        {
        }
    }

    public void s()
    {
        try
        {
            Process a = Runtime.getRuntime().exec("espeak to" + "whom");
        }
        catch (IOException ex)
        {
        }
    }

    public void ss()
    {
        try
        {
            Process a = Runtime.getRuntime().exec("espeak subject");
        }
        catch (IOException ex)
        {
        }
    }

    public void sss()
    {
        try
        {
            Process a = Runtime.getRuntime().exec("espeak content");
        }
        catch (IOException ex)
        {
        }
    }

    public void ssss()
    {
        sendmail(to, subject, content);
    }
    public void setUsername(String un)
    {
        username = un;
    }
    public void setPassword(String pw)
    {
        password = pw;
    }

}

// gsettings set org.gnome.gnome-screenshot auto-save-directory "file:///home/$USER/Desktop/"
