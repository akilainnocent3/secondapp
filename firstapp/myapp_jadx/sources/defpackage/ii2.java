package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ii2 {
    public final zh2 a;
    public final boolean b;
    public final List<rh2> c;

    public ii2(zh2 zh2Var, boolean z, List<rh2> list) {
        zh2Var.getClass();
        list.getClass();
        this.a = zh2Var;
        this.b = z;
        this.c = list;
    }

    public static ii2 a(ii2 ii2Var, zh2 zh2Var, boolean z, int i) {
        if ((i & 1) != 0) {
            zh2Var = ii2Var.a;
        }
        List<rh2> list = ii2Var.c;
        ii2Var.getClass();
        zh2Var.getClass();
        list.getClass();
        return new ii2(zh2Var, z, list);
    }

    public final boolean b() {
        return (c().isEmpty() || (this.a instanceof zh2.c)) ? false : true;
    }

    public final List<rh2> c() {
        zh2 zh2Var = this.a;
        if (zh2Var instanceof zh2.d) {
            return ((zh2.d) zh2Var).a.a;
        }
        return zh2Var instanceof zh2.c ? this.c : m2g.a;
    }

    public final boolean d() {
        zh2 zh2Var = this.a;
        zh2.d dVar = zh2Var instanceof zh2.d ? (zh2.d) zh2Var : null;
        if (dVar == null) {
            return false;
        }
        pg2 pg2Var = dVar.a;
        return (!pg2Var.c || pg2Var.d || pg2Var.e) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii2)) {
            return false;
        }
        ii2 ii2Var = (ii2) obj;
        return Intrinsics.g(this.a, ii2Var.a) && this.b == ii2Var.b && Intrinsics.g(this.c, ii2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetBuilderUiState(status=");
        sb.append(this.a);
        sb.append(", isExpanded=");
        sb.append(this.b);
        sb.append(", lastSuccessSelections=");
        return ng1.a(sb, this.c, ")");
    }
}
