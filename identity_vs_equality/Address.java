import java.util.Objects;
public class Address
{
    String street, city;
    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }
    
    
    
    /**
     * Implement a toString() variant that returns a String representation
     * that can be used to determine equality for this simple Addresses.
     */
    @Override 
    public String toString(){
        return String.format("%s, %s",street,city);
    }
    
 
    
    /**
     * uses String representation (street, city)
     * to easily implement equals() - otherwise the strings in 
     * street & city had to be compared one by one.
     */   
    @Override
    public boolean equals(Object otherAnyType){
        if (!(otherAnyType instanceof Address)) 
            return false;
        Address other = (Address)otherAnyType;

        return toString().equals(other.toString());   
    }

    /**
     * Using the toString() implementation it's easy to implement
     * a hashCode() implementation by using String's implementation.
     */
    @Override
    public int hashCode(){
        return toString().hashCode();
    }


}
