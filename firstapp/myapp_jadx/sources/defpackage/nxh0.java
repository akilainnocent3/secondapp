package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nxh0 extends eyg0 {
    public final String a;

    public nxh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nxh0) {
            return Intrinsics.g(this.a, ((nxh0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
