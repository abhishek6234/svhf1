/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abhishek
 */
@Entity
@Table(name = "registration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registration.findAll", query = "SELECT r FROM Registration r")
    , @NamedQuery(name = "Registration.findById", query = "SELECT r FROM Registration r WHERE r.id = :id")
    , @NamedQuery(name = "Registration.findByReg", query = "SELECT r FROM Registration r WHERE r.reg = :reg")
    , @NamedQuery(name = "Registration.findByFather", query = "SELECT r FROM Registration r WHERE r.father = :father")
    , @NamedQuery(name = "Registration.findByMother", query = "SELECT r FROM Registration r WHERE r.mother = :mother")
    , @NamedQuery(name = "Registration.findByClass1", query = "SELECT r FROM Registration r WHERE r.class1 = :class1")
    , @NamedQuery(name = "Registration.findBySection", query = "SELECT r FROM Registration r WHERE r.section = :section")
    , @NamedQuery(name = "Registration.findByYear", query = "SELECT r FROM Registration r WHERE r.year = :year")
    , @NamedQuery(name = "Registration.findByGender", query = "SELECT r FROM Registration r WHERE r.gender = :gender")
    , @NamedQuery(name = "Registration.findByBloodgr", query = "SELECT r FROM Registration r WHERE r.bloodgr = :bloodgr")
    , @NamedQuery(name = "Registration.findByResaddr", query = "SELECT r FROM Registration r WHERE r.resaddr = :resaddr")
    , @NamedQuery(name = "Registration.findByPermadd", query = "SELECT r FROM Registration r WHERE r.permadd = :permadd")
    , @NamedQuery(name = "Registration.findByDiab", query = "SELECT r FROM Registration r WHERE r.diab = :diab")
    , @NamedQuery(name = "Registration.findByHother", query = "SELECT r FROM Registration r WHERE r.hother = :hother")
    , @NamedQuery(name = "Registration.findByVpolio", query = "SELECT r FROM Registration r WHERE r.vpolio = :vpolio")
    , @NamedQuery(name = "Registration.findByVmeasles", query = "SELECT r FROM Registration r WHERE r.vmeasles = :vmeasles")
    , @NamedQuery(name = "Registration.findByVhepatitisb", query = "SELECT r FROM Registration r WHERE r.vhepatitisb = :vhepatitisb")
    , @NamedQuery(name = "Registration.findByVhepatitisa", query = "SELECT r FROM Registration r WHERE r.vhepatitisa = :vhepatitisa")
    , @NamedQuery(name = "Registration.findByVhepatitise", query = "SELECT r FROM Registration r WHERE r.vhepatitise = :vhepatitise")
    , @NamedQuery(name = "Registration.findByAllergic", query = "SELECT r FROM Registration r WHERE r.allergic = :allergic")
    , @NamedQuery(name = "Registration.findByChronic", query = "SELECT r FROM Registration r WHERE r.chronic = :chronic")
    , @NamedQuery(name = "Registration.findByMed", query = "SELECT r FROM Registration r WHERE r.med = :med")
    , @NamedQuery(name = "Registration.findByPhn", query = "SELECT r FROM Registration r WHERE r.phn = :phn")
    , @NamedQuery(name = "Registration.findByEmail", query = "SELECT r FROM Registration r WHERE r.email = :email")
    , @NamedQuery(name = "Registration.findByDob", query = "SELECT r FROM Registration r WHERE r.dob = :dob")
    , @NamedQuery(name = "Registration.findByAsthama", query = "SELECT r FROM Registration r WHERE r.asthama = :asthama")
    , @NamedQuery(name = "Registration.findByBp", query = "SELECT r FROM Registration r WHERE r.bp = :bp")
    , @NamedQuery(name = "Registration.findByName", query = "SELECT r FROM Registration r WHERE r.name = :name")})
public class Registration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Id
    @Basic(optional = false)
    @Column(name = "reg")
    private Long reg;
    @Column(name = "father")
    private String father;
    @Column(name = "mother")
    private String mother;
    @Column(name = "class")
    private Integer class1;
    @Column(name = "section")
    private String section;
    @Column(name = "year")
    private Integer year;
    @Column(name = "gender")
    private String gender;
    @Column(name = "bloodgr")
    private String bloodgr;
    @Column(name = "resaddr")
    private String resaddr;
    @Column(name = "permadd")
    private String permadd;
    @Column(name = "diab")
    private String diab;
    @Column(name = "hother")
    private String hother;
    @Column(name = "vpolio")
    private String vpolio;
    @Column(name = "vmeasles")
    private String vmeasles;
    @Column(name = "vhepatitisb")
    private String vhepatitisb;
    @Column(name = "vhepatitisa")
    private String vhepatitisa;
    @Column(name = "vhepatitise")
    private String vhepatitise;
    @Column(name = "allergic")
    private String allergic;
    @Column(name = "chronic")
    private String chronic;
    @Column(name = "med")
    private String med;
    @Column(name = "phn")
    private BigInteger phn;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private String dob;
    @Column(name = "asthama")
    private String asthama;
    @Column(name = "bp")
    private String bp;
    @Column(name = "name")
    private String name;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "registration")
    private Info info;

    public Registration() {
    }

    public Registration(Long reg) {
        this.reg = reg;
    }

    public Registration(Long reg, int id) {
        this.reg = reg;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getReg() {
        return reg;
    }

    public void setReg(Long reg) {
        this.reg = reg;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public Integer getClass1() {
        return class1;
    }

    public void setClass1(Integer class1) {
        this.class1 = class1;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodgr() {
        return bloodgr;
    }

    public void setBloodgr(String bloodgr) {
        this.bloodgr = bloodgr;
    }

    public String getResaddr() {
        return resaddr;
    }

    public void setResaddr(String resaddr) {
        this.resaddr = resaddr;
    }

    public String getPermadd() {
        return permadd;
    }

    public void setPermadd(String permadd) {
        this.permadd = permadd;
    }

    public String getDiab() {
        return diab;
    }

    public void setDiab(String diab) {
        this.diab = diab;
    }

    public String getHother() {
        return hother;
    }

    public void setHother(String hother) {
        this.hother = hother;
    }

    public String getVpolio() {
        return vpolio;
    }

    public void setVpolio(String vpolio) {
        this.vpolio = vpolio;
    }

    public String getVmeasles() {
        return vmeasles;
    }

    public void setVmeasles(String vmeasles) {
        this.vmeasles = vmeasles;
    }

    public String getVhepatitisb() {
        return vhepatitisb;
    }

    public void setVhepatitisb(String vhepatitisb) {
        this.vhepatitisb = vhepatitisb;
    }

    public String getVhepatitisa() {
        return vhepatitisa;
    }

    public void setVhepatitisa(String vhepatitisa) {
        this.vhepatitisa = vhepatitisa;
    }

    public String getVhepatitise() {
        return vhepatitise;
    }

    public void setVhepatitise(String vhepatitise) {
        this.vhepatitise = vhepatitise;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getChronic() {
        return chronic;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic;
    }

    public String getMed() {
        return med;
    }

    public void setMed(String med) {
        this.med = med;
    }

    public BigInteger getPhn() {
        return phn;
    }

    public void setPhn(BigInteger phn) {
        this.phn = phn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAsthama() {
        return asthama;
    }

    public void setAsthama(String asthama) {
        this.asthama = asthama;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reg != null ? reg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
        if ((this.reg == null && other.reg != null) || (this.reg != null && !this.reg.equals(other.reg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.Registration[ reg=" + reg + " ]";
    }
    
}
