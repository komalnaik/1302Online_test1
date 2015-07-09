
public class Slot {

	Button candidate_button;
	CandidateLamp candidateLamp;
	public Slot(Candidates cand) {
		super();
		this.candidate_button = new Button(cand);
		candidateLamp=new CandidateLamp();
	}
	public void vote() {
		candidate_button.vote();
		candidateLamp.glowLamp();
		
	}


}
