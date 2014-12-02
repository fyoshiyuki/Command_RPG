
public class Human extends Animal{

	//フィールド宣言
	private int money;
	private final static int DEFAULT_MONEY = 100;

	//コンストラクタ
	Human(String name,int money){
		super(name);
		this.money = money;
	}
	Human(String name){
		this(name, DEFAULT_MONEY);
	}

	//Animalクラスのrun()のオーバーライド
	public void run(){
		System.out.println("一般人は逃げた！！");
	}

	//ゲッター
	public int getMoney(){
		return money;
	}
}
