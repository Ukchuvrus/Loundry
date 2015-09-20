import java.util.ArrayList;

/**
 * Created by 111 on 17.09.2015.
 */
public class Chemist extends Worker implements Chem {
    Chemist(Loundry a){
     l = a;
    }

    @Override
    public void bleach() {

    }

    @Override
    public void regular() {

    }




    private Invoice curInvoice ;

    public void setCurInvoice(Invoice a){
        curInvoice = a;
    }

    public void work(){
        for(int i = 0; i < curInvoice.getHeap().size(); i++) {
            if (!curInvoice.isChem() && curInvoice.getHeap().get(i).getChem()) {
                throw new ClientException(errors.cmemIsNotAllowed);
            } else {
                if (curInvoice.isBleacher() && curInvoice.getHeap().get(i).isColor()) {
                    throw new ClientException(errors.bleacherIsNotAllowed);
                } else {
                    if (curInvoice.isBleacher()) {
                        bleach();
                        l.getSecretary().notificationInProcess();
                    } else {
                        regular();
                        l.getSecretary().notificationInProcess();
                    }
                }
            }
            l.getSecretary().notificationShmotSuccess();
        }
    }


}
