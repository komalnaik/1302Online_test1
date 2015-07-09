import java.util.ArrayList;


public class CantrolUnit {
	
	BallotUnit connection;
	DisplaySection display;
	ArrayList<Candidates> candidates;
	ResltSection result;
	ButtonSection button;

	public CantrolUnit() {
		candidates=new ArrayList<Candidates>();
		display=new DisplaySection();
		
	}
	public void SetCandidate(ArrayList<Candidates> candidates,BallotUnit b){
		this.candidates=candidates;
		connection=b;
		connection.markSlots(candidates,this);
	}
	public void setBusyLamp() {
		display.setBusyLamp();
	}
	public void clearBusyLamp() {
		display.clearBusyLamp();
	}
	public void getRsult() {
		for(int i=0;i<candidates.size();i++){
			System.out.println(candidates.get(i).getName()+" => "+candidates.get(i).getVotes());
		}
		
	}
	
	public void clear(){
		connection.clear();
	}
	
}
