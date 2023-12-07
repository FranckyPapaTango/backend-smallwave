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
//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BigWave
 */
@Entity
//@Table(name = "image",  schema = "smallwave")
//@XmlRootElement
@JsonRootName("image")
@NamedQueries({
    @NamedQuery(name = "Image.findAll", query = "SELECT i FROM Image i")
    , @NamedQuery(name = "Image.findByIdImg", query = "SELECT i FROM Image i WHERE i.idImg = :idImg")
    , @NamedQuery(name = "Image.findByPathDle", query = "SELECT i FROM Image i WHERE i.pathDle = :pathDle")})
public class Image extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_IMG")
    private Long idImg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PATH_DLE")
    private String pathDle;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Actualite id;

    public Image() {
    }

    public Image(Long idImg) {
        this.idImg = idImg;
    }

    public Image(Long idImg, String pathDle) {
        this.idImg = idImg;
        this.pathDle = pathDle;
    }

    public Long getIdImg() {
        return idImg;
    }

    public void setIdImg(Long idImg) {
        this.idImg = idImg;
    }

    public String getPathDle() {
        return pathDle;
    }

    public void setPathDle(String pathDle) {
        this.pathDle = pathDle;
    }

    public Actualite getId() {
        return id;
    }

    public void setId(Actualite id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImg != null ? idImg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Image)) {
            return false;
        }
        Image other = (Image) object;
        if ((this.idImg == null && other.idImg != null) || (this.idImg != null && !this.idImg.equals(other.idImg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rafaros.domaine_smallwave.entities.Image[ idImg=" + idImg + " ]";
    }
    
}
