package day6;

import java.util.Scanner;


class Containers{
	public static WeaponType getHit(String weaponClass) throws Exception{
		WeaponType weapon_used=new WeaponType();
		Weapon weapon=(Weapon)Class.forName(weaponClass).newInstance();
		//dependency injection
		weapon_used.weapon=weapon;
		return weapon_used;
	}
}

public class ChildDogDemo {
	public static void main(String[] args) throws Exception {
		BullDog tiger=new BullDog();
		NaughtyChild baby=new NaughtyChild();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item...:");
		String item=scan.next();
		baby.playWithDog(tiger, item);
		
		WeaponType weapon_used=Containers.getHit(args[0]);
		weapon_used.getHit();
	}
}
class BullDog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("you beat I bite......");
		}
		else if(item.equals("stone")) {
			System.out.println("you hit I bark.....");
		}
	}
}



class WeaponType{
	Weapon weapon;
	public void getHit() {
		weapon.weapon_used(this);
	}
}

abstract class Weapon{
	public abstract void weapon_used(WeaponType weapon_type);
}

class Stick extends Weapon{
	@Override
	public void weapon_used(WeaponType weapon_type) {
		System.out.println("you beat I bite......");
	}
}

class Stone extends Weapon{
	@Override
	public void weapon_used(WeaponType weapon_type) {
		System.out.println("you hit I bark.....");
	}
}

class NaughtyChild{
	public void playWithDog(BullDog dog,String item) {
		dog.play(item);
	}
}