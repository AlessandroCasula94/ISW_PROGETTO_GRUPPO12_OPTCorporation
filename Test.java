package ISW_PROGETTO_GRUPPO12_OPTCorporation;

import java.util.*;

public class Test{
	public static void main(String args[]){
		Database db = new Database();
		db.setAmministratore("admin","admin");
		int log=0;
		do{
			System.out.print("\033c");
			switch(log%10){
			case 0:	
				log = menuUtente(db, log);
				break;
			case 1: 
				log = menuProfessionista(db, log);
				break;
			case 2: 
				log = menuAmministratore(db, log);
				break;			
			}
		}while(true);
	}

	public static int menuUtente(Database db, int log)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                                  MENU                                      ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1) ricerca");
		System.out.println("2) registrati");
		System.out.println("3) login");
		System.out.println("4) segnala");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("scelta:\t");
		try{
			int n = input.nextInt();
			System.out.print("\033c");
			switch(n){
				case 1:
					CheckUser.ricerca(db, 0);
					break; 
				case 2: 
					CheckUser.registrati(db, 0);
					break;
				case 3: 
					log = CheckSession.login(db);
					break;
				case 4: 
					CheckSegn.inserisciSegnalazione(db);
					break;
				default: 
					System.out.println("SCELTA NON VALIDA\n premere un tasto per continuare ");
					String tb = input.nextLine();
			}
		}catch (Exception exc){
			System.out.println("SCELTA NON VALIDA");
		}
		return log;
	}

	public static int menuProfessionista(Database db, int log)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                                  MENU                                      ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1)\t ricerca");
		System.out.println("2)\t modifica informazioni");
		System.out.println("3)\t logout");
		System.out.println("4)\t segnala");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("scelta:\t");
		try{
			int n = input.nextInt();
			System.out.print("\033c");
			switch(n){
				case 1:
					CheckUser.ricerca(db, 1);
					break;
				case 2: 
					CheckUser.registrati(db, ((log-log%10)/10));
					break;
				case 3: 
					log = CheckSession.logout(db);
					break;
				case 4:

					break;
				default: 
					System.out.println("SCELTA NON VALIDA\n premere un tasto per continuare ");
					String tb = input.nextLine();
			}
		}catch (Exception exc){
			System.out.println("SCELTA NON VALIDA");
		}
		return log;
	}

	public static int menuAmministratore(Database db, int log)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("                                  MENU                                      ");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1) visualizza segnalazioni");
		System.out.println("2) modifica pagina");
		System.out.println("3) elimina utente");
		System.out.println("4) logout");
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("scelta:\t");
		try{
			int n = input.nextInt();
			System.out.print("\033c");
			switch(n){
				case 1:
					CheckSegn.visualizzaSegnalazione(db);
					break;
				case 2:

					break; 
				case 3: 
					CheckUser.bannaUtente(db);
					break;
				case 4: 
					log = CheckSession.logout(db);
					break;			
				default: 
					System.out.println("SCELTA NON VALIDA\n premere un tasto per continuare ");
					String tb = input.nextLine();
			}
		}catch (Exception exc){
			System.out.println("SCELTA NON VALIDA");
		}
		return log;
	}

}
