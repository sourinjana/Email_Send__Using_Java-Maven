package org.sourin;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Properties;

public class MailHandler {

    void sendMail(){
        Properties sysProperties=System.getProperties();//this gives me hashtable
        sysProperties.put("mail.smtp.host",MailMetaData.HostServer);
        sysProperties.put("mail.smtp.port",MailMetaData.port);
        sysProperties.put(MailMetaData.sslProperty,"true");
        sysProperties.put(MailMetaData.authPerm,"true");
        Authenticator MailAuth=new CustomAuthentication();

        Session mailSession=Session.getInstance(sysProperties,MailAuth);

        MimeMessage mailMessage=new MimeMessage(mailSession);
        try {
            mailMessage.setFrom(MailMetaData.myMail);
            mailMessage.setSubject("this is my java code testing");
            mailMessage.setText("hey this is from sourin testing java code");
            // Address arr[]= new Address[]{"janasourin15@gmail.com","sourin2104@gmail.com"};
//            String[] arr = new String[]{"janasourin15@gmail.com","sourinjana2104@gmail.com"};
//            String string = arr.toString();
//            Address ar[]=new Address[] (arr.toString());
            Address reciveMail=new InternetAddress("sourinjana2104@gmail.com");
            mailMessage.setRecipient(Message.RecipientType.TO,reciveMail);
            Transport.send(mailMessage);
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
