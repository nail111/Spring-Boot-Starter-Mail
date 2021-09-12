package All;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    /* JavaMailSender interface:
    the subinterface of the above MailSender.
    It supports MIME messages and is mostly used in conjunction with the MimeMessageHelper class for the creation of a MimeMessage.
    It's recommended to use the MimeMessagePreparator mechanism with this interface. */
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleEmail(String toEmail,String body,String subject) {

        /* SimpleMailMessage class:
         used to create a simple mail message including the from, to, cc, subject and text fields  */
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("nailtagiyev1999@gmail.com");
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setText(body);
        simpleMailMessage.setSubject(subject);

        javaMailSender.send(simpleMailMessage);
        System.out.println("Mail sent...");
    }
}
