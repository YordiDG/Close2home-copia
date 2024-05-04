package backend.housekeeper.houseelegantservice.interfaces.rest.resources;

public record KeeperResource(Long id, String name, String country, String city, String streetAddress,
                             String description, String photoUrl, String rating) {
}
