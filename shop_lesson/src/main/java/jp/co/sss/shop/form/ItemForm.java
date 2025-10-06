package jp.co.sss.shop.form;

/*
 * =========================================================================
 * ◆【6章-4】登録 (http://localhost:7777/shop_lesson/items/create/input)
 * ◆【6章-5】更新 (http://localhost:7777/shop_lesson/items/update/input/1)
 * ◆【6章-6】削除 (http://localhost:7777/shop_lesson/items/delete/input)
 * =========================================================================
 */
public class ItemForm {
	private int id;
	private String name;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
//=========================================================================