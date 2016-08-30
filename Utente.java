package ISW_PROGETTO_GRUPPO12_OPTCorporation;

public class Utente{

	private static int idS=0;
	private int id;
	private String email;
	private boolean ban=false;

	public Utente(String mail){
		idS++;		
		this.id = idS;
		this.email = mail;
	}

	public String getEmail(){
		return this.email;
	}

	public int getId(){
		return this.id;
	}

	public boolean getBan(){
		return this.ban;
	}

	public void setBan(){
		ban = !ban;
	}
}
