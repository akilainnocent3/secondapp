package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i48 extends g48 {
    public final Throwable a;

    public i48(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i48) && Intrinsics.g(this.a, ((i48) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vt5.b(new StringBuilder("CollectionsDataError(throwable="), this.a, ')');
    }
}
