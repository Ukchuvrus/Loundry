import java.util.ArrayList;

/**
 * Created by 111 on 18.09.2015.
 */
public class Invoice {

    Invoice(operation o, int t, boolean d, boolean c, boolean b){
        bleacher = b;
        op = o;
        T = t;
        delicate = d;
        chem = c;
        heap   = new ArrayList<Shmot>();
    }
    private boolean auto;
    private boolean bleacher;
    private operation op;
    private int T;
    private boolean delicate;
    private boolean chem;
    private ArrayList<Shmot> heap;


    public int getT() {
        return T;
    }

    public operation getOp() {
        return op;
    }

    public boolean isDelicate() {
        return delicate;
    }

    public boolean isBleacher() {
        return bleacher;
    }

    public boolean isChem() {
        return chem;
    }

    public void add( Shmot a){
        heap.add(a);
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void setBleacher(boolean bleacher) {
        this.bleacher = bleacher;
    }

    public void setChem(boolean chem) {
        this.chem = chem;
    }

    public void setDelicate(boolean delicate) {
        this.delicate = delicate;
    }

    public void setOp(operation op) {
        this.op = op;
    }

    public void setT(int t) {
        T = t;
    }

    public ArrayList<Shmot> getHeap(){

       return heap;

   }
}
