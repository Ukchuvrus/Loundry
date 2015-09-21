/**
 * Created by 111 on 17.09.2015.
 */
public class Loundry {


    Loundry() {

        secretary = new Secretary();
        ironer = new Ironer();
        washer = new Washer();
        chemist = new Chemist();
    }


    public Secretary secretary;
    private Ironer ironer;
    private Washer washer;
    private Chemist chemist;

    public Secretary getSecretary() {
        return secretary;
    }

    public Washer getWasher() {
        return washer;
    }

    public Ironer getIroner() {
        return ironer;
    }

    public Chemist getChemist() {
        return chemist;
    }



    public void execute(Invoice a) {

     secretary.route(a, this);

    }
}

