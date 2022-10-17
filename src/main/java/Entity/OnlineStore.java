package Entity;

import java.util.Objects;
import java.util.Set;

public class OnlineStore {
    private Set<Integer> purchasesId;

    public OnlineStore(Set<Integer> purchasesId) {
        this.purchasesId = purchasesId;
    }

    public Set<Integer> getPurchasesId() {
        return this.purchasesId;
    }

    public void setPurchasesId(Set<Integer> purchasesId) {
        this.purchasesId = purchasesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineStore that = (OnlineStore) o;
        return purchasesId.equals(that.purchasesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchasesId);
    }

    @Override
    public String toString() {
        return "Ваш товар:" + purchasesId;
    }
}
