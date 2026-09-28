package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class vyr implements mwr {
    public final zzr a;

    public vyr(zzr zzrVar) {
        this.a = zzrVar;
    }

    @Override // defpackage.mwr
    public final int a() {
        return this.a.j().i();
    }

    @Override // defpackage.mwr
    public final int b() {
        int i;
        zzr zzrVar = this.a;
        if (zzrVar.j().k().isEmpty()) {
            return 0;
        }
        kzr kzrVarJ = zzrVar.j();
        int iD = (int) (kzrVarJ.a() == i3z.a ? kzrVarJ.d() & 4294967295L : kzrVarJ.d() >> 32);
        int iA = j8d.a(zzrVar.j());
        if (iA != 0 && (i = iD / iA) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.mwr
    public final boolean c() {
        return !this.a.j().k().isEmpty();
    }

    @Override // defpackage.mwr
    public final int d() {
        return Math.max(0, this.a.h());
    }

    @Override // defpackage.mwr
    public final int e() {
        return Math.min(a() - 1, ((zyr) CollectionsKt.b0(this.a.j().k())).getIndex());
    }
}
