/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tauqeer
 */
@Entity
@Table(name = "info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Info.findAll", query = "SELECT i FROM Info i")
    , @NamedQuery(name = "Info.findById", query = "SELECT i FROM Info i WHERE i.id = :id")
    , @NamedQuery(name = "Info.findByRegno", query = "SELECT i FROM Info i WHERE i.regno = :regno")
    , @NamedQuery(name = "Info.findByTeacher", query = "SELECT i FROM Info i WHERE i.teacher = :teacher")
    , @NamedQuery(name = "Info.findByStuname", query = "SELECT i FROM Info i WHERE i.stuname = :stuname")
    , @NamedQuery(name = "Info.findByClass1", query = "SELECT i FROM Info i WHERE i.class1 = :class1")
    , @NamedQuery(name = "Info.findByGender", query = "SELECT i FROM Info i WHERE i.gender = :gender")
    , @NamedQuery(name = "Info.findByDob", query = "SELECT i FROM Info i WHERE i.dob = :dob")
    , @NamedQuery(name = "Info.findByStain", query = "SELECT i FROM Info i WHERE i.stain = :stain")
    , @NamedQuery(name = "Info.findByCavity", query = "SELECT i FROM Info i WHERE i.cavity = :cavity")
    , @NamedQuery(name = "Info.findByCalculus", query = "SELECT i FROM Info i WHERE i.calculus = :calculus")
    , @NamedQuery(name = "Info.findByMalocclusion", query = "SELECT i FROM Info i WHERE i.malocclusion = :malocclusion")
    , @NamedQuery(name = "Info.findByDother", query = "SELECT i FROM Info i WHERE i.dother = :dother")
    , @NamedQuery(name = "Info.findByDadvice", query = "SELECT i FROM Info i WHERE i.dadvice = :dadvice")
    , @NamedQuery(name = "Info.findByHeight", query = "SELECT i FROM Info i WHERE i.height = :height")
    , @NamedQuery(name = "Info.findByWeight", query = "SELECT i FROM Info i WHERE i.weight = :weight")
    , @NamedQuery(name = "Info.findByChest", query = "SELECT i FROM Info i WHERE i.chest = :chest")
    , @NamedQuery(name = "Info.findByAbdomen", query = "SELECT i FROM Info i WHERE i.abdomen = :abdomen")
    , @NamedQuery(name = "Info.findBySkin", query = "SELECT i FROM Info i WHERE i.skin = :skin")
    , @NamedQuery(name = "Info.findByLefteye", query = "SELECT i FROM Info i WHERE i.lefteye = :lefteye")
    , @NamedQuery(name = "Info.findByRighteye", query = "SELECT i FROM Info i WHERE i.righteye = :righteye")
    , @NamedQuery(name = "Info.findByLeftearwax", query = "SELECT i FROM Info i WHERE i.leftearwax = :leftearwax")
    , @NamedQuery(name = "Info.findByRightearwax", query = "SELECT i FROM Info i WHERE i.rightearwax = :rightearwax")
    , @NamedQuery(name = "Info.findByPother", query = "SELECT i FROM Info i WHERE i.pother = :pother")
    , @NamedQuery(name = "Info.findByPadvice", query = "SELECT i FROM Info i WHERE i.padvice = :padvice")})
public class Info implements Serializable {

