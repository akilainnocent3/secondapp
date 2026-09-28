package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sj30 {
    public final String a;
    public final List<Integer> b;

    public sj30(String str, List<Integer> list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj30)) {
            return false;
        }
        sj30 sj30Var = (sj30) obj;
        return this.a.equals(sj30Var.a) && Intrinsics.g(this.b, sj30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("QuickValues(currency=", this.a, ", list=", ")", this.b);
    }
}
