/**
 * Created by 111 on 17.09.2015.
 */


public class Secretary implements Notification {


    Secretary() {


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


    public void route(Invoice a, Loundry l) {
        try {
            if (a.getHeap().isEmpty()) {
                throw new ClientException("Heap is Empty");
            }


            switch (a.getOp()) {

                case wash:

                    l.getWasher().work(a);

                case chem:
                    l.getChemist().work(a);
                    break;

                case iron:
                    l.getIroner().work(a);
                    break;

            }
        } catch (ClientException e) {
            System.out.println(e.getMessage());
            }
        notification();
        }

    @Override
    public void notification() {
        System.out.println("Invoice complete!");
    }
}


