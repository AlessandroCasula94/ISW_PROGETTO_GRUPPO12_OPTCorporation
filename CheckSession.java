package isw;

import java.util.*;

public final class CheckSession{

	public CheckSession(){}

	public static int login(Database db){
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci email:\t");
		String m = input.nextLine();
		System.out.println("inserisci password:\t");
		String p = input.nextLine();
		int log=0;
		if (db.getProfessionista(m,p) != null)
		{
			log=((db.getProfessionista(m,p).getId())*10)+1;
			System.out.println("benvenuto professionista");
		}
		else
		{ 
			if (db.getAmministratore(m,p) != null)
			{
				log=((db.getAmministratore(m,p).getId())*10)+2;
				System.out.println("benvenuto amministratore");
			}		
			else
				System.out.println("utente o password non validi");
		}		
		System.out.println("premere un tasto per continuare ");
		String tb = input.nextLine();
		return log;
		}

		public static int logout(Database db){
			Scanner input = new Scanner(System.in);
			System.out.println("ciao!");
			System.out.println("premere un tasto per continuare ");
			String tb = input.nextLine();
			return 0;
		}

}


