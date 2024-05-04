package backend.housekeeper.houseelegantservice.domain.model.command;

public record CreateHouseCommand(String country, String city, String streetAddress,
                                 String price, String capacity, String rating, String photoUrl) {
}
