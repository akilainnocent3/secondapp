package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jbg extends d58 {
    public final Throwable a;

    public jbg(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbg) && Intrinsics.g(this.a, ((jbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vt5.b(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
