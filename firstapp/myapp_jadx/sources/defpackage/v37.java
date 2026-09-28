package defpackage;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v37<T extends Comparable<? super T>> {
    public final hqe a;
    public final hqe b;
    public final T c;
    public final T d;

    public v37(hqe hqeVar, hqe hqeVar2, T t, T t2) {
        hqeVar.getClass();
        hqeVar2.getClass();
        t.getClass();
        t2.getClass();
        this.a = hqeVar;
        this.b = hqeVar2;
        this.c = t;
        this.d = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v37)) {
            return false;
        }
        v37 v37Var = (v37) obj;
        return this.a == v37Var.a && this.b == v37Var.b && Intrinsics.g(this.c, v37Var.c) && Intrinsics.g(this.d, v37Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Change(from=" + this.a + ", to=" + this.b + ", prev=" + this.c + ", curr=" + this.d + ')';
    }
}
