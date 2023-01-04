

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@ManagedBean(name="commande")
@SessionScoped
public class Commande{
	
	private int code;
	private Date dateCom;
	private Float montant;
	private String modeP;
	private String statusP;
	private String modeL;
	private String statusL;
	public List<Commande> Cmnds= new ArrayList<Commande>();
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getDateCom() {
		return dateCom;
	}
	public void setDateCom(Date dateCom) {
		this.dateCom = dateCom;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public String getModeP() {
		return modeP;
	}
	public void setModeP(String modeP) {
		this.modeP = modeP;
	}
	public String getStatusP() {
		return statusP;
	}
	public void setStatusP(String statusP) {
		this.statusP = statusP;
	}
	public String getModeL() {
		return modeL;
	}
	public void setModeL(String modeL) {
		this.modeL = modeL;
	}
	public String getStatusL() {
		return statusL;
	}
	public void setStatusL(String statusL) {
		this.statusL = statusL;
	}
	public Commande() { super(); }
	public Commande(int code, Date dateCom, Float montant, String modeP, String statusP, String modeL, String statusL, List<Commande> commands) {
		super();
		this.code = code;
		this.dateCom = dateCom;
		this.montant = montant;
		this.modeP = modeP;
		this.statusP = statusP;
		this.modeL = modeL;
		this.statusL = statusL;
		
		
	}
	
	public List<Commande> getCmnds() {
		return Cmnds;
	}
	public void setCmnds(List<Commande> cmnds) {
		Cmnds = cmnds;
	}
	
	public void saveCommande() {
		Commande cmnd = new Commande();
		cmnd.code=this.code;
		cmnd.dateCom=this.dateCom;
		cmnd.montant=this.montant;
		cmnd.modeP=this.modeP;
		cmnd.statusP=this.statusP;
		cmnd.modeL=this.modeL;
		cmnd.statusL=this.statusL;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		trans.begin();
		session.save(cmnd);
		trans.commit();
		Query q = session.createQuery("from Table_COMMANDE");
		Cmnds =q.list();
	}
	public void deleteCommande() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		trans.begin();
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String,String> map = context.getExternalContext().getRequestParameterMap();
		int id= Integer.parseInt(map.get("code"));
		Commande c = (Commande) session.load(Commande.class, id);
		session.delete(c);
		trans.commit();
		Query q = session.createQuery("from Table_COMMANDE");
		Cmnds =q.list();
	}
}
