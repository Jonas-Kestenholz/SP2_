package dat.dtos;

import lombok.Data;

import java.util.List;
@Data
public class StrategyDTO {
    private Long id;
    private String title;
    private String description;
    private String type;

    private List<Long> mapIds;

    public StrategyDTO() {
    }

    public StrategyDTO(Long id, String title, String description, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
    }
}
