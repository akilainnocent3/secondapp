package defpackage;

import com.appsflyer.internal.v;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kgv implements pdd0 {
    public final String a = "me__sporty_loyalty_tab__click";
    public final Integer b;
    public final Integer c;

    public kgv(Integer num, Integer num2) {
        this.b = num;
        this.c = num2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        Integer num;
        Integer num2 = this.b;
        return (num2 == null || (num = this.c) == null) ? new HashMap<>() : kpu.d(new Pair("tier", num2), new Pair("mission_num", num));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgv)) {
            return false;
        }
        kgv kgvVar = (kgv) obj;
        return this.a.equals(kgvVar.a) && Intrinsics.g(this.b, kgvVar.b) && Intrinsics.g(this.c, kgvVar.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return v.a(ew7.a(this.b, "MeLoyaltyTabClickEvent(name=", this.a, ", tier=", ", missionNumber="), this.c, ")");
    }
}
