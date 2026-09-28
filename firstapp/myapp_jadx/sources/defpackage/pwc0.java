package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pwc0 {
    public final String a;
    public final String b;
    public final List<String> c;

    public pwc0(String str, String str2, List<String> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwc0)) {
            return false;
        }
        pwc0 pwc0Var = (pwc0) obj;
        return this.a.equals(pwc0Var.a) && this.b.equals(pwc0Var.b) && Intrinsics.g(this.c, pwc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(ux5.a("SportyPenaltyMarketCategory(id=", this.a, ", name=", this.b, ", marketTypes="), this.c, ")");
    }
}
