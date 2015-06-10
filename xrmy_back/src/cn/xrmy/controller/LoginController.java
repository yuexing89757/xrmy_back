 package cn.xrmy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xrmy.biz.NewsService;
import cn.xrmy.biz.UserService;
import cn.xrmy.pojo.UserCustom;
import cn.xrmy.pojo.UserQueryVo;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	// 登陆
	@RequestMapping("/login")
	public String login(HttpSession session, UserQueryVo userQueryVo)
			throws Exception {

		// 调用service进行用户身份验证
		// ...
		UserCustom  userCustom=userService.findNewsByNameAndPwd(userQueryVo);
       if(null!=userCustom){
    	// 在session中保存用户身份信息
   		 session.setAttribute("username", userQueryVo.getUserCustom().getUsername());
   		// 重定向到商品列表页面
   		   return "redirect:/news/queryNews.action";
       }else{
    	   return "redirect:/news/queryNews.action";
       }
		
	}

	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到商品列表页面
		return "redirect:/news/queryNews.action";
	}

}
