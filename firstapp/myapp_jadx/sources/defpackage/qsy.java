package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qsy {
    public final rsy a;
    public final boolean b;
    public final esy c;
    public final Long d;

    public qsy(rsy rsyVar, boolean z, esy esyVar, Long l) {
        rsyVar.getClass();
        this.a = rsyVar;
        this.b = z;
        this.c = esyVar;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsy)) {
            return false;
        }
        qsy qsyVar = (qsy) obj;
        return this.a == qsyVar.a && this.b == qsyVar.b && this.c == qsyVar.c && Intrinsics.g(this.d, qsyVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        Long l = this.d;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "OneUpExperimentState(variant=" + this.a + ", assigned=" + this.b + ", conversionMode=" + this.c + ", accountCacheGeneration=" + this.d + ")";
    }

    public qsy() {
        this(0);
    }

    public /* synthetic */ qsy(int i) {
        this(rsy.CONTROL, false, esy.a, null);
    }
}
