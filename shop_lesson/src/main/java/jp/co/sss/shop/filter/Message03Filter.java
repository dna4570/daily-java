package jp.co.sss.shop.filter;

//import java.io.IOException;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//
///*
// * =========================================================================
// * ◆【10章-2】複数種類のフィルタを利用する (http://localhost:7777/shop_lesson/filter)
// * =========================================================================
// * 
// * 複数のフィルタをまとめて扱う場合、フィルタの実行順を指定する必要がある。
// * その場合、フィルタの実行順を定義する設定クラスが必要になる。
// * また、複数のフィルタをまとめて利用する場合、クラスに@Componentは記述しないので注意すること。
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
//*/
//public class Message03Filter implements Filter {
//
//	// フィルタのオブジェクトが作成された際に実行(doFilterメソッドより前に実行される)
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//	}
//
//	// フィルタの処理を記述
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		System.out.println("Done Message03Filter request");
//		chain.doFilter(request, response);
//		System.out.println("Done Message03Filter response");
//	}
//
//	// フィルタのオブジェクトが削除される際に実行(doFilterメソッドより後に実行される)
//	@Override
//	public void destroy() {
//	}
//}
////=========================================================================