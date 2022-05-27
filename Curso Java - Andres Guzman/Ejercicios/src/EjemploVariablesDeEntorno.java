import java.util.Map;

public class EjemploVariablesDeEntorno {

    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();

        System.out.println("Variables de entorno del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = varEnv.get("Path");
        System.out.println("path = " + path);

        System.out.println("Listando las variables del sistema ::::....");

        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
    }

}
