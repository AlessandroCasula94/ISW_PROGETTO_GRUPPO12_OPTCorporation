package ISW_PROGETTO_GRUPPO12_OPTCorporation;

public class Amministratore{

	private static int idS=0;
	private int id;
	private String email;
	private String psw;

	public Amministratore(String m, String p){
		idS++;	
		this.id=idS;
		this.email=m;
		this.psw=p;
	}

	public String getEmail(){
		return this.email;	
	}

	public String getPsw(){
		return this.psw;
	}

	public int getId(){
		return this.id;
	}
}
