package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.transition.nfj.CaBJCMnsV;

/* JADX INFO: loaded from: classes.dex */
public final class n8 {
    public static final boolean a(FocusTargetNode focusTargetNode, boolean z) {
        int iOrdinal = focusTargetNode.V().ordinal();
        if (iOrdinal == 0) {
            pkd.g(focusTargetNode).getFocusOwner().q(null);
            focusTargetNode.p2(k5i.a, k5i.d);
            return true;
        }
        if (iOrdinal == 1) {
            FocusTargetNode focusTargetNodeC = p5i.c(focusTargetNode);
            if (!(focusTargetNodeC != null ? a(focusTargetNodeC, z) : true)) {
                return false;
            }
            focusTargetNode.p2(k5i.b, k5i.d);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            uhc.a();
            return false;
        }
        if (z) {
            pkd.g(focusTargetNode).getFocusOwner().q(null);
            focusTargetNode.p2(k5i.c, k5i.d);
        }
        return z;
    }

    public static final odc b(FocusTargetNode focusTargetNode, int i) {
        int iOrdinal = focusTargetNode.V().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = p5i.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    hb5.a("ActiveParent with no focused child");
                    return null;
                }
                odc odcVarB = b(focusTargetNodeC, i);
                odc odcVar = odc.a;
                odc odcVar2 = odcVarB != odcVar ? odcVarB : null;
                if (odcVar2 != null) {
                    return odcVar2;
                }
                if (focusTargetNode.E) {
                    return odcVar;
                }
                focusTargetNode.E = true;
                try {
                    y4i y4iVarQ2 = focusTargetNode.q2();
                    pb6 pb6Var = new pb6(i);
                    s4i focusOwner = pkd.g(focusTargetNode).getFocusOwner();
                    FocusTargetNode focusTargetNodeF = focusOwner.f();
                    y4iVarQ2.k.invoke(pb6Var);
                    FocusTargetNode focusTargetNodeF2 = focusOwner.f();
                    if (pb6Var.b) {
                        b5i b5iVar = b5i.b;
                        return odc.b;
                    }
                    if (focusTargetNodeF == focusTargetNodeF2 || focusTargetNodeF2 == null) {
                        return odcVar;
                    }
                    return b5i.d == b5i.c ? odc.b : odc.c;
                } finally {
                    focusTargetNode.E = false;
                }
            }
            if (iOrdinal == 2) {
                return odc.b;
            }
            if (iOrdinal != 3) {
                uhc.a();
                return null;
            }
        }
        return odc.a;
    }

    public static final odc c(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.F) {
            focusTargetNode.F = true;
            try {
                y4i y4iVarQ2 = focusTargetNode.q2();
                pb6 pb6Var = new pb6(i);
                s4i focusOwner = pkd.g(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeF = focusOwner.f();
                y4iVarQ2.j.invoke(pb6Var);
                FocusTargetNode focusTargetNodeF2 = focusOwner.f();
                if (pb6Var.b) {
                    b5i b5iVar = b5i.b;
                    return odc.b;
                }
                if (focusTargetNodeF != focusTargetNodeF2 && focusTargetNodeF2 != null) {
                    return b5i.d == b5i.c ? odc.b : odc.c;
                }
            } finally {
                focusTargetNode.F = false;
            }
        }
        return odc.a;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ee A[ADDED_TO_REGION, LOOP:9: B:143:0x01ee->B:150:0x0202, LOOP_START, PHI: r12
      0x01ee: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:142:0x01ec, B:150:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:149:0x0200  */
    /* JADX WARN: Code duplicated, block: B:151:0x020a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0211  */
    /* JADX WARN: Code duplicated, block: B:158:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:194:0x0192 A[SYNTHETIC] */
    public static final boolean e(FocusTargetNode focusTargetNode) {
        duw duwVar;
        int i;
        FocusTargetNode focusTargetNode2;
        k5i k5iVar;
        wwx wwxVar;
        char c;
        wwx wwxVar2;
        s4i focusOwner = pkd.g(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeF = focusOwner.f();
        k5i k5iVarV = focusTargetNode.V();
        if (focusTargetNodeF == focusTargetNode) {
            focusTargetNode.p2(k5iVarV, k5iVarV);
            return true;
        }
        int i2 = 0;
        if (focusTargetNodeF == null && !pkd.g(focusTargetNode).getFocusOwner().n()) {
            return false;
        }
        char c2 = 16;
        if (focusTargetNodeF != null) {
            duwVar = new duw(new FocusTargetNode[16]);
            if (!focusTargetNodeF.a.C) {
                wkn.c("visitAncestors called on an unattached node");
            }
            d.c cVar = focusTargetNodeF.a.e;
            tsr tsrVarF = pkd.f(focusTargetNodeF);
            while (tsrVarF != null) {
                if ((tsrVarF.U.f.d & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & 1024) != 0) {
                            d.c cVarC = cVar;
                            duw duwVar2 = null;
                            while (cVarC != null) {
                                if (cVarC instanceof FocusTargetNode) {
                                    duwVar.b((FocusTargetNode) cVarC);
                                } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                    int i3 = 0;
                                    for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                        if ((cVar2.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cVarC = cVar2;
                                            } else {
                                                if (duwVar2 == null) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (cVarC != null) {
                                                    duwVar2.b(cVarC);
                                                    cVarC = null;
                                                }
                                                duwVar2.b(cVar2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cVarC = pkd.c(duwVar2);
                            }
                        }
                        cVar = cVar.e;
                    }
                }
                tsrVarF = tsrVarF.H();
                cVar = (tsrVarF == null || (wwxVar2 = tsrVarF.U) == null) ? null : wwxVar2.e;
            }
        } else {
            duwVar = null;
        }
        Object[] objArr = new FocusTargetNode[16];
        if (!focusTargetNode.a.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar3 = focusTargetNode.a.e;
        tsr tsrVarF2 = pkd.f(focusTargetNode);
        int i4 = 1;
        int i5 = 0;
        while (tsrVarF2 != null) {
            if ((tsrVarF2.U.f.d & 1024) != 0) {
                while (cVar3 != null) {
                    if ((cVar3.c & 1024) != 0) {
                        d.c cVarC2 = cVar3;
                        duw duwVar3 = null;
                        while (cVarC2 != null) {
                            if (cVarC2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarC2;
                                Boolean boolValueOf = duwVar != null ? Boolean.valueOf(duwVar.j(focusTargetNode3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (objArr.length < i6) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(objArr, i2, objArr2, i2, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i5] = focusTargetNode3;
                                    i5 = i6;
                                }
                                if (focusTargetNode3 == focusTargetNodeF) {
                                    i4 = i2;
                                }
                            } else {
                                if ((cVarC2.c & 1024) != 0 && (cVarC2 instanceof tkd)) {
                                    int i7 = i2;
                                    for (d.c cVar4 = ((tkd) cVarC2).E; cVar4 != null; cVar4 = cVar4.f) {
                                        if ((cVar4.c & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                cVarC2 = cVar4;
                                            } else {
                                                if (duwVar3 == null) {
                                                    duwVar3 = new duw(new d.c[16]);
                                                }
                                                if (cVarC2 != null) {
                                                    duwVar3.b(cVarC2);
                                                    cVarC2 = null;
                                                }
                                                duwVar3.b(cVar4);
                                            }
                                        }
                                    }
                                    c = 16;
                                    if (i7 == 1) {
                                        c2 = 16;
                                    }
                                    i2 = 0;
                                }
                                cVarC2 = pkd.c(duwVar3);
                                c2 = c;
                                i2 = 0;
                            }
                            c = 16;
                            cVarC2 = pkd.c(duwVar3);
                            c2 = c;
                            i2 = 0;
                        }
                    }
                    cVar3 = cVar3.e;
                    c2 = c2;
                    i2 = 0;
                }
            }
            char c3 = c2;
            tsrVarF2 = tsrVarF2.H();
            cVar3 = (tsrVarF2 == null || (wwxVar = tsrVarF2.U) == null) ? null : wwxVar.e;
            c2 = c3;
            i2 = 0;
        }
        if (i4 == 0 || focusTargetNodeF == null || a(focusTargetNodeF, false)) {
            nfy.a(focusTargetNode, new o5i(focusTargetNode));
            int iOrdinal = focusTargetNode.V().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    pkd.g(focusTargetNode).getFocusOwner().q(focusTargetNode);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        uhc.a();
                        return false;
                    }
                    pkd.g(focusTargetNode).getFocusOwner().q(focusTargetNode);
                }
            }
            if (duwVar != null) {
                int i8 = duwVar.c - 1;
                Object[] objArr3 = duwVar.a;
                if (i8 < objArr3.length) {
                    while (i8 >= 0) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr3[i8];
                        if (focusOwner.f() == focusTargetNode) {
                            focusTargetNode4.p2(k5i.b, k5i.d);
                            i8--;
                        }
                    }
                    i = i5 - 1;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            focusTargetNode2 = (FocusTargetNode) objArr[i];
                            if (focusOwner.f() == focusTargetNode) {
                                if (focusTargetNode2 == focusTargetNodeF) {
                                    k5iVar = k5i.a;
                                } else {
                                    k5iVar = k5i.d;
                                }
                                focusTargetNode2.p2(k5iVar, k5i.b);
                                i--;
                            }
                        }
                        if (focusOwner.f() == focusTargetNode) {
                            focusTargetNode.p2(k5iVarV, k5i.a);
                            if (focusOwner.f() != focusTargetNode) {
                                return true;
                            }
                        }
                    } else if (focusOwner.f() == focusTargetNode) {
                        focusTargetNode.p2(k5iVarV, k5i.a);
                        if (focusOwner.f() != focusTargetNode) {
                            return true;
                        }
                    }
                } else {
                    i = i5 - 1;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            focusTargetNode2 = (FocusTargetNode) objArr[i];
                            if (focusOwner.f() == focusTargetNode) {
                                if (focusTargetNode2 == focusTargetNodeF) {
                                    k5iVar = k5i.a;
                                } else {
                                    k5iVar = k5i.d;
                                }
                                focusTargetNode2.p2(k5iVar, k5i.b);
                                i--;
                            }
                        }
                        if (focusOwner.f() == focusTargetNode) {
                            focusTargetNode.p2(k5iVarV, k5i.a);
                            if (focusOwner.f() != focusTargetNode) {
                                return true;
                            }
                        }
                    } else if (focusOwner.f() == focusTargetNode) {
                        focusTargetNode.p2(k5iVarV, k5i.a);
                        if (focusOwner.f() != focusTargetNode) {
                            return true;
                        }
                    }
                }
            } else {
                i = i5 - 1;
                if (i < objArr.length) {
                    while (i >= 0) {
                        focusTargetNode2 = (FocusTargetNode) objArr[i];
                        if (focusOwner.f() == focusTargetNode) {
                            if (focusTargetNode2 == focusTargetNodeF) {
                                k5iVar = k5i.a;
                            } else {
                                k5iVar = k5i.d;
                            }
                            focusTargetNode2.p2(k5iVar, k5i.b);
                            i--;
                        }
                    }
                    if (focusOwner.f() == focusTargetNode) {
                        focusTargetNode.p2(k5iVarV, k5i.a);
                        if (focusOwner.f() != focusTargetNode) {
                            return true;
                        }
                    }
                } else if (focusOwner.f() == focusTargetNode) {
                    focusTargetNode.p2(k5iVarV, k5i.a);
                    if (focusOwner.f() != focusTargetNode) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final odc d(FocusTargetNode focusTargetNode, int i) {
        d.c cVarC;
        wwx wwxVar;
        int iOrdinal = focusTargetNode.V().ordinal();
        if (iOrdinal != 0) {
            odc odcVar = null;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (!focusTargetNode.a.C) {
                            wkn.c(CaBJCMnsV.grAcbfRXOnVYHgD);
                        }
                        d.c cVar = focusTargetNode.a.e;
                        tsr tsrVarF = pkd.f(focusTargetNode);
                        loop0: while (true) {
                            if (tsrVarF != null) {
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
                                                    int i2 = 0;
                                                    for (d.c cVar2 = ((tkd) cVarC).E; cVar2 != null; cVar2 = cVar2.f) {
                                                        if ((cVar2.c & 1024) != 0) {
                                                            i2++;
                                                            if (i2 == 1) {
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
                                                    if (i2 == 1) {
                                                    }
                                                }
                                                cVarC = pkd.c(duwVar);
                                            }
                                        }
                                        cVar = cVar.e;
                                    }
                                }
                                tsrVarF = tsrVarF.H();
                                if (tsrVarF != null && (wwxVar = tsrVarF.U) != null) {
                                    cVar = wwxVar.e;
                                } else {
                                    cVar = null;
                                }
                            } else {
                                cVarC = null;
                                break;
                            }
                        }
                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
                        if (focusTargetNode2 == null) {
                            return odc.a;
                        }
                        int iOrdinal2 = focusTargetNode2.V().ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 == 3) {
                                        odc odcVarD = d(focusTargetNode2, i);
                                        if (odcVarD != odc.a) {
                                            odcVar = odcVarD;
                                        }
                                        if (odcVar == null) {
                                            return c(focusTargetNode2, i);
                                        }
                                        return odcVar;
                                    }
                                    uhc.a();
                                    return null;
                                }
                                return odc.b;
                            }
                            return d(focusTargetNode2, i);
                        }
                        return c(focusTargetNode2, i);
                    }
                    uhc.a();
                    return null;
                }
            } else {
                FocusTargetNode focusTargetNodeC = p5i.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return b(focusTargetNodeC, i);
                }
                hb5.a("ActiveParent with no focused child");
                return null;
            }
        }
        return odc.a;
    }
}
