package jp.co.sss.shop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * =========================================================================
 * ◆【4章-1】パラメータの取得 (http://localhost:7777/shop_lesson/login)
 * =========================================================================
 *
 * method属性
 *    リクエストの種類をGETかPOSTか指定できる。
 *    URLだけでなく、リクエストの種類によってそのメソッドを実行するか指定したい場合に使用する。
 *    GET時に実行したい場合は「RequestMethod.GET」、POST時に実行したい場合は「RequestMethod.POST」と指定する。
 *    サンプルの場合、URLが「http://localhost:7777/shop/doGetLogin」かつ、リクエストが「GET」場合にdoGetLogin()が実行され、
 *    URLが「http://localhost:7777/shop/doPostLogin」かつ、リクエストが「POST」場合にdoPostLogin()が実行される。
 *
 *
 * リクエストパラメータを受け取る場合
 *    リクエストパラメータを受け取る場合、パラメータ名と同じ名前の引数を記述することで、
 *    自動で引数にパラメータが代入される。(パラメータ名は入力フォームのname属性の属性値)
 *    サンプルでは、login.htmlから「userId」「password」というパラメータが送られる。
 *    そして、コントローラにはパラメータと同名の引数「userId」と「password」が記述されているため、
 *    パラメータが自動で引数に代入されている。
 *
 *    パラメータは、引数に代入される前に引数の型に合わせて自動的に型変換が行われる。 
 *    そのため、パラメータを受け取る引数がint or Integer型かつ、
 *    パラメータが「abc」といった整数に変換できないものの場合、型変換が正常に行われないため注意。
 *    また、パラメータが空文字もしくは未入力の場合、引数にはnullが代入される。
 *
 */
@Controller
public class SessionController {
	@RequestMapping(path = "/login")
	public String login() {
		return "session/login";
	}

	@RequestMapping(path = "/doGetLogin", method = RequestMethod.GET)
	public String doGetLogin(int userId, String password) {
		System.out.println("ユーザID:" + userId);
		System.out.println("パスワード:" + password);
		return "session/login";
	}

	@RequestMapping(path = "/doPostLogin", method = RequestMethod.POST)
	public String doPostLogin(int userId, String password) {
		System.out.println("ユーザID:" + userId);
		System.out.println("パスワード:" + password);
		return "session/login";
	}
}
////=========================================================================



//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import jp.co.sss.shop.form.LoginForm;
//
///*
// * =========================================================================
// * ◆【4章-2】Formクラスの利用 (http://localhost:7777/shop_lesson/login)
// * =========================================================================
// */
//@Controller
//public class SessionController {
//	@RequestMapping(path = "/login")
//	public String login() {
//		return "session/login";
//	}
//
//	@RequestMapping(path = "/doLogin", method = RequestMethod.POST)
//	public String doLogin(LoginForm form) {
//		System.out.println("ユーザID:" + form.getUserId()); 
//		System.out.println("パスワード:" + form.getPassword()); 
//		return "session/login"; 
//	}
//}
////=========================================================================



//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import jp.co.sss.shop.form.LoginForm;
//
///*
// * =========================================================================
// * ◆【5章-1】リクエストスコープ (http://localhost:7777/shop_lesson/login)
// * =========================================================================
// *
// * リクエストスコープに値を格納する場合
// *    リクエストスコープに値を格納するには、Model.addAttribute()を使用する。
// *    そのため、まずはModelオブジェクトを作成する必要がある。
// *
// *    Modelオブジェクトを作成するには、メソッドの引数にModelを記述する。
// *    そうすることで、メソッド実行時にModelオブジェクトが自動で作成され、引数に代入される。
// *
// *    次に、addAttribute()を使用してリクエストスコープに値を格納する。
// *    このメソッドには、引数を2つ指定する必要がある。
// *    第1引数には「スコープ変数名(格納する値の名前)」、第2引数には「スコープに格納する値」を指定する。
// *    サンプルの場合、「TIS一郎」を「userName」というスコープ変数名でスコープに格納している。
// * 
//*/
//@Controller
//public class SessionController {
//	@RequestMapping(path = "/login")
//	public String login() {
//		return "session/login";
//	}
//
//	@RequestMapping(path = "/doLogin", method = RequestMethod.POST) 
//	public String doLogin(LoginForm form, Model model) { 
//		if (form.getUserId() == 123 && "aaa".equals(form.getPassword())) { 
//	    	model.addAttribute("userName", "TIS一郎"); 
//	        return "session/top"; 
//		} else {
//	    	return "session/login"; 
//		} 
//	}
//
//	@RequestMapping(path = "/myPage") 
//	public String myPage(String userName, Model model) { 
//		model.addAttribute("userName", userName);
//		return "session/my_page";
//	}
//}
////=========================================================================



//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import jakarta.servlet.http.HttpSession;
//import jp.co.sss.shop.form.LoginForm; 
//
///*
// * =========================================================================
// * ◆【5章-2】セッションスコープ (http://localhost:7777/shop_lesson/login)
// * =========================================================================
// *
// * セッションスコープに値を格納する場合
// *    セッションスコープに値を格納するには、HttpSession.setAttribute()を使用する。
// *    そのため、まずはHttpSessionオブジェクトを作成する必要がある。
// *    
// *    HttpSessionオブジェクトを作成するには、メソッドの引数にHttpSessionを記述する。
// *    そうすることで、メソッド実行時にHttpSessionオブジェクトが自動で作成され、引数に代入される。
// *
// *    次に、setAttribute()を使用してセッションスコープに値を格納する。
// *    このメソッドには、引数を2つ指定する必要があるが、引数に関してはModel.addAttribute()と同様。
// *
// *
// * セッションスコープの値を破棄する場合
// *    セッションスコープの値を破棄するにはHttpSession.invalidate()を使用する。
// *    ただ、スコープ内の全ての値が破棄されるので、特定の値のみを破棄したい場合は、
// *    HttpSession.removeAttribute()を使用する。
// *    removeAttribute()を使用する際は、引数に破棄したい値のスコープ変数名を記述する。
// * 
//*/
//@Controller
//public class SessionController {
//	@RequestMapping(path = "/login")
//	public String login() {
//		return "session/login";
//	}
//
//	@RequestMapping(path = "/doLogin", method = RequestMethod.POST) 
//	public String doLogin(LoginForm form, HttpSession session) { 
//		if (form.getUserId() == 123 && "aaa".equals(form.getPassword())) { 
//			session.setAttribute("userName", "TIS一郎"); 
//	        return "session/top"; 
//		} else {
//	    	return "session/login"; 
//		}
//	}
//
//	@RequestMapping(path = "/myPage") 
//	public String myPage() {
//		return "session/my_page"; 
//	}
//
//	@RequestMapping(path = "/doLogout") 
//	public String doLogout(HttpSession session) { 
//		session.invalidate(); 
//		return "redirect:/myPage"; 
//	} 
//}
////=========================================================================



//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import jakarta.servlet.http.HttpSession;
//import jakarta.validation.Valid;
//import jp.co.sss.shop.form.LoginForm; 
//
///*
// * =========================================================================
// * ◆【8章-1】入力チェック (http://localhost:7777/shop_lesson/login)
// * ◆【9章-1】エラーメッセージの変更 (http://localhost:7777/shop_lesson/login)
// * ◆【9章-2】メッセージ中への文字列の埋め込み (http://localhost:7777/shop_lesson/login)
// * ◆【9章-3】独自入力チェック (http://localhost:7777/shop_lesson/login)
// * ◆【10章-3】ログインチェック (http://localhost:7777/shop_lesson/login)
// * =========================================================================
// *
// * @ModelAttribute
// *    メソッドか引数に記述でき、記述した箇所によって動きが異なる。
// *    
// *    メソッドの場合
// *       リクエストURLに該当するメソッドの実行前にこのアノテーションがついたメソッドが実行され、
// *       その戻り値がリクエストスコープに格納される。
// *       その際、戻り値の型の先頭を小文字にしたものがスコープ変数名になる。
// *
// *    引数の場合
// *       引数をリクエストスコープに格納する。
// *       その際、引数の型の先頭を小文字にしたものがスコープ変数名になる。
// *
// *
// * @Valid
// *    このアノテーションが記述されたFormの各フィールド対して入力チェックを行う。
// * 
// * BindingResult
// *    入力チェックの判定結果の情報が入っているオブジェクト。
// *    必ず入力チェックを行ったFormの後に記述する必要があるので注意。
// *
// * BindingResult.hasErrors()
// *    入力チェックを行い、1つでもチェックに該当した場合はtrueを、
// *    チェックに該当しなかった場合はfalseを返す。
// * 
// */
//@Controller
//public class SessionController {
//	@RequestMapping(path = "/login")
//	public String login(@ModelAttribute LoginForm form) {
//		return "session/login";
//	}
//
//	@RequestMapping(path = "/doLogin", method = RequestMethod.POST)
//	public String doLogin(@Valid @ModelAttribute LoginForm form, BindingResult result, HttpSession session) {
//		// チェックに該当した場合はlogin()を実行
//		if (result.hasErrors()) {
//			return login(form);
//		}
//
//		if (form.getUserId() == 123 && "aaa".equals(form.getPassword())) {
//			session.setAttribute("userName", "TIS一郎");
//			return "session/top";
//		} else {
//			return "session/login";
//		}
//	}
//
//	@RequestMapping(path = "/myPage") 
//	public String myPage() {
//		return "session/my_page"; 
//	}
//	
//	@RequestMapping(path = "/doLogout") 
//	public String doLogout(HttpSession session) { 
//		session.invalidate(); 
//		return "redirect:/myPage"; 
//	} 
//}
//=========================================================================