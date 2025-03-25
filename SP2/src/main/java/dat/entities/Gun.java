package dat.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "guns")
public class Gun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean teamId;

    @ManyToOne
    private Game game;

    public Gun() {
    }

    public Gun(String name, Game game) {
        this.name = name;
        this.game = game;
    }
}
