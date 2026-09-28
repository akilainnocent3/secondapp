package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class wsi0 {
    public final oti0 a;
    public final uf00<gsi0> b;
    public final long c;
    public final uf00<gsi0> d;
    public final int e;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((gsi0) t).a).compareTo(Integer.valueOf(((gsi0) t2).a));
        }
    }

    public wsi0(oti0 oti0Var, uf00<gsi0> uf00Var, long j) {
        oti0Var.getClass();
        uf00Var.getClass();
        this.a = oti0Var;
        this.b = uf00Var;
        this.c = j;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (gsi0 gsi0Var : uf00Var) {
            if (hashSet.add(Integer.valueOf(gsi0Var.a))) {
                arrayList.add(gsi0Var);
            }
        }
        this.d = a4h.f(CollectionsKt.r0(arrayList, new a()));
        this.e = this.b.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsi0)) {
            return false;
        }
        wsi0 wsi0Var = (wsi0) obj;
        return this.a == wsi0Var.a && Intrinsics.g(this.b, wsi0Var.b) && this.c == wsi0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + yvz.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDPayout(risk=");
        sb.append(this.a);
        sb.append(", arrangement=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return uvh.a(sb, this.c, ')');
    }

    public wsi0() {
        this(0);
    }

    public wsi0(int i) {
        this(oti0.c, n1a0.c, 0L);
    }
}
