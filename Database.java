package isw;

import java.util.*;

public class Database{

	private ArrayList<Utente> ute = new ArrayList<Utente>();
	private ArrayList<Professionista> pro = new ArrayList<Professionista>();
	private ArrayList<Recensione> rec = new ArrayList<Recensione>();
	private ArrayList<Segnalazione> seg = new ArrayList<Segnalazione>();
	private ArrayList<Amministratore> amm = new ArrayList<Amministratore>();

	public Database(){}

	public boolean setUtente(String m){
		Utente nuovo = new Utente(m);
		ute.add(nuovo);
		return true;
	}

	public boolean updateUtente(int id){
		for(Utente app:ute)
		{
			if(id==app.getId())
			{
				app.setBan();
				return true;			
			}
		}	
		return false;
	}

	public boolean setProfessionista(String [] v){
		Professionista nuovo = new Professionista(v[0],v[1],v[2],v[3],v[4],v[5],v[6],v[7],v[8],v[9]);
		pro.add(nuovo);	
		return true;
	}

	public boolean updateProfessionista(String [] v, int id){		
		for(Professionista app:pro)
		{
			if(id==app.getId())
			{
				app.setPro(v[0],v[1],v[2],v[3],v[4],v[6],v[7],v[8],v[9]);
				return true;			
			}
		}	
		return false;
	}

	public boolean setAmministratore(String m, String p){
		Amministratore nuovo = new Amministratore(m, p);
		amm.add(nuovo);	
		return true;
	}

	public boolean setRecensione(int n, int i, String p){
		Recensione nuovo = new Recensione(n, i, p);
		rec.add(nuovo);
		return true;
	}

	public boolean setSegnalazione(String p, int i){
		Segnalazione nuovo = new Segnalazione(p, i);
		seg.add(nuovo);
		return true;
	}

	public Utente getUtente(int id){
		for(Utente app:ute)
		{
			if(id == app.getId())
				return app;
		}	
		return null;
	}

	public Utente getUtente(String m){
		for(Utente app:ute)
		{
			if(m.equals(app.getEmail()))
				return app;
		}	
		return null;
	}

	public Professionista getProfessionista(int n){
		for(Professionista app:pro)
		{
			if(app.getId() == n)
				return app;
		}	
		return null;
	}

	public Professionista getProfessionista(String m){
		for(Professionista app:pro)
		{
			if(m.equals(app.getEmail()))
				return app;
		}	
		return null;
	}

	public Professionista getProfessionista(String m, String p){
		for(Professionista app:pro)
		{
			if(m.equals(app.getEmail()) && p.equals(app.getPsw()))
				return app;
		}	
		return null;
	}

	public ArrayList<Professionista> getsProfessionista(String camp, int cat){
		ArrayList<Professionista> ret = new ArrayList<Professionista>();
		for(Professionista app:pro)
			if(((app.getNome()).startsWith(camp) && cat == 1) || ((app.getCitta()).startsWith(camp) && cat == 2) || ((app.getCategoria()).startsWith(camp) && cat == 3))
				ret.add(app);
		return ret;
	}

	public Amministratore getAmministratore(String m, String p){
		for(Amministratore app:amm)
		{
			if(m.equals(app.getEmail()) && p.equals(app.getPsw()))
				return app;
		}	
		return null;
	}

	public ArrayList<Recensione> getsRecensione(int n){
		ArrayList<Recensione> ret = new ArrayList<Recensione>();
		for(Recensione app:rec)
			if(n == app.getIdP())
				ret.add(app);
		return ret;	
	}

	public ArrayList<Segnalazione> getsSegnalazione(){
		ArrayList<Segnalazione> ret = new ArrayList<Segnalazione>();
		for(Segnalazione app:seg)
			if(!(app.getStato()))
				ret.add(app);
		return ret;	
	}

}


