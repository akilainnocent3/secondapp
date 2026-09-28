package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes8.dex */
public final class oxf0<T> {
    public final T a;
    public final long b;

    /* JADX WARN: Multi-variable type inference failed */
    public oxf0(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxf0)) {
            return false;
        }
        oxf0 oxf0Var = (oxf0) obj;
        return Intrinsics.g(this.a, oxf0Var.a) && b.d(this.b, oxf0Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        int iHashCode = t == null ? 0 : t.hashCode();
        b.a aVar = b.b;
        return Long.hashCode(this.b) + (iHashCode * 31);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) b.k(this.b)) + ')';
    }
}
