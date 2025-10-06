package jp.co.sss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * =========================================================================
 * ◆【10章-1】1種類のフィルタを利用する (http://localhost:7777/shop_lesson/filter)
 * ◆【10章-2】複数種類のフィルタを利用する (http://localhost:7777/shop_lesson/filter)
 * =========================================================================
 * 
*/
@Controller
public class FilterController {
	@RequestMapping(path = "/filter")
	public String filter() {
		System.out.println("リクエスト対象のプログラムの処理");
		return "index";
	}
}
//=========================================================================
