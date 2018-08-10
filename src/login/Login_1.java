/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abhishek
 */
@Entity
@Table(name = "login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login_1.findAll", query = "SELECT l FROM Login_1 l")
    , @NamedQuery(name = "Login_1.findById", query = "SELECT l FROM Login_1 l WHERE l.id = :id")
    , @NamedQuery(name = "Login_1.findByUsername", query = "SELECT l FROM Login_1 l WHERE l.username = :username")
    , @NamedQuery(name = "Login_1.findByPassword", query = "SELECT l FROM Login_1 l WHERE l.password = :password")
    , @NamedQuery(name = "Login_1.findByPriviledge", query = "SELECT l FROM Login_1 l WHERE l.priviledge = :priviledge")})
public class Login_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "priviledge")
    private String priviledge;

    public Login_1() {
    }

    public Login_1(Integer id) {
        this.id = id;
    }

    public Login_1(Integer id, String username, String password, String priviledge) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.priviledge = priviledge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPriviledge() {
        return priviledge;
    }

    public void setPriviledge(String priviledge) {
        this.priviledge = priviledge;
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
        if (!(object instanceof Login_1)) {
            return false;
        }
        Login_1 other = (Login_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.Login_1[ id=" + id + " ]";
    }
    
}
