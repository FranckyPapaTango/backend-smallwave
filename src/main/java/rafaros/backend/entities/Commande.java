/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaros.backend.entities;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author BigWave
 */
@Entity
//@Table(name = "commande",  schema = "smallwave")
//@XmlRootElement
@JsonRootName("commande")
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c")
   // , @NamedQuery(name = "Commande.findByIdCommande ", query = "SELECT c FROM Commande c WHERE c.idCommande  = :idCommande ")
    , @NamedQuery(name = "Commande.findByIdCommande ", query = "SELECT c FROM Commande c WHERE c.id  = :id ")
    , @NamedQuery(name = "Commande.findByCivilite", query = "SELECT c FROM Commande c WHERE c.civilite = :civilite")
    , @NamedQuery(name = "Commande.findByPays", query = "SELECT c FROM Commande c WHERE c.pays = :pays")
    , @NamedQuery(name = "Commande.findByPrenom", query = "SELECT c FROM Commande c WHERE c.prenom = :prenom")
    , @NamedQuery(name = "Commande.findByNom", query = "SELECT c FROM Commande c WHERE c.nom = :nom")
    , @NamedQuery(name = "Commande.findByNomProduit", query = "SELECT c FROM Commande c WHERE c.nomProduit = :nomProduit")
    , @NamedQuery(name = "Commande.findByDescriptionProduit", query = "SELECT c FROM Commande c WHERE c.descriptionProduit = :descriptionProduit")
    , @NamedQuery(name = "Commande.findByPhone", query = "SELECT c FROM Commande c WHERE c.phone = :phone")
    , @NamedQuery(name = "Commande.findByInstantMessenger", query = "SELECT c FROM Commande c WHERE c.instantMessenger = :instantMessenger")
    , @NamedQuery(name = "Commande.findByEmail", query = "SELECT c FROM Commande c WHERE c.email = :email")
    , @NamedQuery(name = "Commande.findByDeadline", query = "SELECT c FROM Commande c WHERE c.deadline = :deadline")
    , @NamedQuery(name = "Commande.findByBudget", query = "SELECT c FROM Commande c WHERE c.budget = :budget")
    , @NamedQuery(name = "Commande.findByPathDle", query = "SELECT c FROM Commande c WHERE c.pathDle = :pathDle")})
public class Commande extends AbstractEntity implements Serializable {
	//public class Commande  implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 3682320742167623974L;
	//  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_COMMANDE")
 //   private Long idCommande;
    private Long id;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CIVILITE")
    private String civilite;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PAYS")
    private String pays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOM")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOM_PRODUIT")
    private String nomProduit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPTION_PRODUIT")
    private String descriptionProduit;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 50)
    @Column(name = "INSTANT_MESSENGER")
    private String instantMessenger;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
//    @Basic(optional = false)
//    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DEADLINE")
    private String deadline;
//    @Basic(optional = false)
//    @NotNull
    @Size(max = 50)
    @Column(name = "BUDGET")
    private String budget;
    @Size(max = 255)
    @Column(name = "PATH_DLE")
    private String pathDle;
    @JoinColumn(name = "id")
    @ManyToOne(fetch=FetchType.LAZY,optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Typecommande typecommande;

    public Commande() {
    }





	public Commande(//Long id, 
			@Size(min = 1, max = 30) String civilite, @Size(min = 1, max = 50) String pays,
			@NotNull @Size(min = 1, max = 50) String prenom, @NotNull @Size(min = 1, max = 50) String nom,
			@NotNull @Size(min = 1, max = 50) String nomProduit,
			@NotNull @Size(min = 1, max = 255) String descriptionProduit, @Size(max = 50) String phone,
			@Size(max = 50) String instantMessenger, @NotNull @Size(min = 1, max = 50) String email,
			@Size(min = 1, max = 50) String deadline, @Size(min = 1, max = 50) String budget,
			@Size(max = 255) String pathDle, Typecommande typecommande) {
		super();
		//this.id = id;
		this.civilite = civilite;
		this.pays = pays;
		this.prenom = prenom;
		this.nom = nom;
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.phone = phone;
		this.instantMessenger = instantMessenger;
		this.email = email;
		this.deadline = deadline;
		this.budget = budget;
		this.pathDle = pathDle;
		this.typecommande = typecommande;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getNomProduit() {
		return nomProduit;
	}


	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}


	public String getDescriptionProduit() {
		return descriptionProduit;
	}


	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getInstantMessenger() {
		return instantMessenger;
	}


	public void setInstantMessenger(String instantMessenger) {
		this.instantMessenger = instantMessenger;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDeadline() {
		return deadline;
	}


	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}


	public String getBudget() {
		return budget;
	}


	public void setBudget(String budget) {
		this.budget = budget;
	}


	public String getPathDle() {
		return pathDle;
	}


	public void setPathDle(String pathDle) {
		this.pathDle = pathDle;
	}


	public Typecommande getTypecommande() {
		return typecommande;
	}


	public void setTypecommande(Typecommande typecommande) {
		this.typecommande = typecommande;
	}


	@Override
	public int hashCode() {
		return Objects.hash(budget, civilite, deadline, descriptionProduit, email, id, instantMessenger, nom,
				nomProduit, pathDle, pays, phone, prenom, typecommande);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		return Objects.equals(budget, other.budget) && Objects.equals(civilite, other.civilite)
				&& Objects.equals(deadline, other.deadline)
				&& Objects.equals(descriptionProduit, other.descriptionProduit) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(instantMessenger, other.instantMessenger)
				&& Objects.equals(nom, other.nom) && Objects.equals(nomProduit, other.nomProduit)
				&& Objects.equals(pathDle, other.pathDle) && Objects.equals(pays, other.pays)
				&& Objects.equals(phone, other.phone) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(typecommande, other.typecommande);
	}


	@Override
	public String toString() {
		return "Commande [id=" + id + ", civilite=" + civilite + ", pays=" + pays + ", prenom=" + prenom + ", nom="
				+ nom + ", nomProduit=" + nomProduit + ", descriptionProduit=" + descriptionProduit + ", phone=" + phone
				+ ", instantMessenger=" + instantMessenger + ", email=" + email + ", deadline=" + deadline + ", budget="
				+ budget + ", pathDle=" + pathDle + ", typecommande=" + typecommande + "]";
	}



}







    

