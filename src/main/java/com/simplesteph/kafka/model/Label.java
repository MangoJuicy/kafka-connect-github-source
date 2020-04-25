
package com.simplesteph.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor  // No args constructor for use in serialization
@AllArgsConstructor
public class Label {

    private Integer id;
    private String url;
    private String name;
    private String color;
    private Boolean _default;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
