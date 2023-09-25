package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.LeatherReward;

public class LeatherGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new LeatherReward();
    }
    
}
