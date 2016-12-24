package cn.edu.bjtu.weibo.service;
import cn.edu.bjtu.weibo.dao;

/**
 * Usually it will show automatically beside the user profile.
 * 
 * @author Liu Jinfeng
 *
 */

public FollowingNumberServiceImpl implement FollowingNumberService{
	/**
	 * 
	 * @param userId
	 * @return
	 */
	int getFollowingNumber(String userId)
	{
		int followingNumbers£»
		UserDAO ud = new UserDAO();
		String str = ud.getFollowingNumber(userID);
		try {
			followingNumbers = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return followingNumbers£»
	}
}