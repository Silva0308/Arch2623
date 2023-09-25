package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.CoinReward;

public class CoinGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new CoinReward();
    }
    
}
