package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.CristalReward;

public class CristalGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new CristalReward();
    }
    
}
