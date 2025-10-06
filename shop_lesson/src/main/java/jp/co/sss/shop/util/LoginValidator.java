package jp.co.sss.shop.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/*
 * =========================================================================
 * ◆【9章-3】独自入力チェック (http://localhost:7777/shop_lesson/login)
 * ◆【10章-3】ログインチェック (http://localhost:7777/shop_lesson/login)
 * =========================================================================
 *
 * 予め用意されているアノテーションでは不可能な入力チェックを行いたい場合、
 * オリジナルの入力チェックを作成することができる。
 * オリジナルの入力チェックを作成するには、「アノテーション型クラス(アノテーションを定義するクラス)」と、
 * 「検証クラス(入力チェックの処理を定義するクラス)」を作成する必要がある。
 * ここでは、検証クラスについて説明する。
 *
 *
 * 検証クラスを作成する場合、下記のように記述する。
 * 
 *   public class クラス名 implements ConstraintValidator<アノテーション型クラス, Object> {
 *       処理
 *   }
 * 
 */
public class LoginValidator implements ConstraintValidator<Login, Object> {
    private String userId;
    private String password;


    // 入力チェックの処理の前に実行されるメソッド。
    // 事前に行いたい処理がある場合は、ここに記述する。
    @Override
    public void initialize(Login annotation) {
		// アノテーションを定義するクラスからチェック対象となるフィールド名を取得
        this.userId = annotation.fieldUserId();
        this.password = annotation.fieldPassword();
    }


    // 入力チェックを行っているメソッド。
    // チェックの結果、問題ない場合はtrueを、エラーの場合はfalseを返すようにする。
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
    	BeanWrapper beanWrapper = new BeanWrapperImpl(value);
    	
		// getPropertyValue()を使用し、チェック対象となるフィールドの値を取得。
    	// 引数にはフィールド名を指定する。
		// 取得した値はObject型で返ってくるので、必要に応じてキャストすること。
        Integer userId = (Integer)beanWrapper.getPropertyValue(this.userId);
        String password = (String)beanWrapper.getPropertyValue(this.password);

        // ユーザIDが「123」かつ、パスワードが「aaa」かチェック
        if (userId.intValue() == 123 && "aaa".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
