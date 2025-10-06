package jp.co.sss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * =========================================================================
 * ◆【11章-1】基本的な属性、制御系属性 (http://localhost:7777/shop_lesson/thymeleaf)
 * =========================================================================
 */
@Controller
public class ThymeleafController {

	@RequestMapping(path = "/thymeleaf")
	public String showItemList(Model model) {
		// htmlで使用する値の準備
		model.addAttribute("message", "<h3>ThymeleafSample</h3>");
		model.addAttribute("num", 100);
		model.addAttribute("gender", 2);
		model.addAttribute("category_id", 3);
		model.addAttribute("numArray", new int[] {23, 41, 58});
		model.addAttribute("deptId", 1);
		model.addAttribute("id1", 11);
		model.addAttribute("id2", 22);
		return "thymeleaf";
	}

	@RequestMapping(path = "/items")
	public String doGetLogin(Model model, Integer i1, Integer i2) {
		// htmlで使用する値の準備
		model.addAttribute("message", "<h3>ThymeleafSample</h3>");
		model.addAttribute("num", 100);
		model.addAttribute("gender", 2);
		model.addAttribute("category_id", 3);
		model.addAttribute("numArray", new int[] {23, 41, 58});
		model.addAttribute("deptId", 1);
		model.addAttribute("id1", i1);
		model.addAttribute("id2", i2);
		return "thymeleaf";
	}
}
//=========================================================================
