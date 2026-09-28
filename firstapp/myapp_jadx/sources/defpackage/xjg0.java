package defpackage;

import defpackage.pdd0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xjg0<T extends pdd0> {
    public final T a;
    public final List<k00> b;

    /* JADX WARN: Multi-variable type inference failed */
    public xjg0(T t, List<? extends k00> list) {
        t.getClass();
        list.getClass();
        this.a = t;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjg0)) {
            return false;
        }
        xjg0 xjg0Var = (xjg0) obj;
        return Intrinsics.g(this.a, xjg0Var.a) && Intrinsics.g(this.b, xjg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackingModel(event=" + this.a + ", platforms=" + this.b + ")";
    }
}
