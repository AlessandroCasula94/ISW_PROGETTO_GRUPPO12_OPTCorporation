package ISW_PROGETTO_GRUPPO12_OPTCorporation;

import java.util.*;

public final class CheckRec{

	public CheckRec(){}

	public static void inserisciRecensione(Database db, int idP){
		System.out.print("\033c");
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci email:\t");
		String m1 = input.nextLine();
		System.out.println("conferma email:\t");
		String m2 = input.nextLine();
		if(m1.equals(m2))
		{
			if((db.getUtente(m1)) == null)
			{
				db.setUtente(m1);
			}		
			if(!((db.getUtente(m1)).getBan()))
			{	
				int id = (db.getUtente(m1)).getId();		
				System.out.println("inserisci recensione:\t");
				String p = input.nextLine();
				db.setRecensione(idP, id, p); 
				System.out.println("recensione aggiunta con successo\npremere un tasto per continuare ");
				String tb = input.nextLine();
			}
			else
			{
				System.out.println("e-mail bloccata\n premere un tasto per continuare");
				String tb = input.nextLine();
			}
		}
		else
		{	
			System.out.println("e-mail diversa\n premere un tasto per continuare");
			String tb = input.nextLine();	
		}
		System.out.print("\033c");	
	}

}


