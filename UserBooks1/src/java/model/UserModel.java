
package model;

public class UserModel {
private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public UserModel(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public UserModel() {
    }
    
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uName) {
        this.uname = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String password;
    
}
