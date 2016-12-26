package cn.edu.bjtu.weibo.service;
import cn.edu.bjtu.weibo.dao.UserDAO;

public class FollowingNumberServiceImpl implements FollowingNumberService{

	@Override
	public int getFollowingNumber(String userId) {
		// TODO Auto-generated method stub
		UserDAO ud = new UserDAO();
		int FollowingNumber = ud.getFollowingNumber(userId);
		return FollowingNumber;
	}

}
