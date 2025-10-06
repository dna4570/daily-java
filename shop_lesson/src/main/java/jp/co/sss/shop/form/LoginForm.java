package jp.co.sss.shop.form;



/*
 * =========================================================================
 * ◆【4章-2】Formクラスの利用 (http://localhost:7777/shop_lesson/login)
 * ◆【5章-1】リクエストスコープ (http://localhost:7777/shop_lesson/login)
 * ◆【5章-2】セッションスコープ (http://localhost:7777/shop_lesson/login)
 * =========================================================================
 *
 * 複数のデータをまとめて格納するための入れ物用クラスのことを「JavaBeans」といい、以下ような特徴を持つ。
 * 
 * ・publicなクラス
 * ・フィールドがprivateになっている
 * ・フィールドにアクセスするpublicなgetter・setterメソッドがある
 * ・引数のないコンストラクタがある(「new クラス名()」ができる)
 * 
 * JavaBeansは、格納するデータに応じて「Form」「Entity」「DTO」というように名称が変わる。
 * 今回作成するFormは、入力フォームから送られたパラメータを格納するためのJavaBeans。
 * Formを作成する場合、以下の点に注意すること。
 * 
 * ・パラメータ名とフィールド名は同じにすること
 * ・getterメソッド名を「get + 頭文字を大文字にしたフィールド名」にすること
 * ・setterメソッド名を「set + 頭文字を大文字にしたフィールド名」にすること
 *
 */
public class LoginForm {
	private int userId;
	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
////=========================================================================



//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
///*
// * =========================================================================
// * ◆【8章-1】入力チェック (http://localhost:7777/shop_lesson/login)
// * ◆【9章-1】エラーメッセージの変更 (http://localhost:7777/shop_lesson/login)
// * ◆【9章-2】メッセージ中への文字列の埋め込み (http://localhost:7777/shop_lesson/login)
// * =========================================================================
// *
// * 入力フォームに入力した値が正しいかチェックすることを「入力チェック(Validation)」という。
// * Formの各フィールドに入力チェック用のアノテーションを記述することで、入力チェックが可能になる。
// * 下記以外の入力チェック用のアノテーションに関しては、P127参照。
// * 
// * @Max
// *    指定した値以下かどうかチェック。
// *
// * @NotBlank
// *    null、空文字、スペース等の空白を意味する値でないかチェック。
// *    似たようなアノテーションで@NotEmpty、@NotNullがある。
// *    それぞれの違いは「https://qiita.com/NagaokaKenichi/items/67a63c91a7db8717fc7d」参照。
// * 
// * @Size
// *    指定の文字数以内かチェック。
// *    最小値と最大値を指定でき、デフォルトの最小値は0、最大値はIntegerクラスの最大値。
// *
// * @Pattern
// *    正規表現に該当するかチェック。
// *    サンプルの場合は「半角英数字」を表す。
// *    正規表現の詳しい読み方は「http://gimite.net/help/devas-ja/all_regex.html」参照。
// *
// * 型のチェック
// *    フィールドの型がintやInteger、もしくはDateの場合、代入される値の型チェックが自動で行われるため、
// *    型チェックに関してはアノテーションを記述する必要はない。
// *    詳細はP120参照。
// *
// */
//public class LoginForm {
//    @Max(value = 999)
//    private int userId; 
// 
//    @NotBlank
//    @Size(max = 16)
//    @Pattern(regexp = "^[a-zA-Z0-9]+$")
//    private String password;
//
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//}
////=========================================================================


//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
//import jp.co.sss.shop.util.Login;
//
///*
// * =========================================================================
// * ◆【9章-3】独自入力チェック (http://localhost:7777/shop_lesson/login)
// * ◆【10章-3】ログインチェック (http://localhost:7777/shop_lesson/login)
// * =========================================================================
// */
//@Login
//public class LoginForm {
//    @Max(value = 999) 
//    private int userId; 
// 
//    @NotBlank 
//    @Size(max = 16) 
//    @Pattern(regexp = "^[a-zA-Z0-9]+$") 
//    private String password; 
//
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//}
//=========================================================================