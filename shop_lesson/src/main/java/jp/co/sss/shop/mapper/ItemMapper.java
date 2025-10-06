package jp.co.sss.shop.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import jp.co.sss.shop.entity.Item;

/*
 * =========================================================================
 * ◆【6章-1】全件検索 (http://localhost:7777/shop_lesson/items/findAll)
 * ◆【9章-4】通常のメッセージの出力 (http://localhost:7777/shop_lesson/items/findAll)
 * ◆【11章-2】CSSとJavaScriptの利用 (http://localhost:7777/shop_lesson/items/findAll)
 * =========================================================================
 *
 * マッパー
 *    マッパーとは、データベースに対するCRUD処理を記述したインターフェースのこと。
 *    「検索対象のテーブル名 + Mapper」という形式で命名するとわかりやすい。
 *    マッパーに記述されたメソッドを呼び出すことでSQLが実行され、検索結果を得ることができる。
 *    SQLはマッパーに記述することもできるが、複雑なSQLを記述すると可読性が落ちるため、
 *    講義ではxmlファイル(マッパーxml)に記述する。
 *    マッパーxmlは、「src/main/resources」配下に作成する。
 *    その際、マッパーと同じフォルダ階層になるように作成すること。
 *
 *
 * @Mapper
 *    アノテーションが付与されたファイルが「マッパー」の役割を持つファイルであることを表す
 * 
 *
 * メソッドの戻り値
 *    データベースに対してSQLを実行した際は「検索結果のレコード」が返ってくるが、
 *    マッパーを使用した場合は「検索結果のレコードの情報が格納されたエンティティ」が返ってくる。 
 *    検索結果が2レコードの場合、1レコード目の情報は1つ目のエンティティに、
 *    2レコード目の情報は2つ目のエンティティに格納される。
 *    そして、2つのエンティティを格納したListが最終的に戻ってくる。
 *    仮に検索結果が必ず1件になる場合は、戻り値をListではなくエンティティのみにすること。
 *
 */
@Mapper
public interface ItemMapper {
	List<Item> findAll();
}



//import org.apache.ibatis.annotations.Mapper;
//import jp.co.sss.shop.entity.Item;
//import org.apache.ibatis.annotations.Param; 
//
///*
// * =========================================================================
// * ◆【6章-2】条件検索(主キー検索) (http://localhost:7777/shop_lesson/items/getOne/1)
// * =========================================================================
// *
// * @Param
// *    メソッドの引数をSQLに渡したい場合に使用する。
// *    アノテーション内にはパラメータ名を記述する。
// *    SQL内でパラメータを使用する場合は、「#{パラメータ名}」という形式で記述する。
// *
// */
//@Mapper
//public interface ItemMapper {
//	Item getOne(@Param("id")int id); 
//}



//import java.util.List;
//import org.apache.ibatis.annotations.Mapper;
//import jp.co.sss.shop.entity.Item;
//
///*
// * =========================================================================
// * ◆【6章-3】選択コントロールの動的な作成 (http://localhost:7777/shop_lesson/items/getItems)
// * =========================================================================
// */
//@Mapper
//public interface ItemMapper {
//	List<Item> getItemInfo();  
//}



//import org.apache.ibatis.annotations.Mapper;
//import jp.co.sss.shop.entity.Item;
//import org.apache.ibatis.annotations.Param; 
//
///*
// * =========================================================================
// * ◆【6章-4】登録 (http://localhost:7777/shop_lesson/items/create/input)
// * =========================================================================
// * 
// * メソッドの戻り値
// *    登録・更新・削除の場合、戻り値をintやbooleanにすることも可能。
// *    intの場合は、登録・更新・削除の件数が返ってくる。
// *    booleanの場合は、登録・更新・削除の件数が0件の際にfalse、1件以上の際にtrueが返ってくる。
// *
// */
//@Mapper
//public interface ItemMapper {
//	Item getOne(@Param("id")int id); 
//
//	void insert(Item item);
//}



//import org.apache.ibatis.annotations.Mapper;
//import jp.co.sss.shop.entity.Item;
//import org.apache.ibatis.annotations.Param; 
//
///*
// * =========================================================================
// * ◆【6章-5】更新 (http://localhost:7777/shop_lesson/items/update/input/1)
// * =========================================================================
// */
//@Mapper
//public interface ItemMapper {
//	Item getOne(@Param("id")int id); 
//
//	void update(Item item);  
//}



//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param; 
//import java.util.List;
//import jp.co.sss.shop.entity.Item;
//
///*
// * =========================================================================
// * ◆【6章-6】削除 (http://localhost:7777/shop_lesson/items/delete/input)
// * =========================================================================
// */
//@Mapper
//public interface ItemMapper {
//	List<Item> findAll();
//	
//	void delete(@Param("id") int id);   
//}



//import java.util.List;
//import org.apache.ibatis.annotations.Mapper;
//import jp.co.sss.shop.entity.ItemCategory;
//
///*
// * =========================================================================
// * ◆【7章-1】結合したテーブルの検索(1対1) (http://localhost:7777/shop_lesson/items/findItemAndCategory)
// * =========================================================================
// */
//@Mapper
//public interface ItemMapper {
//	List<ItemCategory> findAllItemCategory(); 
//}



//import java.util.List;
//import org.apache.ibatis.annotations.Mapper;
//import jp.co.sss.shop.entity.ItemCustomer;
//
///*
// * =========================================================================
// * ◆【7章-2】結合したテーブルの検索(1対多) (http://localhost:7777/shop_lesson/items/findItemAndCustomer)
// * =========================================================================
// */
//@Mapper
//public interface ItemMapper {
//	 List<ItemCustomer> findAllItemCustomer();
//}