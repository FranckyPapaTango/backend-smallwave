/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaros.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BigWave
 */
@Entity
//@Table(name = "chatteur",  schema = "smallwave")
//@XmlRootElement
@JsonRootName("chatteur")
@NamedQueries({
    @NamedQuery(name = "Chatteur.findAll", query = "SELECT c FROM Chatteur c")
    , @NamedQuery(name = "Chatteur.findByChatteurId", query = "SELECT c FROM Chatteur c WHERE c.chatteurId = :chatteurId")
    , @NamedQuery(name = "Chatteur.findBySessionId", query = "SELECT c FROM Chatteur c WHERE c.sessionId = :sessionId")
    , @NamedQuery(name = "Chatteur.findByDateAdded", query = "SELECT c FROM Chatteur c WHERE c.dateAdded = :dateAdded")
    , @NamedQuery(name = "Chatteur.findByPathDle", query = "SELECT c FROM Chatteur c WHERE c.pathDle = :pathDle")
    , @NamedQuery(name = "Chatteur.findByLogin", query = "SELECT c FROM Chatteur c WHERE c.login = :login")
    , @NamedQuery(name = "Chatteur.findByUsername", query = "SELECT c FROM Chatteur c WHERE c.username = :username")})
public class Chatteur extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CHATTEUR_ID")
    private Long chatteurId;
    @Size(max = 255)
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_ADDED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Size(max = 255)
    @Column(name = "PATH_DLE")
    private String pathDle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "USERNAME")
    private String username;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chatteurId")
    private Collection<Message> messageCollection;

    public Chatteur() {
    }

    public Chatteur(Long chatteurId) {
        this.chatteurId = chatteurId;
    }

    public Chatteur(Long chatteurId, Date dateAdded, String login, String username) {
        this.chatteurId = chatteurId;
        this.dateAdded = dateAdded;
        this.login = login;
        this.username = username;
    }

    public Long getChatteurId() {
        return chatteurId;
    }

    public void setChatteurId(Long chatteurId) {
        this.chatteurId = chatteurId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getPathDle() {
        return pathDle;
    }

    public void setPathDle(String pathDle) {
        this.pathDle = pathDle;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //@XmlTransient
    @JsonIgnore
    public Collection<Message> getMessageCollection() {
        return messageCollection;
    }

    public void setMessageCollection(Collection<Message> messageCollection) {
        this.messageCollection = messageCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chatteurId != null ? chatteurId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chatteur)) {
            return false;
        }
        Chatteur other = (Chatteur) object;
        if ((this.chatteurId == null && other.chatteurId != null) || (this.chatteurId != null && !this.chatteurId.equals(other.chatteurId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rafaros.domaine_smallwave.entities.Chatteur[ chatteurId=" + chatteurId + " ]";
    }
    
}
