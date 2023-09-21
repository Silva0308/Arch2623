package Editor3D.ModelElements;
import java.util.ArrayList;
import java.util.List;

import Editor3D.Staff.Type;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
    }

    /**
    * заглушка
    */
    public Type method1(Type t) {
    return t;
    }

    /**
    * заглушка
    */
    public Type method1(Type t1, Type t2) {
    return t1;
    }
}

