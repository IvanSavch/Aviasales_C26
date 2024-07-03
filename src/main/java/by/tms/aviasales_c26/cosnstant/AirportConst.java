package by.tms.aviasales_c26.cosnstant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AirportConst {
    @Value("${Client_id}")
    private String Client_id;
    @Value("${Client_key}")
    private String Client_secret;
}
