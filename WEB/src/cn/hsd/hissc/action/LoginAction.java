package cn.hsd.hissc.action;

import java.util.Map;

import cn.hsd.hissc.model.User;
import cn.hsd.hissc.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private Map<String,Object> session;
	private String message;
	User user;
	private UserService userService;
    @Override
    public String execute() throws Exception {
    	user = userService.getUserByUserId(user.getUserid(), user.getPassword());
    	if(user!=null){
    		return SUCCESS;
    	}else{
    		message = "’À∫≈ªÚ√‹¬Î¥ÌŒÛ£°";
    		session.put("message", "message");
    		return INPUT;
    	}   	
    }
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	   
}
