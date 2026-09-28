package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ln6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final List<pt90> d;
    public final Set<String> e;
    public final boolean f;

    public ln6(String str, String str2, boolean z, List<pt90> list, Set<String> set, boolean z2) {
        str2.getClass();
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
        this.e = set;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln6)) {
            return false;
        }
        ln6 ln6Var = (ln6) obj;
        return this.a.equals(ln6Var.a) && Intrinsics.g(this.b, ln6Var.b) && this.c == ln6Var.c && Intrinsics.g(this.d, ln6Var.d) && Intrinsics.g(this.e, ln6Var.e) && this.f == ln6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ai50.a(mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("CashOutSuccessSingleUiState(amount=", this.a, ", eventTitle=", this.b, ", isLive=");
        sbA.append(this.c);
        sbA.append(", items=");
        sbA.append(this.d);
        sbA.append(", selectedKeys=");
        sbA.append(this.e);
        sbA.append(", isLoading=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
