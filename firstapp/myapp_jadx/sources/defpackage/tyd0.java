package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tyd0<T> implements avh0<T> {
    public final T a;

    public tyd0(T t) {
        this.a = t;
    }

    @Override // defpackage.avh0
    public final T a(ne00 ne00Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyd0) && Intrinsics.g(this.a, ((tyd0) obj).a);
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return ekw.a(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
