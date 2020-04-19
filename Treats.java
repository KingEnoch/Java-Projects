/*
 * Author --> Enoch Oppong D19126484
 * This file is connected to my statistic page on the Java CRUD Application
 * 
 * 
 */
package oppong.enoch_assignment2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @NamedQuery annotation defines a query in the database and then retrieves all that specific objects within the database 
 * This allows me to manipulate the data while it keeps its integrity
 */
@Entity
@Table(name = "TREATS", catalog = "", schema = "EOPPONG")
@NamedQueries({
    @NamedQuery(name = "Treats.findAll", query = "SELECT t FROM Treats t")
    , @NamedQuery(name = "Treats.findById", query = "SELECT t FROM Treats t WHERE t.id = :id")
    , @NamedQuery(name = "Treats.findByMake", query = "SELECT t FROM Treats t WHERE t.make = :make")
    , @NamedQuery(name = "Treats.findByFlavour", query = "SELECT t FROM Treats t WHERE t.flavour = :flavour")
    , @NamedQuery(name = "Treats.findByPurchased", query = "SELECT t FROM Treats t WHERE t.purchased = :purchased")
    , @NamedQuery(name = "Treats.findByColor", query = "SELECT t FROM Treats t WHERE t.color = :color")
    , @NamedQuery(name = "Treats.findByContainsNuts", query = "SELECT t FROM Treats t WHERE t.containsNuts = :containsNuts")
    , @NamedQuery(name = "Treats.findByVeganFriendly", query = "SELECT t FROM Treats t WHERE t.veganFriendly = :veganFriendly")
    , @NamedQuery(name = "Treats.findByCalories", query = "SELECT t FROM Treats t WHERE t.calories = :calories")
    , @NamedQuery(name = "Treats.findByRating", query = "SELECT t FROM Treats t WHERE t.rating = :rating")})

