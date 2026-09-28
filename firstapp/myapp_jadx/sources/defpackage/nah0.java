package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class nah0 implements Comparable<nah0> {
    public static final a b = new a(null);
    public final byte a;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(nah0 nah0Var) {
        return Intrinsics.h(this.a & 255, nah0Var.a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nah0) {
            return this.a == ((nah0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
