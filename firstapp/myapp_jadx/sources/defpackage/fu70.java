package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fu70 {
    public final Event a;
    public final RegularMarketRule b;
    public final mfb0 c;
    public final long d;

    public fu70(Event event, RegularMarketRule regularMarketRule, mfb0 mfb0Var, long j) {
        event.getClass();
        this.a = event;
        this.b = regularMarketRule;
        this.c = mfb0Var;
        this.d = j;
    }

    public static fu70 a(fu70 fu70Var, Event event, long j) {
        RegularMarketRule regularMarketRule = fu70Var.b;
        mfb0 mfb0Var = fu70Var.c;
        event.getClass();
        return new fu70(event, regularMarketRule, mfb0Var, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu70)) {
            return false;
        }
        fu70 fu70Var = (fu70) obj;
        return Intrinsics.g(this.a, fu70Var.a) && Intrinsics.g(this.b, fu70Var.b) && this.c.equals(fu70Var.c) && this.d == fu70Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        RegularMarketRule regularMarketRule = this.b;
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SearchEventWrapper(event=" + this.a + ", marketRule=" + this.b + ", sportRule=" + this.c + ", updatedAt=" + this.d + ")";
    }
}
