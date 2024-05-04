package backend.housekeeper.houseelegantservice.interfaces.rest.resources;

public record HouseResource(Long id, String country, String city, String streetAddress,
                            String price, String capacity, String rating, String photoUrl) {
}
