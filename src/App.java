import controllers.BrandController;
import models.Brand;
import test.TestData;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");
        TestData data = new TestData();
        Brand[] brands = data.createBrands();
        BrandController controller = new BrandController();
        System.out.println(brands);
        controller.sortInsertionDesc(brands);
        System.out.println(brands);

    }

}
