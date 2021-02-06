package game_character;

import character_basic.GameCharacterBasic;
import interfaces.SecondaryClass;

public class BowMaster extends GameCharacterBasic implements SecondaryClass {

	
	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("일반 화살");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("강철화살");
	}
	
	public void archerPassiveSkill() {
		System.out.println("은폐술");
	}
	
	@Override
	public void secondaryActiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("불화살");
	}

	@Override
	public void secondaryPassiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("크리티컬 데미지");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BowMaster bowMaster = new BowMaster();
		System.out.println("** 궁수의 기술을 계승함 **");
		bowMaster.attackMethod();
		bowMaster.skillMethod();
		bowMaster.archerPassiveSkill();
		System.out.println("** 보우마스터의 스킬을 새로 익힘 **");
		bowMaster.secondaryActiveSkill();
		bowMaster.secondaryPassiveSkill();
	}

	

}
