package isw;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class TestProgram{

	@Before
	public void Initializazione(){
	       	Utente ute1 = new Utente("Utente1");
		Utente ute2 = new Utente("Utente2");
		Amministratore amm1 = new Amministratore("Amministratore1","Psw");
	}

	@Test
	public void TestUtente(){
        	Utente ute = new Utente("Test");
		Assert.assertEquals("Test", ute.getEmail());
		Assert.assertEquals(3, ute.getId());
		Assert.assertEquals(false, ute.getBan());
		ute.setBan();
		Assert.assertEquals(true, ute.getBan());
	}

	@Test
	public void TestProfessionista(){
        	Professionista pro = new Professionista("a","b","c","d","e","f","g","h","i","l");
        	Assert.assertEquals("a", pro.getNome());
		Assert.assertEquals("b", pro.getCognome());
		Assert.assertEquals("c", pro.getAttivita());
		Assert.assertEquals("d", pro.getCitta());
		Assert.assertEquals("e", pro.getTelefono());
		Assert.assertEquals("f", pro.getEmail());
		Assert.assertEquals("g", pro.getCategoria());
		Assert.assertEquals("h", pro.getDescrizioneU());
		Assert.assertEquals("i", pro.getDescrizioneA());
		Assert.assertEquals("l", pro.getPsw());
		Assert.assertEquals(1, pro.getCognome());
		pro.setPro("m","n","o","p","q","r","s","t","u");
		Assert.assertEquals("m", pro.getNome());
		Assert.assertEquals("n", pro.getCognome());
		Assert.assertEquals("o", pro.getAttivita());
		Assert.assertEquals("p", pro.getCitta());
		Assert.assertEquals("q", pro.getTelefono());
		Assert.assertEquals("r", pro.getCategoria());
		Assert.assertEquals("s", pro.getDescrizioneU());
		Assert.assertEquals("t", pro.getDescrizioneA());
		Assert.assertEquals("u", pro.getPsw());
		Assert.assertEquals(2, pro.getCognome());
	}

	@Test
	public void TestAmministratore(){
        	Amministratore amm = new Amministratore("Utente","Test");
        	Assert.assertEquals("Utente", amm.getEmail());
		Assert.assertEquals("Test", amm.getPsw());
		Assert.assertEquals(2, amm.getId());
	}

	@Test
	public void TestRecensione(){
        	Recensione rec = new Recensione(1,2,"Recensione");
        	Assert.assertEquals(1, rec.getIdP());
		Assert.assertEquals(2, rec.getIdU());
		Assert.assertEquals("Recensione", rec.getDescrizione());
	}

	@Test
	public void TestSegnalazione(){
        	Segnalazione seg = new Segnalazione("Segnalazione",1);
        	Assert.assertEquals(1, seg.getId());
		Assert.assertEquals("Segnalazione", seg.getDescrizione());
		Assert.assertEquals(false, seg.getStato());
	}
}
