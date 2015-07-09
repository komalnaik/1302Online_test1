import java.util.ArrayList;


public class ResltSection {

	public Candidates getResult(BallotUnit connection) {
		int max=0;
		Candidates winner = null;
		ArrayList<Candidates> candidates=connection.getCandidates();
		for(int i=0;i<candidates.size();i++){
			if(candidates.get(i).getVotes()>max){
				winner=candidates.get(i);
				max=candidates.get(i).getVotes();
			}
		}
		return winner;
	}

}
