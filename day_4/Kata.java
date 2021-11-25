public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        if (firstAttacker.equals(fighter1.name)){
            Fighter tempFighter = fighter1;
            fighter1 = fighter2;
            fighter2 = tempFighter;
        }

        do {
            fighter1.health -= fighter2.damagePerAttack;
            if (fighter1.health <= 0){
                winner = fighter2.name;
                break;
            }
            fighter2.health -= fighter1.damagePerAttack;
            if (fighter2.health <= 0){
                winner = fighter1.name;
                break;
            }
        } while (fighter1.health > 0 && fighter2.health > 0);

        return winner;
    }
}