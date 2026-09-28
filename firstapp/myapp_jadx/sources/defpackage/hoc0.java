package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hoc0 {
    public static final boolean a(lk40 lk40Var, lk40 lk40Var2, lk40 lk40Var3, int i) {
        float f;
        float f2;
        boolean zB = b(i, lk40Var3, lk40Var);
        float f3 = lk40Var3.b;
        float f4 = lk40Var3.d;
        float f5 = lk40Var3.a;
        float f6 = lk40Var3.c;
        float f7 = lk40Var.d;
        float f8 = lk40Var.b;
        float f9 = lk40Var.c;
        float f10 = lk40Var.a;
        if (!zB && b(i, lk40Var2, lk40Var)) {
            if (i == 3) {
                if (f10 < f6) {
                    return true;
                }
            } else if (i == 4) {
                if (f9 > f5) {
                    return true;
                }
            } else if (i == 5) {
                if (f8 < f4) {
                    return true;
                }
            } else if (i != 6) {
                ib5.a("This function should only be used for 2-D focus search");
            } else if (f7 > f3) {
                return true;
            }
            if (i == 3 || i == 4) {
                return true;
            }
            if (i == 3) {
                f = f10 - lk40Var2.c;
            } else if (i == 4) {
                f = lk40Var2.a - f9;
            } else if (i == 5) {
                f = f8 - lk40Var2.d;
            } else {
                if (i != 6) {
                    ib5.a("This function should only be used for 2-D focus search");
                    return false;
                }
                f = lk40Var2.b - f7;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (i == 3) {
                f2 = f10 - f5;
            } else if (i == 4) {
                f2 = f6 - f9;
            } else if (i == 5) {
                f2 = f8 - f3;
            } else {
                if (i != 6) {
                    ib5.a("This function should only be used for 2-D focus search");
                    return false;
                }
                f2 = f4 - f7;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            if (f < f2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(int i, lk40 lk40Var, lk40 lk40Var2) {
        if (i == 3 || i == 4) {
            if (lk40Var.d > lk40Var2.b && lk40Var.b < lk40Var2.d) {
                return true;
            }
        } else {
            if (i != 5 && i != 6) {
                ib5.a("This function should only be used for 2-D focus search");
                return false;
            }
            if (lk40Var.c > lk40Var2.a && lk40Var.a < lk40Var2.c) {
                return true;
            }
        }
        return false;
    }

    public static final void c(FocusTargetNode focusTargetNode, duw duwVar) {
        if (!focusTargetNode.a.C) {
            wkn.c("visitChildren called on an unattached node");
        }
        duw duwVar2 = new duw(new d.c[16]);
        d.c cVar = focusTargetNode.a;
        d.c cVar2 = cVar.f;
        if (cVar2 == null) {
            pkd.a(duwVar2, cVar);
        } else {
            duwVar2.b(cVar2);
        }
        while (true) {
            int i = duwVar2.c;
            if (i == 0) {
                return;
            }
            d.c cVarC = (d.c) duwVar2.k(i - 1);
            if ((cVarC.d & 1024) == 0) {
                pkd.a(duwVar2, cVarC);
            } else {
                while (cVarC != null) {
                    if ((cVarC.c & 1024) != 0) {
                        duw duwVar3 = null;
                        while (cVarC != null) {
                            if (cVarC instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
                                if (focusTargetNode2.C && !pkd.f(focusTargetNode2).f0) {
                                    if (focusTargetNode2.q2().a) {
                                        duwVar.b(focusTargetNode2);
                                    } else {
                                        c(focusTargetNode2, duwVar);
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
                                            if (duwVar3 == null) {
                                                duwVar3 = new duw(new d.c[16]);
                                            }
                                            if (cVarC != null) {
                                                duwVar3.b(cVarC);
                                                cVarC = null;
                                            }
                                            duwVar3.b(cVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVarC = pkd.c(duwVar3);
                        }
                        break;
                    }
                    cVarC = cVarC.f;
                }
            }
        }
    }

    public static final FocusTargetNode d(duw duwVar, lk40 lk40Var, int i) {
        lk40 lk40VarI;
        FocusTargetNode focusTargetNode = null;
        if (i == 3) {
            lk40VarI = lk40Var.i((lk40Var.c - lk40Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            lk40VarI = lk40Var.i(-((lk40Var.c - lk40Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            lk40VarI = lk40Var.i(0.0f, (lk40Var.d - lk40Var.b) + 1.0f);
        } else {
            if (i != 6) {
                ib5.a("This function should only be used for 2-D focus search");
                return null;
            }
            lk40VarI = lk40Var.i(0.0f, -((lk40Var.d - lk40Var.b) + 1.0f));
        }
        Object[] objArr = duwVar.a;
        int i2 = duwVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (p5i.d(focusTargetNode2)) {
                lk40 lk40VarB = p5i.b(focusTargetNode2);
                if (g(lk40VarB, lk40VarI, lk40Var, i)) {
                    focusTargetNode = focusTargetNode2;
                    lk40VarI = lk40VarB;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i, Function1 function1) {
        lk40 lk40Var;
        duw duwVar = new duw(new FocusTargetNode[16]);
        c(focusTargetNode, duwVar);
        int i2 = duwVar.c;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : duwVar.a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                lk40 lk40VarB = p5i.b(focusTargetNode);
                float f = lk40VarB.a;
                float f2 = lk40VarB.b;
                lk40Var = new lk40(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    ib5.a("This function should only be used for 2-D focus search");
                    return false;
                }
                lk40 lk40VarB2 = p5i.b(focusTargetNode);
                float f3 = lk40VarB2.c;
                float f4 = lk40VarB2.d;
                lk40Var = new lk40(f3, f4, f3, f4);
            }
            FocusTargetNode focusTargetNodeD = d(duwVar, lk40Var, i);
            if (focusTargetNodeD != null) {
                return ((Boolean) function1.invoke(focusTargetNodeD)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean f(int i, t4i.a aVar, lk40 lk40Var, FocusTargetNode focusTargetNode) {
        if (j(i, aVar, lk40Var, focusTargetNode)) {
            return true;
        }
        Boolean bool = (Boolean) z44.a(focusTargetNode, i, new tzg0(pkd.g(focusTargetNode).getFocusOwner().f(), focusTargetNode, lk40Var, i, aVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(lk40 lk40Var, lk40 lk40Var2, lk40 lk40Var3, int i) {
        if (!h(i, lk40Var, lk40Var3)) {
            return false;
        }
        if (h(i, lk40Var2, lk40Var3) && !a(lk40Var3, lk40Var, lk40Var2, i)) {
            return !a(lk40Var3, lk40Var2, lk40Var, i) && i(i, lk40Var3, lk40Var) < i(i, lk40Var3, lk40Var2);
        }
        return true;
    }

    public static final boolean h(int i, lk40 lk40Var, lk40 lk40Var2) {
        float f = lk40Var.b;
        float f2 = lk40Var.d;
        float f3 = lk40Var.a;
        float f4 = lk40Var.c;
        if (i == 3) {
            float f5 = lk40Var2.c;
            float f6 = lk40Var2.a;
            if ((f5 > f4 || f6 >= f4) && f6 > f3) {
                return true;
            }
        } else if (i == 4) {
            float f7 = lk40Var2.a;
            float f8 = lk40Var2.c;
            if ((f7 < f3 || f8 <= f3) && f8 < f4) {
                return true;
            }
        } else if (i == 5) {
            float f9 = lk40Var2.d;
            float f10 = lk40Var2.b;
            if ((f9 > f2 || f10 >= f2) && f10 > f) {
                return true;
            }
        } else {
            if (i != 6) {
                ib5.a("This function should only be used for 2-D focus search");
                return false;
            }
            float f11 = lk40Var2.b;
            float f12 = lk40Var2.d;
            if ((f11 < f || f12 <= f) && f12 < f2) {
                return true;
            }
        }
        return false;
    }

    public static final long i(int i, lk40 lk40Var, lk40 lk40Var2) {
        float f;
        float fA;
        float f2 = lk40Var2.b;
        float f3 = lk40Var2.d;
        float f4 = lk40Var2.a;
        float f5 = lk40Var2.c;
        if (i == 3) {
            f = lk40Var.a - f5;
        } else if (i == 4) {
            f = f4 - lk40Var.c;
        } else if (i == 5) {
            f = lk40Var.b - f3;
        } else {
            if (i != 6) {
                ib5.a("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f2 - lk40Var.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f6 = lk40Var.b;
            fA = g70.a(lk40Var.d, f6, 2.0f, f6) - (((f3 - f2) / 2.0f) + f2);
        } else {
            if (i != 5 && i != 6) {
                ib5.a("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f7 = lk40Var.a;
            fA = g70.a(lk40Var.c, f7, 2.0f, f7) - (((f5 - f4) / 2.0f) + f4);
        }
        long j2 = (long) fA;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean j(int i, t4i.a aVar, lk40 lk40Var, FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeD;
        duw duwVar = new duw(new FocusTargetNode[16]);
        if (!focusTargetNode.a.C) {
            wkn.c("visitChildren called on an unattached node");
        }
        duw duwVar2 = new duw(new d.c[16]);
        d.c cVar = focusTargetNode.a;
        d.c cVar2 = cVar.f;
        if (cVar2 == null) {
            pkd.a(duwVar2, cVar);
        } else {
            duwVar2.b(cVar2);
        }
        while (true) {
            int i2 = duwVar2.c;
            if (i2 == 0) {
                break;
            }
            d.c cVarC = (d.c) duwVar2.k(i2 - 1);
            if ((cVarC.d & 1024) == 0) {
                pkd.a(duwVar2, cVarC);
            } else {
                while (cVarC != null) {
                    if ((cVarC.c & 1024) != 0) {
                        duw duwVar3 = null;
                        while (cVarC != null) {
                            if (cVarC instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarC;
                                if (focusTargetNode2.C) {
                                    duwVar.b(focusTargetNode2);
                                }
                            } else if ((cVarC.c & 1024) != 0 && (cVarC instanceof tkd)) {
                                int i3 = 0;
                                for (d.c cVar3 = ((tkd) cVarC).E; cVar3 != null; cVar3 = cVar3.f) {
                                    if ((cVar3.c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cVarC = cVar3;
                                        } else {
                                            if (duwVar3 == null) {
                                                duwVar3 = new duw(new d.c[16]);
                                            }
                                            if (cVarC != null) {
                                                duwVar3.b(cVarC);
                                                cVarC = null;
                                            }
                                            duwVar3.b(cVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cVarC = pkd.c(duwVar3);
                        }
                        break;
                    }
                    cVarC = cVarC.f;
                }
            }
        }
        while (duwVar.c != 0 && (focusTargetNodeD = d(duwVar, lk40Var, i)) != null) {
            if (focusTargetNodeD.q2().a) {
                return ((Boolean) aVar.invoke(focusTargetNodeD)).booleanValue();
            }
            if (f(i, aVar, lk40Var, focusTargetNodeD)) {
                return true;
            }
            duwVar.j(focusTargetNodeD);
        }
        return false;
    }

    public static final Boolean k(int i, t4i.a aVar, lk40 lk40Var, FocusTargetNode focusTargetNode) {
        int iOrdinal = focusTargetNode.V().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = p5i.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    ib5.a("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = focusTargetNodeC.V().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = k(i, aVar, lk40Var, focusTargetNodeC);
                        if (!Intrinsics.g(boolK, Boolean.FALSE)) {
                            return boolK;
                        }
                        if (lk40Var == null) {
                            if (focusTargetNodeC.V() != k5i.b) {
                                ib5.a("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            FocusTargetNode focusTargetNodeA = p5i.a(focusTargetNodeC);
                            if (focusTargetNodeA == null) {
                                ib5.a("ActiveParent must have a focusedChild");
                                return null;
                            }
                            lk40Var = p5i.b(focusTargetNodeA);
                        }
                        return Boolean.valueOf(f(i, aVar, lk40Var, focusTargetNode));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            uhc.a();
                            return null;
                        }
                        ib5.a("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (lk40Var == null) {
                    lk40Var = p5i.b(focusTargetNodeC);
                }
                return Boolean.valueOf(f(i, aVar, lk40Var, focusTargetNode));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                if (focusTargetNode.q2().a) {
                    return (Boolean) aVar.invoke(focusTargetNode);
                }
                return lk40Var == null ? Boolean.valueOf(e(focusTargetNode, i, aVar)) : Boolean.valueOf(j(i, aVar, lk40Var, focusTargetNode));
            }
        }
        return Boolean.valueOf(e(focusTargetNode, i, aVar));
    }
}
