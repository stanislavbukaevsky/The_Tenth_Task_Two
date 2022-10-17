package Controller;

import Entity.OnlineStore;
import Service.OnlineStoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class OnlineStoreController {
    private final OnlineStoreService onlineStoreService;

    public OnlineStoreController(OnlineStoreService onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping("/add")
    public OnlineStore addProduct(@RequestParam("add-product") Set<Integer> purchasesId) {
        OnlineStore onlineStore = null;
        onlineStore = onlineStoreService.addProduct(purchasesId);
        return onlineStore;
    }

    @GetMapping("/get")
    public Set<OnlineStore> getProduct() {
        Set<OnlineStore> onlineStore = null;
        onlineStore = onlineStoreService.getProduct();
        return onlineStore;
    }
}
