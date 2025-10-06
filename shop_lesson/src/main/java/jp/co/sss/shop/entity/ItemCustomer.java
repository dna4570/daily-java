package jp.co.sss.shop.entity;

import java.util.List;

/*
 * =========================================================================
 * ◆【7章-2】結合したテーブルの検索(1対多) (http://localhost:7777/shop_lesson/items/findItemAndCustomer)
 * =========================================================================
 *
 * 結合されたテーブルの情報を取得する場合、
 * テーブル同士のリレーションに合うようにエンティティを作成する必要がある。
 * 
 * itemsテーブルとcustomerテーブルを結合した場合、itemsテーブルを基準に考えると、
 * itemsテーブルの1レコードに対してcustomerテーブルの複数レコードが紐付く。
 * この「itemsテーブルの1レコードに対してcustomerテーブルの複数レコードが紐付く」という状態を、
 * 「1対多のリレーション」という。
 * 
 * 1対多の場合は、「多」のテーブルのエンティティのListをフィールドに定義する。
 * サンプルの場合はエンティティCustomerのListを定義することにより、
 * 「itemsテーブルの1レコードに対してcustomerテーブルの複数レコードが紐付く」という状態を再現している。
 *
 */
public class ItemCustomer {
	private Integer id;
	private String name;
	private Integer price;
	private List<Customer> customerList;

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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
}
//=========================================================================