/**
 * Created by 111 on 17.09.2015.
 */


enum errors {
    tooHot, cmemIsNotAllowed, EmtyHeap, tooHard, bleacherIsNotAllowed;
}
public class ClientException  extends Error {
    private errors e;
    ClientException(errors a){
        e = a;
    }
    public errors getError(){
        return e;
    }
}
