/**
 * Created by 111 on 17.09.2015.
 */
 public class Shmot {

    private boolean color;
    private boolean auto;
    private int Tmax;
    private boolean chem;
    private boolean delicate;

    public int getT(){
        return Tmax;
    };

    public boolean isDelicate() {
        return delicate;
    }

    public boolean isAuto() {
        return auto;
    }

    public boolean isColor() {
        return color;
    }

    public int getTmax() {
        return Tmax;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void setDelicate(boolean delicate) {
        this.delicate = delicate;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public void setTmax(int tmax) {
        Tmax = tmax;
    }

    public boolean getChem(){
        return chem;
    };
    public void setT(int a){
       Tmax = a;
    }
    public void setChem(boolean a){
       chem = a;
    }
}
