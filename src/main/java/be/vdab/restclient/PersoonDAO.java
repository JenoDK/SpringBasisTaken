package be.vdab.restclient;

import java.io.IOException;
import java.util.List;

import be.vdab.Persoon;

public interface PersoonDAO {
	List<Persoon> findAll() throws IOException;
}
