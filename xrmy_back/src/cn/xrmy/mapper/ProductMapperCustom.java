package cn.xrmy.mapper;



import java.util.List;




import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.ProductCustom;
import cn.xrmy.pojo.ProductQueryVo;

public interface ProductMapperCustom {
    //商品查询列表
	public List<ProductCustom> findProductList(ProductQueryVo productQueryVo)throws Exception;
}