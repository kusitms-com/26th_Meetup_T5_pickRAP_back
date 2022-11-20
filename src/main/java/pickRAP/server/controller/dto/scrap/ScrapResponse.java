package pickRAP.server.controller.dto.scrap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pickRAP.server.domain.scrap.ScrapType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScrapResponse {

    private Long id;

    private String title;

    private String content;

    private String memo;

    @JsonProperty("file_url")
    private String fileUrl;

    @JsonProperty("url_preview")
    private String urlPreview;

    @JsonProperty("scrap_type")
    private ScrapType scrapType;

    private String category;

    @JsonProperty("create_time")
    private LocalDateTime createTime;

    private List<String> hashtags = new ArrayList<>();

    @Builder
    @QueryProjection
    public ScrapResponse(Long id, String title, String content, String memo, String fileUrl, ScrapType scrapType, String category, LocalDateTime createTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.memo = memo;
        this.fileUrl = fileUrl;
        this.scrapType = scrapType;
        this.category = category;
        this.createTime = createTime;
    }
}
