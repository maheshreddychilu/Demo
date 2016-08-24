package com.built.io.automationframework;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class MailingReports {

    static final String FROM = "mahesh.chilumula@raweng.com";   
    static final String TO = "contentstack-dev@raweng.com";                                                   
    static final String BODY = "Below are the links to automation reports generated for UI and API, respectively :"+ '\n' + '\n' + "UI: http://uiautomation.builtapp.io/assets/"+Reports.report_name +'\n' + '\n'+ "API: http://uiautomation.builtapp.io/assets/"+"test.jtl-report.html"+'\n'+'\n' + "------" +'\n' +"Regards,"+ '\n' + "QA Team";
    static final String SUBJECT = "Contentstack Development UI Report | " + BasePageActions.report_date;
    static final String SMTP_USERNAME = "AKIAI56YLBVETIWY55NA"; 
    static final String SMTP_PASSWORD = "An+QcbdQOWr/+FgTgsW+ZMacKQS03T8c8Bp5QYAEp9Xa"; 
    static final String HOST = "email-smtp.us-east-1.amazonaws.com";    
    static final int PORT = 587;

  
    public static void mailReport() throws AddressException, MessagingException  {

    	Properties props = System.getProperties();
    	props.put("mail.transport.protocol", "smtp");
    	props.put("mail.smtp.port", PORT); 
    	props.put("mail.smtp.auth", "true");
    	props.put("mail.smtp.starttls.enable", "true");
    	props.put("mail.smtp.starttls.required", "true");

    	Session session = Session.getDefaultInstance(props);     
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        msg.setSubject(SUBJECT);
        msg.setContent(BODY,"text/plain");
            
        Transport transport = session.getTransport();         
       
        try
        {
            System.out.println("Attempting to send an email through the Amazon SES SMTP interface...");
            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            transport.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Email sent!");
        }
        catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());
        }
        finally
        {
           
            transport.close();        	
        }
    }
}