package Entity;

import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@SessionScope
public class OnlineStore {
    private Set<Integer> purchasesId;

    public OnlineStore() {
        this.purchasesId = new HashSet<>();
    }

    public Set<Integer> getPurchasesId() {
        return this.purchasesId;
    }

    public void setPurchasesId(Set<Integer> purchasesId) {
        this.purchasesId = purchasesId;
    }

    public void addProducts(Set<Integer> purchasesId) {
        for (Integer purchaseId : purchasesId) {
            this.purchasesId.add(purchaseId);
        }
    }
}
