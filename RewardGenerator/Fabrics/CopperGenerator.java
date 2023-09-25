package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Rewards.CopperReward;

public class CopperGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new CopperReward();
    }
    
}
