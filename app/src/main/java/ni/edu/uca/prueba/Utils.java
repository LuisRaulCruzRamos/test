package ni.edu.uca.prueba;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrador on 28/11/2016.
 */

public class Utils {

    public Letter convertToLetter(int grade) throws Exception {

        if(grade > 100 || grade < 0 )
        {

            throw new Exception("Fallo la Prueba");

        }

        if(grade >=90 && grade <=100)
                {
                    return Letter.A;
                }
                else
                {
                    if(grade >=80 && grade <=89)
                    {
                        return Letter.B;
                    }
                    else
                    {
                        if (grade >=70 && grade <=79)
                        {return Letter.C;
                        }
                        else{
                            if (grade >=60 && grade <=69)
                            {
                                return Letter.D;
                            }
                            else
                            {
                                return Letter.F;
                            }
                        }
                    }


                }

            }


        //TODO: implementar método a su manera.
        public enum Letter
        {A,B,C,D,F}
    }


