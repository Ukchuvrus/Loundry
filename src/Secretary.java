/**
 * Created by 111 on 17.09.2015.
 */


public class Secretary {

    private Loundry l;

    Secretary(Loundry a) {
        l = a;
    }


    public errors route(Shmot a, operation op) {
        try {
            if ((a instanceof Clothe) && (op == operation.chem)) {
                throw new ClientException(errors.chemClothe);
            }
            if ((a.getT() == false)) {
                throw new ClientException(errors.temp);
            }
            if ((a.getChem() == false)) {
                throw new ClientException(errors.chem);
            }
        } catch (ClientException e) {
            return e.getError();
        }


        switch (op) {
            case wash:
                l.getWasher().action();
                break;

            case chem:
                l.getChemist().action();
                break;

            case iron:
                l.getIroner().action();
                break;


        }
        return errors.nullError;
    }
}

