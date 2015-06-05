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
import cn.xrmy.pojo.News;
import cn.xrmy.pojo.NewsCustom;
import cn.xrmy.pojo.NewsQueryVo;


//使用Controller标识 它是一个控制器
@Controller
@RequestMapping("/news")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	//商品查询列表
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
	public String editItems(Model model,
			@RequestParam(value = "id", required = true) Long items_id)throws Exception {
		// 调用service根据商品id查询商品信息
		News news = newsService.findNewsById(items_id);
		// 通过形参中的model将model数据传到页面
		// 相当于modelAndView.addObject方法
		model.addAttribute("news", news);
		return "news/editNews";
	}
	
	//提交编辑
		@RequestMapping("/editNewsSubmit")
		public String editItemsSubmit(
				Model model,
				HttpServletRequest request,
				Long id,
				NewsCustom newsCustom
				) throws Exception {
			// 调用service更新商品信息，页面需要将商品信息传到此方法
			newsService.updateNews(id, newsCustom);

			// 重定向到商品查询列表
			 return "redirect:queryNews.action";
			// 页面转发
			// return "forward:queryItems.action";
			//return "success";
		}

		
		//添加新闻
		@RequestMapping("/addNews")
		public String addNews() throws Exception {
						
			return "news/addNews";
							
		}
		
		
		
		//添加新闻
		@RequestMapping("/addNewsSubmit")
		public String addNewsSubmit(
						Model model,
						HttpServletRequest request,
						News news
						) throws Exception {
					// 调用service更新商品信息，页面需要将商品信息传到此方法
					newsService.addNews(news);
					// 重定向到商品查询列表
					 return "redirect:queryNews.action";
					// 页面转发
					// return "forward:queryItems.action";
					//return "success";
				}
		
		//删除新闻
				@RequestMapping("/deleteNews")
				public String deleteNews( Long id) throws Exception {
							// 调用service更新商品信息，页面需要将商品信息传到此方法
					 newsService.deleteByPrimaryKey(id);
							// 重定向到商品查询列表
					 return "redirect:queryNews.action";
				}
}
