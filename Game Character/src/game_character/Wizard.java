package game_character;

import character_basic.GameCharacterBasic;
import interfaces.SecondaryClass;

public class Wizard extends GameCharacterBasic implements SecondaryClass {

	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("���̾");
		System.out.println("���̽��̻���");
	}
	
	public void magicianPassiveSkill() {
		System.out.println("���� ȸ��");
	}
	
	@Override
	public void secondaryActiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ�� ��Ʈ");
	}

	@Override
	public void secondaryPassiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("���� �ǵ�");
	}

	

}
