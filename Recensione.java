package isw;

public class Recensione{

	private int idP;
	private int idU;
	private String descrizione;
	private boolean stato=false;

	public Recensione(int p, int u,String desc){
		descrizione=desc;
		idP = p;
		idU = u;
	}

	public String getDescrizione(){
		return this.descrizione;
	}

	public int getIdU(){
		return this.idU;
	}

	public int getIdP(){
		return this.idP;
	}
}
