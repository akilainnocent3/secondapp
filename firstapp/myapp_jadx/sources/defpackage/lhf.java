package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lhf<T> implements avh0<T> {
    public final ytw<T> a;

    public lhf(ytw<T> ytwVar) {
        this.a = ytwVar;
    }

    @Override // defpackage.avh0
    public final T a(ne00 ne00Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhf) && Intrinsics.g(this.a, ((lhf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
