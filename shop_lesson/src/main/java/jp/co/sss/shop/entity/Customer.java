package jp.co.sss.shop.entity;

/*
 * =========================================================================
 * ◆【7章-2】結合したテーブルの検索(1対多) (http://localhost:7777/shop_lesson/items/findItemAndCustomer)
 * =========================================================================
 */
public class Customer {
	private Integer id;
	private String name;
	private Integer itemId;
	private Integer quantity;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
//=========================================================================