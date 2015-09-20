/**
 * Created by 111 on 17.09.2015.
 */


public class Secretary {

    private Loundry l;


    Secretary(Loundry a) {
        l = a;
    }

    public void notificationInProcess(){
        System.out.print("Shmot in processing\n");
    }
    public void notificationFail(){
        System.out.println("Cleaning failed\n");
    }
    public void notificationSuccess(){
        System.out.println("Cleaning complete\n");
    }
    public void notificationShmotSuccess(){
        System.out.println("Shmot complete\n");
    }
    public void route(Invoice a) {
        try {
            if (a.getHeap().isEmpty()) {
                throw new ClientException(errors.EmtyHeap);
            }


            switch (a.getOp()) {

                case wash:

                    l.getWasher().setCurInvoice(a);
                    l.getWasher().work();

                case chem:
                    l.getChemist().setCurInvoice(a);
                    l.getChemist().work();
                    break;

                case iron:
                    l.getIroner().setCurInvoice(a);
                    l.getIroner().work();
                    break;

            }
        } catch (ClientException e) {
            switch (e.getError()) {
                case bleacherIsNotAllowed:
                case tooHard:
                case cmemIsNotAllowed:
                case tooHot:
                case EmtyHeap:
                    notificationFail();
                    //break;
            }
        }
        notificationSuccess();
    }

}

