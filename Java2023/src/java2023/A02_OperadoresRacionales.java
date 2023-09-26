package java2023;

/**
 *
 * @author joseLevanoArbizu
 */
public class A02_OperadoresRacionales {

    public static void main(String[] args) {

//variables********************************************
        int a = 10, b = 20, c = 10;
        boolean x, y, z, m, n, v;
//Operadores Racionales********************************
        x = a < b;  //menor que      //true
        y = a > b;  //mayor que      //false
        z = a >= c; //mayor o igual  //true
        m = a <= c; //menor o igual  //true
        n = a != b; //distinto       //true
        v = a == b; //comparar       //false

//imprimir en consola********************************
        System.out.println("Los resultados son"
                + "\nmenor que " + x
                + "\nmayor que " + y
                + "\nmayor o igual " + z
                + "\nmenor o igual " + m
                + "\ndistinto  " + n
                + "\ncomparar " + v);

    }

}
