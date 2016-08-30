package isw;

import java.util.*;

public final class CheckUser{

	public CheckUser(){}

	public static void registrati(Database db, int log){
		Scanner input = new Scanner(System.in);
		String v[] = new String[10];
		System.out.println("inserisci nome:\t");
		v[0] = input.nextLine();
		System.out.println("inserisci cognome:\t");
		v[1] = input.nextLine();
		System.out.println("inserisci attivita:\t");
		v[2] = input.nextLine();
		System.out.println("inserisci citta:\t");
		v[3] = input.nextLine();
		System.out.println("inserisci telefono:\t");
		v[4] = input.nextLine();
		if(log==0)
		{
			System.out.println("inserisci email:\t");
			v[5] = input.nextLine();
		}		
		System.out.println("inserisci categoria:\t");
		v[6] = input.nextLine();
		System.out.println("inserisci una tua descrizione:\t");
		v[7] = input.nextLine();
		System.out.println("inserisci la descrizione della tua attivita:\t");
		v[8] = input.nextLine();
		System.out.println("inserisci password:\t");
		v[9] = input.nextLine();
		System.out.println("ripeti password:\t");
		String v10 = input.nextLine();
		if(log==0)
		{
			if(v10.equals(v[9]) && db.getProfessionista(v[5]) == null)
			{
				db.setProfessionista(v);	
				System.out.println("\nprofessionista inserito corretamente\npremere un tasto per continuare ");
				String tb = input.nextLine();
				System.out.print("\033c");
			}
			else{
				System.out.println("\nerrore nell'inserimento dei dati\npremere un tasto per continuare ");
				String tb = input.nextLine();
				System.out.print("\033c");	
			}
		}
		else
		{
			if(v10.equals(v[9]))
			{
				db.updateProfessionista(v,log);	
				System.out.println("\ndati professionista cambiati\npremere un tasto per continuare ");
				String tb = input.nextLine();
				System.out.print("\033c");
			}
			else{
				System.out.println("\nerrore nell'inserimento dei dati\npremere un tasto per continuare ");
				String tb = input.nextLine();
				System.out.print("\033c");	
			}
		}
	}

	public static void ricerca(Database db, int log){
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci campo di ricerca:\t");
		String c = input.nextLine();
		System.out.println("inserisci 1 per ricerca per nome, 2 per citta, 3 per attivita:\t");
		int v2 = input.nextInt();
		System.out.println("-----------------------------------------------------------------");
		int j=0;
		ArrayList<Professionista> pro = db.getsProfessionista(c, v2);
		for(Professionista app:pro)
		{
			j++;	
			System.out.println(j +")\tNome: " + app.getNome() + " Categoria: " + app.getCategoria() + " Citta: " + app.getCitta());
		}
		if(j!=0)
		{
			System.out.println("\nscelta (digita 0 per tornare indietro):\t");
			int n = input.nextInt();
			if(n!=0)
			{
				int id = (pro.get(n-1)).getId();
				CheckUser.visualizzaPagina(db, id, log);
			}
		}
		else
		{
			System.out.println("\nnessun risultato\npremere un tasto per continuare ");
			int n = input.nextInt();
		}
	}

	public static void visualizzaPagina(Database db, int id, int log){
		Scanner input = new Scanner(System.in);
		System.out.print("\033c");
		Professionista p = db.getProfessionista(id);
		System.out.println("------------------------------------PAGINA-----------------------------------");
		System.out.println("Nome:\t\t" + p.getNome());
		System.out.println("Cognome:\t" + p.getCognome());
		System.out.println("Attivita:\t"  + p.getAttivita());
		System.out.println("Citta:\t\t" + p.getCitta());
		System.out.println("Telefono:\t" + p.getTelefono());
		System.out.println("E-mail:\t\t" + p.getEmail());
		System.out.println("Categoria:\t" + p.getCategoria());
		System.out.println("Descrizione Attivita:\t" + p.getDescrizioneA());
		System.out.println("Descrizione Utente:\t" + p.getDescrizioneU());
		System.out.println("-----------------------------------RECENSIONI--------------------------------\n");
		ArrayList<Recensione> rec = db.getsRecensione(id);
		for(Recensione app:rec)
		{
			Utente u = db.getUtente(app.getIdU());
			System.out.println("Utente: " + u.getEmail());
			System.out.println(app.getDescrizione() + "\n");
	
		}
		if(log == 0)
		{
			System.out.println("-----------------------------------COMMENTA--------------------------------");
			System.out.print("digita 1 per inserire una recensione, 0 per tornare indietro:\t");
			int n = input.nextInt();
			if(n!=0)
			CheckRec.inserisciRecensione(db, id);
		}
		else
		{
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("premere un tasto per tornare al menu principale:\t");
			int n = input.nextInt();
		}
	}

	public static void bannaUtente(Database db){
		System.out.print("\033c");
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci id utente:\t");
		int n1 = input.nextInt();
		System.out.println("conferma id utente:\t");
		int n2 = input.nextInt();
		if(n1 == n2 && db.getUtente(n1) != null)
		{
			db.updateUtente(n1);
			System.out.println("errore bloccata corretamente\n premere un tasto per continuare");
			int n23 = input.nextInt();
		}
		else
		{
			System.out.println("errore nell'e-mail\n premere un tasto per continuare");
			int n23 = input.nextInt();		
		}

	}
	
}


