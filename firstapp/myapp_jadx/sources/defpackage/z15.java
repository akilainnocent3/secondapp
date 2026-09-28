package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z15 {
    public final String a;
    public final l25 b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final rvk g;
    public final long h;
    public final long i;

    public z15(String str, l25 l25Var, String str2, String str3, int i, int i2, rvk rvkVar, long j, long j2) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = l25Var;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = rvkVar;
        this.h = j;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z15)) {
            return false;
        }
        z15 z15Var = (z15) obj;
        return Intrinsics.g(this.a, z15Var.a) && this.b == z15Var.b && Intrinsics.g(this.c, z15Var.c) && Intrinsics.g(this.d, z15Var.d) && this.e == z15Var.e && this.f == z15Var.f && this.g == z15Var.g && this.h == z15Var.h && this.i == z15Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + f87.a((this.g.hashCode() + gpp.a(this.f, gpp.a(this.e, gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31), 31)) * 31, this.h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoostGift(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        hxa.c(sb, this.c, ", description=", this.d, ", durationInDays=");
        d5d.a(sb, this.e, ", boostPercentage=", this.f, ", giftStatus=");
        sb.append(this.g);
        sb.append(", deliveryTime=");
        sb.append(this.h);
        return zug.a(this.i, ", expireTime=", ")", sb);
    }
}
