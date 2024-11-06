package wardrobe;
import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<Cloth> wardrobe;

public void addCloth(Cloth cloth) {
    if (wardrobe == null) {
        wardrobe = new ArrayList<>();
    }
    wardrobe.add(cloth);
}

public void printInfo() {
    for (Cloth cloth : wardrobe) {
        System.out.println(cloth.getInfo());
    }
}
public void washAllClothes(){
    for (Cloth cloth : wardrobe){
        cloth.wash();
    }
}
public void repairAllClothes(){
    for (Cloth cloth : wardrobe){
        cloth.repair();
    }
}


}