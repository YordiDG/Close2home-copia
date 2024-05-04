package backend.housekeeper.houseelegantservice.domain.model.command;

public record CreateKeeperCommand(String name, String country, String city, String streetAddress,
                                  String description, String photoUrl, String rating) {
}
