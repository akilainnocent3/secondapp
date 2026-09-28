package defpackage;

import com.sportybet.plugin.realsports.data.Market;

/* JADX INFO: loaded from: classes7.dex */
public final class gqu {
    public final Market a;
    public boolean b = false;

    public gqu(Market market) {
        this.a = market;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqu)) {
            return false;
        }
        gqu gquVar = (gqu) obj;
        return this.a.equals(gquVar.a) && this.b == gquVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketItem(market=" + this.a + ", isSelected=" + this.b + ")";
    }
}
