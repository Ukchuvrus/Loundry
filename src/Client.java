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
  public void makeInvoice() {
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
          inv = new Invoice(op,r.nextInt(100),r.nextBoolean(), r.nextBoolean(),r.nextBoolean());

  }

    public Invoice getInv() {
        return inv;
    }

    static public void main(String argv[]){

     Loundry l = new Loundry();
     Client c = new Client();
     c.makeInvoice();
        c.getInv().add(true,true,1488,true,true);
        c.getInv().add(true,true,228,true,true);
        c.getInv().setChem(true);
        c.getInv().setDelicate(true);
        c.getInv().setAuto(true);
        c.getInv().setBleacher(false);
        c.getInv().setOp(operation.chem);
        c.getInv().setT(2077);
        l.getSecretary().route(c.getInv());
 }
}
