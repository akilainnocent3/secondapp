package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sd60 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public sd60(String str, String str2, String str3, boolean z, boolean z2) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd60)) {
            return false;
        }
        sd60 sd60Var = (sd60) obj;
        return Intrinsics.g(this.a, sd60Var.a) && Intrinsics.g(this.b, sd60Var.b) && Intrinsics.g(this.c, sd60Var.c) && this.d == sd60Var.d && this.e == sd60Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBFooterState(balance=");
        sb.append(this.a);
        sb.append(", totalPlay=");
        sb.append(this.b);
        sb.append(", won=");
        sb.append(this.c);
        sb.append(", amountIsGift=");
        sb.append(this.d);
        sb.append(", wonIsGift=");
        return ruw.a(sb, this.e, ')');
    }

    public /* synthetic */ sd60(int i) {
        this("", "", "", false, false);
    }

    public sd60() {
        this(0);
    }
}
