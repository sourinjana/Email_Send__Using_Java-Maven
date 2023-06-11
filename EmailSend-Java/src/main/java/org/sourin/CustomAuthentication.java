package org.sourin;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomAuthentication extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(MailMetaData.myMail,MailMetaData.Password);
    }

}
