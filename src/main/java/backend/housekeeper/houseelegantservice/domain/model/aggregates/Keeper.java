package backend.housekeeper.houseelegantservice.domain.model.aggregates;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Keeper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Keeper(String name, String country, String city, String streetAddress, String description, String photoUrl, String rating) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.description = description;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }

    private String name;
    private String country;
    private String city;
    private String streetAddress;
    private String description;
    private String photoUrl;
    private String rating;

    public Keeper() {

    }
}
