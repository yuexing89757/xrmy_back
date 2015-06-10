package cn.xrmy.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.xrmy.biz.UserService;
import cn.xrmy.mapper.ProductMapper;
import cn.xrmy.mapper.ProductMapperCustom;
import cn.xrmy.mapper.UserMapper;
import cn.xrmy.mapper.UserMapperCustom;
import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.User;
import cn.xrmy.pojo.UserCustom;
import cn.xrmy.pojo.UserQueryVo;


public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapperCustom userMapperCustom;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserCustom> findNewsList(UserQueryVo userQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCustom findNewsById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCustom findNewsByNameAndPwd(UserQueryVo userQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return userMapperCustom.findNewsByNameAndPwd(userQueryVo);
	}

	@Override
	public void updateUser(Long id, UserCustom userCustom) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
