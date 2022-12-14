package com.product.restful.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@JsonPropertyOrder({
        "success",
        "message"
})
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {

    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("message")
    private String message;

    @JsonIgnore
    private HttpStatus status;

    public MessageResponse(Boolean success) {
        this.success = success;
    }

    public MessageResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

}
