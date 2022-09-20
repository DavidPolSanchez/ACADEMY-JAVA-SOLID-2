

package srp.good;

public class Email {

    private String message;
    private User user;


    public String getMessage() {
        return response;
    }
    public void setMessage(Long id) {
        this.response = response;
    }


    void sendEmail(User user, String msg) {
        // sending email to user
        this.user=user;
        String email = user.getEmail();
        // ....
    }


}
