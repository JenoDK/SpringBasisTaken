package be.vdab.services;

import java.io.IOException;
import java.util.List;

import be.vdab.Persoon;
import be.vdab.restclient.PersoonDAO;

public class PersoonServiceImpl implements PersoonService {
	private final PersoonDAO persoonDAO;

	public PersoonServiceImpl(PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		return persoonDAO.findAll();
	}

}
