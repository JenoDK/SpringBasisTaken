package be.vdab;

public class Persoon {
	private int persoonNr;
	private String voornaam;
	private String familienaam;
	private int aantalKinderen;

	public Persoon(int persoonNr, String voornaam, String familienaam,
			int aantalKinderen) {
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public int getPersoonNr() {
		return persoonNr;
	}

	public void setPersoonNr(int persoonNr) {
		this.persoonNr = persoonNr;
	}

	public String getNaam() {
		return voornaam + " " + familienaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public int getAantalKinderen() {
		return aantalKinderen;
	}

	public void setAantalKinderen(int aantalKinderen) {
		this.aantalKinderen = aantalKinderen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aantalKinderen;
		result = prime * result
				+ ((familienaam == null) ? 0 : familienaam.hashCode());
		result = prime * result + persoonNr;
		result = prime * result
				+ ((voornaam == null) ? 0 : voornaam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoon other = (Persoon) obj;
		if (aantalKinderen != other.aantalKinderen)
			return false;
		if (familienaam == null) {
			if (other.familienaam != null)
				return false;
		} else if (!familienaam.equals(other.familienaam))
			return false;
		if (persoonNr != other.persoonNr)
			return false;
		if (voornaam == null) {
			if (other.voornaam != null)
				return false;
		} else if (!voornaam.equals(other.voornaam))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persoon persoonNr=");
		builder.append(persoonNr);
		builder.append(", voornaam=");
		builder.append(voornaam);
		builder.append(", familienaam=");
		builder.append(familienaam);
		builder.append(", aantalKinderen=");
		builder.append(aantalKinderen);
		return builder.toString();
	}

}
