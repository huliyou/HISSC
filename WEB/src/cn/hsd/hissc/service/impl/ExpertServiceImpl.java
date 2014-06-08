package cn.hsd.hissc.service.impl;

import cn.hsd.hissc.dao.ExpertDao;
import cn.hsd.hissc.model.Expert;
import cn.hsd.hissc.service.ExpertService;

public class ExpertServiceImpl implements ExpertService{
    private ExpertDao expertDao;
	public void addExpert(Expert expert) {
		expertDao.add(expert);
	}

	public void deleteExpert(Expert expert) {
		expertDao.delete(expert);		
	}

	public void updateExpert(Expert expert) {
		expertDao.update(expert);
		
	}

	public Expert getExpertByZid(int zid) {
		
		return expertDao.get(zid);
	}

}
