package defpackage;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5<T extends Comparable<? super T>> {
    public final T a;
    public final hqe b;
    public final v37<T> c;

    public u5(T t, hqe hqeVar, v37<T> v37Var) {
        hqeVar.getClass();
        this.a = t;
        this.b = hqeVar;
        this.c = v37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Intrinsics.g(this.a, u5Var.a) && this.b == u5Var.b && Intrinsics.g(this.c, u5Var.c);
    }

    public final int hashCode() {
        T t = this.a;
        int iHashCode = (this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31)) * 31;
        v37<T> v37Var = this.c;
        return iHashCode + (v37Var != null ? v37Var.hashCode() : 0);
    }

    public final String toString() {
        return "Acc(last=" + this.a + ", dir=" + this.b + ", change=" + this.c + ')';
    }

    public /* synthetic */ u5(Comparable comparable, int i) {
        this((i & 1) != 0 ? null : comparable, hqe.c, null);
    }

    public u5() {
        this(null, 7);
    }
}
