package Controller;

import Service.OnlineStoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(path = "/order")
public class OnlineStoreController {
    private final OnlineStoreService onlineStoreService;

    public OnlineStoreController(OnlineStoreService onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping(path = "/add")
    public void addProduct(@RequestParam("add-product") Set<Integer> purchasesId) {
        onlineStoreService.addProduct(purchasesId);
    }

    @GetMapping(path = "/get")
    public Set<Integer> getProduct() {
        return onlineStoreService.getProduct();
    }
}
