package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class mqy {
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean a(FocusTargetNode focusTargetNode, t4i.a aVar) {
        int iOrdinal = focusTargetNode.V().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = p5i.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    ib5.a("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = focusTargetNodeC.V().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(focusTargetNodeC, aVar) || c(focusTargetNode, focusTargetNodeC, 2, aVar) || (focusTargetNodeC.q2().a && ((Boolean) aVar.invoke(focusTargetNodeC)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            uhc.a();
                            return false;
                        }
                        ib5.a("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return c(focusTargetNode, focusTargetNodeC, 2, aVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    uhc.a();
                    return false;
                }
                if (!d(focusTargetNode, aVar)) {
                    if (!(focusTargetNode.q2().a ? ((Boolean) aVar.invoke(focusTargetNode)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return d(focusTargetNode, aVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, t4i.a aVar) {
        int iOrdinal = focusTargetNode.V().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = p5i.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return b(focusTargetNodeC, aVar) || c(focusTargetNode, focusTargetNodeC, 1, aVar);
                }
                ib5.a("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.q2().a ? ((Boolean) aVar.invoke(focusTargetNode)).booleanValue() : e(focusTargetNode, aVar);
                }
                uhc.a();
                return false;
            }
        }
        return e(focusTargetNode, aVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, t4i.a aVar) {
        if (f(focusTargetNode, focusTargetNode2, i, aVar)) {
            return true;
        }
        Boolean bool = (Boolean) z44.a(focusTargetNode, i, new lqy(pkd.g(focusTargetNode).getFocusOwner().f(), focusTargetNode, focusTargetNode2, i, aVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, t4i.a aVar) {
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.a.C) {
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
        int i = 0;
        while (true) {
            int i2 = duwVar.c;
            if (i2 == 0) {
                break;
            }
            d.c cVarC = (d.c) duwVar.k(i2 - 1);
            if ((cVarC.d & 1024) == 0) {
                pkd.a(duwVar, cVarC);
            } else {
                while (cVarC != null) {
                    if ((cVarC.c & 1024) != 0) {
                        duw duwVar2 = null;
                        while (cVarC != null) {
                            if (cVarC instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = focusTargetNode2;
                                i = i3;
                            } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                int i4 = 0;
                                for (d.c cVar3 = ((tkd) cVarC).E; cVar3 != null; cVar3 = cVar3.f) {
                                    if ((cVar3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        Arrays.sort(objArr, 0, i, q5i.a);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i5];
                if (p5i.d(focusTargetNode3) && a(focusTargetNode3, aVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, t4i.a aVar) {
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.a.C) {
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
        int i = 0;
        while (true) {
            int i2 = duwVar.c;
            if (i2 == 0) {
                break;
            }
            d.c cVarC = (d.c) duwVar.k(i2 - 1);
            if ((cVarC.d & 1024) == 0) {
                pkd.a(duwVar, cVarC);
            } else {
                while (cVarC != null) {
                    if ((cVarC.c & 1024) != 0) {
                        duw duwVar2 = null;
                        while (cVarC != null) {
                            if (cVarC instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = focusTargetNode2;
                                i = i3;
                            } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                int i4 = 0;
                                for (d.c cVar3 = ((tkd) cVarC).E; cVar3 != null; cVar3 = cVar3.f) {
                                    if ((cVar3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        Arrays.sort(objArr, 0, i, q5i.a);
        for (int i5 = 0; i5 < i; i5++) {
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i5];
            if (p5i.d(focusTargetNode3) && b(focusTargetNode3, aVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
      0x0138: PHI (r13v12 androidx.compose.ui.d$c) = (r13v7 androidx.compose.ui.d$c), (r13v13 androidx.compose.ui.d$c) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, t4i.a aVar) {
        d.c cVar;
        d.c cVar2;
        tsr tsrVarF;
        wwx wwxVar;
        d.c cVarC;
        duw duwVar;
        if (focusTargetNode.V() != k5i.b) {
            ib5.a("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.a.C) {
            wkn.c("visitChildren called on an unattached node");
        }
        duw duwVar2 = new duw(new d.c[16]);
        d.c cVar3 = focusTargetNode.a;
        d.c cVar4 = cVar3.f;
        if (cVar4 == null) {
            pkd.a(duwVar2, cVar3);
        } else {
            duwVar2.b(cVar4);
        }
        int i2 = 0;
        while (true) {
            int i3 = duwVar2.c;
            cVar = null;
            if (i3 == 0) {
                break;
            }
            d.c cVarC2 = (d.c) duwVar2.k(i3 - 1);
            if ((cVarC2.d & 1024) == 0) {
                pkd.a(duwVar2, cVarC2);
            } else {
                while (cVarC2 != null) {
                    if ((cVarC2.c & 1024) != 0) {
                        duw duwVar3 = null;
                        while (cVarC2 != null) {
                            if (cVarC2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarC2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = focusTargetNode3;
                                i2 = i4;
                            } else if ((cVarC2.c & 1024) != 0 && (cVarC2 instanceof tkd)) {
                                int i5 = 0;
                                for (d.c cVar5 = ((tkd) cVarC2).E; cVar5 != null; cVar5 = cVar5.f) {
                                    if ((cVar5.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cVarC2 = cVar5;
                                        } else {
                                            if (duwVar3 == null) {
                                                duwVar3 = new duw(new d.c[16]);
                                            }
                                            if (cVarC2 != null) {
                                                duwVar3.b(cVarC2);
                                                cVarC2 = null;
                                            }
                                            duwVar3.b(cVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            cVarC2 = pkd.c(duwVar3);
                        }
                        break;
                    }
                    cVarC2 = cVarC2.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, q5i.a);
        if (i != 1) {
            if (i != 2) {
                ib5.a("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange intRangeN = f.n(0, i2);
            int i6 = intRangeN.a;
            int i7 = intRangeN.b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr[i7];
                        if (p5i.d(focusTargetNode4) && a(focusTargetNode4, aVar)) {
                            return true;
                        }
                    }
                    if (Intrinsics.g(objArr[i7], focusTargetNode2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!focusTargetNode.a.C) {
                    wkn.c("visitAncestors called on an unattached node");
                }
                cVar2 = focusTargetNode.a.e;
                tsrVarF = pkd.f(focusTargetNode);
                loop5: while (tsrVarF != null) {
                    if ((tsrVarF.U.f.d & 1024) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.c & 1024) != 0) {
                                cVarC = cVar2;
                                duwVar = null;
                                while (cVarC != null) {
                                    if (cVarC instanceof FocusTargetNode) {
                                        cVar = cVarC;
                                        break loop5;
                                    }
                                    if ((cVarC.c & 1024) == 0) {
                                    }
                                    cVarC = pkd.c(duwVar);
                                }
                            }
                            cVar2 = cVar2.e;
                        }
                    }
                    tsrVarF = tsrVarF.H();
                    if (tsrVarF != null) {
                    }
                }
                if (cVar != null) {
                    return ((Boolean) aVar.invoke(focusTargetNode)).booleanValue();
                }
            }
            return false;
        }
        IntRange intRangeN2 = f.n(0, i2);
        int i8 = intRangeN2.a;
        int i9 = intRangeN2.b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    FocusTargetNode focusTargetNode5 = (FocusTargetNode) objArr[i8];
                    if (p5i.d(focusTargetNode5) && b(focusTargetNode5, aVar)) {
                        return true;
                    }
                }
                if (Intrinsics.g(objArr[i8], focusTargetNode2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && focusTargetNode.q2().a) {
            if (!focusTargetNode.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            cVar2 = focusTargetNode.a.e;
            tsrVarF = pkd.f(focusTargetNode);
            loop5: while (tsrVarF != null) {
                if ((tsrVarF.U.f.d & 1024) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.c & 1024) != 0) {
                            cVarC = cVar2;
                            duwVar = null;
                            while (cVarC != null) {
                                if (cVarC instanceof FocusTargetNode) {
                                    cVar = cVarC;
                                    break loop5;
                                }
                                if ((cVarC.c & 1024) == 0 && (cVarC instanceof tkd)) {
                                    int i10 = 0;
                                    for (d.c cVar6 = ((tkd) cVarC).E; cVar6 != null; cVar6 = cVar6.f) {
                                        if ((cVar6.c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVarC = cVar6;
                                            } else {
                                                if (duwVar == null) {
                                                    duwVar = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar.b(cVar6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar);
                            }
                        }
                        cVar2 = cVar2.e;
                    }
                }
                tsrVarF = tsrVarF.H();
                cVar2 = (tsrVarF != null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
            }
            if (cVar != null) {
                return ((Boolean) aVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }
}
