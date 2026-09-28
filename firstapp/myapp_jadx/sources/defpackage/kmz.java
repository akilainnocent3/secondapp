package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class kmz implements vp7 {
    public final Class<?> a;

    public kmz(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.vp7
    public final Class<?> d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kmz) {
            return Intrinsics.g(this.a, ((kmz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
