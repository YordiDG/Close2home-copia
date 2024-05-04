package backend.housekeeper.houseelegantservice.domain.model.aggregates;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String city;

    private String streetAddress;

    private String price;

    private String capacity;

    private String rating;

    private String photoUrl;

    public House(String country, String city, String streetAddress,
                 String price, String capacity, String rating, String photoUrl) {
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.price = price;
        this.capacity = capacity;
        this.rating = rating;
        this.photoUrl = photoUrl;
    }

    public House() {
    }
}
