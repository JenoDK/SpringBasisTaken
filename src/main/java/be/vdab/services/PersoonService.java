package be.vdab.services;

import java.io.IOException;
import java.util.List;

import be.vdab.Persoon;

public interface PersoonService {
	List<Persoon> findAll() throws IOException;
}
