import java.util.Properties;

public class EjemploPropiedadesDeSistema{

    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("Username: " + username);

        String home = System.getProperty("user.home");
        System.out.println("Home: " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("Workspace: " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeprator: " + lineSeparator + "Una línea nueva...");

        Properties p = System.getProperties();
        p.list(System.out);

    }
}
