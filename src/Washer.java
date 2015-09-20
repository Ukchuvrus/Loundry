import java.util.ArrayList;

/**
 * Created by 111 on 17.09.2015.
 */
public class Washer extends Worker implements Wash {

    Washer(Loundry a){
        l = a;
    }


    @Override
    public void regular() {

    }

    @Override
    public void delicate() {

    }

    @Override
    public void regularAuto() {

    }

    @Override
    public void delicateAuto() {

    }

    public void work(){
        for(int i = 0; i < curInvoice.getHeap().size(); i++){
            if (curInvoice.getHeap().get(i).getT() < curInvoice.getT()){
                throw new ClientException(errors.tooHot);
            }
             else {
                if (!curInvoice.isDelicate() && curInvoice.getHeap().get(i).isDelicate()) {
                    throw new ClientException(errors.tooHard);
                } else {
                    if (curInvoice.isBleacher() && curInvoice.getHeap().get(i).isColor()) {
                        throw new ClientException(errors.bleacherIsNotAllowed);
                    } else {
                            if (curInvoice.getHeap().get(i).isAuto()){
                                if(curInvoice.isDelicate()){
                                    delicateAuto();
                                }
                                 else {
                                    regularAuto();
                                }
                            }
                                else{ if(curInvoice.isDelicate()){
                                delicate();
                                l.getSecretary().notificationInProcess();
                            }
                            else {
                                regular();
                                l.getSecretary().notificationInProcess();
                            }}
                    }
                }
            }
            l.getSecretary().notificationShmotSuccess();
        }

        }




    private Invoice curInvoice ;

    public void setCurInvoice(Invoice a){
        curInvoice = a;
    }

}
