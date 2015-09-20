import java.util.ArrayList;

/**
 * Created by 111 on 17.09.2015.
 */
public class Ironer extends Worker implements Iron {
    Ironer(Loundry a) {
        l = a;
    }


    @Override
    public void regular() {

    }

    @Override
    public void delicate() {

    }

    private Invoice curInvoice;

    public void setCurInvoice(Invoice a) {
        curInvoice = a;
    }


    public void work() {
        for (int i = 0; i < curInvoice.getHeap().size(); i++) {
            if (curInvoice.getT() > curInvoice.getHeap().get(i).getT()) {
                throw new ClientException(errors.tooHot);
            } else {
                if (curInvoice.isDelicate()) {
                    delicate();
                    l.getSecretary().notificationInProcess();
                } else {
                    regular();
                    l.getSecretary().notificationInProcess();
                }
            }
            l.getSecretary().notificationShmotSuccess();
        }


    }
}
