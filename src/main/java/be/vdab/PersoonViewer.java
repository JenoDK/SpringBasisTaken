package be.vdab;

import java.io.IOException;
import java.util.List;

import be.vdab.services.PersoonService;

public class PersoonViewer {
	private final PersoonEigenschap[] persooneiegenschappen;
	private final PersoonService persoonService;

	public PersoonViewer(PersoonEigenschap[] persooneiegenschappen,
			PersoonService persoonService) {
		this.persooneiegenschappen = persooneiegenschappen;
		this.persoonService = persoonService;
	}

	public void afbeelden() throws IOException {
		for (Persoon persoon : persoonService.findAll()) {
			for (PersoonEigenschap eigenschap : persooneiegenschappen) {
				toonEigenschap(persoon, eigenschap);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	public void toonEigenschap(Persoon a, PersoonEigenschap b) {
		if (b == PersoonEigenschap.PERSOON_NR) {
			System.out.print(a.getPersoonNr());
		}
		if (b == PersoonEigenschap.VOORNAAM) {
			System.out.print(a.getVoornaam());
		}
		if (b == PersoonEigenschap.FAMILIENAAM) {
			System.out.print(a.getFamilienaam());
		}
		if (b == PersoonEigenschap.AANTAL_KINDEREN) {
			System.out.print(a.getAantalKinderen());
		}
	}
}
