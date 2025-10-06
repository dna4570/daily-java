package jp.co.sss.shop.entity;

/*
 * =========================================================================
 * ◆【6章-1】全件検索 (http://localhost:7777/shop_lesson/items/findAll)
 * ◆【6章-2】条件検索(主キー検索) (http://localhost:7777/shop_lesson/items/getOne/1)
 * ◆【6章-3】選択コントロールの動的な作成 (http://localhost:7777/shop_lesson/items/getItems)
 * ◆【6章-4】登録 (http://localhost:7777/shop_lesson/items/create/input)
 * ◆【6章-5】更新 (http://localhost:7777/shop_lesson/items/update/input/1)
 * ◆【6章-6】削除 (http://localhost:7777/shop_lesson/items/delete/input)
 * ◆【9章-4】通常のメッセージの出力 (http://localhost:7777/shop_lesson/items/findAll)
 * ◆【11章-2】CSSとJavaScriptの利用 (http://localhost:7777/shop_lesson/items/findAll)
 * =========================================================================
 *
 * Entity
 *    JavaBeansの一種。
 *    今回作成するEntityは、検索結果の1レコード分の情報を格納するためのJavaBeans。
 *    サンプルでは、itemsテーブルの1レコード分の情報(id・name・price)を格納するため、
 *    それぞれの列に対応したフィールドを定義している。
 *
 *
 *    命名規則
 *       エンティティの各フィールドは、検索結果の列と同じ名前を付ける必要がある。
 *       その際、列名がスネークケースのものは、キャメルケースに変換する。
 *       例えば列名が「user_name」の場合、対応するフィールド名は「userName」となる。
 *
 *       また、getter・setterメソッドに関してはFormと同様に
 *       「get(set) + 頭文字を大文字にしたフィールド名」にすること。
 *
 */
public class Item {
	private Integer id;
	private String name;
	private Integer price;

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
}
//=========================================================================