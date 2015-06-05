package cn.xrmy.biz;

import java.util.List;

import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.Product;
import cn.xrmy.pojo.ProductCustom;
import cn.xrmy.pojo.ProductQueryVo;


public interface ProductService {
	
	//商品查询列表
	public List<ProductCustom> findProductList(ProductQueryVo proQueryVo) throws Exception;
	
	//根据id查询商品信息
	
	public Product findProductById(Long id) throws Exception;
	
	//修改商品信息
	
	public void updateProduct(Long id,ProductCustom proCustom) throws Exception;
	
	
	//添加商品提交
    public void insertSelective(Product product) throws Exception;
    
  //删除
    public void deleteByPrimaryKey(Long id) throws Exception;
		
}
