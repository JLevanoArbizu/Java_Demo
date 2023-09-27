package java2023.SwitchCase;

/**
 *
 * @author joseLevanoArbizu
 */
public class E01 {

    public static void main(String[] args) {
        int edad = 10;

        /*En caso de (Switch case)
“En caso de” se usa para evaluar una
misma pregunta en varias posibles
respuestas este solo acepta tipos de
datos enteros y string en su pregunta.
        */
        switch (edad) {
            case 10:
                System.out.println("la edad es 10");
                break;
            case 20:
                System.out.println("la edad es 20");
                break;
            case 90:
                System.out.println("la edad es 90");
                break;
            default:
                System.out.println("no tenemos esa opcion");
                break;
        }

        String ropa = "short";

        switch (ropa) {
            case "polo":
                System.out.println("si encontre el polo");
                break;
            case "pantalon":
                System.out.println("si encontre el pantalon");
                break;
            case "chompa":
                System.out.println("si encontre el chompa");
                break;
            default:
                System.out.println("no encontre ");
                break;

        }
    }

}
