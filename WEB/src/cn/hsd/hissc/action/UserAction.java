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
	//���û����ҳ��
	public String addUserForward(){
		
		
		return "adduserforword";
	}
	//������������ѯ�û���Ϣҳ��
	public String getUserByConditionForward(){
		return "getuserbyconditionforward";
	}
	// ����û�
	public String addUser() throws Exception {
		User u = userService.getUserByUserId(user.getUserid());
		if(u==null){
			userService.addUser(user);
			message="�û���ӳɹ�";
			session.put("message", message);
		}else{
			message="�û����ʧ�ܣ��õ�½���Ѵ��ڣ�����õ�½�Ų���������û���";
			session.put("message", message);
		}
		
		return "message";
	}
	// ��ҳ��ʾ�û���Ϣ
	public String listUser() throws Exception {
		pager = userService.getUserPager();
		return SUCCESS;
	}
	// ���޸��û�ҳ
	public String updateUserInput() throws Exception {
		user = userService.getUser(user.getId());
		return "updateUser";
	}
	// �޸��û�
	public String updateUser() throws Exception {
		userService.updateUser(user);
		message="�û��޸ĳɹ�";
		session.put("message", message);
		return "message";
	}
	// ɾ���û�
	public String deleteUser() throws Exception {
			userService.deleteUser(user);
			message="�û�ɾ���ɹ���";
			session.put("message", message);
		return "message";
	}
	//���ݵ�½�Ų�ѯ�û�
	public String getUserByUserId(){
		System.out.println(user.getUserid());
		user = userService.getUserByUserId(user.getUserid());
		return "updateUser";
	}
	//�����û�����ѯ�û�
	public String listUserByName(){
		if(user==null){//��ҳʱ  user���ڿ�
			String name = (String) ActionContext.getContext().getSession().get("usernamecondition");
			pager = userService.getUserPagerByName(name);
		}else{
			pager = userService.getUserPagerByName(user.getName());
			ActionContext.getContext().getSession().put("usernamecondition", user.getName());
		}
		return "listuserbyname";
	}
	//����������λ��ѯ�û�
	public String listUserByDe(){
		if(user==null){//��ҳʱ  user���ڿ�
			String department = (String) ActionContext.getContext().getSession().get("userdepartmentcondition");
			pager = userService.getUserPagerByDe(department);
		}else{
			pager = userService.getUserPagerByDe(user.getDepartment());
			ActionContext.getContext().getSession().put("userdepartmentcondition", user.getDepartment());
		}
		return "listuserbyde";
	}
	//�û���ѯ�Լ�����Ϣ
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
