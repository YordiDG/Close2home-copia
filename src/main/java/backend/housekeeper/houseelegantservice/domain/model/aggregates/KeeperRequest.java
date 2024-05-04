package backend.housekeeper.houseelegantservice.domain.model.aggregates;
import backend.housekeeper.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Entity
public class KeeperRequest extends AuditableModel {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String name;
    @Getter
    private String message;
    @Getter
    private String photoUrl;
    @Getter
    private Float rating;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;




    public KeeperRequest(String name, String message, String photoUrl, Float rating){
        this.name =  name;
        this.message = message;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }

    public KeeperRequest() {

    }
}
