//プログラム開始クラス
public class RpgMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword sword = null;
		Hero hero = new Hero("onuki", 200, 300, sword);
		hero.profile();

		Slime slime = new Slime("スライム");
		slime.profile();

		//勇者の攻撃
		System.out.println("勇者の攻撃");
		hero.attack(slime);
		hero.profile();
		slime.profile();

		//スライムの攻撃
		System.out.println("スライムの攻撃");
		slime.attack(hero);
		hero.profile();
		slime.profile();
	}

}
