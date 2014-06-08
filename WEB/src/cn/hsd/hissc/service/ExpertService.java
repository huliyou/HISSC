package cn.hsd.hissc.service;

import cn.hsd.hissc.model.Expert;

public interface ExpertService {
	/**
	 * 添加专家
	 * @param expert
	 */
    public void addExpert(Expert expert);
    /**
     * 删除专家
     * @param expert
     */
    public void deleteExpert(Expert expert);
    /**
     * 修改专家
     * @param expert
     */
    public void updateExpert(Expert expert);
    /**
     * 根据专家编号查找专家
     * @param zid
     * @return  用户对象，如果用户不存在，则返回 null
     */
    public Expert getExpertByZid(int zid);
    
}
