package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.SilverReward;

public class SilverGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
    
}
