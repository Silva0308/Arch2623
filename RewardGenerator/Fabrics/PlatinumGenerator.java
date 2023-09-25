package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.PlatinumReward;

public class PlatinumGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new PlatinumReward();
    }
    
}
