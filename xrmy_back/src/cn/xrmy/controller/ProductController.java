package cn.xrmy.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String editItemsSubmit(Model model,HttpServletRequest request,
			                               Long id,ProductCustom productCustom) throws Exception {
		// 调用service更新商品信息，页面需要将商品信息传到此方法
		productService.updateProduct(id, productCustom);
		// 重定向到商品查询列表
		 return "redirect:queryProduct.action";
		// 页面转发
		// return "forward:queryItems.action";
		//return "success";
	}
	
	/*//商品查询列表
	//@RequestMapping实现 对queryItems方法和url进行映射，一个方法对应一个url
	//一般建议将url和方法写成一样
	@RequestMapping("/queryNews")
	public ModelAndView queryNews(HttpServletRequest request,
			NewsQueryVo newsQueryVo)throws Exception{
		
		System.out.println(request.getParameter("id"));

		// 调用service查找 数据库，查询商品列表
		List<NewsCustom> newsList = newsService.findNewsList(newsQueryVo);
	
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.addObject("newsList", newsList);
		//指定视图
		//下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		//modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		//上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("news/newsList");
		return modelAndView;
		
	}
	
	
	
	@RequestMapping(value ="/editNews", method = { RequestMethod.POST,RequestMethod.GET })
	// @RequestParam里边指定request传入参数名称和形参进行绑定。
	// 通过required属性指定参数是否必须要传入
	// 通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定。
	public String editItems(Model model,
			@RequestParam(value = "id", required = true) Integer items_id)throws Exception {
		// 调用service根据商品id查询商品信息
		News news = newsService.findNewsById(items_id);
		// 通过形参中的model将model数据传到页面
		// 相当于modelAndView.addObject方法
		model.addAttribute("news", news);
		return "news/editNews";
	}
	
	
		@RequestMapping("/editNewsSubmit")
		public String editItemsSubmit(
				Model model,
				HttpServletRequest request,
				Integer id,
				NewsCustom newsCustom
				) throws Exception {
			// 调用service更新商品信息，页面需要将商品信息传到此方法
			newsService.updateNews(id, newsCustom);

			// 重定向到商品查询列表
			 return "redirect:queryNews.action";
			// 页面转发
			// return "forward:queryItems.action";
			//return "success";
		}*/


}
