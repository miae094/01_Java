package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.println("============캐릭터 생성============");
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n", job, nickname);
		System.out.println("현재 레벨 : " + level);
		System.out.println("현재 hp : " + hp);
		System.out.println("현재 mp : " + mp);
		System.out.println("현재 경험치 : " + exp);
		
	}
	
	public void attack(double exp) {
//		전달받은 경험치를 현재 경험치에 누적하고, 공격했다는 메세지	출력.
//		(단, 현재 경험치가 300 이상이면	현재 레벨을 1 증가시키고,
//		레벨이 올랐다는 메세지 출력)
	
		this.exp += exp;
		System.out.println(nickname +"의 강한 공격!!!!  현재 경험치 : " + this.exp);
		if(this.exp >= 300) {
			level++;
			System.out.println("레벨이 올랐습니다! 현재 레벨 : " + level);
		}
		
		
	}
	
	public void dash() {
//		대시 할 때 마다 현재 mp에서 -10씩 감소되며 대시했다는 메세지 출력.
//		(단, 현재 mp가 0 이하라면 마력이 부족하여 대시할 수	없다는 메세지 출력)
		
		if(mp>0) {
			mp -= 10;
			System.out.println(nickname + "이/가 대시를 시전했다!!! 남은 마력 : " + mp);	
		}else {
			System.out.println("아앗! 마력이 부족해서 스킬을 쓸 수 없어!!!!");
		}
		
	}

	@Override
	public String toString() {
		return "========'" + nickname + "'님의 정보========" + 
				 "\n- 현재 레벨 : " + level + 
				"\n- 현재 hp : " + hp + 
				"\n- 현재 mp : " + mp +
				"\n- 현재 exp : " + exp;
		
//		return "Hero [nickname=" + nickname + ", job=" + job + ", hp=" + hp + ", mp=" + mp + ", level=" + level
//				+ ", exp=" + exp + "]";
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	

}
