package senderView;

// E => 実装側クラスの型
public interface GetResult<E> {

	/*
	 * setResultメソッドが呼び出されることを明示(!=強制)、ここから画面を呼び出す。
	 * 自クラスに値として結果を戻す必要がないならばnullを指定してください。
	 * また第２引数はsetResultでの識別ナンバーとして使用してください。
	 * 分岐がない場合は使用しないでかまいません。
	 */
	void startForResult(E receiveClass, int callNumber);


	//呼び出し先から結果を受けるメソッド
	void setResult(Object retValue, int callNumber);

}

/*
 * このインターフェースはAndroidの
 * 「startActivityForResultメソッド」を
 * 参考にしています。
 */