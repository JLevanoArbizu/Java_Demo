package java2023;

/**
 *
 * @author joseLevanoArbizu
 */
public class Condicionales {

    public static void main(String[] args) {
        int a = 10, b = 10;
        //if************************
        if (10 == b) {  //solo se ejecuta cuando es  true
            System.out.println("es verdadero");
        }

        //if - else*******************
        if (20 == b) {
            System.out.println("es verdaro");
        } else {
            System.out.println("es falso");
        }

        //else if*********************
        if(a == 1){
            System.out.println("es 1");
        } else if (a == 2) {
            System.out.println("es 2");
        } else if (a == 3) {
            System.out.println("es 3");
        } else {
            System.out.println("no encontre el numero");
        }
    }
}
