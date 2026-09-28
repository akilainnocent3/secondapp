package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z44 {
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[PHI: r0
      0x00a8: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int), (r0v10 int) binds: [B:54:0x00a6, B:57:0x00ab, B:60:0x00af, B:63:0x00b3, B:66:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    public static final <T> T a(FocusTargetNode focusTargetNode, int i, Function1<? super x44.a, ? extends T> function1) {
        int i2;
        d.c cVarC;
        x44 x44Var;
        int i3;
        wwx wwxVar;
        if (!focusTargetNode.a.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar = focusTargetNode.a.e;
        tsr tsrVarF = pkd.f(focusTargetNode);
        loop0: while (true) {
            i2 = 1;
            if (tsrVarF == null) {
                cVarC = null;
                break;
            }
            if ((tsrVarF.U.f.d & 1024) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 1024) != 0) {
                        cVarC = cVar;
                        duw duwVar = null;
                        while (cVarC != null) {
                            if (cVarC instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                int i4 = 0;
                                for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                    if ((cVar2.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cVarC = cVar2;
                                        } else {
                                            if (duwVar == null) {
                                                duwVar = new duw(new d.c[16]);
                                            }
                                            if (cVarC != null) {
                                                duwVar.b(cVarC);
                                                cVarC = null;
                                            }
                                            duwVar.b(cVar2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cVarC = pkd.c(duwVar);
                        }
                    }
                    cVar = cVar.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
        if (focusTargetNode2 != null) {
            g730<x44> g730Var = y44.a;
            if (!Intrinsics.g((x44) focusTargetNode2.g(g730Var), (x44) focusTargetNode.g(g730Var))) {
                x44Var = (x44) focusTargetNode.g(y44.a);
                if (x44Var != null) {
                    i3 = 5;
                    if (i == 5) {
                        i2 = i3;
                    } else {
                        i3 = 6;
                        if (i == 6) {
                            i2 = i3;
                        } else {
                            i3 = 3;
                            if (i == 3) {
                                i2 = i3;
                            } else {
                                i3 = 4;
                                if (i == 4) {
                                    i2 = i3;
                                } else {
                                    i3 = 2;
                                    if (i == 1) {
                                        i2 = i3;
                                    } else if (i != 2) {
                                        ib5.a("Unsupported direction for beyond bounds layout");
                                    }
                                }
                            }
                        }
                    }
                    return (T) x44Var.e0(i2, function1);
                }
            }
        } else {
            x44Var = (x44) focusTargetNode.g(y44.a);
            if (x44Var != null) {
                i3 = 5;
                if (i == 5) {
                    i2 = i3;
                } else {
                    i3 = 6;
                    if (i == 6) {
                        i2 = i3;
                    } else {
                        i3 = 3;
                        if (i == 3) {
                            i2 = i3;
                        } else {
                            i3 = 4;
                            if (i == 4) {
                                i2 = i3;
                            } else {
                                i3 = 2;
                                if (i == 1) {
                                    i2 = i3;
                                } else if (i != 2) {
                                    ib5.a("Unsupported direction for beyond bounds layout");
                                }
                            }
                        }
                    }
                }
                return (T) x44Var.e0(i2, function1);
            }
        }
        return null;
    }
}
