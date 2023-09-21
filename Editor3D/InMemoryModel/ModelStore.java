package Editor3D.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Editor3D.ModelElements.Camera;
import Editor3D.ModelElements.Flash;
import Editor3D.ModelElements.PoligonalModel;
import Editor3D.ModelElements.Scene;

/**
 * Класс - хранилище моделей.
 */
public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    /**
     * Конструктор класса.
     *
     * @param changeObservers
     * @throws Exception
     */

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
        models.add(new PoligonalModel(null));

        scenes.add(new Scene(0, models, flashes, cameras));

        flashes.add(new Flash());
        cameras.add(new Camera());

    }

    /**
     * Метод возвращает сцену по порядковому номеру.
     *
     * @param id
     * @return
     */
    public Scene getScene(int id) {
        return null;
    }

    /*
     * метод регистрации изменений
     */
    @Override
    public void NotifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }

}
