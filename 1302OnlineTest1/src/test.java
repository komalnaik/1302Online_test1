import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<Candidates> c=new ArrayList<Candidates>();
		
		c.add(new Candidates("candidate1"));
		c.add(new Candidates("candidate2"));
		c.add(new Candidates("candidate3"));
		EVM evm=new EVM();
		
		evm.setcandidate(c);
		evm.pressButton(0);
		evm.pressButton(0);
		evm.pressButton(2);
		evm.pressButton(0);
		evm.pressButton(1);
		
		evm.getResul();
	}

}
