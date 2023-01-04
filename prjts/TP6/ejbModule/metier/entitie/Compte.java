package metier.entitie;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity

public class Compte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code;
	private Date date;
	private Double solde;
	private static final long serialVersionUID = 1L;

	public Compte() {
		super();
	}   
	public long getCode() {
		return this.code;
	}

	public void setCode(long code) {
		this.code = code;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public Double getSolde() {
		return this.solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}
   
}
