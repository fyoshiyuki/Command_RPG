//最上位スーパークラス
public abstract class Animal {

	//フィールド宣言
	private String name;

	//コンストラクタ
	public Animal(String name){
		this.name = name;
	}

	//ゲッター
	public String getName(){
		return this.name;
	}

	//走るメソッドはサブクラスで作って！！
	public abstract void run();
}
