package jp.co.sss.shop.filter;

//import java.io.IOException;
//
//import org.springframework.stereotype.Component;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//
//
///*
// * =========================================================================
// * ◆【10章-1】1種類のフィルタを利用する (http://localhost:7777/shop_lesson/filter)
// * =========================================================================
// * 
// * フィルタとは、リクエスト・レスポンス時に何らかの処理を行う機能。
// * 複数のリクエストの際に共通的に行うような処理がある場合に使用する。
// *
// *
// * 処理イメージ
// * 
// *   フィルタなし
// *     ①リクエストが投げられる
// *     ②リクエスト対象のプログラムの処理が実行される
// *     ③レスポンスが返される
// *
// *   フィルタあり
// *     ①リクエストが投げられる
// *     ②リクエスト時のフィルタの処理
// *     ③リクエスト対象のプログラムの処理が実行される
// *     ④レスポンス時のフィルタの処理
// *     ⑤レスポンスが返される
// *
// *
// * フィルタを作成する場合、下記のように記述する。
// * 
// *   @Component
// *   public class フィルタ名 implements Filter {
// *       処理
// *   }
// *
// *
// * フィルタ内には下記の3つのメソッドを記述する必要があるが、
// * フィルタの処理内容を記述するのはdoFilter()メソッドのため、残りの2つに関しては必要に応じて作成すること。
// * 
// *   ・init()：フィルタの処理の前に行いたい処理がある場合は、ここに記述する
// *   ・doFilter()：フィルタの処理を記述
// *   ・destroy()：フィルタの処理の後に行いたい処理がある場合は、ここに記述する
// *
//*/
//@Component
//public class Message01Filter implements Filter {
//	
//	// フィルタのオブジェクトが作成された際に実行(doFilterメソッドより前に実行される)
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//	}
//
//
//	// フィルタの処理を記述
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		// FilterChain.doFilter()メソッドより前の処理は、リクエスト時に実行される
//		System.out.println("Done Message01Filter request");
//
//		// リクエストのURLに該当する処理が実行される
//		chain.doFilter(request, response);
//
//		// FilterChain.doFilterメソッドより後の処理は、レスポンス時に実行される
//		System.out.println("Done Message01Filter response");
//	}
//
//	
//	// フィルタのオブジェクトが削除される際に実行(doFilterメソッドより後に実行される)
//	@Override
//	public void destroy() {
//	}
//}
////=========================================================================