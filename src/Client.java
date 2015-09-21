import java.util.Random;

/**
 * Created by 111 on 17.09.2015.
 */

 enum  operation {
    wash, iron, chem;
}

public class Client{

    Client(){
    }
    private Invoice inv;
  public Invoice makeInvoice() {
      Random r = new Random();
      operation op;
      switch (r.nextInt(2)) {

          case 0:
              op = operation.wash;
              break;
          case 1:
              op = operation.iron;
              break;
          case 2:
              op = operation.chem;
              break;
          default: op = operation.wash;
      }
          return inv = new Invoice(op,r.nextInt(100),r.nextBoolean(), r.nextBoolean(),r.nextBoolean());

  }

    public Invoice getInv() {
        return inv;
    }

    static public void main(String argv[]){

     Loundry loundry = new Loundry();
     Client client = new Client();
     Invoice invoice  =  client.makeInvoice();
     Shmot shmot = new Shmot(true,true,1488,true,true) ;
        invoice.add(shmot);
        loundry.execute(invoice);
 }
}
