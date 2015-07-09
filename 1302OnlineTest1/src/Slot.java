
public class Slot {

	Button candidate_button;
	boolean candidateLamp;
	public Slot(Candidates cand) {
		super();
		this.candidate_button = new Button(cand);
		candidateLamp=false;
	}


}
