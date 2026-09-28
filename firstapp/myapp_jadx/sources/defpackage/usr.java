package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class usr extends qlr implements Function0<Unit> {
    public final /* synthetic */ tsr a;
    public final /* synthetic */ dq40<sa80> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usr(tsr tsrVar, dq40<sa80> dq40Var) {
        super(0);
        this.a = tsrVar;
        this.b = dq40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, sa80] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        wwx wwxVar = this.a.U;
        if ((wwxVar.f.d & 8) != 0) {
            for (d.c cVar = wwxVar.e; cVar != null; cVar = cVar.e) {
                if ((cVar.c & 8) != 0) {
                    ?? C = cVar;
                    ?? duwVar = 0;
                    while (C != 0) {
                        if (C instanceof ya80) {
                            ya80 ya80Var = (ya80) C;
                            boolean zF0 = ya80Var.f0();
                            dq40<sa80> dq40Var = this.b;
                            if (zF0) {
                                ?? sa80Var = new sa80();
                                dq40Var.a = sa80Var;
                                sa80Var.d = true;
                            }
                            if (ya80Var.Y1()) {
                                dq40Var.a.c = true;
                            }
                            ya80Var.G0(dq40Var.a);
                        } else if ((C.c & 8) != 0 && (C instanceof tkd)) {
                            d.c cVar2 = ((tkd) C).E;
                            int i = 0;
                            while (cVar2 != null) {
                                if ((cVar2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        C = C;
                                        duwVar = duwVar;
                                        duwVar = duwVar;
                                        C = cVar2;
                                    } else {
                                        if (duwVar == 0) {
                                            duwVar = new duw(new d.c[16]);
                                        }
                                        if (C != 0) {
                                            duwVar.b(C);
                                            C = 0;
                                        }
                                        duwVar.b(cVar2);
                                    }
                                } else {
                                    C = C;
                                    duwVar = duwVar;
                                }
                                cVar2 = cVar2.f;
                                C = C;
                                duwVar = duwVar;
                            }
                            if (i == 1) {
                                C = C;
                                duwVar = duwVar;
                            } else {
                                C = C;
                                duwVar = duwVar;
                            }
                        }
                        C = pkd.c(duwVar);
                    }
                }
            }
        }
        return Unit.a;
    }
}
