package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vw70 {
    public final List<fu70> a;
    public final List<fu70> b;

    public vw70(List<fu70> list, List<fu70> list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw70)) {
            return false;
        }
        vw70 vw70Var = (vw70) obj;
        return Intrinsics.g(this.a, vw70Var.a) && Intrinsics.g(this.b, vw70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return w9d.a("SearchMatches(live=", ", upcoming=", ")", this.a, this.b);
    }
}
