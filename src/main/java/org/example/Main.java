package org.example;

public class Main {
	public static void main(String[] args) {
		try{
            Roata roata1 = new Roata(5);
            Roata roata2 = new Roata(4);
		    Roata roata3 = new Roata(3);
		    Roata roata4 = new Roata(2);
		    
		    Masina masina = new Masina("Ford Focus");
		    masina.adaugaRoata(roata1);
		    masina.adaugaRoata(roata2);
		    masina.adaugaRoata(roata3);
		    masina.adaugaRoata(roata4);
		    
		    System.out.println(masina.calculeazaArieTotala());
		}
		catch(NumarDeRotiMaximAtinsException ex){
		}
	}
}