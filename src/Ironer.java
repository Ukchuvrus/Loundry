import java.util.ArrayList;

/**
 * Created by 111 on 17.09.2015.
 */
public class Ironer extends Worker implements Iron {
    Ironer() {

    }


    @Override
    public void regular() {

    }

    @Override
    public void delicate() {

    }




    public void work(Invoice a) {
        for (int i = 0; i < a.getHeap().size(); i++) {
            if (a.getT() > a.getHeap().get(i).getT()) {
                throw new ClientException("It's too hot!");
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

    @Override
    public void notification() {
        System.out.println("Ironing complete!");
    }
}
