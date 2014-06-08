package cn.hsd.hissc.service;

import cn.hsd.hissc.model.Enterprise;

public interface EnterpriseService {
	/**
	 * 添加企业
	 * @param enter
	 */
    public void addEnterprise(Enterprise enter);
    /**
     * 删除企业
     * @param enter
     */
    public void deleteEnterprise(Enterprise enter);
    /**
     * 修改企业
     * @param enter
     */
    public void updateEnterprise(Enterprise enter);
    /**
     * 根据 id 查找企业
     * @param qid
     * @return  用户对象，如果用户不存在，则返回 null
     */
    public Enterprise getEnterById(int qid);
}
