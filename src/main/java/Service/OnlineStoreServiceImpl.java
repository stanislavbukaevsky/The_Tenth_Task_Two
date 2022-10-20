package Service;

import Entity.OnlineStore;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OnlineStoreServiceImpl implements OnlineStoreService {
    private final Set<Integer> customerPurchase;
    private OnlineStore onlineStore;

    public OnlineStoreServiceImpl(OnlineStore onlineStore, Set<Integer> customerPurchase) {
        this.onlineStore = onlineStore;
        this.customerPurchase = customerPurchase;
    }

    @Override
    public void addProduct(Set<Integer> purchasesId) {
        for (Integer purchaseId : purchasesId) {
            customerPurchase.add(purchaseId);
            if (onlineStore == null) {
                OnlineStore onlineStore = new OnlineStore();
            }
        }
        onlineStore.addProducts(purchasesId);
    }

    @Override
    public Set<Integer> getProduct() {
        return onlineStore.getPurchasesId();
    }
}
