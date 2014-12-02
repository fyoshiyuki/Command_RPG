
public abstract class MainCharacter extends Human{
	int hp;

	//コンストラクタ
	MainCharacter(String name, int money, int hp){
		super(name, money);
		this.setHp(hp);
	}

	//ゲッターとセッター
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp(){
		return this.hp;
	}

	public abstract void attack(Monster monster);
}
