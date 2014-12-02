
public class Hero extends MainCharacter{
	//フィールド
	private Sword sword;

	//コンストラクタ
	Hero(String name, int money, int hp, Sword sword){
		super(name, hp, money);
		if(sword != null){
			this.sword = sword;
		}else{
			this.sword = new Sword();
		}
		System.out.println("勇者作成時の武器");
		System.out.println("剣の名前：" + this.sword.getSwordName());
		System.out.println("剣の威力：" + this.sword.getSwordDamage());
	}
	Hero(String name){
		this("不明", 200, 100, null);
	}

	//攻撃メソッド
	public void attack(Monster monster){
		System.out.println("勇者" + this.getName() + "がモンスター" + monster.getName() + "へ攻撃");
		//モンスターのHPを減らします
		System.out.println("勇者の攻撃力sword:" + sword.getSwordDamage());
		System.out.println("攻撃前モンスターHP:" + monster.getHp());
		monster.setHp((monster.getHp() - sword.getSwordDamage()));
		System.out.println("モンスター" + monster.getName() + " 残HP :" + monster.getHp());
		//モンスターのHPが0以下の場合の処理
		if(monster.getHp() <= 0){
			//モンスターからドロップできたら次の処理を実行
			if(monster.getItemDrop() != null){
				//Sword型の参照変数swordに入手したアイテムを装備する。
				this.sword = monster.getItemDrop();

//				System.out.println("アイテムを装備");
//				System.out.println("装備名：" + this.sword.getSwordName());
//				System.out.println("威力" + this.sword.getSwordDamage());
			}
		}
	}

	//勇者のデータ表示
	public void profile(){
		System.out.println("**** Hero情報 **************************");
		System.out.println("名前：" + this.getName());
		System.out.println("所持金：" + this.getMoney());
		System.out.println("HP:" + this.getHp());
		System.out.println("装備名:" + this.sword.getSwordName());
		System.out.println("****************************************");
	}
}
