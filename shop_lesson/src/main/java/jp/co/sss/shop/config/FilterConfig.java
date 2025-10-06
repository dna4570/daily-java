//package jp.co.sss.shop.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import jp.co.sss.shop.filter.Message02Filter;
//import jp.co.sss.shop.filter.Message03Filter;
//
///*
// * =========================================================================
// * ◆【10章-2】複数種類のフィルタを利用する (http://localhost:7777/shop_lesson/filter)
// * =========================================================================
// * 
// * 複数のフィルタをまとめて扱う場合、フィルタの実行順を指定する必要がある。
// * その場合、フィルタの実行順を定義する設定クラスが必要になる。
// * 
// *
// * 複数のフィルタがある場合の処理イメージ(フィルタが2つの場合)
// *
// *   ①リクエストが投げられる
// *   ②リクエスト時のフィルタ1の処理
// *   ③リクエスト時のフィルタ2の処理
// *   ④リクエスト対象のプログラムの処理が実行される
// *   ⑤レスポンス時のフィルタ2の処理
// *   ⑥レスポンス時のフィルタ1の処理
// *   ⑦レスポンスが返される
// *
// *
// * 設定クラスを作成する場合、下記のように記述する。
// * 
// *   @Configuration
// *   public class 設定クラス名 implements WebMvcConfigurer {
// *       処理
// *   }
// *
//*/
//@Configuration
//public class FilterConfig implements WebMvcConfigurer {
//
//	// フィルタ分メソッドを定義する(ここはMessage02Filterに関する定義)
//	@Bean
//	public FilterRegistrationBean<Message02Filter> configMessage02Filter() {
//		// FilterRegistrationBeanクラス(フィルタに対して設定を加えるためのクラス)のオブジェクトを作成。
//		// ジェネリクス(<>)には、設定対象のフィルタ名を記述。
//		FilterRegistrationBean<Message02Filter> bean = new FilterRegistrationBean<Message02Filter>();
//
//		// 設定対象のフィルタのオブジェクトを渡す
//		bean.setFilter(new Message02Filter());
//		
//		// 上記で渡したフィルタの実行順を設定。
//		// 引数の値の小さい順に実行される。
//		// サンプルの場合は、Message03Filter→Message02Filterの順で実行される。
//		bean.setOrder(2);
//
//		return bean;
//	}
//
//
//	@Bean
//	public FilterRegistrationBean<Message03Filter> configMessage03Filter() {
//		FilterRegistrationBean<Message03Filter> bean = new FilterRegistrationBean<Message03Filter>();
//		bean.setFilter(new Message03Filter());
//		bean.setOrder(1);
//		return bean;
//	}
//}
////=========================================================================