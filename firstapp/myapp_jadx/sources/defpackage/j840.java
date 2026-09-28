package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j840 implements hx90 {
    public final ww90 b;

    public j840(ww90 ww90Var) {
        this.b = ww90Var;
    }

    @Override // defpackage.hx90
    public final Object d(v1b<? super ww90> v1bVar) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j840) && Intrinsics.g(this.b, ((j840) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.b + ')';
    }
}
