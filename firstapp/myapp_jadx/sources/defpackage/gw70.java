package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gw70 {
    public final mfb0 a;
    public final RegularMarketRule b;
    public final List<Event> c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public gw70(mfb0 mfb0Var, RegularMarketRule regularMarketRule, List<? extends Event> list, boolean z) {
        this.a = mfb0Var;
        this.b = regularMarketRule;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw70)) {
            return false;
        }
        gw70 gw70Var = (gw70) obj;
        return Intrinsics.g(this.a, gw70Var.a) && Intrinsics.g(this.b, gw70Var.b) && Intrinsics.g(this.c, gw70Var.c) && this.d == gw70Var.d;
    }

    public final int hashCode() {
        mfb0 mfb0Var = this.a;
        int iHashCode = (mfb0Var == null ? 0 : mfb0Var.hashCode()) * 31;
        RegularMarketRule regularMarketRule = this.b;
        int iHashCode2 = (iHashCode + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31;
        List<Event> list = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SearchLiveResult(sportRule=" + this.a + ", marketRule=" + this.b + ", events=" + this.c + ", reload=" + this.d + ")";
    }

    public /* synthetic */ gw70(int i) {
        this(null, null, null, false);
    }

    public gw70() {
        this(0);
    }
}
