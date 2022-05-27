public class EjemploClaseMath {

    public static void main(String[] args) {

        int absoluto = Math.abs(-4);
        System.out.println("Absoluto = " + absoluto);

        absoluto = Math.abs(4);
        System.out.println("Absoluto = " + absoluto);

        double max = Math.max(3.5, 1.6);
        System.out.println("Max = " + max);

        double min = Math.max(3.4, 4.1);
        System.out.println("Min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("Redondear hacia arriba = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("Redondear hacia abajo = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir a grados = " + grados);

        double radianes = Math.toDegrees(90d);
        System.out.println("Convertir a radianes = " + radianes);

        System.out.println("Sin(90): " + Math.sin(radianes));
        System.out.println("Cos(90): " + Math.sin(radianes));

        radianes = Math.toRadians(180d);
        System.out.println("Sin(180): " + Math.sin(radianes));
        System.out.println("Cos(180): " + Math.cos(radianes));

    }

}
