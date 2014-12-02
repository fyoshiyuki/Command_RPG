
public class Slime extends Monster {
	//フィールド宣言はなし

	//コンストラクタ
	public Slime(String name, int hp){
		super(name, hp);
	}
	public Slime(String name){
		this(name, 100);
	}

	//スライムが勇者へ攻撃
	public void attack(Hero hero){
		int damagePoint = hero.getHp() - 30;
		hero.setHp(damagePoint);
	}

	//当インスタンスが倒された時、アイテム報酬を返す
	public Sword getItemDrop(){
		System.out.println("モンスターアイテムの褒美");
		Sword sword = new Sword();
		sword.setItemSword("エクスカリバー", 1000);
		return sword;
	}

	public void profile(){
		System.out.println("**** Slime情報 *************************");
		System.out.println("名前：" + this.getName());
		System.out.println("HP:" + this.getHp());
		System.out.println("****************************************");
	}
}
