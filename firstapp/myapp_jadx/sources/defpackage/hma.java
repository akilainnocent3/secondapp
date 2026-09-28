package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hma implements cbs {
    public final g1k[] a;

    public hma(g1k[] g1kVarArr) {
        this.a = g1kVarArr;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        new HashMap();
        g1k[] g1kVarArr = this.a;
        for (g1k g1kVar : g1kVarArr) {
            g1kVar.a();
        }
        for (g1k g1kVar2 : g1kVarArr) {
            g1kVar2.a();
        }
    }
}
