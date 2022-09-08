public class BonusMilesService {

    public int calculate(int cost) {
        int bonusCost = 20;
        int totalBonus = cost / bonusCost;
        return totalBonus;
    }

}
