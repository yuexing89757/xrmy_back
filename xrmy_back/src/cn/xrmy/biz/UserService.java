package cn.xrmy.biz;

import java.util.List;

import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.User;
import cn.xrmy.pojo.UserCustom;
import cn.xrmy.pojo.UserQueryVo;


public interface UserService {
	
	//商品查询列表
	public List<UserCustom> findNewsList(UserQueryVo userQueryVo) throws Exception;
	
	//根据id查询商品信息
	public UserCustom findNewsById(Long id) throws Exception;
	
	//根据id查询商品信息
	public UserCustom findNewsByNameAndPwd(UserQueryVo userQueryVo) throws Exception;
	
	//修改商品信息
	public void updateUser(Long id,UserCustom userCustom) throws Exception;
	
	//添加新闻信息
	public void addUser(User user) throws Exception;
	
	//删除新闻信息
	public void deleteByPrimaryKey(Long id) throws Exception;
	

}
