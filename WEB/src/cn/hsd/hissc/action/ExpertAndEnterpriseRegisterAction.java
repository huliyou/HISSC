package cn.hsd.hissc.action;

import cn.hsd.hissc.model.Enterprise;
import cn.hsd.hissc.model.Expert;
import cn.hsd.hissc.service.EnterpriseService;
import cn.hsd.hissc.service.ExpertService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ExpertAndEnterpriseRegisterAction extends ActionSupport{
    Expert expert = new Expert();//ר�Ҷ���
    Enterprise enter = new Enterprise();//��ҵ����
    private ExpertService expertService;//ר�ҵķ����
    private EnterpriseService enterService;//��ҵ�ķ����
	
	public Expert getExpert() {
		return expert;
	}
	public void setExpert(Expert expert) {
		this.expert = expert;
	}
	public Enterprise getEnter() {
		return enter;
	}
	public void setEnter(Enterprise enter) {
		this.enter = enter;
	}
	public ExpertService getExpertService() {
		return expertService;
	}
	public void setExpertService(ExpertService expertService) {
		this.expertService = expertService;
	}
	public EnterpriseService getEnterService() {
		return enterService;
	}
	public void setEnterService(EnterpriseService enterService) {
		this.enterService = enterService;
	}
	//�ж�ע�������
	@Override
	public String execute() throws Exception {
		
		return super.execute();
	}
	//��ҵע��
	public String EnterpriseExecute() throws Exception {
		enterService.addEnterprise(enter);
		return "enterpriseSuccess";
	}
	//ר��ע��
    public String ExpertExecute() throws Exception {
    	expertService.addExpert(expert);
    	return "expertSuccess";
    }
}
