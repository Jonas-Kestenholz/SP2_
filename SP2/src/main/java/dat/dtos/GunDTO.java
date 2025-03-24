package dat.dtos;

import lombok.Data;

@Data
public class GunDTO {
    private Long id;
    private String name;
    private Long gameId;

    public GunDTO() {
    }

    public GunDTO(Long id, String name, Long gameId) {
        this.id = id;
        this.name = name;
        this.gameId = gameId;
    }

}
