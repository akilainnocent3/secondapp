package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class izs<T> {
    public final uzd0 a;
    public final T b;
    public final kk50.a c;
    public final kk50.b d;

    public izs() {
        throw null;
    }

    public izs(uzd0 uzd0Var, Object obj, kk50.a aVar, kk50.b bVar, int i) {
        obj = (i & 2) != 0 ? (T) null : obj;
        aVar = (i & 4) != 0 ? null : aVar;
        bVar = (i & 8) != 0 ? null : bVar;
        this.a = uzd0Var;
        this.b = (T) obj;
        this.c = aVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izs)) {
            return false;
        }
        izs izsVar = (izs) obj;
        return this.a == izsVar.a && Intrinsics.g(this.b, izsVar.b) && Intrinsics.g(this.c, izsVar.c) && Intrinsics.g(this.d, izsVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        T t = this.b;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        kk50.a aVar = this.c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        kk50.b bVar = this.d;
        return (iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LoadingState(status=" + this.a + ", data=" + this.b + ", error=" + this.c + ", networkError=" + this.d + ", additionalInfo=null)";
    }
}
