package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;

public abstract class ItemGenerator {
    public abstract IGameItem createItem();
    
    public void openReward(){
        createItem().open();
    }

}
