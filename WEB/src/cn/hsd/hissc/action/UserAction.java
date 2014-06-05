package cn.hsd.hissc.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import cn.hsd.hissc.model.Pager;
import cn.hsd.hissc.model.User;
import cn.hsd.hissc.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements SessionAware,RequestAware {
	private Map<String,Object> session;
	private Map<String,Object> request;
	private UserService userService;
	private User user;
	private String message;
	private Pager<User> pager;
	private int[] ids;
	private boolean isexists=false;
	//到用户添加页面
	public String addUserForward(){
		
		
		return "adduserforword";
	}
	//到根据条件查询用户信息页面
	public String getUserByConditionForward(){
		return "getuserbyconditionforward";
	}
	// 添加用户
	public String addUser() throws Exception {
		User u = userService.getUserByUserId(user.getUserid());
		if(u==null){
			userService.addUser(user);
			message="用户添加成功";
			session.put("message", message);
		}else{
			message="用户添加失败，该登陆号已存在！请检查好登陆号并重新添加用户。";
			session.put("message", message);
		}
		
		return "message";
	}
	// 分页显示用户信息
	public String listUser() throws Exception {
		pager = userService.getUserPager();
		return SUCCESS;
	}
	// 到修改用户页
	public String updateUserInput() throws Exception {
		user = userService.getUser(user.getId());
		return "updateUser";
	}
	// 修改用户
	public String updateUser() throws Exception {
		userService.updateUser(user);
		message="用户修改成功";
		session.put("message", message);
		return "message";
	}
	// 删除用户
	public String deleteUser() throws Exception {
			userService.deleteUser(user);
			message="用户删除成功！";
			session.put("message", message);
		return "message";
	}
	//根据登陆号查询用户
	public String getUserByUserId(){
		System.out.println(user.getUserid());
		user = userService.getUserByUserId(user.getUserid());
		return "updateUser";
	}
	//根据用户名查询用户
	public String listUserByName(){
		if(user==null){//翻页时  user等于空
			String name = (String) ActionContext.getContext().getSession().get("usernamecondition");
			pager = userService.getUserPagerByName(name);
		}else{
			pager = userService.getUserPagerByName(user.getName());
			ActionContext.getContext().getSession().put("usernamecondition", user.getName());
		}
		return "listuserbyname";
	}
	//根据行政单位查询用户
	public String listUserByDe(){
		if(user==null){//翻页时  user等于空
			String department = (String) ActionContext.getContext().getSession().get("userdepartmentcondition");
			pager = userService.getUserPagerByDe(department);
		}else{
			pager = userService.getUserPagerByDe(user.getDepartment());
			ActionContext.getContext().getSession().put("userdepartmentcondition", user.getDepartment());
		}
		return "listuserbyde";
	}
	//用户查询自己的信息
	public String getUserSelf(){
		User loginUser = (User) ActionContext.getContext().getSession()
		.get("loginUser");
		user = userService.getUserByUserId(loginUser.getUserid());
		return "updateUser";
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public Pager<User> getPager() {
		return pager;
	}
	public void setPager(Pager<User> pager) {
		this.pager = pager;
	}
	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}
	public boolean isIsexists() {
		return isexists;
	}
	public void setIsexists(boolean isexists) {
		this.isexists = isexists;
	}
	
	
	
	
}
