package jp.co.sss.shop.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
 * =========================================================================
 * ◆【10章-3】ログインチェック (http://localhost:7777/shop_lesson/login)
 * =========================================================================
*/
@Component
public class LoginCheckFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		// リクエストURLを取得
		String requestURL = httpRequest.getRequestURI();

		// リクエストURLが「/myPage(ログイン後に実行されるべきURL)」の場合、ログインチェックを実施
		if (requestURL.endsWith("/myPage")) {
			// セッション情報を取得
			HttpSession session = httpRequest.getSession();
			// セッション情報からユーザ名を取得
			String userName = (String) session.getAttribute("userName");

			// ユーザ名が存在しない(null)場合、ログイン画面にリダイレクトする
			if (userName == null) {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
			// ユーザ名が存在する場合、リクエスト対象のコントローラを実行
			} else {
				chain.doFilter(request, response);
			}

		// リクエストURLが「/myPage」でない場合、ログインチェックは実施しない
		} else {
			chain.doFilter(request, response);
		}
	}
	
	@Override
	public void destroy() {
	}
}
//=========================================================================
