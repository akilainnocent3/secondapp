package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gzs<T> {
    public final wzd0 a;
    public final T b;
    public final hk50.a c;
    public final hk50.b d;

    public gzs() {
        throw null;
    }

    public gzs(wzd0 wzd0Var, Object obj, hk50.a aVar, hk50.b bVar, int i) {
        obj = (i & 2) != 0 ? (T) null : obj;
        aVar = (i & 4) != 0 ? null : aVar;
        bVar = (i & 8) != 0 ? null : bVar;
        this.a = wzd0Var;
        this.b = (T) obj;
        this.c = aVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzs)) {
            return false;
        }
        gzs gzsVar = (gzs) obj;
        return this.a == gzsVar.a && Intrinsics.g(this.b, gzsVar.b) && Intrinsics.g(this.c, gzsVar.c) && Intrinsics.g(this.d, gzsVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        T t = this.b;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        hk50.a aVar = this.c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        hk50.b bVar = this.d;
        return (iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LoadingState(status=" + this.a + ", data=" + this.b + ", error=" + this.c + ", networkError=" + this.d + ", additionalInfo=null)";
    }
}
