package cn.hsd.hissc.action;

import cn.hsd.hissc.model.User;
import cn.hsd.hissc.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport{
    User user = new User();
    private UserService userService;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
    public String execute() throws Exception {
    	userService.addUser(user);//ÃÌº””√ªß
    	return "registerSuccess";
    }
}
