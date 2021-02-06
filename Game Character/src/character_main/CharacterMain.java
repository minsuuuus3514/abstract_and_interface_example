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
		
		System.out.println("** [전사] 기본 캐릭터 능력을 계승함 **");
		warrior.attackMethod();
		warrior.skillMethod();
		warrior.worriorPassiveSkill();
		
		System.out.println("** [궁수] 기본 캐릭터 능력을 계승함 **");
		archer.attackMethod();
		archer.skillMethod();
		archer.archerPassiveSkill();
		
		System.out.println("** [마법사] 기본 캐릭터 능력을 계승함 **");
		magician.attackMethod();
		magician.skillMethod();
		magician.magicianPassiveSkill();
		
		System.out.println("** [나이트] 전사의 기술을 계승함 **");
		knight.attackMethod();
		knight.skillMethod();
		knight.worriorPassiveSkill();
		System.out.println("** 나이트의 새로운 스킬 **");
		knight.secondaryActiveSkill();
		knight.secondaryPassiveSkill();
		
		System.out.println("** [보우마스터] 궁수의 기술을 계승함 **");
		bowMaster.attackMethod();
		bowMaster.skillMethod();
		bowMaster.archerPassiveSkill();
		System.out.println("** 보우마스터의 새로운 스킬 **");
		bowMaster.secondaryActiveSkill();
		bowMaster.secondaryPassiveSkill();
		
		System.out.println("** [위자드] 마법사의 기술을 계승함 **");
		wizard.attackMethod();
		wizard.skillMethod();
		wizard.magicianPassiveSkill();
		System.out.println("** 위자드의 새로운 스킬 **");
		wizard.secondaryActiveSkill();
		wizard.secondaryPassiveSkill();
	}

}
