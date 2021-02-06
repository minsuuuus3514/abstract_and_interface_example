package character_main;

import game_character.Archer;
import game_character.BowMaster;
import game_character.Knight;
import game_character.Magician;
import game_character.Warrior;
import game_character.Wizard;

public class CharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Basic Class
		Warrior warrior = new Warrior();
		Archer archer = new Archer();
		Magician magician = new Magician();
		
		// Secondary Class
		Knight knight = new Knight();
		BowMaster bowMaster = new BowMaster();
		Wizard wizard = new Wizard();
		
		System.out.println("** [����] �⺻ ĳ���� �ɷ��� ����� **");
		warrior.attackMethod();
		warrior.skillMethod();
		warrior.worriorPassiveSkill();
		
		System.out.println("** [�ü�] �⺻ ĳ���� �ɷ��� ����� **");
		archer.attackMethod();
		archer.skillMethod();
		archer.archerPassiveSkill();
		
		System.out.println("** [������] �⺻ ĳ���� �ɷ��� ����� **");
		magician.attackMethod();
		magician.skillMethod();
		magician.magicianPassiveSkill();
		
		System.out.println("** [����Ʈ] ������ ����� ����� **");
		knight.attackMethod();
		knight.skillMethod();
		knight.worriorPassiveSkill();
		System.out.println("** ����Ʈ�� ���ο� ��ų **");
		knight.secondaryActiveSkill();
		knight.secondaryPassiveSkill();
		
		System.out.println("** [���츶����] �ü��� ����� ����� **");
		bowMaster.attackMethod();
		bowMaster.skillMethod();
		bowMaster.archerPassiveSkill();
		System.out.println("** ���츶������ ���ο� ��ų **");
		bowMaster.secondaryActiveSkill();
		bowMaster.secondaryPassiveSkill();
		
		System.out.println("** [���ڵ�] �������� ����� ����� **");
		wizard.attackMethod();
		wizard.skillMethod();
		wizard.magicianPassiveSkill();
		System.out.println("** ���ڵ��� ���ο� ��ų **");
		wizard.secondaryActiveSkill();
		wizard.secondaryPassiveSkill();
	}

}
