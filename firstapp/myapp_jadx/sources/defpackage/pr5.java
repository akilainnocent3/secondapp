package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pr5 {
    public final String a;
    public final int b;
    public final List<Integer> c;

    public pr5(String str, int i, List<Integer> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr5)) {
            return false;
        }
        pr5 pr5Var = (pr5) obj;
        return Intrinsics.g(this.a, pr5Var.a) && this.b == pr5Var.b && Intrinsics.g(this.c, pr5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ng1.a(ml5.a(this.b, "CacheFavoriteMarketIds(sportId=", this.a, ", productType=", ", favoriteMarketIds="), this.c, ")");
    }
}
