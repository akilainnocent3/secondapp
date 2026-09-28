package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xd8 implements wvt {
    public final krf0 a;
    public final krf0 b;
    public final String c;
    public final String d;
    public final ib50 e;
    public final boolean f;

    public xd8(krf0 krf0Var, krf0 krf0Var2, String str, String str2, ib50 ib50Var, boolean z) {
        krf0Var.getClass();
        krf0Var2.getClass();
        ib50Var.getClass();
        this.a = krf0Var;
        this.b = krf0Var2;
        this.c = str;
        this.d = str2;
        this.e = ib50Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd8)) {
            return false;
        }
        xd8 xd8Var = (xd8) obj;
        return this.a == xd8Var.a && this.b == xd8Var.b && this.c.equals(xd8Var.c) && this.d.equals(xd8Var.d) && Intrinsics.g(this.e, xd8Var.e) && this.f == xd8Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(YAzniTbXHYQ.fNxlEECGtSWhElR);
        sb.append(this.a);
        sb.append(", currentTier=");
        sb.append(this.b);
        sb.append(", bannerImgUrl=");
        hxa.c(sb, this.c, ", logoUrl=", this.d, ", requestScrollTier=");
        sb.append(this.e);
        sb.append(", isUserTierUnlocked=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
