import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11387
 */
class Player {
	CombatData current;
	CombatData weapon;

	public Player(String readLine) {
		current = new CombatData(readLine);
	}

	void setWeaponCombat(String readLine) {
		weapon = new CombatData(readLine);
	}

	char hasChangedCombat(CombatData anotherWeapon) {
		CombatData another = new CombatData(current.minus(weapon).add(anotherWeapon));
		return current.getCombat() > another.getCombat() ? '-' : current.getCombat() < another.getCombat() ? '+' : '0';
	}
}

class CombatData {
	long attack, power, criChance, criDamRate, atkSpeed;

	CombatData() {
	}

	CombatData(String readLine) {
		StringTokenizer st = new StringTokenizer(readLine);
		this.attack = Long.parseLong(st.nextToken());
		this.power = Long.parseLong(st.nextToken());
		this.criChance = Long.parseLong(st.nextToken());
		this.criDamRate = Long.parseLong(st.nextToken());
		this.atkSpeed = Long.parseLong(st.nextToken());
	}

	CombatData(CombatData data) {
		this.attack = data.attack;
		this.power = data.power;
		this.criChance = data.criChance;
		this.criDamRate = data.criDamRate;
		this.atkSpeed = data.atkSpeed;
	}

	CombatData minus(CombatData data) {
		CombatData minusData = new CombatData();
		minusData.attack = this.attack - data.attack;
		minusData.power = this.power - data.power;
		minusData.criChance = this.criChance - data.criChance;
		minusData.criDamRate = this.criDamRate - data.criDamRate;
		minusData.atkSpeed = this.atkSpeed - data.atkSpeed;
		return minusData;
	}

	CombatData add(CombatData data) {
		CombatData addData = new CombatData();
		addData.attack = this.attack + data.attack;
		addData.power = this.power + data.power;
		addData.criChance = this.criChance + data.criChance;
		addData.criDamRate = this.criDamRate + data.criDamRate;
		addData.atkSpeed = this.atkSpeed + data.atkSpeed;
		return addData;
	}

	long getCombat() {
		return this.attack * (100 + this.power) * (10000 - 100 * Math.min(100, this.criChance) + Math.min(100, this.criChance) * this.criDamRate) * (100 + this.atkSpeed);
	}
}

public class p11387 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 현재 정보
		Player P1 = new Player(br.readLine());
		Player P2 = new Player(br.readLine());

		// 무기 정보
		P1.setWeaponCombat(br.readLine());
		P2.setWeaponCombat(br.readLine());

		System.out.println(P1.hasChangedCombat(P2.weapon));
		System.out.println(P2.hasChangedCombat(P1.weapon));
	}
}