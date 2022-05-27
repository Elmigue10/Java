import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream =
                    new FileInputStream("src/resources/EjemploAsignarPropiedadesDeSistema.properties");

            Properties properties = new Properties(System.getProperties());
            properties.load(fileInputStream);

            properties.setProperty("mi.propiedad.personalizada","Valor de la propiedad personalizada");

//            Listar las propiedades, no se listan porque no se han agregado al sistema
//            System.getProperties().list(System.out);

//            Actualizar propiedades del sistema
            System.setProperties(properties);
            Properties propertiesSystem = System.getProperties();
//            Mostrar las propiedades actualizadas
            propertiesSystem.list(System.out);
            System.out.println("propertiesSystem.getProperty(...) = " + propertiesSystem.getProperty("mi.propiedad.personalizada"));
            System.out.println("System.getProperty(...) = " + System.getProperty("config.autor.email"));

        } catch (Exception e) {
            System.out.println("No existe el archivo: " + e);
        }

    }

}
