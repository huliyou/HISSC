package cn.hsd.hissc.action;

import java.util.Map;
import cn.hsd.hissc.model.Expert;
import cn.hsd.hissc.service.ExpertService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ShowExpertDetailsAction extends ActionSupport{
	private Map<String,Object> session ;		//用于存储提示信息到session会话范围
	private String message ;		//存储提示信息
	private Expert expert ;		//存储读取的专家信息
	private ExpertService expertService ;		//用来从数据库中读取信息
	
	/**左侧信息*/
	private String expertId ;		//接收之前页面传送过来的专家id
	private String expertName ;		//专家姓名
	private int attentions ;		//关注度
	private String location ;		//所在地区
	private String contacts ;		//联系人
	private String telephone ;		//联系电话
	private String mobile ;		//手机
	private String email ;		//电子邮件
	private String address ;		//地址
	
	/**右侧信息*/
	//基本信息
	private String birthday ; 		//出生日期
	private String startWorkingTime ;		//开始工作时间
	private String college ;		//毕业院校
	private String unitBelongTo ;		//所属单位
	private String position ;		//职位
	private String title ;			//职称

	//业务信息
	private Map<String,String> researchFields ;		//研究领域 
	private String researchDirections ;		//研究方向
	private String technicalAbilitys ;		//技术能力
	private String introduce;		//专家简介
	
	@Override
	public String execute() throws Exception {
		this.expert = expertService.getExpertByExpertId(expertId) ;
		
		if (expert == null) {		//查询专家信息不存在，返回到message视图显示提示信息
			message = "对不起，您查询的专家信息不存在！";
			session.put("message", message);
			return "message";
		} 
		
		this.expertName = expert.getName() ;
		this.attentions = expert.getAttentions() ;
		this.location = expert.getLocation() ;
		this.contacts = expert.getContacts() ;
		this.telephone = expert.getTelephone() ;
		this.mobile = expert.getMobile() ;
		this.email = expert.getEmail() ;
		this.birthday = expert.getBirthday() ;
		this.startWorkingTime = expert.getStartWorkingTime() ;
		this.college = expert.getCollege() ;
		this.unitBelongTo = expert.getUnitBelongTo() ;
		this.position = expert.getPosition() ;
		this.title = expert.getTitle() ;
		
		String[] rf = expert.getResearchFields() ;
		this.researchFields.put("主攻领域",rf[0]) ;
		this.researchFields.put("相关领域",rf[1]) ;
		this.researchFields.put("相关领域",rf[2]) ;
		this.researchFields.put("相关领域",rf[3]) ;
		this.researchFields.put("相关领域",rf[4]) ;
		
		this.researchDirections = expert.getResearchDirections() ;
		this.technicalAbilitys = expert.getTechnicalAbilitys() ;
		this.introduce = expert.getIntroduce() ;
		return "showexpertdetails";
	}// #execute
	
	/**
	 * 处理用户关注事件
	 * 
	 * @throws Exception
	 */
	public void dealWithConcern() throws Exception {
		// 用户未关注过该专家时，增加该专家的关注度
		if (null == session.get(expertId)) {
			int newHot = expert.getAttentions() + 1; // 关注度加1
			expert.setAttentions(newHot);
			expertService.updateExpert(expert);		//将新的特派员信息保存到数据库;加密后的手机信息呢？
			session.put(expertId, expertId); // 当用户关注一个特派员之后，以特派员id为键值，将被关注的特派员id放到session中
		}
	}// #dealWithConcern

	/**Getters and Setters*/
	public int getAttentions() {
		return attentions;
	}
	public void setAttentions(int attentions) {
		this.attentions = attentions;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getStartWorkingTime() {
		return startWorkingTime;
	}
	public void setStartWorkingTime(String startWorkingTime) {
		this.startWorkingTime = startWorkingTime;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getUnitBelongTo() {
		return unitBelongTo;
	}
	public void setUnitBelongTo(String unitBelongTo) {
		this.unitBelongTo = unitBelongTo;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<String, String> getResearchFields() {
		return researchFields;
	}
	public void setResearchFields(Map<String, String> researchFields) {
		this.researchFields = researchFields;
	}
	public String getResearchDirections() {
		return researchDirections;
	}
	public void setResearchDirections(String researchDirections) {
		this.researchDirections = researchDirections;
	}
	public String getTechnicalAbilitys() {
		return technicalAbilitys;
	}
	public void setTechnicalAbilitys(String technicalAbilitys) {
		this.technicalAbilitys = technicalAbilitys;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getExpertId() {
		return expertId;
	}
	public void setExpertId(String expertId) {
		this.expertId = expertId;
	}
	public String getExpertName() {
		return expertName;
	}
	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}
	public Map<String,Object> getSession() {
		return session;
	}


	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExpertService getExpertService() {
		return expertService;
	}
	public void setExpertService(ExpertService expertService) {
		this.expertService = expertService;
	}
}
