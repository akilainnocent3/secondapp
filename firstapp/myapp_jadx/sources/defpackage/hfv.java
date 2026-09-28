package defpackage;

import com.appsflyer.internal.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hfv {
    public final boolean a;
    public final String b;
    public final lst c;
    public final Integer d;
    public final Integer e;

    public hfv(int i) {
        this((i & 1) != 0, null, new lst.a("", "0", null, null, null, true, 0.0f, j58.m, vch0.a), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfv)) {
            return false;
        }
        hfv hfvVar = (hfv) obj;
        return this.a == hfvVar.a && Intrinsics.g(this.b, hfvVar.b) && Intrinsics.g(this.c, hfvVar.c) && Intrinsics.g(this.d, hfvVar.d) && Intrinsics.g(this.e, hfvVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("MeScreenLoyaltyState(enabled=", ", backgroundUrl=", this.b, ", displayState=", this.a);
        sbA.append(this.c);
        sbA.append(", tier=");
        sbA.append(this.d);
        sbA.append(", missionCount=");
        return v.a(sbA, this.e, ")");
    }

    public hfv(boolean z, String str, lst lstVar, Integer num, Integer num2) {
        lstVar.getClass();
        this.a = z;
        this.b = str;
        this.c = lstVar;
        this.d = num;
        this.e = num2;
    }

    public hfv() {
        this(31);
    }
}
