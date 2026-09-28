package androidx.compose.ui.layout;

import defpackage.duw;
import defpackage.gvg0;
import defpackage.hvg0;
import defpackage.ixo;
import defpackage.ko20;
import defpackage.nsw;
import defpackage.pkd;
import defpackage.tkd;
import defpackage.tsr;
import defpackage.wkn;
import defpackage.wwx;
import defpackage.xsr;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class n implements g0.b {
    public final nsw a;
    public final /* synthetic */ k b;
    public final /* synthetic */ Object c;

    public n(k kVar, Object obj) {
        this.b = kVar;
        this.c = obj;
        int[] iArr = ixo.a;
        this.a = new nsw((Object) null);
    }

    @Override // androidx.compose.ui.layout.g0.b
    public final long a(int i) {
        tsr tsrVarD = this.b.y.d(this.c);
        if (tsrVarD == null || !tsrVarD.e()) {
            return 0L;
        }
        int i2 = ((duw.a) tsrVarD.A()).a.c;
        if (i < 0 || i >= i2) {
            wkn.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        int i3 = ((tsr) ((duw.a) tsrVarD.A()).get(i)).V.p.a;
        return (((long) ((tsr) ((duw.a) tsrVarD.A()).get(i)).V.p.b) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // androidx.compose.ui.layout.g0.b
    public final int b() {
        tsr tsrVarD = this.b.y.d(this.c);
        if (tsrVarD != null) {
            return ((duw.a) tsrVarD.A()).a.c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ko20] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // androidx.compose.ui.layout.g0.b
    public final void c(ko20 ko20Var) {
        wwx wwxVar;
        androidx.compose.ui.d.c cVar;
        gvg0 gvg0Var;
        tsr tsrVarD = this.b.y.d(this.c);
        if (tsrVarD == null || (wwxVar = tsrVarD.U) == null || (cVar = wwxVar.f) == null) {
            return;
        }
        if (!cVar.a.C) {
            wkn.c("visitSubtreeIf called on an unattached node");
        }
        duw duwVar = new duw(new androidx.compose.ui.d.c[16]);
        androidx.compose.ui.d.c cVar2 = cVar.a;
        androidx.compose.ui.d.c cVar3 = cVar2.f;
        if (cVar3 == null) {
            pkd.a(duwVar, cVar2);
        } else {
            duwVar.b(cVar3);
        }
        while (true) {
            int i = duwVar.c;
            if (i == 0) {
                return;
            }
            androidx.compose.ui.d.c cVar4 = (androidx.compose.ui.d.c) duwVar.k(i - 1);
            if ((cVar4.d & 262144) != 0) {
                androidx.compose.ui.d.c cVar5 = cVar4;
                while (true) {
                    if (cVar5 != null) {
                        if ((cVar5.c & 262144) != 0) {
                            ?? C = cVar5;
                            ?? duwVar2 = 0;
                            while (C != 0) {
                                if (C instanceof hvg0) {
                                    hvg0 hvg0Var = (hvg0) C;
                                    if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(hvg0Var.J())) {
                                        ko20Var.invoke(hvg0Var);
                                        gvg0Var = gvg0.b;
                                    } else {
                                        gvg0Var = gvg0.a;
                                    }
                                    if (gvg0Var != gvg0.c) {
                                        if (gvg0Var == gvg0.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((C.c & 262144) != 0 && (C instanceof tkd)) {
                                    androidx.compose.ui.d.c cVar6 = ((tkd) C).E;
                                    int i2 = 0;
                                    C = C;
                                    duwVar2 = duwVar2;
                                    while (cVar6 != null) {
                                        if ((cVar6.c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                duwVar2 = duwVar2;
                                                C = cVar6;
                                            } else {
                                                if (duwVar2 == 0) {
                                                    duwVar2 = new duw(new androidx.compose.ui.d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar2.b(C);
                                                    C = 0;
                                                }
                                                duwVar2.b(cVar6);
                                            }
                                        }
                                        cVar6 = cVar6.f;
                                        C = C;
                                        duwVar2 = duwVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = pkd.c(duwVar2);
                            }
                        }
                        cVar5 = cVar5.f;
                    }
                }
            }
            pkd.a(duwVar, cVar4);
        }
    }

    @Override // androidx.compose.ui.layout.g0.b
    public final void d(int i, long j) {
        k kVar = this.b;
        tsr tsrVarD = kVar.y.d(this.c);
        if (tsrVarD == null || !tsrVarD.e()) {
            return;
        }
        int i2 = ((duw.a) tsrVarD.A()).a.c;
        if (i < 0 || i >= i2) {
            wkn.e("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (tsrVarD.i()) {
            wkn.a("Pre-measure called on node that is not placed");
        }
        tsr tsrVar = kVar.a;
        tsrVar.F = true;
        xsr.a(tsrVarD).s((tsr) ((duw.a) tsrVarD.A()).get(i), j);
        Unit unit = Unit.a;
        tsrVar.F = false;
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.compose.ui.layout.g0.b
    public final void dispose() {
        k kVar = this.b;
        tsr tsrVar = kVar.a;
        kVar.e();
        tsr tsrVarK = kVar.y.k(this.c);
        if (tsrVarK != null) {
            if (kVar.D <= 0) {
                wkn.c("No pre-composed items to dispose");
            }
            int i = ((duw.a) tsrVar.B()).a.i((T) tsrVarK);
            if (i < ((duw.a) tsrVar.B()).a.c - kVar.D) {
                wkn.c("Item is not in pre-composed item range");
            }
            kVar.C++;
            kVar.D--;
            k.b bVarD = kVar.f.d(tsrVarK);
            if (bVarD != null) {
                k.b(bVarD);
            }
            int i2 = (((duw.a) tsrVar.B()).a.c - kVar.D) - kVar.C;
            kVar.g(i, i2);
            kVar.d(i2);
        }
    }
}
