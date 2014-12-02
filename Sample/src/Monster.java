
public abstract class Monster extends Animal{

	//フィールドの宣言
	private int hp;
	private final static int DEFAULT_HP  = 200;

	//コンストラクタ
	public Monster(String name, int hp){
		super(name);
		this.hp = hp;
	}
	public Monster(String name){
		this(name, DEFAULT_HP);
	}

	//逃げるメソッド
	public void run(){
		System.out.println("モンスターは笑みを浮かべて立ち去った！！");
	}

	//ゲッターとセッター
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp(){
		return this.hp;
	}

	//攻撃メソッドはサブクラスでつくって
	public abstract void attack(Hero hero);
	public abstract Sword getItemDrop();	//モンスターが倒された時のアイテム報酬
}
