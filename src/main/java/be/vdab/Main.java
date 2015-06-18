package be.vdab;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.services.PersoonServiceImpl;

public class Main {

	public static void main(String[] args) throws IOException{
//		List<Persoon> personen = new ArrayList<Persoon>();
//		personen.add(new Persoon(1, "Jeno", "De Keyzer", 0));
//		personen.add(new Persoon(2, "Odin", "De Keyzer", 0));
//		personen.add(new Persoon(3, "Lando", "De Keyzer", 0));
//		personen.add(new Persoon(4, "Adinda", "Ricourt", 3));
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"container.xml")) {
			context.getBean(PersoonViewer.class).afbeelden();
		}

	}

}
