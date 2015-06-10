package cn.xrmy.mapper;

import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.UserCustom;
import cn.xrmy.pojo.UserQueryVo;

public interface UserMapperCustom {
	public UserCustom selectByPrimaryKey(Long id);
	public UserCustom findNewsByNameAndPwd(UserQueryVo userQueryVo);
}