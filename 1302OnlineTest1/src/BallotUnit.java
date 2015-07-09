import java.util.ArrayList;


public class BallotUnit {
	static BallotUnit myInstance=null;
	Slot[] slots=new Slot[16];
	ReadyLamp lamp;
	int maskFrom;
	CantrolUnit cu;
	
	private BallotUnit() {
		
	}
	public static BallotUnit getInstance(){
		if(myInstance==null){
			myInstance=new BallotUnit();
		}
		return myInstance;
	}

	public void markSlots(ArrayList<Candidates> candidates,CantrolUnit c) {
		maskFrom=candidates.size();
		for(int i=0;i<candidates.size();i++){
			slots[i]=new Slot(candidates.get(i));
		}
		lamp=new ReadyLamp();
		cu=c;
	}

	public void pressButton(int i) {
		if(i<maskFrom){
			slots[i].pressButton();
		}
		cu.setBusyLamp();
		cu.clearBusyLamp();
	}

	public void clear() {
		slots=new Slot[16] ;
		
	}
	public void close(){
		maskFrom=0;
	}

	public ArrayList<Candidates> getCandidates() {
		
		ArrayList<Candidates> ret=new ArrayList<Candidates>();
		for(int i=0;i<maskFrom;i++){
			ret.add(slots[i].getCandidate());
		}
		return ret;
	}

	
}
