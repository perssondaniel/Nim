public class Pot {

    int total = 21;
    boolean youLose = false;

    public void takeStick(int t){
        total = total - t;
    }

    public boolean someoneLost(){
        if(total <= 0){
            youLose = true;
        }
        return youLose;
    }
}
