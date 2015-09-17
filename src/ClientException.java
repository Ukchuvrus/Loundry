/**
 * Created by 111 on 17.09.2015.
 */


enum errors {
    nullError, chemClothe, temp, chem
}
public class ClientException  extends Throwable {
    private errors e;
    ClientException(errors a){
        e = a;
    }
    public errors getError(){
        return e;
    }
}
