package ISW_PROGETTO_GRUPPO12_OPTCorporation;

import java.util.Date;

public class Segnalazione{

	private int idU;
	private String descrizione;
	private boolean stato=false;
	private String data;

	public Segnalazione(String desc, int id){
		idU = id;
		descrizione=desc;
		Date dat = new Date();
	}

	public int getId(){
		return this.idU;
	}

	public String getDescrizione(){
		return this.descrizione;
	}

	public boolean getStato(){
		return this.stato;
	}

}
