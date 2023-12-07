/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaros.backend.entities;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
//import javax.xml.bind.annotation.XmlRootElement;




/**
 *
 * @author BigWave
 */
@Entity
//@Table(name = "typecommande",  schema = "smallwave")
//@XmlRootElement
@JsonRootName("typecommande")
@NamedQueries({
    @NamedQuery(name = "Typecommande.findAll", query = "SELECT t FROM Typecommande t")
    , @NamedQuery(name = "Typecommande.findByIdTypecommande", query = "SELECT t FROM Typecommande t WHERE t.id = :id")
    , @NamedQuery(name = "Typecommande.findByLibelletype", query = "SELECT t FROM Typecommande t WHERE t.libelle = :libelle")})
public class Typecommande extends AbstractEntity implements Serializable {
//	public class Typecommande implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = -3816629299736604220L;
	//  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TYPECOMMANDE")
//    private Long idTypecommande;
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "LIBELLETYPE")
    private String libelle;
    
    @Transient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Collection<Commande> commandeCollection;

    public Typecommande() {
    }


    public Typecommande(//Long idTypecommande, 
    		String libelletype) {
     //   this.idTypecommande = idTypecommande;
        this.libelle = libelletype;
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelletype) {
		this.libelle = libelletype;
	}


	public Collection<Commande> getCommandeCollection() {
		return commandeCollection;
	}


	public void setCommandeCollection(Collection<Commande> commandeCollection) {
		this.commandeCollection = commandeCollection;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(commandeCollection, id, libelle);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Typecommande other = (Typecommande) obj;
		return Objects.equals(commandeCollection, other.commandeCollection) && Objects.equals(id, other.id)
				&& Objects.equals(libelle, other.libelle);
	}


	@Override
	public String toString() {
		return "Typecommande [id=" + id + ", libelletype=" + libelle + ", commandeCollection=" + commandeCollection
				+ "]";
	}

   


    
}