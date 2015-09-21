import java.util.ArrayList;

/**
 * Created by 111 on 17.09.2015.
 */
public class Chemist extends Worker implements Chem {
    Chemist(){

    }

    @Override
    public void bleach() {

    }

    @Override
    public void regular() {

    }




    public void work(Invoice a){
        for(int i = 0; i < a.getHeap().size(); i++) {
            if (!a.isChem() && a.getHeap().get(i).getChem()) {
                throw new ClientException("Chem is not Allowed!");
            } else {
                if (a.isBleacher() && a.getHeap().get(i).isColor()) {
                    throw new ClientException("Bleacher is not Allowed!");
                } else {
                    if (a.isBleacher()) {
                        bleach();
                        notification();
                    } else {
                        regular();
                        notification();

                    }
                }
            }

        }
    }


    @Override
    public void notification() {
        System.out.println("Chem is complete!");
    }
}
