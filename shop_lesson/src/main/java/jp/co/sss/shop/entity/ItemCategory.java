package jp.co.sss.shop.entity;

/*
 * =========================================================================
 * ◆【7章-1】結合したテーブルの検索(1対1) (http://localhost:7777/shop_lesson/items/findItemAndCategory)
 * =========================================================================
 *
 * 結合されたテーブルの情報を取得する場合、
 * テーブル同士のリレーションに合うようにエンティティを作成する必要がある。
 * 
 * itemsテーブルとcategoriesテーブルを結合した場合、itemsテーブルを基準に考えると、
 * itemsテーブルの1レコードに対してcategoriesテーブルの1レコードが紐付く。
 * この「itemsテーブルの1レコードに対してcategoriesテーブルの1レコードが紐付く」という状態を、
 * 「1対1のリレーション」という。
 * 
 * 1対1の場合は、今までと同様に検索結果に応じたエンティティを作成すればよい。
 * 今回は商品番号・商品名・価格・カテゴリ名を取得するので、その4つをフィールドに持つエンティティを作成する。
 *
 */
public class ItemCategory {
	private Integer id;
	private String itemName;
	private Integer price;
	private String categoryName;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
//=========================================================================