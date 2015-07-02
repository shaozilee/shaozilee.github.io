package;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 * Created by lee on 15-7-1.
 */
public class Main {

    public static void main(String[] args){
        try {
            sendSimpleEmail();
            sendMultiPartEmail();
            sendHtmlEmail();
            sendImageHtmlEmail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendSimpleEmail() throws EmailException {
        Date date = new Date();
        Email email = new SimpleEmail();
        init(email);
        //发送给谁
        email.addTo("shaozilee@gmail.com");
        //邮件标题
        email.setSubject("this is SimpleEmail");
        //邮件正文
        email.setMsg("Welcome to shaozilee.com!");
        email.send();

        System.out.println("sendSimpleEmal成功!"+(new Date().getTime()-date.getTime()));
    }

    private static void sendMultiPartEmail() throws EmailException {
        Date date = new Date();
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("logo.gif");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("the logo of shaozilee.com");
        attachment.setName("logo.gif");

        MultiPartEmail email = new MultiPartEmail();
        init(email);
        email.addTo("shaozilee@gmail.com");
        email.setSubject("this is MultiPartEmail");
        email.setMsg("Welcome to shaozilee.com!");
        email.attach(attachment);
        email.send();

        System.out.println("sendMultiPartEmail成功!"+(new Date().getTime()-date.getTime()));
    }

    private static void sendHtmlEmail() throws EmailException, MalformedURLException {
        Date date = new Date();
        HtmlEmail email = new HtmlEmail();
        init(email);
        String cid = email.embed(new URL("http://www.shaozilee.com/images/logo.gif"), "shaozilee logo");
        email.setHtmlMsg("<html>The shaozilee logo - <img src=\"cid:" + cid + "\"></html>");
        email.setTextMsg("Welcome to shaozilee.com!");
        email.addTo("shaozilee@gmail.com");
        email.setSubject("this is HtmlEmail");
        email.send();

        System.out.println("sendHtmlEmail成功!"+(new Date().getTime()-date.getTime()));
    }

    private static void sendImageHtmlEmail() throws EmailException, MalformedURLException {
        Date date = new Date();
        String htmlEmailTemplate = "<html>welcome to <a href=\"http://www.shaozilee.com\">shaozilee.com</a> - <img src=\"http://www.shaozilee.com/images/logo.gif\"> </html>";

        ImageHtmlEmail email = new ImageHtmlEmail();
        init(email);
        email.setDataSourceResolver(new DataSourceUrlResolver(new URL("http://www.shaozilee.com")));
        email.addTo("shaozilee@gmail.com");
        email.setSubject("this is ImageHtmlEmail");
        email.setMsg("Welcome to shaozilee.com!");
        email.setHtmlMsg(htmlEmailTemplate);
        email.setTextMsg("Your email client does not support HTML messages");
        email.send();

        System.out.println("sendImageHtmlEmail成功!"+(new Date().getTime()-date.getTime()));
    }

    private static void init(Email email){
        try {
            email.setHostName("smtp.shaozilee.com");
            email.setSmtpPort(25);
            email.setAuthentication("username","password");
            email.setCharset("UTF-8");
            email.setFrom("test@shaozilee.com","shaozilee实验室");
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

}
