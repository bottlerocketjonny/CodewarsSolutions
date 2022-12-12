public class SurviveTheAttack {
    public static boolean block(int[] attackers, int[] defenders){
        // set variable states to 0
        int survivingAttackers = 0;
        int survivingDefenders = 0;
        int attackersDamage = 0;
        int defendersDamage = 0;
        int amountOfBattles = 0;

        if (attackers.length > defenders.length) {
            amountOfBattles = defenders.length;
        } else amountOfBattles = attackers.length;


        // carry out battle
        for (int nextBattle = 0; nextBattle < amountOfBattles; nextBattle++) {
            if (attackers[nextBattle] > defenders[nextBattle]) {
                survivingAttackers += 1;
                attackersDamage += attackers[nextBattle];
            }
            else {
                survivingDefenders += 1;
                defendersDamage += defenders[nextBattle];
            }
        }

        // calculate result
        if (survivingAttackers > survivingDefenders) { return false; }
        if (survivingAttackers == survivingDefenders && attackersDamage > defendersDamage) { return false; }
        if (attackersDamage == defendersDamage && attackers.length > defenders.length) { return false; }
        if (attackersDamage == defendersDamage) { return true; }

        return true;
    }
}
