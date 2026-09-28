package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class liy {
    public final tiy a;
    public final uiy b;
    public final qcn<miy> c;
    public final tgy d;

    public liy(tiy tiyVar, uiy uiyVar, uf00 uf00Var, tgy tgyVar) {
        uf00Var.getClass();
        this.a = tiyVar;
        this.b = uiyVar;
        this.c = uf00Var;
        this.d = tgyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liy)) {
            return false;
        }
        liy liyVar = (liy) obj;
        return this.a.equals(liyVar.a) && this.b.equals(liyVar.b) && Intrinsics.g(this.c, liyVar.c) && this.d.equals(liyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shu.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "OddsFilterPanelState(shortcutRiskyOptionState=" + this.a + ", shortcutSimpleOptionState=" + this.b + ", regularOptionStates=" + this.c + ", customOptionState=" + this.d + ")";
    }
}
