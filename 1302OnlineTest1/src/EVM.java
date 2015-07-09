import java.util.ArrayList;


public class EVM {
BallotUnit bu;
CantrolUnit cu;
public EVM() {
	bu=new BallotUnit();
	cu=new CantrolUnit();
}
public void setcandidate(ArrayList<Candidates> c) {
	cu.SetCandidate(c, bu);
}
public void vote(int i) {
	bu.vote(i);
}


}