public class Treats implements Serializable {//start Treats

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "MAKE")
    private String make;
    @Column(name = "FLAVOUR")
    private String flavour;
    @Column(name = "PURCHASED")
    private String purchased;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "CONTAINS_NUTS")
    private Integer containsNuts;
    @Column(name = "VEGAN_FRIENDLY")
    private Integer veganFriendly;
    @Column(name = "CALORIES")
    private Integer calories;
    @Column(name = "RATING")
    private Integer rating;

    public Treats() {//start Treats constructor
    }//end Treats constructor

    //************************************ GETTERS/SETTERS ***************************\\
    public Treats(String id) {//start Treats
        this.id = id;
    }//end Treats

    public String getId() {//start getId
        return id;
    }//end getId

    public void setId(String id) {//start setId
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }//end setId

    public String getMake() {//start getMake
        return make;
    }//end getMake

    public void setMake(String make) {//start setMake
        String oldMake = this.make;
        this.make = make;
        changeSupport.firePropertyChange("make", oldMake, make);
    }//end setMake

    public String getFlavour() {//start getFlavour
        return flavour;
    }//end getFlavour

    public void setFlavour(String flavour) {//start setFlavour
        String oldFlavour = this.flavour;
        this.flavour = flavour;
        changeSupport.firePropertyChange("flavour", oldFlavour, flavour);
    }//end setFlavour

    public String getPurchased() {//start getPurhased
        return purchased;
    }//end getPurchased

    public void setPurchased(String purchased) {//start setPurchased
        String oldPurchased = this.purchased;
        this.purchased = purchased;
        changeSupport.firePropertyChange("purchased", oldPurchased, purchased);
    }//end setPurchased

    public String getColor() {//start getColor
        return color;
    }//end getColor

    public void setColor(String color) {//start setColor
        String oldColor = this.color;
        this.color = color;
        changeSupport.firePropertyChange("color", oldColor, color);
    }//end setColor

    public Integer getContainsNuts() {//start getContainsNuts
        return containsNuts;
    }//end getContainsNuts

    public void setContainsNuts(Integer containsNuts) {//start setContainsNuts
        Integer oldContainsNuts = this.containsNuts;
        this.containsNuts = containsNuts;
        changeSupport.firePropertyChange("containsNuts", oldContainsNuts, containsNuts);
    }//end setContainsNuts

    public Integer getVeganFriendly() {//start getVeganFriendly
        return veganFriendly;
    }//end getVeganFriendly

    public void setVeganFriendly(Integer veganFriendly) {//start setVeganFriendly
        Integer oldVeganFriendly = this.veganFriendly;
        this.veganFriendly = veganFriendly;
        changeSupport.firePropertyChange("veganFriendly", oldVeganFriendly, veganFriendly);
    }//end setVeganFriendly

    public Integer getCalories() {//start getCalories
        return calories;
    }//end getCalories

    public void setCalories(Integer calories) {//start setCalories
        Integer oldCalories = this.calories;
        this.calories = calories;
        changeSupport.firePropertyChange("calories", oldCalories, calories);
    }//end setCalories

    public Integer getRating() {//start getRating
        return rating;
    }//end getRating

    public void setRating(Integer rating) {//start setRating
        Integer oldRating = this.rating;
        this.rating = rating;
        changeSupport.firePropertyChange("rating", oldRating, rating);
    }//end setRating

    
    //************************************ OTHER METHODS ***************************\\
    @Override
    public int hashCode() {//start hashcode
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }//end hashcode

    @Override
    public boolean equals(Object object) {//start equals
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treats)) {//start if
            return false;
        }//end if
        Treats other = (Treats) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {//start if
            return false;
        }//end if
        return true;
    }//end equals

    @Override
    public String toString() {//start toString
        return "oppong.enoch_assignment2.Treats[ id=" + id + " ]";
    }//end toString

    public void addPropertyChangeListener(PropertyChangeListener listener) {//start addPropertyChangeListener
        changeSupport.addPropertyChangeListener(listener);
    }//end addPropertyChangeListener

    public void removePropertyChangeListener(PropertyChangeListener listener) {//start removePropertyChangeListener
        changeSupport.removePropertyChangeListener(listener);
    }//end removePropertyChangeListener
    
    
    //************************************ OTHER METHODS ***************************\\
    //This function counts how many records there are in the database
    static String count(){//start count
        String x = null;
        try
        {//start try
          String myDriver = "org.apache.derby.jdbc.EmbeddedDriver";
          String myUrl = "jdbc:derby://localhost:1527/TREATS";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "eoppong", "eoppong");
          String count = "SELECT COUNT(*) FROM TREATS";
          Statement st1 = conn.createStatement();
          ResultSet rs1 = st1.executeQuery(count);
          while (rs1.next())
          {//start while
            String icecount = rs1.getString(1);
            x = icecount;
          }//end while
          st1.close();
        }//end try
        catch (Exception e)
        {//start catch
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }//end catch
        return x;
    }//end count
    
    
    //This function calculates thre average rating of each ice-cream
    static String average(){//start average  
    String x = null;
        try
        {//start try
          String myDriver = "org.apache.derby.jdbc.EmbeddedDriver";
          String myUrl = "jdbc:derby://localhost:1527/TREATS";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "eoppong", "eoppong");
          String avg = "SELECT AVG(RATING) FROM TREATS";
          Statement st2 = conn.createStatement();
          ResultSet rs2 = st2.executeQuery(avg);
          while (rs2.next())
          {//start while
            String ratingavg = rs2.getString(1);
            x = ratingavg;
          }//end while
          st2.close();
        }//end try
        catch (Exception e)
        {//start catch
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }//end catch
        return x;
    }//end average
    
    
    //This calculates the amount of a specific brand of ice-cream
    static String bandj(){//start bandj  
    String x = null;
        try
        {//start try
          String myDriver = "org.apache.derby.jdbc.EmbeddedDriver";
          String myUrl = "jdbc:derby://localhost:1527/TREATS";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "eoppong", "eoppong");
          String jerry = "SELECT COUNT(*) FROM TREATS WHERE MAKE = 'Ben & Jerrys'";
          Statement st2 = conn.createStatement();
          ResultSet rs2 = st2.executeQuery(jerry);
          while (rs2.next())
          {//start while
            String popmake = rs2.getString(1);
            x = popmake;
          }//end while
          st2.close();
        }//end try
        catch (Exception e)
        {//start catch
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }//end catch
        return x;
    }//end bandj

    
    //This function calculates the average for calories    
    static String calAverage(){//start calAverage  
    String x = null;
        try
        {//start try
          String myDriver = "org.apache.derby.jdbc.EmbeddedDriver";
          String myUrl = "jdbc:derby://localhost:1527/TREATS";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "eoppong", "eoppong");
          String avg = "SELECT AVG(CALORIES) FROM TREATS";
          Statement st2 = conn.createStatement();
          ResultSet rs2 = st2.executeQuery(avg);
          while (rs2.next())
          {//start while
            String carbs = rs2.getString(1);
            x = carbs;
          }//end while
          st2.close();
        }//end try
        catch (Exception e)
        {//start catch
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }//end catch
        return x;
    }//end calAverage
    
    
    //This function calculates the amount of ice-cream that is the color red 
    static String redice(){//start redice  
    String x = null;
        try
        {//start try
          String myDriver = "org.apache.derby.jdbc.EmbeddedDriver";
          String myUrl = "jdbc:derby://localhost:1527/TREATS";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "eoppong", "eoppong");
          String red = "SELECT COUNT(*) FROM TREATS WHERE COLOR = 'Red'";
          Statement st3 = conn.createStatement();
          ResultSet rs3 = st3.executeQuery(red);
          while (rs3.next())
          {//start while
            String icered = rs3.getString(1);
            x = icered;
          }//end while
          st3.close();
        }//end try
        catch (Exception e)
        {//start catch
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
        }//end catch
        return x;
    }//end redice
    
}//end Treats
