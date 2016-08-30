package isw;

import java.util.*;

public final class CheckSegn{

	public CheckSegn(){}

	public static void inserisciSegnalazione(Database db){
		System.out.print("\033c");
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci email:\t");
		String m1 = input.nextLine();
		System.out.println("conferma email:\t");
		String m2 = input.nextLine();
		if(m1.equals(m2) && (db.getUtente(m1)) != null)
		{		
			int id = (db.getUtente(m1)).getId();		
			System.out.println("inserisci motivazione:\t");
			String p = input.nextLine();
			db.setSegnalazione(p, id); 
			System.out.println("segnalazione aggiunta con successo\npremere un tasto per continuare ");
			String tb = input.nextLine();
		}
		else
		{	
			System.out.println("e-mail non valida\n premere un tasto per continuare");
			String tb = input.nextLine();	
		}
		System.out.print("\033c");	
	}

	public static void visualizzaSegnalazione(Database db){
		Scanner input = new Scanner(System.in);
		int j=0;
		ArrayList<Segnalazione> pro = db.getsSegnalazione();
		for(Segnalazione app:pro)
		{
			j++;	
			System.out.println(j +")\tID utente: " + app.getId() + "\nDescrizione: " + app.getDescrizione() + "\n");
		}

		System.out.println("\npremere un tasto per continuare");
		String tb = input.nextLine();
	}
}


