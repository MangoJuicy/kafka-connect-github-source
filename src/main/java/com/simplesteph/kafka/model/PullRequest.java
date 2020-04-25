
package com.simplesteph.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import static com.simplesteph.kafka.GitHubSchemas.*;

@Data
@Builder
@NoArgsConstructor  // No args constructor for use in serialization
@AllArgsConstructor
public class PullRequest {

    private String url;
    private String htmlUrl;
    private String diffUrl;
    private String patchUrl;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public static PullRequest fromJson(JSONObject pullRequest) {
        return PullRequest.builder()
                .url(pullRequest.getString(PR_URL_FIELD))
                .htmlUrl(pullRequest.getString(PR_HTML_URL_FIELD))
                .build();
    }
}
