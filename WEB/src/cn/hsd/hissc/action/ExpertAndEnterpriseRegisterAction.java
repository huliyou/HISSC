package cn.hsd.hissc.action;

import cn.hsd.hissc.model.Enterprise;
import cn.hsd.hissc.model.Expert;
import cn.hsd.hissc.service.EnterpriseService;
import cn.hsd.hissc.service.ExpertService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ExpertAndEnterpriseRegisterAction extends ActionSupport{
    Expert expert = new Expert();//专家对象
    Enterprise enter = new Enterprise();//企业对象
    private ExpertService expertService;//专家的服务层
    private EnterpriseService enterService;//企业的服务层
	
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
	//判断注册者身份
	@Override
	public String execute() throws Exception {
		
		return super.execute();
	}
	//企业注册
	public String EnterpriseExecute() throws Exception {
		enterService.addEnterprise(enter);
		return "enterpriseSuccess";
	}
	//专家注册
    public String ExpertExecute() throws Exception {
    	expertService.addExpert(expert);
    	return "expertSuccess";
    }
}
