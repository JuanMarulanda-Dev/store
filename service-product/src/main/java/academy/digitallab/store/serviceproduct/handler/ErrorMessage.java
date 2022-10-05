package academy.digitallab.store.serviceproduct.handler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.List;

@Builder
@Getter
@Setter
public class ErrorMessage {
    private String code;
    private List<Map<String, String>> messages;
}
