package cn.xrmy.controller;


import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.xrmy.biz.NewsService;
import cn.xrmy.biz.ProductService;
import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;
import cn.xrmy.pojo.Product;
import cn.xrmy.pojo.ProductCustom;
import cn.xrmy.pojo.ProductQueryVo;


//使用Controller标识 它是一个控制器
@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/queryProduct")
	public ModelAndView queryNews(HttpServletRequest request,ProductQueryVo productQueryVo)throws Exception{
		
		// 调用service查找 数据库，查询商品列表
		List<ProductCustom> productList = productService.findProductList(productQueryVo);
	
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.addObject("productList", productList);
		//指定视图
		//下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		//modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		//上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("product/productList");
		return modelAndView;
		
	}
	
	@RequestMapping(value ="/editProduct", method = { RequestMethod.POST,RequestMethod.GET })
	public String editItems(Model model,
			@RequestParam(value = "id", required = true) Long items_id)throws Exception {
		// 调用service根据商品id查询商品信息
		Product product = productService.findProductById(items_id);
		// 通过形参中的model将model数据传到页面
		// 相当于modelAndView.addObject方法
		model.addAttribute("product", product);
		return "product/editProduct";
	}
	
	
	@RequestMapping("/editProductSubmit")
	public String editItemsSubmit(Model model,
			                        HttpServletRequest request,
			                        Long id,
			                        ProductCustom productCustom
			                        ) throws Exception {
		
		// 调用service更新商品信息，页面需要将商品信息传到此方法
		productService.updateProduct(id, productCustom);
		// 重定向到商品查询列表
		 return "redirect:queryProduct.action";
		// 页面转发
		// return "forward:queryItems.action";
		//return "success";
	}
	
	@RequestMapping("/addProduct")
	public String editItemsSubmit() throws Exception {
	
		 return "product/addProduct";
	}
	@RequestMapping("/addProductSubmit")
	public String addItemsSubmit(Model model,
			                        HttpServletRequest request,
			                        Product product
			                        ) throws Exception {
		
		   // 调用service更新商品信息，页面需要将商品信息传到此方法
		 productService.insertSelective(product);
		// 重定向到商品查询列表
		 return "redirect:queryProduct.action";
	}
	
	
	//删除新闻
	@RequestMapping("/deleteProduct")
	public String deleteNews( Long id) throws Exception {
				// 调用service更新商品信息，页面需要将商品信息传到此方法
		 productService.deleteByPrimaryKey(id);
				// 重定向到商品查询列表
		 return "redirect:queryProduct.action";
	}

}
