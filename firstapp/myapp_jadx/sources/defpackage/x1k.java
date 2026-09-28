package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class x1k implements qx80 {
    public final gaj<bxz, yw90, asr, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public x1k(gaj<? super bxz, ? super yw90, ? super asr, Unit> gajVar) {
        this.a = gajVar;
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        j90 j90VarA = m90.a();
        this.a.invoke(j90VarA, new yw90(j), asrVar);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        x1k x1kVar = obj instanceof x1k ? (x1k) obj : null;
        return (x1kVar != null ? x1kVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
