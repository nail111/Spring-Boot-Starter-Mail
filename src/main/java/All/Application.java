package All;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {
    @Autowired
    private AppService appService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() {
        appService.sendSimpleEmail("nailtagiyev1999@gmail.com","This is the body","This is the subject");
    }
}
