package com.bean;

public class TePaiYuan {
	public String userName;//用户userName 数据库主键
	public String name;//姓名
	public String email;//电子邮箱
	public String tel;//固定电话
	public String phone;//手机
	public int P;		//手机信息是否隐藏
	public String birthday;//出生日期
	public String school;//毕业院校
	public String gongZuoShiJian;//开始工作时间
	public String fangXiang;//研究方向
	public String zhuanChang;//技术专长
	public String shengFen;//省份
	public String chengShi;//城市
	public String address;//详细地址
	public String lingYu1;//研究领域.1
	public String lingYu2;//研究领域.2
	public String lingYu3;//研究领域.3
	public String lingYu4;//研究领域.4
	public String qiYeFuWuType;//企业服务类型
	public String qiYeFuWu;//可为企业提供的服务
	public String pingJia;//企业对专家的评价
	public String zhiWei;//职位
	public String zhiCheng;//职称
	public String danWei;//单位
	public String zhuanYe;//专业
	public String jianJie;//简介
	public int hot;//热度
	
	public String getId() {
		return userName;
	}
	public void setId(String id) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getShengFen() {
		return shengFen;
	}
	public void setShengFen(String shengFen) {
		this.shengFen = shengFen;
	}
	public String getChengShi() {
		return chengShi;
	}
	public void setChengShi(String chengShi) {
		this.chengShi = chengShi;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLingYu1() {
		return lingYu1;
	}
	public void setLingYu1(String lingYu1) {
		this.lingYu1 = lingYu1;
	}
	public String getLingYu2() {
		return lingYu2;
	}
	public void setLingYu2(String lingYu2) {
		this.lingYu2 = lingYu2;
	}
	public String getLingYu3() {
		return lingYu3;
	}
	public void setLingYu3(String lingYu3) {
		this.lingYu3 = lingYu3;
	}
	public String getLingYu4() {
		return lingYu4;
	}
	public void setLingYu4(String lingYu4) {
		this.lingYu4 = lingYu4;
	}
	public String getZhiWei() {
		return zhiWei;
	}
	public void setZhiWei(String zhiWei) {
		this.zhiWei = zhiWei;
	}
	public String getZhiCheng() {
		return zhiCheng;
	}
	public void setZhiCheng(String zhiCheng) {
		this.zhiCheng = zhiCheng;
	}
	public String getJianJie() {
		return jianJie;
	}
	public void setJinaJie(String jinaJie) {
		this.jianJie = jianJie;
	}
	public int getP() {
		return P;
	}
	public void setP(int p) {
		P = p;
	}
	
}
