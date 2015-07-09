
public class Candidates {

String name;
int votes;

public Candidates(String name) {
	super();
	this.name = name;
	this.votes = 0;
}

public void vote(){
	votes++;
	
}

public int getVotes() {
	return votes;
}


}
