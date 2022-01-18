public class BonusMilesService {

    int rubles = 20;

    public int calculate(int cost) {
        cost = cost / rubles;

        return cost;
    }
}

