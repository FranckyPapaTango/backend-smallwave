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
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BigWave
 */
@Entity
//@Table(name = "categorie",  schema = "smallwave")
//@XmlRootElement
@JsonRootName("categorie")
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c")
    , @NamedQuery(name = "Categorie.findByIdCategorie", query = "SELECT c FROM Categorie c WHERE c.id = :id")})
public class Categorie extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIE")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Collection<Actualite> actualiteCollection;

    

    public Categorie() {
	}

	public Categorie(@NotNull @Size(min = 1, max = 2147483647) String libelle) {
		super();
		this.libelle = libelle;
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

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collection<Actualite> getActualiteCollection() {
		return actualiteCollection;
	}

	public void setActualiteCollection(Collection<Actualite> actualiteCollection) {
		this.actualiteCollection = actualiteCollection;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rafaros.domaine_smallwave.entities.Categorie[ idCategorie=" + id + " ]";
    }
    
}
