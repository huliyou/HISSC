package cn.hsd.hissc.service;

import cn.hsd.hissc.model.Enterprise;

public interface EnterpriseService {
	/**
	 * �����ҵ
	 * @param enter
	 */
    public void addEnterprise(Enterprise enter);
    /**
     * ɾ����ҵ
     * @param enter
     */
    public void deleteEnterprise(Enterprise enter);
    /**
     * �޸���ҵ
     * @param enter
     */
    public void updateEnterprise(Enterprise enter);
    /**
     * ���� id ������ҵ
     * @param qid
     * @return  �û���������û������ڣ��򷵻� null
     */
    public Enterprise getEnterById(int qid);
}
