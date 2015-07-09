import java.util.ArrayList;


public class CantrolUnit {
	
	BallotUnit connection;
	DisplaySection display;
	
	ResltSection result;
	ButtonSection button;

	public CantrolUnit() {
		
		display=new DisplaySection();
		result=new ResltSection();
		
	}
	public void SetCandidate(ArrayList<Candidates> candidates,BallotUnit b){
		
		connection=b;
		connection.markSlots(candidates,this);
	}
	public void setBusyLamp() {
		display.setBusyLamp();
	}
	public void clearBusyLamp() {
		display.clearBusyLamp();
	}
	public Candidates getRsult() {
		return result.getResult(connection);
		
	}
	
	public void clear(){
		connection.clear();
	}
	
}
