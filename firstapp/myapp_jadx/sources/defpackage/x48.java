package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x48 extends y48 {
    public final Throwable a;

    public x48(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x48) && Intrinsics.g(this.a, ((x48) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vt5.b(new StringBuilder("CollectionsMultiplierError(throwable="), this.a, ')');
    }
}
