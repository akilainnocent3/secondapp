package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class iqe {
    public static final n92.a a = new n92.a();

    public static boolean a(ixa ixaVar) {
        ixa.a[] aVarArr = ixaVar.V;
        ixa.a aVar = aVarArr[0];
        ixa.a aVar2 = aVarArr[1];
        ixa ixaVar2 = ixaVar.W;
        jxa jxaVar = ixaVar2 != null ? (jxa) ixaVar2 : null;
        ixa.a aVar3 = ixa.a.a;
        if (jxaVar != null) {
            ixa.a aVar4 = jxaVar.V[0];
        }
        if (jxaVar != null) {
            ixa.a aVar5 = jxaVar.V[1];
        }
        ixa.a aVar6 = ixa.a.c;
        ixa.a aVar7 = ixa.a.b;
        boolean z = aVar == aVar3 || ixaVar.C() || aVar == aVar7 || (aVar == aVar6 && ixaVar.s == 0 && ixaVar.Z == 0.0f && ixaVar.v(0)) || (aVar == aVar6 && ixaVar.s == 1 && ixaVar.w(0, ixaVar.s()));
        boolean z2 = aVar2 == aVar3 || ixaVar.D() || aVar2 == aVar7 || (aVar2 == aVar6 && ixaVar.t == 0 && ixaVar.Z == 0.0f && ixaVar.v(1)) || (aVar2 == aVar6 && ixaVar.t == 1 && ixaVar.w(1, ixaVar.m()));
        return (ixaVar.Z > 0.0f && (z || z2)) || (z && z2);
    }

    public static void b(int i, n92.b bVar, ixa ixaVar, boolean z) {
        ewa ewaVar;
        ewa ewaVar2;
        boolean z2;
        ewa ewaVar3;
        ewa ewaVar4;
        if (ixaVar.n) {
            return;
        }
        if (!(ixaVar instanceof jxa) && ixaVar.B() && a(ixaVar)) {
            jxa.c0(ixaVar, bVar, new n92.a());
        }
        ewa ewaVarK = ixaVar.k(ewa.a.a);
        ewa ewaVarK2 = ixaVar.k(ewa.a.c);
        int iD = ewaVarK.d();
        int iD2 = ewaVarK2.d();
        HashSet<ewa> hashSet = ewaVarK.a;
        ixa.a aVar = ixa.a.c;
        if (hashSet != null && ewaVarK.c) {
            Iterator<ewa> it = hashSet.iterator();
            while (it.hasNext()) {
                ewa next = it.next();
                ixa ixaVar2 = next.d;
                int i2 = i + 1;
                boolean zA = a(ixaVar2);
                ewa ewaVar5 = ixaVar2.K;
                ewa ewaVar6 = ixaVar2.M;
                if (ixaVar2.B() && zA) {
                    z2 = true;
                    jxa.c0(ixaVar2, bVar, new n92.a());
                } else {
                    z2 = true;
                }
                boolean z3 = ((next == ewaVar5 && (ewaVar4 = ewaVar6.f) != null && ewaVar4.c) || (next == ewaVar6 && (ewaVar3 = ewaVar5.f) != null && ewaVar3.c)) ? z2 : false;
                ixa.a aVar2 = ixaVar2.V[0];
                if (aVar2 != aVar || zA) {
                    if (!ixaVar2.B()) {
                        if (next == ewaVar5 && ewaVar6.f == null) {
                            int iE = ewaVar5.e() + iD;
                            ixaVar2.M(iE, ixaVar2.s() + iE);
                            b(i2, bVar, ixaVar2, z);
                        } else if (next == ewaVar6 && ewaVar5.f == null) {
                            int iE2 = iD - ewaVar6.e();
                            ixaVar2.M(iE2 - ixaVar2.s(), iE2);
                            b(i2, bVar, ixaVar2, z);
                        } else if (z3 && !ixaVar2.z()) {
                            c(i2, bVar, ixaVar2, z);
                        }
                    }
                } else if (aVar2 == aVar && ixaVar2.w >= 0 && ixaVar2.v >= 0 && (ixaVar2.j0 == 8 || (ixaVar2.s == 0 && ixaVar2.Z == 0.0f))) {
                    if (!ixaVar2.z() && !ixaVar2.H && z3 && !ixaVar2.z()) {
                        d(i2, ixaVar, bVar, ixaVar2, z);
                    }
                }
            }
        }
        if (ixaVar instanceof qal) {
            return;
        }
        HashSet<ewa> hashSet2 = ewaVarK2.a;
        if (hashSet2 != null && ewaVarK2.c) {
            Iterator<ewa> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ewa next2 = it2.next();
                ixa ixaVar3 = next2.d;
                int i3 = i + 1;
                boolean zA2 = a(ixaVar3);
                ewa ewaVar7 = ixaVar3.K;
                ewa ewaVar8 = ixaVar3.M;
                if (ixaVar3.B() && zA2) {
                    jxa.c0(ixaVar3, bVar, new n92.a());
                }
                boolean z4 = (next2 == ewaVar7 && (ewaVar2 = ewaVar8.f) != null && ewaVar2.c) || (next2 == ewaVar8 && (ewaVar = ewaVar7.f) != null && ewaVar.c);
                ixa.a aVar3 = ixaVar3.V[0];
                if (aVar3 != aVar || zA2) {
                    if (!ixaVar3.B()) {
                        if (next2 == ewaVar7 && ewaVar8.f == null) {
                            int iE3 = ewaVar7.e() + iD2;
                            ixaVar3.M(iE3, ixaVar3.s() + iE3);
                            b(i3, bVar, ixaVar3, z);
                        } else if (next2 == ewaVar8 && ewaVar7.f == null) {
                            int iE4 = iD2 - ewaVar8.e();
                            ixaVar3.M(iE4 - ixaVar3.s(), iE4);
                            b(i3, bVar, ixaVar3, z);
                        } else if (z4 && !ixaVar3.z()) {
                            c(i3, bVar, ixaVar3, z);
                        }
                    }
                } else if (aVar3 == aVar && ixaVar3.w >= 0 && ixaVar3.v >= 0) {
                    if (ixaVar3.j0 == 8 || (ixaVar3.s == 0 && ixaVar3.Z == 0.0f)) {
                        if (!ixaVar3.z() && !ixaVar3.H && z4 && !ixaVar3.z()) {
                            d(i3, ixaVar, bVar, ixaVar3, z);
                        }
                    }
                }
            }
        }
        ixaVar.n = true;
    }

    public static void c(int i, n92.b bVar, ixa ixaVar, boolean z) {
        float f = ixaVar.g0;
        ewa ewaVar = ixaVar.K;
        int iD = ewaVar.f.d();
        ewa ewaVar2 = ixaVar.M;
        int iD2 = ewaVar2.f.d();
        int iE = ewaVar.e() + iD;
        int iE2 = iD2 - ewaVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iS = ixaVar.s();
        int i2 = (iD2 - iD) - iS;
        if (iD > iD2) {
            i2 = (iD - iD2) - iS;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iS;
        if (iD > iD2) {
            i4 = i3 - iS;
        }
        ixaVar.M(i3, i4);
        b(i + 1, bVar, ixaVar, z);
    }

    public static void d(int i, ixa ixaVar, n92.b bVar, ixa ixaVar2, boolean z) {
        float f = ixaVar2.g0;
        ewa ewaVar = ixaVar2.K;
        int iE = ewaVar.e() + ewaVar.f.d();
        ewa ewaVar2 = ixaVar2.M;
        int iD = ewaVar2.f.d() - ewaVar2.e();
        if (iD >= iE) {
            int iS = ixaVar2.s();
            if (ixaVar2.j0 != 8) {
                int i2 = ixaVar2.s;
                if (i2 == 2) {
                    iS = (int) (ixaVar2.g0 * 0.5f * (ixaVar instanceof jxa ? ixaVar.s() : ixaVar.W.s()));
                } else if (i2 == 0) {
                    iS = iD - iE;
                }
                iS = Math.max(ixaVar2.v, iS);
                int i3 = ixaVar2.w;
                if (i3 > 0) {
                    iS = Math.min(i3, iS);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iS)) + 0.5f));
            ixaVar2.M(i4, iS + i4);
            b(i + 1, bVar, ixaVar2, z);
        }
    }

    public static void e(int i, n92.b bVar, ixa ixaVar) {
        float f = ixaVar.h0;
        ewa ewaVar = ixaVar.L;
        int iD = ewaVar.f.d();
        ewa ewaVar2 = ixaVar.N;
        int iD2 = ewaVar2.f.d();
        int iE = ewaVar.e() + iD;
        int iE2 = iD2 - ewaVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iM = ixaVar.m();
        int i2 = (iD2 - iD) - iM;
        if (iD > iD2) {
            i2 = (iD - iD2) - iM;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iM;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iM;
        }
        ixaVar.N(i4, i5);
        g(i + 1, bVar, ixaVar);
    }

    public static void f(int i, ixa ixaVar, n92.b bVar, ixa ixaVar2) {
        float f = ixaVar2.h0;
        ewa ewaVar = ixaVar2.L;
        int iE = ewaVar.e() + ewaVar.f.d();
        ewa ewaVar2 = ixaVar2.N;
        int iD = ewaVar2.f.d() - ewaVar2.e();
        if (iD >= iE) {
            int iM = ixaVar2.m();
            if (ixaVar2.j0 != 8) {
                int i2 = ixaVar2.t;
                if (i2 == 2) {
                    iM = (int) (f * 0.5f * (ixaVar instanceof jxa ? ixaVar.m() : ixaVar.W.m()));
                } else if (i2 == 0) {
                    iM = iD - iE;
                }
                iM = Math.max(ixaVar2.y, iM);
                int i3 = ixaVar2.z;
                if (i3 > 0) {
                    iM = Math.min(i3, iM);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iM)) + 0.5f));
            ixaVar2.N(i4, iM + i4);
            g(i + 1, bVar, ixaVar2);
        }
    }

    public static void g(int i, n92.b bVar, ixa ixaVar) {
        boolean z;
        ewa ewaVar;
        ewa ewaVar2;
        ewa ewaVar3;
        ewa ewaVar4;
        if (ixaVar.o) {
            return;
        }
        if (!(ixaVar instanceof jxa) && ixaVar.B() && a(ixaVar)) {
            jxa.c0(ixaVar, bVar, new n92.a());
        }
        ewa ewaVarK = ixaVar.k(ewa.a.b);
        ewa ewaVarK2 = ixaVar.k(ewa.a.d);
        int iD = ewaVarK.d();
        int iD2 = ewaVarK2.d();
        HashSet<ewa> hashSet = ewaVarK.a;
        ixa.a aVar = ixa.a.c;
        if (hashSet != null && ewaVarK.c) {
            Iterator<ewa> it = hashSet.iterator();
            while (it.hasNext()) {
                ewa next = it.next();
                ixa ixaVar2 = next.d;
                int i2 = i + 1;
                boolean zA = a(ixaVar2);
                ewa ewaVar5 = ixaVar2.L;
                ewa ewaVar6 = ixaVar2.N;
                if (ixaVar2.B() && zA) {
                    jxa.c0(ixaVar2, bVar, new n92.a());
                }
                boolean z2 = (next == ewaVar5 && (ewaVar4 = ewaVar6.f) != null && ewaVar4.c) || (next == ewaVar6 && (ewaVar3 = ewaVar5.f) != null && ewaVar3.c);
                ixa.a aVar2 = ixaVar2.V[1];
                if (aVar2 != aVar || zA) {
                    if (!ixaVar2.B()) {
                        if (next == ewaVar5 && ewaVar6.f == null) {
                            int iE = ewaVar5.e() + iD;
                            ixaVar2.N(iE, ixaVar2.m() + iE);
                            g(i2, bVar, ixaVar2);
                        } else if (next == ewaVar6 && ewaVar5.f == null) {
                            int iE2 = iD - ewaVar6.e();
                            ixaVar2.N(iE2 - ixaVar2.m(), iE2);
                            g(i2, bVar, ixaVar2);
                        } else if (z2 && !ixaVar2.A()) {
                            e(i2, bVar, ixaVar2);
                        }
                    }
                } else if (aVar2 == aVar && ixaVar2.z >= 0 && ixaVar2.y >= 0 && (ixaVar2.j0 == 8 || (ixaVar2.t == 0 && ixaVar2.Z == 0.0f))) {
                    if (!ixaVar2.A() && !ixaVar2.H && z2 && !ixaVar2.A()) {
                        f(i2, ixaVar, bVar, ixaVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (ixaVar instanceof qal) {
            return;
        }
        HashSet<ewa> hashSet2 = ewaVarK2.a;
        if (hashSet2 != null && ewaVarK2.c) {
            Iterator<ewa> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ewa next2 = it2.next();
                ixa ixaVar3 = next2.d;
                int i3 = i + 1;
                boolean zA2 = a(ixaVar3);
                ewa ewaVar7 = ixaVar3.L;
                ewa ewaVar8 = ixaVar3.N;
                if (ixaVar3.B() && zA2) {
                    jxa.c0(ixaVar3, bVar, new n92.a());
                }
                boolean z4 = (next2 == ewaVar7 && (ewaVar2 = ewaVar8.f) != null && ewaVar2.c) || (next2 == ewaVar8 && (ewaVar = ewaVar7.f) != null && ewaVar.c);
                ixa.a aVar3 = ixaVar3.V[1];
                if (aVar3 != aVar || zA2) {
                    if (!ixaVar3.B()) {
                        if (next2 == ewaVar7 && ewaVar8.f == null) {
                            int iE3 = ewaVar7.e() + iD2;
                            ixaVar3.N(iE3, ixaVar3.m() + iE3);
                            g(i3, bVar, ixaVar3);
                        } else if (next2 == ewaVar8 && ewaVar7.f == null) {
                            int iE4 = iD2 - ewaVar8.e();
                            ixaVar3.N(iE4 - ixaVar3.m(), iE4);
                            g(i3, bVar, ixaVar3);
                        } else if (z4 && !ixaVar3.A()) {
                            e(i3, bVar, ixaVar3);
                        }
                    }
                } else if (aVar3 == aVar && ixaVar3.z >= 0 && ixaVar3.y >= 0 && (ixaVar3.j0 == 8 || (ixaVar3.t == 0 && ixaVar3.Z == 0.0f))) {
                    if (!ixaVar3.A() && !ixaVar3.H && z4 && !ixaVar3.A()) {
                        f(i3, ixaVar, bVar, ixaVar3);
                    }
                }
            }
        }
        ewa ewaVarK3 = ixaVar.k(ewa.a.e);
        if (ewaVarK3.a != null && ewaVarK3.c) {
            int iD3 = ewaVarK3.d();
            for (ewa ewaVar9 : ewaVarK3.a) {
                ixa ixaVar4 = ewaVar9.d;
                int i4 = i + 1;
                boolean zA3 = a(ixaVar4);
                ewa ewaVar10 = ixaVar4.O;
                if (ixaVar4.B() && zA3) {
                    jxa.c0(ixaVar4, bVar, new n92.a());
                }
                if (ixaVar4.V[z3 ? 1 : 0] != aVar || zA3) {
                    if (!ixaVar4.B()) {
                        if (ewaVar9 == ewaVar10) {
                            int iE5 = ewaVar9.e() + iD3;
                            if (ixaVar4.F) {
                                int i5 = iE5 - ixaVar4.d0;
                                int i6 = ixaVar4.Y + i5;
                                ixaVar4.c0 = i5;
                                ixaVar4.L.l(i5);
                                ixaVar4.N.l(i6);
                                ewaVar10.l(iE5);
                                z = z3 ? 1 : 0;
                                ixaVar4.m = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            g(i4, bVar, ixaVar4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        ixaVar.o = z3;
    }
}
