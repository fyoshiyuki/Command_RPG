//装備クラス（剣）
public class Sword {

	//フィールド宣言
	private String name;
	private int damage;

	//コンストラクタ
	public Sword(){
		this.name = "名無しの剣";
		this.damage = 50;
	}

	//装備
	public void setItemSword(String name, int damage){
		this.name = name;
		this.damage = damage;
	}

	//ゲッター
	public String getSwordName(){
		return this.name;
	}
	public int getSwordDamage(){
		return this.damage;
	}
}
