package cn.edu.bjtu.weibo.service.serviceImpl;
import cn.edu.bjtu.weibo.dao.daoImpl.UserDAOImpl;

public class FollowingNumberServiceImpl implements FollowingNumberService{

	@Override
	public int getFollowingNumber(String userId) {
		// TODO Auto-generated method stub
		UserDAOImpl ud = new UserDAOImpl();
		int FollowingNumber = ud.getFollowingNumber(userId);
		return FollowingNumber;
	}

}
