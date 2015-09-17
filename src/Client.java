/**
 * Created by 111 on 17.09.2015.
 */

 enum  operation {
    wash, iron, chem
}

public class Client<T> {

    Client(operation op){

    }
    private T shmot;
    private operation op;

    public void give(Loundry l){

    }
 static public void main(String argv[]){

     Loundry l = new Loundry();
     Client<Clothe> c = new Client<Clothe>(operation.wash);
 }
}
