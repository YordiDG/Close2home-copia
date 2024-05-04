package backend.housekeeper.houseelegantservice.domain.model.valueobjects;


import jakarta.persistence.Embeddable;

@Embeddable
public record PersonName(String firstName,String lastName) {
    public PersonName(){
        this(null, null);
    }

    public PersonName{
        if (firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("FirstName cannot be null or blank");
        }
        if (lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("LastName cannot be null or blank");
        }
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

}