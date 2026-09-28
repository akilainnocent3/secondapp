package defpackage;

import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class iqu {
    public final SocketMarketMessage a;
    public final RegularMarketRule b;

    public iqu(SocketMarketMessage socketMarketMessage, RegularMarketRule regularMarketRule) {
        this.a = socketMarketMessage;
        this.b = regularMarketRule;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqu)) {
            return false;
        }
        iqu iquVar = (iqu) obj;
        return this.a.equals(iquVar.a) && Intrinsics.g(this.b, iquVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        RegularMarketRule regularMarketRule = this.b;
        return iHashCode + (regularMarketRule == null ? 0 : regularMarketRule.hashCode());
    }

    public final String toString() {
        return "MarketMessageWithDynamicMarket(message=" + this.a + ", dynamicMarket=" + this.b + ")";
    }
}
