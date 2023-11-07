package ie.atu.labexam;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AcknowledgeService {
    public String ackMessage(UserDetails user){
        String message = "Thank you " +user.getCustomerId() + ", Order Added";
        return message;
    }
}
