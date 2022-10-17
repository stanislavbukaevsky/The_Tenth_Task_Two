package Service;

import Entity.OnlineStore;

import java.util.Set;

public interface OnlineStoreService {
    OnlineStore addProduct(Set<Integer> purchasesId);

    Set<OnlineStore> getProduct();
}
