package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class wbh0 implements Comparable<wbh0> {
    public static final a b = new a(null);
    public final short a;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(wbh0 wbh0Var) {
        return Intrinsics.h(this.a & 65535, wbh0Var.a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wbh0) {
            return this.a == ((wbh0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
