import java.util.ArrayList;


public class BallotUnit {
	
	Slot[] slots=new Slot[32];
	ReadyLamp lamp;
	int maskFrom;
	
	public BallotUnit() {
		
	}

	public void markSlots(ArrayList<Candidates> candidates) {
		maskFrom=candidates.size();
		for(int i=0;i<candidates.size();i++){
			slots[i]=new Slot(candidates.get(i));
		}
		lamp=new ReadyLamp();
	}

	public void vote(int i) {
		if(i<maskFrom){
			slots[i].vote();
		}
	}
	
	
}
