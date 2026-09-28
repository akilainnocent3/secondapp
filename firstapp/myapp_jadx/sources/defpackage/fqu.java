package defpackage;

import com.sportybet.plugin.realsports.data.Market;

/* JADX INFO: loaded from: classes7.dex */
public final class fqu extends c2p {
    public final Market a;

    public fqu(Market market) {
        this.a = market;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MarketItem{market=" + this.a + '}';
    }
}
