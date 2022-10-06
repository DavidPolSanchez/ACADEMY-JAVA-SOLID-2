package srp.good;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MailService {


    void sendMail(User user,String msg){
        //sending email to user
        String email = user.getEmail();
        // ....

    }

    public void sendEmailLogin(User user){
        LocalDate now= LocalDate.now();
        var msg = """
                Nuevo inicio
                """+now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        sendMail(user,msg);
    }
}