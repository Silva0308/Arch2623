package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.GemReward;

public class GemGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
    
}
