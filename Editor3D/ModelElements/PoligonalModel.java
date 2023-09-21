package Editor3D.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс - полигональная модель.
 */
public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;


    /**
     * Конструктор класса.
     *
     * @param poligon
     */
     public PoligonalModel(List<Texture> Textures) {
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;
    }
    }
