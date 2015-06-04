package cn.xrmy.mapper;



import java.util.List;


import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;

public interface NewsMapperCustom {
    //商品查询列表
	public List<NewsCustom> findNewsList(NewsQueryVo newsQueryVo)throws Exception;
}