package cn.hsd.hissc.service;

import cn.hsd.hissc.model.Expert;

public interface ExpertService {
	/**
	 * ���ר��
	 * @param expert
	 */
    public void addExpert(Expert expert);
    /**
     * ɾ��ר��
     * @param expert
     */
    public void deleteExpert(Expert expert);
    /**
     * �޸�ר��
     * @param expert
     */
    public void updateExpert(Expert expert);
    /**
     * ����ר�ұ�Ų���ר��
     * @param zid
     * @return  �û���������û������ڣ��򷵻� null
     */
    public Expert getExpertByZid(int zid);
    
}
