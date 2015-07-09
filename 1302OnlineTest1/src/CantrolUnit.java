import java.util.ArrayList;


public class CantrolUnit {
	
	BallotUnit connection;
	DisplaySection display;
	ArrayList<Candidates> candidates;
	ResltSection result;
	ButtonSection button;

	public CantrolUnit() {
		candidates=new ArrayList<Candidates>();
		
	}
	public void SetCandidate(ArrayList<Candidates> candidates,BallotUnit b){
		this.candidates=candidates;
		connection=b;
		b.markSlots(candidates);
	}
	
}
