package cn.hsd.hissc.action;

import java.util.Map;
import cn.hsd.hissc.model.Expert;
import cn.hsd.hissc.service.ExpertService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ShowExpertDetailsAction extends ActionSupport{
	private Map<String,Object> session ;		//���ڴ洢��ʾ��Ϣ��session�Ự��Χ
	private String message ;		//�洢��ʾ��Ϣ
	private Expert expert ;		//�洢��ȡ��ר����Ϣ
	private ExpertService expertService ;		//���������ݿ��ж�ȡ��Ϣ
	
	/**�����Ϣ*/
	private String expertId ;		//����֮ǰҳ�洫�͹�����ר��id
	private String expertName ;		//ר������
	private int attentions ;		//��ע��
	private String location ;		//���ڵ���
	private String contacts ;		//��ϵ��
	private String telephone ;		//��ϵ�绰
	private String mobile ;		//�ֻ�
	private String email ;		//�����ʼ�
	private String address ;		//��ַ
	
	/**�Ҳ���Ϣ*/
	//������Ϣ
	private String birthday ; 		//��������
	private String startWorkingTime ;		//��ʼ����ʱ��
	private String college ;		//��ҵԺУ
	private String unitBelongTo ;		//������λ
	private String position ;		//ְλ
	private String title ;			//ְ��

	//ҵ����Ϣ
	private Map<String,String> researchFields ;		//�о����� 
	private String researchDirections ;		//�о�����
	private String technicalAbilitys ;		//��������
	private String introduce;		//ר�Ҽ��
	
	@Override
	public String execute() throws Exception {
		this.expert = expertService.getExpertByExpertId(expertId) ;
		
		if (expert == null) {		//��ѯר����Ϣ�����ڣ����ص�message��ͼ��ʾ��ʾ��Ϣ
			message = "�Բ�������ѯ��ר����Ϣ�����ڣ�";
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
		this.researchFields.put("��������",rf[0]) ;
		this.researchFields.put("�������",rf[1]) ;
		this.researchFields.put("�������",rf[2]) ;
		this.researchFields.put("�������",rf[3]) ;
		this.researchFields.put("�������",rf[4]) ;
		
		this.researchDirections = expert.getResearchDirections() ;
		this.technicalAbilitys = expert.getTechnicalAbilitys() ;
		this.introduce = expert.getIntroduce() ;
		return "showexpertdetails";
	}// #execute
	
	/**
	 * �����û���ע�¼�
	 * 
	 * @throws Exception
	 */
	public void dealWithConcern() throws Exception {
		// �û�δ��ע����ר��ʱ�����Ӹ�ר�ҵĹ�ע��
		if (null == session.get(expertId)) {
			int newHot = expert.getAttentions() + 1; // ��ע�ȼ�1
			expert.setAttentions(newHot);
			expertService.updateExpert(expert);		//���µ�����Ա��Ϣ���浽���ݿ�;���ܺ���ֻ���Ϣ�أ�
			session.put(expertId, expertId); // ���û���עһ������Ա֮��������ԱidΪ��ֵ��������ע������Աid�ŵ�session��
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
