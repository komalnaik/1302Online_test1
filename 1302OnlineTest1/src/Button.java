
public class Button {
	
	Candidates candidate;
	CandidateLamp candidateLamp;
	public Button(Candidates cand,CandidateLamp c) {
		candidate=cand;
		candidateLamp=c;
	}
	
	

	public void pressButton() {
		candidate.vote();
		candidateLamp.glowLamp();
	}



	public Candidates getCandidate() {
		// TODO Auto-generated method stub
		return candidate;
	}

}
