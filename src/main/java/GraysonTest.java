import java.util.Scanner;

/**
 * Created by Will on 10/18/2015.
 */
public class GraysonTest {
    public class FooCorp {
        public void blazeIt ()
        {
            System.out.println("420 BLAZE IT");
            System.out.println("L33T HAX0R M0D3 3NABL3D");
            System.out.println("$42000000");
            System.out.println("Has been added to account number" + 420);
            System.out.println("Please call IT before an administrator sees this, i dont want to get fired - James");
        }

        public void main(String args[] )
        {
            System.out.println("Sponserd by the US Department of Labor");
            Scanner k = new Scanner(System.in);
            System.out.println("Welcome to the FooCorp pay calculator");
            System.out.println("NOTE: if you are found to be entering false information your job will be terminated immediatly");
            System.out.println("What is your account #? (9 digit ID)");
            int Anum = k.nextInt();
            if (Anum == 420){blazeIt();}
            else
            if (Anum < 999999999 && Anum > 99999999)
            {

                System.out.println("How long did you work? (hours) MAX 60 hours");
                double H = k.nextDouble();
                System.out.println("Enter your base pay ($/hour)MIN $8.00");
                double P = k.nextDouble();
                if (H > 60)
                {System.out.println("ERROR MAX 60 HOURS, you said"); System.out.println(H+"hours");}
                else if (P < 8.0)
                {
                    System.out.println("ERROR MIN $8.00/hour");
                    System.out.println(P+"$/hour");
                }
                else if (H <= 40) {double C = H*P; System.out.println(C);}
                else if (H > 40)
                {
                    double C = H - 40;

                    double D = P*1.5;
                    double F = C*D;
                    double G = 40*P;
/*
System.out.println(C); Used for checking value correctness
System.out.println(D);
System.out.println(F);
System.out.println(G);
*/
                    double J = F+G;
                    System.out.println("$"+ J);
                    System.out.println("Has been transfered to acount: " + Anum);


                }
            }
            else if (Anum > 999999999)
            {
                System.out.println("ID # too long");
            }
            else if (Anum < 99999999)
            {
                System.out.println("ID # too short");
            }
            System.out.println("Thank you for using the FooCorp pay calculator");

        }
    }
}
