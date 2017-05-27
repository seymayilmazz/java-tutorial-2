/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        int a = 3;

        {
            /* scope 1 */
            int b = 4;
            {
                /* inner scope */
                int c = 5;
            }
            int d = 4;

        }

        {
            /* scope 2 */
            int d = 3;
        }



    }
}
