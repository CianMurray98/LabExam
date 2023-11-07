package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private OrderService orderservice;
    private final AcknowledgeService acknowledgeService;

    @Autowired
    public OrderController(AcknowledgeService acknowledgeService, OrderService orderservice){
        this.acknowledgeService = acknowledgeService;
        this.orderservice = orderservice;
    }
    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userdetails){
        String confirm;
        confirm = OrderService.someDetails(userdetails);
        String response = confirm + " " +acknowledgeService.ackMessage(userdetails);
        return response;
    }

}
