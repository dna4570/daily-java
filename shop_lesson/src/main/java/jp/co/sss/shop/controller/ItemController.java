package jp.co.sss.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import jp.co.sss.shop.mapper.ItemMapper;

/*
 * =========================================================================
 * ◆【6章-1】全件検索 (http://localhost:7777/shop_lesson/items/findAll)
 * ◆【9章-4】通常のメッセージの出力 (http://localhost:7777/shop_lesson/items/findAll)
 * ◆【11章-2】CSSとJavaScriptの利用 (http://localhost:7777/shop_lesson/items/findAll)
 * =========================================================================
 *
 * @Autowired
 *    フィールドにこのアノテーションが付与されると、アプリケーション起動時に、
 *    そのフィールドに対応したオブジェクトが自動で作成される。
 *    この機能のことを「DI」と呼ぶ。
 *
*/
@Controller
public class ItemController {
	@Autowired
	ItemMapper itemMapper;

	@RequestMapping(path = "/items/findAll")
	public String showItemList(Model model) {
		model.addAttribute("items", itemMapper.findAll());
		return "items/item_list";
	}
}
//=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【6章-2】条件検索(主キー検索) (http://localhost:7777/shop_lesson/items/getOne/1)
// * =========================================================================
// *
// * @RequestMapping内の「{ }」
// *    「{ }」を記述することで、URLの「{ }」に該当する部分をパラメータにすることができる。
// *    その際、「{ }」内の値がパラメータ名となる。
// *    例えば「http://localhost:7777/shop/items/getOne/35」というURLの場合、
// *    「35」がパラメータで、「id」がパラメータ名となる。
// *    このように、URLに含まれたパラメータのことを「URLパラメータ」と呼ぶ。
// * 
// * @PathVariable
// *    このアノテーションがついた引数に対し、URLパラメータを代入する。
// *    URLパラメータ名と引数名が同じ場合はアノテーションのみで代入されるが、
// *    そうでない場合は「@PathVariable("URLパラメータ名")」と記述する必要がある。
// *
//*/
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//
//	@RequestMapping(path = "/items/getOne/{id}") 
//	public String showItem(@PathVariable int id, Model model) {
//		model.addAttribute("item", itemMapper.getOne(id)); 
//		return "items/item"; 
//	}
//}
////=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【6章-3】選択コントロールの動的な作成 (http://localhost:7777/shop_lesson/items/getItems)
// * =========================================================================
//*/
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//
//	@RequestMapping(path = "/items/getItems") 
//	public String getItems(Model model) { 
//		model.addAttribute("items", itemMapper.getItemInfo()); 
//		return "items/item_form"; 
//	}
//
//	@RequestMapping(path = "/items/showItems") 
//	public String showItems(int dropdown, int checkbox, int radio) { 
//		System.out.println("ドロップダウンリスト：" + dropdown); 
//		System.out.println("チェックボックス：" + checkbox); 
//		System.out.println("ラジオボタン：" + radio); 
//		return "index"; 
//	} 
//}
////=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import jp.co.sss.shop.entity.Item;
//import jp.co.sss.shop.form.ItemForm;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【6章-4】登録 (http://localhost:7777/shop_lesson/items/create/input)
// * =========================================================================
// * 
// * エンティティに代入していないのにidを取得できる理由
// *    insert()メソッド実行時に、シーケンスで自動採番されたidが「id」フィールドに代入される。
// *    そのため、getId()メソッドでidの取得ができるようになっている。
// * 
//*/
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//
//	@RequestMapping(path = "/items/create/input") 
//	public String createInput() { 
//		return "items/create_input"; 
//	} 
//
//	@RequestMapping(path = "/items/create/complete", method = RequestMethod.POST) 
//	public String createComplete(ItemForm form) {
//		Item item = new Item(); 
//		item.setName(form.getName()); 
//		item.setPrice(form.getPrice()); 
//
//		itemMapper.insert(item); 
//
//		return "redirect:/items/getOne/" + item.getId(); 
//	}
//
//	@RequestMapping(path = "/items/getOne/{id}") 
//	public String showItem(@PathVariable int id, Model model) { 
//		model.addAttribute("item", itemMapper.getOne(id)); 
//		return "items/item"; 
//	}
//}
////=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import jp.co.sss.shop.entity.Item;
//import jp.co.sss.shop.form.ItemForm;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【6章-5】更新 (http://localhost:7777/shop_lesson/items/update/input/1)
// * =========================================================================
//*/
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//	
//	@RequestMapping(path = "/items/update/input/{id}") 
//	public String updateInput(@PathVariable int id, Model model) {
//		// 入力画面の初期値として設定するため、更新対象のレコードを取得
//		model.addAttribute("item", itemMapper.getOne(id)); 
//		return "items/update_input"; 
//	}
//
//	@RequestMapping(path = "/items/update/complete/{id}", method = RequestMethod.POST)
//	public String updateComplete(@PathVariable int id, ItemForm form) {
//		Item item = itemMapper.getOne(id); 
//		item.setName(form.getName()); 
//		item.setPrice(form.getPrice()); 
//
//		itemMapper.update(item);
//
//		return "redirect:/items/getOne/" + item.getId(); 
//	}
//
//	@RequestMapping(path = "/items/getOne/{id}") 
//	public String showItem(@PathVariable int id, Model model) { 
//		model.addAttribute("item", itemMapper.getOne(id)); 
//		return "items/item"; 
//	}
//}
////=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import jp.co.sss.shop.form.ItemForm;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【6章-6】削除 (http://localhost:7777/shop_lesson/items/delete/input)
// * =========================================================================
//*/
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//	
//	@RequestMapping(path = "/items/delete/input") 
//	public String deleteInput() { 
//		return "items/delete_input"; 
//	}
//
//	@RequestMapping(path = "/items/delete/complete") 
//	public String deleteComplete(ItemForm form) { 
//		itemMapper.delete(form.getId()); 
//		return "redirect:/items/findAll"; 
//	}
//	
//	@RequestMapping(path = "/items/findAll")
//	public String showItemList(Model model) {
//		model.addAttribute("items", itemMapper.findAll());
//		return "items/item_list";
//	}
//}
////=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【7章-1】結合したテーブルの検索(1対1) (http://localhost:7777/shop_lesson/items/findItemAndCategory)
// * =========================================================================
// */
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//
//	@RequestMapping("/items/findItemAndCategory") 
//	public String showItemAndCategoryList(Model model) { 
//		model.addAttribute("itemCategoryList", itemMapper.findAllItemCategory()); 
//		return "items/item_category_list"; 
//	}
//}
////=========================================================================



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import jp.co.sss.shop.mapper.ItemMapper;
//
///*
// * =========================================================================
// * ◆【7章-2】結合したテーブルの検索(1対多) (http://localhost:7777/shop_lesson/items/findItemAndCustomer)
// * =========================================================================
// */
//@Controller
//public class ItemController {
//	@Autowired
//	ItemMapper itemMapper;
//
//	@RequestMapping("/items/findItemAndCustomer") 
//	public String showItemAndCustomerList(Model model) { 
//		model.addAttribute("itemCustomerList", itemMapper.findAllItemCustomer()); 
//		return "items/item_customer_list"; 
//	}
//}
////=========================================================================