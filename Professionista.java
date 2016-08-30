package isw;

public class Professionista{

	private static int idS=0;
	private int id;
	private String nome;
	private String cognome;
	private String attivita;
	private String citta;
	private String telefono;
	private String email;
	private String categoria;
	private String descrizioneU;
	private String descrizioneA;
	private String psw;

	public Professionista(String nome, String cognome, String attivita, String citta, String telefono, String email, String categoria, String descrizioneU, String descrizioneA, String psw){
		idS++;	
		this.id=idS;
		this.nome=nome;
		this.cognome=cognome;
		this.attivita=attivita;
		this.citta=citta;
		this.telefono=telefono;
		this.email=email;
		this.categoria=categoria;
		this.descrizioneU=descrizioneU;
		this.descrizioneA=descrizioneA;
		this.psw=psw;
	}

	public void setPro(String nome, String cognome, String attivita, String citta, String telefono, String categoria, String descrizioneU, String descrizioneA, String psw){
		idS++;	
		this.nome=nome;
		this.cognome=cognome;
		this.attivita=attivita;
		this.citta=citta;
		this.telefono=telefono;
		this.categoria=categoria;
		this.descrizioneU=descrizioneU;
		this.descrizioneA=descrizioneA;
		this.psw=psw;
	}


	public String getEmail(){
		return this.email;	
	}

	public String getPsw(){
		return this.psw;
	}

	public String getNome(){
		return this.nome;
	}

	public String getCognome(){
		return this.cognome;
	}

	public String getAttivita(){
		return this.attivita;
	}

	public String getCitta(){
		return this.citta;
	}

	public String getCategoria(){
		return this.categoria;
	}

	public String getDescrizioneU(){
		return this.descrizioneU;
	}

	public String getDescrizioneA(){
		return this.descrizioneA;
	}

	public String getTelefono(){
		return this.telefono;
	}

	public int getId(){
		return this.id;
	}
}
