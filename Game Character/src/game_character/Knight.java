package game_character;

import character_basic.GameCharacterBasic;
import interfaces.SecondaryClass;

public class Knight extends GameCharacterBasic implements SecondaryClass {

	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("����");
		System.out.println("���");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� �˼�");
	}
	
	public void worriorPassiveSkill() {
		System.out.println("ȸ�Ǽ�");
	}

	@Override
	public void secondaryActiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("���м�");
	}

	@Override
	public void secondaryPassiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("ü�� ȸ��");
	}
	
}
