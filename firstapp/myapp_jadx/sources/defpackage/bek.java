package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes5.dex */
public final class bek {
    public final Object a;
    public Object b;

    public bek() {
        this.a = new duw(new tsr[16]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void a(tsr tsrVar) {
        if (tsrVar.e0 > 0) {
            if (tsrVar.V.d == tsr.d.e && !tsrVar.C() && !tsrVar.D() && !tsrVar.f0 && tsrVar.i()) {
                d.c cVar = tsrVar.U.f;
                if ((cVar.d & 256) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 256) != 0) {
                            ?? C = cVar;
                            ?? duwVar = 0;
                            while (C != 0) {
                                if (C instanceof l2l) {
                                    l2l l2lVar = (l2l) C;
                                    l2lVar.r0(pkd.d(l2lVar, 256));
                                } else if ((C.c & 256) != 0 && (C instanceof tkd)) {
                                    d.c cVar2 = ((tkd) C).E;
                                    int i = 0;
                                    C = C;
                                    duwVar = duwVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & 256) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                        }
                                        cVar2 = cVar2.f;
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                C = pkd.c(duwVar);
                            }
                        }
                        if ((cVar.d & 256) == 0) {
                            break;
                        } else {
                            cVar = cVar.f;
                        }
                    }
                }
            }
            tsrVar.d0 = false;
            duw<tsr> duwVarK = tsrVar.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i2 = duwVarK.c;
            for (int i3 = 0; i3 < i2; i3++) {
                a(tsrVarArr[i3]);
            }
        }
    }

    public bek(ej7 ej7Var, yfe yfeVar) {
        yfeVar.getClass();
        this.a = ej7Var;
        this.b = yfeVar;
    }
}
