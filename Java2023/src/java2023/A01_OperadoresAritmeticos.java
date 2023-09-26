package java2023;

/**
 *
 * @author joseLevanoArbizu
 */
public class A01_OperadoresAritmeticos {

    public static void main(String[] args) {
        //Variables*******************
        final int m = 1;
        int i = 1;
        float f = 1.2f;
        double d = 10.0;
        boolean o = true;
        
        
        //operadores aritmeticos****************
        
        int b=10,c=30,sum,res,mul,resi,incremento=10, decremento =20;
        double div,p=50,q = 13;
        
        sum = b+c; //suma 
        res = b-c; // resta
        mul = b*c; // multiplicaci{on
        div = p/q; // division
        resi = b%c; // residuo
        incremento++; //incremento
        decremento--; // decremento
        
        System.out.println("la suma es "+sum);
        System.out.println("la resta es "+ res);
        System.out.println("la multiplicacion es "+ mul);
        System.out.println("la division es "+div);
        
        System.out.println("residuo: "+resi
                + "\nel incremento es: "+incremento
                + "\nel decremento es: "+ decremento);
        
        
        
        

    }

}
