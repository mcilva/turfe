package turfe;

import java.util.Comparator;

public class Colocacao implements Comparator<Joker>{

	@Override
	public int compare(Joker o1, Joker o2) {
		if(o1.getTempo()<o2.getTempo()) return -1;
		else if(o1.getTempo()>o2.getTempo()) return 1;
		return 0;
	}
	


}
