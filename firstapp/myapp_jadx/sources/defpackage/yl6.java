package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yl6 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final mn6 e;

    public yl6(j7g j7gVar, j7g j7gVar2, String str, String str2, mn6 mn6Var, int i) {
        String str3 = (i & 1) != 0 ? "" : j7gVar;
        String str4 = (i & 2) != 0 ? "" : j7gVar2;
        str = (i & 8) != 0 ? "" : str;
        str2 = (i & 16) != 0 ? null : str2;
        mn6Var = (i & 32) != 0 ? mn6.b.a : mn6Var;
        str.getClass();
        this.a = str3;
        this.b = str4;
        this.c = str;
        this.d = str2;
        this.e = mn6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl6)) {
            return false;
        }
        yl6 yl6Var = (yl6) obj;
        return Intrinsics.g(this.a, yl6Var.a) && Intrinsics.g(this.b, yl6Var.b) && Intrinsics.g(this.c, yl6Var.c) && Intrinsics.g(this.d, yl6Var.d) && Intrinsics.g(this.e, yl6Var.e);
    }

    public final int hashCode() {
        int iA = gmf0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashOutMatchBriefData(teams=");
        sb.append((Object) this.a);
        sb.append(", stake=");
        sb.append((Object) this.b);
        sb.append(", isFallback=false, orderId=");
        hxa.c(sb, this.c, ", userNote=", this.d, ", cashOutViewData=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public yl6() {
        this(null, null, null, null, null, 63);
    }
}
