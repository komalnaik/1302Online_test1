import java.util.ArrayList;


public class EVM {
BallotUnit bu;
CantrolUnit cu;
public EVM() {
	
	cu=new CantrolUnit();
	bu=new BallotUnit();
}
public void setcandidate(ArrayList<Candidates> c) {
	cu.SetCandidate(c, bu);
}
public void pressButton(int i) {
	bu.pressButton(i);
}
public void getResul() {
	cu.getRsult();
}


}
