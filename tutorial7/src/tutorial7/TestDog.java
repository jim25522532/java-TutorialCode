package tutorial7;

/**
 * 這是一個測試的類別而已~
 * 建立了 a這個動物
 * 建立了b這隻狗狗
 * 我們讓a動物跟b狗狗去做移動看看會發生什麼事!
 * Overriding(程式術語:多載,想像是覆蓋掉方法)
  * @author User
 *  
 */
public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a = new Animal();   // Animal類別 的物件
	     Animal b = new Dog();   // Animal類別 但是是狗狗的物件

	     a.move();   // 讓Animal移動
	     b.move();   // 讓狗狗移動
	}

}
