package baldwin;

/***************************************************
 *
 * Project: NSALoginController 
 *
 * Created by: davidbaldwin.toUpperCase() on 4/25/18 at 7:16 PM.
 *
 ***************************************************/
public class User {

    private String password;

    private String salt;

    private String hashValue;

    public User(String userPassword) {

        password = userPassword;
    }

    public void setPassword(String newPassword) {

        this.password = newPassword;

    }

    public String getPassword() {

        return password;
    }

    public void setSalt(String newSalt) {

        this.salt = newSalt;

    }

    public String getSalt() {

        return salt;
    }

    public void setHashedPassword(String newHashValue) {

        this.hashValue = newHashValue;

    }

    public String getHashedPassword() {

        return hashValue;
    }


}
