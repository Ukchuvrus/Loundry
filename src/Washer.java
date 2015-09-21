import java.util.ArrayList;

/**
 * Created by 111 on 17.09.2015.
 */
public class Washer extends Worker implements Wash {

    Washer() {



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

    public void work(Invoice a) {
        for (int i = 0; i < a.getHeap().size(); i++) {
            if (a.getHeap().get(i).getT() < a.getT()) {
                throw new ClientException("It's too hot!");
            } else {
                if (!a.isDelicate() && a.getHeap().get(i).isDelicate()) {
                    throw new ClientException("Need delicate washing!");
                } else {
                    if (a.isBleacher() && a.getHeap().get(i).isColor()) {
                        throw new ClientException("Bleacher is not allowed!");
                    } else {
                        if (a.getHeap().get(i).isAuto()) {
                            if (a.isDelicate()) {
                                delicateAuto();
                                notification();
                            } else {
                                regularAuto();
                                notification();
                            }
                        } else {
                            if (a.isDelicate()) {
                                delicate();
                                notification();

                            } else {
                                regular();
                                notification();

                            }
                        }
                    }
                }
            }

        }

    }

    @Override
    public void notification() {
        System.out.println("Washing complete!");
    }
}
