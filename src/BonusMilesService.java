public class BonusMilesService {

    public int calculate(int cost) {
        int bonuscost = 20;
        int totalbonus = cost / bonuscost;
        return totalbonus;
    }

}
