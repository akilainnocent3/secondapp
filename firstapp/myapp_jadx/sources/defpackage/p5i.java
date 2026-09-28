package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class p5i {
    public static final FocusTargetNode a(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = pkd.g(focusTargetNode).getFocusOwner().f();
        if (focusTargetNodeF == null || !focusTargetNodeF.C) {
            return null;
        }
        return focusTargetNodeF;
    }

    public static final lk40 b(FocusTargetNode focusTargetNode) {
        ywx ywxVar = focusTargetNode.v;
        return ywxVar != null ? eb9.c(ywxVar).P(ywxVar, false) : lk40.e;
    }

    public static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        boolean z = focusTargetNode.a.C;
        if (z) {
            if (!z) {
                wkn.c("visitChildren called on an unattached node");
            }
            duw duwVar = new duw(new d.c[16]);
            d.c cVar = focusTargetNode.a;
            d.c cVar2 = cVar.f;
            if (cVar2 == null) {
                pkd.a(duwVar, cVar);
            } else {
                duwVar.b(cVar2);
            }
            while (true) {
                int i = duwVar.c;
                if (i == 0) {
                    break;
                }
                d.c cVarC = (d.c) duwVar.k(i - 1);
                if ((cVarC.d & 1024) == 0) {
                    pkd.a(duwVar, cVarC);
                } else {
                    while (cVarC != null) {
                        if ((cVarC.c & 1024) != 0) {
                            duw duwVar2 = null;
                            while (cVarC != null) {
                                if (cVarC instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
                                    if (focusTargetNode2.a.C) {
                                        int iOrdinal = focusTargetNode2.V().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return focusTargetNode2;
                                        }
                                        if (iOrdinal != 3) {
                                            uhc.a();
                                            return null;
                                        }
                                    }
                                } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                    int i2 = 0;
                                    for (d.c cVar3 = ((tkd) cVarC).E; cVar3 != null; cVar3 = cVar3.f) {
                                        if ((cVar3.c & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarC = cVar3;
                                            } else {
                                                if (duwVar2 == null) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar2.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar2.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar2);
                            }
                            break;
                        }
                        cVarC = cVarC.f;
                    }
                }
            }
        }
        return null;
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        tsr tsrVar;
        ywx ywxVar;
        tsr tsrVar2;
        ywx ywxVar2 = focusTargetNode.v;
        return (ywxVar2 == null || (tsrVar = ywxVar2.E) == null || !tsrVar.i() || (ywxVar = focusTargetNode.v) == null || (tsrVar2 = ywxVar.E) == null || !tsrVar2.e()) ? false : true;
    }
}
