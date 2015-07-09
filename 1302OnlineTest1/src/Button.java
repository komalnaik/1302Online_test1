
public class Button {
	
	Candidates candidate;
	public Button(Candidates cand) {
		candidate=cand;
	}
	
	public void pressButton(){
		candidate.vote();
	}

}
