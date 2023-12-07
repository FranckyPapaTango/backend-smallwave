package rafaros.backend.entities;


import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 *
 * @author BigWave
 */
@Entity
//@Table(name = "produit",  schema = "smallwave")
//@XmlRootElement
@JsonRootName("produit")
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByIdProduit", query = "SELECT p FROM Produit p WHERE p.idProduit = :idProduit"),
    @NamedQuery(name = "Produit.findByCssRawColorCode", query = "SELECT p FROM Produit p WHERE p.cssRawColorCode = :cssRawColorCode"),
    @NamedQuery(name = "Produit.findByDatePersistence", query = "SELECT p FROM Produit p WHERE p.datePersistence = :datePersistence"),
    @NamedQuery(name = "Produit.findByUpdatedVersionDate", query = "SELECT p FROM Produit p WHERE p.updatedVersionDate = :updatedVersionDate"),
    @NamedQuery(name = "Produit.findByCategory", query = "SELECT p FROM Produit p WHERE p.category = :category"),
    @NamedQuery(name = "Produit.findByDescription", query = "SELECT p FROM Produit p WHERE p.description = :description"),
    @NamedQuery(name = "Produit.findByImage", query = "SELECT p FROM Produit p WHERE p.image = :image"),
    @NamedQuery(name = "Produit.findByPrice", query = "SELECT p FROM Produit p WHERE p.price = :price"),
    @NamedQuery(name = "Produit.findByTitle", query = "SELECT p FROM Produit p WHERE p.title = :title")})
public class Produit extends AbstractEntity implements Serializable {
private static final long serialVersionUID = 3682320742167623974L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PRODUIT")
    private Long idProduit;
    @Size(min = 1, max = 30)
    @Column(name = "TITLE")
    private String title;
    @Column(name = "PRICE")
    private Double price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(min = 1, max = 30)
    @Column(name = "ISAVAILABLE")
    private Boolean isAvailable;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IMAGE")
    private String image; // Path to image

/* rating  is not implemented */

/*    @JoinColumn(name = "id")
    @ManyToOne(fetch=FetchType.LAZY,optional = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Typeproduit typeproduit;
*/
    @Size(max = 100)
    @Column(name = "OUTSIDELINK")
    private String outsideLink;/* lien externe au site pointant sur le produit (ex: vers Google Play Store) */

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CATEGORY")
    private String category;


    public Produit() {
    }

    public Produit(Long idProduit) {
        this.idProduit = idProduit;
    }


	

	public Produit(@Size(min = 1, max = 30) String title, Double price,
			@NotNull @Size(min = 1, max = 250) String description, @Size(min = 1, max = 30) Boolean isAvailable,
			@NotNull @Size(min = 1, max = 50) String image, @Size(max = 100) String outsideLink,
			@NotNull @Size(min = 1, max = 50) String category) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
		this.isAvailable = isAvailable;
		this.image = image;
		this.outsideLink = outsideLink;
		this.category = category;
	}

	public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	

	public String getOutsideLink() {
		return outsideLink;
	}

	public void setOutsideLink(String outsideLink) {
		this.outsideLink = outsideLink;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduit != null ? idProduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.idProduit == null && other.idProduit != null) || (this.idProduit != null && !this.idProduit.equals(other.idProduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gradleproject1.Produit[ idProduit=" + idProduit + " ]";
    }
}
