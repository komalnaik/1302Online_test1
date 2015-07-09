
public class Slot {

	Button candidate_button;
	CandidateLamp candidateLamp;
	public Slot(Candidates cand) {
		super();
		candidateLamp=new CandidateLamp();
		this.candidate_button = new Button(cand,candidateLamp);
	}
	public void pressButton() {
		candidate_button.pressButton();
		
		
	}
	public Candidates getCandidate() {
		return candidate_button.getCandidate();
	}


}
