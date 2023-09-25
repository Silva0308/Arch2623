package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.GoldReward;

public class GoldGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new GoldReward();
    }
    
}
