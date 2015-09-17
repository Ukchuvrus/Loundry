/**
 * Created by 111 on 17.09.2015.
 */
public class Loundry {


    Loundry(){

        secretary = new Secretary(this);
        ironer = new Ironer(this);
        washer = new Washer(this);
        chemist = new Chemist(this);
    }

    public Secretary secretary;
    private Ironer ironer;
    private Washer washer;
    private Chemist chemist;

    public Washer getWasher(){
        return washer;
    }

    public Ironer getIroner(){
        return  ironer;
    }

    public Chemist getChemist(){
        return  chemist;
    }
}