    @Column(name = "dob")
    private String dob;
    @JoinColumn(name = "regno", referencedColumnName = "reg")
    @OneToOne(optional = false)
    private Registration registration;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Id
    @Basic(optional = false)
    @Column(name = "regno")
    private Long regno;
    @Column(name = "teacher")
    private String teacher;
    @Column(name = "stuname")
    private String stuname;
    @Column(name = "class")
    private Integer class1;
    @Column(name = "gender")
    private String gender;
    @Column(name = "stain")
    private String stain;
    @Column(name = "cavity")
    private String cavity;
    @Column(name = "calculus")
    private String calculus;
    @Column(name = "malocclusion")
    private String malocclusion;
    @Column(name = "dother")
    private String dother;
    @Column(name = "dadvice")
    private String dadvice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "height")
    private Float height;
    @Column(name = "weight")
    private Float weight;
    @Column(name = "chest")
    private Float chest;
    @Column(name = "abdomen")
    private Float abdomen;
    @Column(name = "skin")
    private String skin;
    @Column(name = "lefteye")
    private Float lefteye;
    @Column(name = "righteye")
    private Float righteye;
    @Column(name = "leftearwax")
    private String leftearwax;
    @Column(name = "rightearwax")
    private String rightearwax;
    @Column(name = "pother")
    private String pother;
    @Column(name = "padvice")
    private String padvice;

    public Info() {
    }

    public Info(Long regno) {
        this.regno = regno;
    }

    public Info(Long regno, int id) {
        this.regno = regno;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Long getRegno() {
        return regno;
    }

    public void setRegno(Long regno) {
        Long oldRegno = this.regno;
        this.regno = regno;
        changeSupport.firePropertyChange("regno", oldRegno, regno);
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        String oldTeacher = this.teacher;
        this.teacher = teacher;
        changeSupport.firePropertyChange("teacher", oldTeacher, teacher);
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        String oldStuname = this.stuname;
        this.stuname = stuname;
        changeSupport.firePropertyChange("stuname", oldStuname, stuname);
    }

    public Integer getClass1() {
        return class1;
    }

    public void setClass1(Integer class1) {
        Integer oldClass1 = this.class1;
        this.class1 = class1;
        changeSupport.firePropertyChange("class1", oldClass1, class1);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }


    public String getStain() {
        return stain;
    }

    public void setStain(String stain) {
        String oldStain = this.stain;
        this.stain = stain;
        changeSupport.firePropertyChange("stain", oldStain, stain);
    }

    public String getCavity() {
        return cavity;
    }

    public void setCavity(String cavity) {
        String oldCavity = this.cavity;
        this.cavity = cavity;
        changeSupport.firePropertyChange("cavity", oldCavity, cavity);
    }

    public String getCalculus() {
        return calculus;
    }

    public void setCalculus(String calculus) {
        String oldCalculus = this.calculus;
        this.calculus = calculus;
        changeSupport.firePropertyChange("calculus", oldCalculus, calculus);
    }

    public String getMalocclusion() {
        return malocclusion;
    }

    public void setMalocclusion(String malocclusion) {
        String oldMalocclusion = this.malocclusion;
        this.malocclusion = malocclusion;
        changeSupport.firePropertyChange("malocclusion", oldMalocclusion, malocclusion);
    }

    public String getDother() {
        return dother;
    }

    public void setDother(String dother) {
        String oldDother = this.dother;
        this.dother = dother;
        changeSupport.firePropertyChange("dother", oldDother, dother);
    }

    public String getDadvice() {
        return dadvice;
    }

    public void setDadvice(String dadvice) {
        String oldDadvice = this.dadvice;
        this.dadvice = dadvice;
        changeSupport.firePropertyChange("dadvice", oldDadvice, dadvice);
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        Float oldHeight = this.height;
        this.height = height;
        changeSupport.firePropertyChange("height", oldHeight, height);
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        Float oldWeight = this.weight;
        this.weight = weight;
        changeSupport.firePropertyChange("weight", oldWeight, weight);
    }

    public Float getChest() {
        return chest;
    }

    public void setChest(Float chest) {
        Float oldChest = this.chest;
        this.chest = chest;
        changeSupport.firePropertyChange("chest", oldChest, chest);
    }

    public Float getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Float abdomen) {
        Float oldAbdomen = this.abdomen;
        this.abdomen = abdomen;
        changeSupport.firePropertyChange("abdomen", oldAbdomen, abdomen);
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        String oldSkin = this.skin;
        this.skin = skin;
        changeSupport.firePropertyChange("skin", oldSkin, skin);
    }

    public Float getLefteye() {
        return lefteye;
    }

    public void setLefteye(Float lefteye) {
        Float oldLefteye = this.lefteye;
        this.lefteye = lefteye;
        changeSupport.firePropertyChange("lefteye", oldLefteye, lefteye);
    }

    public Float getRighteye() {
        return righteye;
    }

    public void setRighteye(Float righteye) {
        Float oldRighteye = this.righteye;
        this.righteye = righteye;
        changeSupport.firePropertyChange("righteye", oldRighteye, righteye);
    }

    public String getLeftearwax() {
        return leftearwax;
    }

    public void setLeftearwax(String leftearwax) {
        String oldLeftearwax = this.leftearwax;
        this.leftearwax = leftearwax;
        changeSupport.firePropertyChange("leftearwax", oldLeftearwax, leftearwax);
    }

    public String getRightearwax() {
        return rightearwax;
    }

    public void setRightearwax(String rightearwax) {
        String oldRightearwax = this.rightearwax;
        this.rightearwax = rightearwax;
        changeSupport.firePropertyChange("rightearwax", oldRightearwax, rightearwax);
    }

    public String getPother() {
        return pother;
    }

    public void setPother(String pother) {
        String oldPother = this.pother;
        this.pother = pother;
        changeSupport.firePropertyChange("pother", oldPother, pother);
    }

    public String getPadvice() {
        return padvice;
    }

    public void setPadvice(String padvice) {
        String oldPadvice = this.padvice;
        this.padvice = padvice;
        changeSupport.firePropertyChange("padvice", oldPadvice, padvice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regno != null ? regno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Info)) {
            return false;
        }
        Info other = (Info) object;
        if ((this.regno == null && other.regno != null) || (this.regno != null && !this.regno.equals(other.regno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.Info[ regno=" + regno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }
    
}
