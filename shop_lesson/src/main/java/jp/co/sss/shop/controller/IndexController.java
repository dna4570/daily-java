package jp.co.sss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//
///*
// * =========================================================================
// * ◆【3章-1】画面遷移 (http://localhost:7777/shop_lesson/before)
// * =========================================================================
//*/
@Controller
public class IndexController {

	@RequestMapping(path = "/before") 
	public String before() { 
		return "before";
	}

	@RequestMapping(path = "/after") 
	public String after() { 
		return "after";
	}

}
////=========================================================================



//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///*
// * =========================================================================
// * ◆【3章-2】フォワード (http://localhost:7777/shop_lesson/forward)
// * =========================================================================
// * 
// * forward:フォワード先のURL
// *    フォワードを行うには「forward:フォワード先のURL」と記述する。
// *    サンプルでは「/」と記述しているので、forward()からindex()へフォワードしている。
// *
//*/
//@Controller
//public class IndexController {
//	@RequestMapping(path = "/forward") 
//	public String forward() { 
//		return "forward:/";
//	}
//
//	@RequestMapping(path = "/")
//	public String index() {
//		return "index";
//	}
//}
////=========================================================================



//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;

/*
 * =========================================================================
 * ◆【3章-3】リダイレクト (http://localhost:7777/shop_lesson/redirect)
 * =========================================================================
 * 
 * redirect:リダイレクト先のURL
 *    リダイレクトを行うには「redirect:リダイレクト先のURL」と記述する。
 *    サンプルでは「/」と記述しているので、redirect()からindex()へリダイレクトしている。
 *
*/
//@Controller
//public class IndexController {
//	@RequestMapping(path = "/redirect") 
//	public String redirect() { 
//		return "redirect:/";
//	}
//
//	@RequestMapping(path = "/")
//	public String index() {
//		return "index";
//	}
//}
//=========================================================================