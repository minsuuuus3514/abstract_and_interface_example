package game_character;

import character_basic.GameCharacterBasic;
import interfaces.SecondaryClass;

public class BowMaster extends GameCharacterBasic implements SecondaryClass {

	
	@Override
	public void attackMethod() {
		// TODO Auto-generated method stub
		System.out.println("�Ϲ� ȭ��");
	}

	@Override
	public void skillMethod() {
		// TODO Auto-generated method stub
		System.out.println("��öȭ��");
	}
	
	public void archerPassiveSkill() {
		System.out.println("�����");
	}
	
	@Override
	public void secondaryActiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ��");
	}

	@Override
	public void secondaryPassiveSkill() {
		// TODO Auto-generated method stub
		System.out.println("ũ��Ƽ�� ������");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BowMaster bowMaster = new BowMaster();
		System.out.println("** �ü��� ����� ����� **");
		bowMaster.attackMethod();
		bowMaster.skillMethod();
		bowMaster.archerPassiveSkill();
		System.out.println("** ���츶������ ��ų�� ���� ���� **");
		bowMaster.secondaryActiveSkill();
		bowMaster.secondaryPassiveSkill();
	}

	

}
