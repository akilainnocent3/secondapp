package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class moz implements mwr {
    public final zpz a;
    public final int b;

    public moz(zpz zpzVar, int i) {
        this.a = zpzVar;
        this.b = i;
    }

    @Override // defpackage.mwr
    public final int a() {
        return this.a.n();
    }

    @Override // defpackage.mwr
    public final int b() {
        int i;
        zpz zpzVar = this.a;
        if (zpzVar.m().k().size() == 0) {
            return 0;
        }
        epz epzVarM = zpzVar.m();
        int iD = (int) (epzVarM.a() == i3z.a ? epzVarM.d() & 4294967295L : epzVarM.d() >> 32);
        int iN = zpzVar.m().n() + zpzVar.m().j();
        if (iN != 0 && (i = iD / iN) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.mwr
    public final boolean c() {
        return !this.a.m().k().isEmpty();
    }

    @Override // defpackage.mwr
    public final int d() {
        return Math.max(0, this.a.e - this.b);
    }

    @Override // defpackage.mwr
    public final int e() {
        zpz zpzVar = this.a;
        return Math.min(zpzVar.n() - 1, ((rnz) CollectionsKt.b0(zpzVar.m().k())).getIndex() + this.b);
    }
}
