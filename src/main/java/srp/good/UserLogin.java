package srp.bad;

public class UserLogin {

    User login(String userName, String password) {
    	
        //User user = db.findUserByUserNameAndPassword(userName, password);
    	User user = new User();
        Email mail = new Email();
        if (user == null) {
            // do something
        }
        // login process..
        mail.sendEmail(user, "Successfull login");
        
        return user;
    }
    

}
