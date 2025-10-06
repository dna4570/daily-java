package jp.co.sss.shop.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

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
 * ここでは、アノテーション型クラスについて説明する。
 *
 *
 * アノテーション型クラスを作成する場合、下記のように記述する。
 * 
 *   public @interface アノテーション名 {
 *       処理
 *   }
 *
 * 
 * クラス内には最低限、下記の3つのメソッドを記述する必要があるが、
 * 編集するのはmessage()のみで、それ以外は基本的に変更不要。
 * 
 *   ・String message() default：入力チェックに該当した際に表示するエラーメッセージを指定
 *   ・Class<?>[] groups() default {}：対象の入力チェックをグルーピングする
 *   ・Class<? extends Payload>[] payload() default {}：任意のカテゴリを付与する
 * 
 * 
 * 各アノテーションの説明
 *   @Target
 *     アノテーションを記述できる場所の指定。
 *     何も指定しない場合、アノテーションが記述できる場所であればどこにでも記述することができる。
 *     複数指定したい場合、{ }の中にカンマ区切りで記述。
 *     サンプルでは「java.lang.annotation.ElementType.TYPE」と指定しているが、
 *     これはクラス・インターフェース・アノテーション・enumに記述できることを表す。
 * 
 *   @Retention
 *     アノテーションの情報をどの段階まで保持するかを指定する。
 *     アノテーションを記述したクラスは、コンパイルして作成されたclassファイル内にもアノテーションの情報が残る(デフォルトでは)。
 *     設定次第では、コンパイル時にアノテーションの情報を消すことも可能。
 *     サンプルでは「RetentionPolicy.RUNTIME」と指定しているが、これはプログラムの実行時も情報を保持することを表す。
 * 
 *   @Documented
 *     JavaDocを作成した際に、独自アノテーションの情報を載せるようにする。
 *     デフォルトだと、独自アノテーションの情報は載らない。
 * 
 *   @Constraint
 *     検証クラスを指定。
 * 
 */
@Target({ java.lang.annotation.ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { LoginValidator.class })
public @interface Login {
    String message() default "ユーザID、もしくはパスワードが間違っています。";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    // チェック対象となるフィールド名を定義
    String fieldUserId() default "userId";
    String fieldPassword() default "password";
}
