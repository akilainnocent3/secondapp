package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public interface l3w extends n3w, okd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.n3w
    default <T> T g(i3w<T> i3wVar) {
        wwx wwxVar;
        if (!i().C) {
            wkn.a("ModifierLocal accessed from an unattached node");
        }
        if (!i().C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar = i().e;
        tsr tsrVarF = pkd.f(this);
        while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 32) != 0) {
                        ?? C = cVar;
                        ?? duwVar = 0;
                        while (C != 0) {
                            if (C instanceof l3w) {
                                l3w l3wVar = (l3w) C;
                                if (l3wVar.o0().g(i3wVar)) {
                                    return (T) l3wVar.o0().i(i3wVar);
                                }
                            } else if ((C.c & 32) != 0 && (C instanceof tkd)) {
                                d.c cVar2 = ((tkd) C).E;
                                int i = 0;
                                C = C;
                                duwVar = duwVar;
                                while (cVar2 != null) {
                                    if ((cVar2.c & 32) != 0) {
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
                    cVar = cVar.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
        return i3wVar.a.invoke();
    }

    default kni0 o0() {
        return p2g.b;
    }
}
