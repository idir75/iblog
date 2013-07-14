package org.resume.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * A class to handle login action.
 * @author IDIR.
 */
public class LoginAction extends ActionSupport {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * User.
	 */
	private String fUsername;
	/**
	 * Password.
	 */
    private String fPassword;
 
    public String execute() {
        if (this.fUsername.equals("test") && this.fPassword.equals("test")) {
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
    }
 
    public String getUsername() {
        return fUsername;
    }
 
    public void setUsername(String username) {
        this.fUsername = username;
    }
 
    public String getPassword() {
        return fPassword;
    }
 
    public void setPassword(String password) {
        this.fPassword = password;
    }
}

