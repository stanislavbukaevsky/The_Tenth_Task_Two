package Service;

import java.util.Set;

public interface OnlineStoreService {
    void addProduct(Set<Integer> purchasesId);

    Set<Integer> getProduct();
}
