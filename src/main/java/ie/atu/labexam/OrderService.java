package ie.atu.labexam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="confirmation-service", url="http://localhost:8082")
public interface OrderService {
    @PostMapping("/confirm")
    static String someDetails(@RequestBody UserDetails userDetails) {
        return null;
    }
}
