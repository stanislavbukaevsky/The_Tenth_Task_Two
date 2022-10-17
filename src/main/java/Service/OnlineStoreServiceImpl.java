package Service;

import Entity.OnlineStore;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class OnlineStoreServiceImpl implements OnlineStoreService {
    private final Set<OnlineStore> purchase;

    public OnlineStoreServiceImpl(Set<OnlineStore> purchase) {
        this.purchase = purchase;
    }

    @Override
    public OnlineStore addProduct(Set<Integer> purchasesId) {
        OnlineStore onlineStore = new OnlineStore(purchasesId);
        purchase.add(onlineStore);
        return onlineStore;
    }

    @Override
    public Set<OnlineStore> getProduct() {
        return purchase;
    }
}
