package cn.xrmy.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import cn.xrmy.biz.NewsService;
import cn.xrmy.mapper.NewsMapper;
import cn.xrmy.mapper.NewsMapperCustom;
import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;

/**
 * 
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsMapperCustom newsMapperCustom;
	
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public List<NewsCustom> findNewsList(NewsQueryVo newsQueryVo)
			throws Exception {
		//通过ItemsMapperCustom查询数据库
		return newsMapperCustom.findNewsList(newsQueryVo);
	}

	@Override
	public News findNewsById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return newsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateNews(Long id, NewsCustom newsCustom) throws Exception {
		        //添加业务校验，通常在service接口对关键参数进行校验
				//校验 id是否为空，如果为空抛出异常
				//更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括 大文本类型字段
				//updateByPrimaryKeyWithBLOBs要求必须转入id
		         newsCustom.setId(id);
		         newsMapper.updateByPrimaryKeyWithBLOBs(newsCustom);
	}



}
