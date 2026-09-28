package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ymd {
    public final jxa a;
    public final jxa d;
    public n92.b f;
    public final n92.a g;
    public final ArrayList<v160> h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList<x6j0> e = new ArrayList<>();

    public ymd(jxa jxaVar) {
        new ArrayList();
        this.f = null;
        this.g = new n92.a();
        this.h = new ArrayList<>();
        this.a = jxaVar;
        this.d = jxaVar;
    }

    public final void a(zmd zmdVar, int i, ArrayList arrayList, v160 v160Var) {
        x6j0 x6j0Var = zmdVar.d;
        v160 v160Var2 = x6j0Var.c;
        zmd zmdVar2 = x6j0Var.i;
        zmd zmdVar3 = x6j0Var.h;
        if (v160Var2 == null) {
            jxa jxaVar = this.a;
            if (x6j0Var == jxaVar.d || x6j0Var == jxaVar.e) {
                return;
            }
            if (v160Var == null) {
                v160Var = new v160();
                v160Var.a = null;
                v160Var.b = new ArrayList<>();
                v160Var.a = x6j0Var;
                arrayList.add(v160Var);
            }
            x6j0Var.c = v160Var;
            v160Var.b.add(x6j0Var);
            ArrayList arrayList2 = zmdVar3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                smd smdVar = (smd) obj;
                if (smdVar instanceof zmd) {
                    a((zmd) smdVar, i, arrayList, v160Var);
                }
            }
            ArrayList arrayList3 = zmdVar2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                smd smdVar2 = (smd) obj2;
                if (smdVar2 instanceof zmd) {
                    a((zmd) smdVar2, i, arrayList, v160Var);
                }
            }
            if (i == 1 && (x6j0Var instanceof c3i0)) {
                ArrayList arrayList4 = ((c3i0) x6j0Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    smd smdVar3 = (smd) obj3;
                    if (smdVar3 instanceof zmd) {
                        a((zmd) smdVar3, i, arrayList, v160Var);
                    }
                }
            }
            ArrayList arrayList5 = zmdVar3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((zmd) obj4, i, arrayList, v160Var);
            }
            ArrayList arrayList6 = zmdVar2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((zmd) obj5, i, arrayList, v160Var);
            }
            if (i == 1 && (x6j0Var instanceof c3i0)) {
                ArrayList arrayList7 = ((c3i0) x6j0Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((zmd) obj6, i, arrayList, v160Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0211  */
    public final void b(jxa jxaVar) {
        int iS;
        ixa.a aVar;
        ixa.a aVar2;
        ixa.a aVar3;
        ixa.a aVar4;
        ixa.a aVar5;
        ixa.a aVar6;
        int i;
        ixa.a aVar7;
        ixa.a aVar8;
        ArrayList<ixa> arrayList = jxaVar.v0;
        int size = arrayList.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            ixa ixaVar = arrayList.get(i2);
            i2++;
            ixa ixaVar2 = ixaVar;
            ixa.a[] aVarArr = ixaVar2.V;
            ewa[] ewaVarArr = ixaVar2.S;
            ewa ewaVar = ixaVar2.N;
            ewa ewaVar2 = ixaVar2.L;
            ewa ewaVar3 = ixaVar2.M;
            ewa ewaVar4 = ixaVar2.K;
            ixa.a aVar9 = aVarArr[c];
            ixa.a aVar10 = aVarArr[1];
            if (ixaVar2.j0 == 8) {
                ixaVar2.a = true;
            } else {
                float f = ixaVar2.x;
                char c2 = c;
                ixa.a aVar11 = ixa.a.c;
                if (f < 1.0f && aVar9 == aVar11) {
                    ixaVar2.s = 2;
                }
                float f2 = ixaVar2.A;
                if (f2 < 1.0f && aVar10 == aVar11) {
                    ixaVar2.t = 2;
                }
                float f3 = ixaVar2.Z;
                ArrayList<ixa> arrayList2 = arrayList;
                ixa.a aVar12 = ixa.a.a;
                int i3 = size;
                ixa.a aVar13 = ixa.a.b;
                if (f3 > 0.0f) {
                    if (aVar9 == aVar11 && (aVar10 == aVar13 || aVar10 == aVar12)) {
                        ixaVar2.s = 3;
                    } else if (aVar10 == aVar11 && (aVar9 == aVar13 || aVar9 == aVar12)) {
                        ixaVar2.t = 3;
                    } else if (aVar9 == aVar11 && aVar10 == aVar11) {
                        if (ixaVar2.s == 0) {
                            ixaVar2.s = 3;
                        }
                        if (ixaVar2.t == 0) {
                            ixaVar2.t = 3;
                        }
                    }
                }
                if (aVar9 == aVar11 && ixaVar2.s == 1 && (ewaVar4.f == null || ewaVar3.f == null)) {
                    aVar9 = aVar13;
                }
                if (aVar10 == aVar11 && ixaVar2.t == 1 && (ewaVar2.f == null || ewaVar.f == null)) {
                    aVar10 = aVar13;
                }
                vjm vjmVar = ixaVar2.d;
                vjmVar.d = aVar9;
                int i4 = ixaVar2.s;
                vjmVar.a = i4;
                c3i0 c3i0Var = ixaVar2.e;
                c3i0Var.d = aVar10;
                int i5 = ixaVar2.t;
                c3i0Var.a = i5;
                ixa.a aVar14 = ixa.a.d;
                if ((aVar9 == aVar14 || aVar9 == aVar12 || aVar9 == aVar13) && (aVar10 == aVar14 || aVar10 == aVar12 || aVar10 == aVar13)) {
                    ixa.a aVar15 = aVar10;
                    int iS2 = ixaVar2.s();
                    if (aVar9 == aVar14) {
                        iS = (jxaVar.s() - ewaVar4.g) - ewaVar3.g;
                        aVar = aVar12;
                    } else {
                        iS = iS2;
                        aVar = aVar9;
                    }
                    int iM = ixaVar2.m();
                    if (aVar15 == aVar14) {
                        iM = (jxaVar.m() - ewaVar2.g) - ewaVar.g;
                        aVar2 = aVar12;
                    } else {
                        aVar2 = aVar15;
                    }
                    f(ixaVar2, aVar, iS, aVar2, iM);
                    ixaVar2.d.e.d(ixaVar2.s());
                    ixaVar2.e.e.d(ixaVar2.m());
                    ixaVar2.a = true;
                } else {
                    if (aVar9 != aVar11 || (aVar10 != aVar13 && aVar10 != aVar12)) {
                        aVar3 = aVar13;
                        aVar4 = aVar10;
                        aVar5 = aVar12;
                    } else if (i4 == 3) {
                        if (aVar10 == aVar13) {
                            f(ixaVar2, aVar13, 0, aVar13, 0);
                        }
                        int iM2 = ixaVar2.m();
                        f(ixaVar2, aVar12, (int) ((iM2 * ixaVar2.Z) + 0.5f), aVar12, iM2);
                        ixaVar2.d.e.d(ixaVar2.s());
                        ixaVar2.e.e.d(ixaVar2.m());
                        ixaVar2.a = true;
                    } else {
                        aVar5 = aVar12;
                        if (i4 == 1) {
                            f(ixaVar2, aVar13, 0, aVar10, 0);
                            ixaVar2.d.e.m = ixaVar2.s();
                        } else {
                            aVar4 = aVar10;
                            if (i4 == 2) {
                                ixa.a aVar16 = jxaVar.V[c2];
                                if (aVar16 == aVar5 || aVar16 == aVar14) {
                                    f(ixaVar2, aVar5, (int) ((f * jxaVar.s()) + 0.5f), aVar4, ixaVar2.m());
                                    ixaVar2.d.e.d(ixaVar2.s());
                                    ixaVar2.e.e.d(ixaVar2.m());
                                    ixaVar2.a = true;
                                } else {
                                    aVar3 = aVar13;
                                }
                            } else if (ewaVarArr[c2].f == null || ewaVarArr[1].f == null) {
                                f(ixaVar2, aVar13, 0, aVar4, 0);
                                ixaVar2.d.e.d(ixaVar2.s());
                                ixaVar2.e.e.d(ixaVar2.m());
                                ixaVar2.a = true;
                            } else {
                                aVar3 = aVar13;
                            }
                        }
                    }
                    if (aVar4 != aVar11 || (aVar9 != aVar3 && aVar9 != aVar5)) {
                        aVar6 = aVar4;
                        i = 1;
                        aVar7 = aVar3;
                        aVar8 = aVar5;
                    } else if (i5 == 3) {
                        if (aVar9 == aVar3) {
                            f(ixaVar2, aVar3, 0, aVar3, 0);
                        }
                        int iS3 = ixaVar2.s();
                        float f4 = ixaVar2.Z;
                        if (ixaVar2.a0 == -1) {
                            f4 = 1.0f / f4;
                        }
                        f(ixaVar2, aVar5, iS3, aVar5, (int) ((iS3 * f4) + 0.5f));
                        ixaVar2.d.e.d(ixaVar2.s());
                        ixaVar2.e.e.d(ixaVar2.m());
                        ixaVar2.a = true;
                    } else {
                        aVar6 = aVar4;
                        aVar7 = aVar3;
                        aVar8 = aVar5;
                        if (i5 == 1) {
                            f(ixaVar2, aVar9, 0, aVar7, 0);
                            ixaVar2.e.e.m = ixaVar2.m();
                        } else if (i5 == 2) {
                            ixa.a aVar17 = jxaVar.V[1];
                            if (aVar17 == aVar8 || aVar17 == aVar14) {
                                f(ixaVar2, aVar9, ixaVar2.s(), aVar8, (int) ((f2 * jxaVar.m()) + 0.5f));
                                ixaVar2.d.e.d(ixaVar2.s());
                                ixaVar2.e.e.d(ixaVar2.m());
                                ixaVar2.a = true;
                            } else {
                                i = 1;
                            }
                        } else if (ewaVarArr[2].f == null || ewaVarArr[3].f == null) {
                            f(ixaVar2, aVar7, 0, aVar6, 0);
                            ixaVar2.d.e.d(ixaVar2.s());
                            ixaVar2.e.e.d(ixaVar2.m());
                            ixaVar2.a = true;
                        } else {
                            i = 1;
                        }
                    }
                    if (aVar9 == aVar11 && aVar6 == aVar11) {
                        if (i4 == i || i5 == i) {
                            f(ixaVar2, aVar7, 0, aVar7, 0);
                            ixaVar2.d.e.m = ixaVar2.s();
                            ixaVar2.e.e.m = ixaVar2.m();
                        } else if (i5 == 2 && i4 == 2) {
                            ixa.a[] aVarArr2 = jxaVar.V;
                            if (aVarArr2[c2] == aVar8 && aVarArr2[i] == aVar8) {
                                f(ixaVar2, aVar8, (int) ((f * jxaVar.s()) + 0.5f), aVar8, (int) ((f2 * jxaVar.m()) + 0.5f));
                                ixaVar2.d.e.d(ixaVar2.s());
                                ixaVar2.e.e.d(ixaVar2.m());
                                ixaVar2.a = true;
                            }
                        }
                    }
                }
                c = c2;
                arrayList = arrayList2;
                size = i3;
                i2 = i2;
            }
        }
    }

    public final void c() {
        ArrayList<x6j0> arrayList = this.e;
        arrayList.clear();
        jxa jxaVar = this.d;
        jxaVar.d.f();
        jxaVar.e.f();
        arrayList.add(jxaVar.d);
        arrayList.add(jxaVar.e);
        ArrayList<ixa> arrayList2 = jxaVar.v0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            ixa ixaVar = arrayList2.get(i);
            i++;
            ixa ixaVar2 = ixaVar;
            if (ixaVar2 instanceof qal) {
                ral ralVar = new ral(ixaVar2);
                ixaVar2.d.f();
                ixaVar2.e.f();
                ralVar.f = ((qal) ixaVar2).z0;
                arrayList.add(ralVar);
            } else {
                if (ixaVar2.z()) {
                    if (ixaVar2.b == null) {
                        ixaVar2.b = new hw6(ixaVar2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ixaVar2.b);
                } else {
                    arrayList.add(ixaVar2.d);
                }
                if (ixaVar2.A()) {
                    if (ixaVar2.c == null) {
                        ixaVar2.c = new hw6(ixaVar2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ixaVar2.c);
                } else {
                    arrayList.add(ixaVar2.e);
                }
                if (ixaVar2 instanceof yil) {
                    arrayList.add(new xil(ixaVar2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            x6j0 x6j0Var = arrayList.get(i2);
            i2++;
            x6j0Var.f();
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            x6j0 x6j0Var2 = arrayList.get(i3);
            i3++;
            x6j0 x6j0Var3 = x6j0Var2;
            if (x6j0Var3.b != jxaVar) {
                x6j0Var3.d();
            }
        }
        ArrayList<v160> arrayList3 = this.h;
        arrayList3.clear();
        jxa jxaVar2 = this.a;
        e(jxaVar2.d, 0, arrayList3);
        e(jxaVar2.e, 1, arrayList3);
        this.b = false;
    }

    public final int d(jxa jxaVar, int i) {
        ArrayList<v160> arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList<v160> arrayList2 = this.h;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            x6j0 x6j0Var = arrayList2.get(i3).a;
            if (!(x6j0Var instanceof hw6) ? !(i != 0 ? (x6j0Var instanceof c3i0) : (x6j0Var instanceof vjm)) : ((hw6) x6j0Var).f != i) {
                zmd zmdVar = (i == 0 ? jxaVar.d : jxaVar.e).h;
                zmd zmdVar2 = (i == 0 ? jxaVar.d : jxaVar.e).i;
                zmd zmdVar3 = x6j0Var.h;
                zmd zmdVar4 = x6j0Var.i;
                boolean zContains = zmdVar3.l.contains(zmdVar);
                boolean zContains2 = zmdVar4.l.contains(zmdVar2);
                long j4 = x6j0Var.j();
                if (zContains && zContains2) {
                    long jB = v160.b(zmdVar3, j3);
                    arrayList = arrayList2;
                    long jA = v160.a(zmdVar4, j3);
                    long j5 = jB - j4;
                    int i4 = zmdVar4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = zmdVar3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    ixa ixaVar = x6j0Var.b;
                    if (i == 0) {
                        f = ixaVar.g0;
                    } else if (i == 1) {
                        f = ixaVar.h0;
                    } else {
                        ixaVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) zmdVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) hxa.a(1.0f, f, f2, 0.5f)))) - ((long) zmdVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(v160.b(zmdVar3, zmdVar3.f), ((long) zmdVar3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-v160.a(zmdVar4, zmdVar4.f), ((long) (-zmdVar4.f)) + j4);
                    } else {
                        j = (x6j0Var.j() + ((long) zmdVar3.f)) - ((long) zmdVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public final void e(x6j0 x6j0Var, int i, ArrayList<v160> arrayList) {
        zmd zmdVar = x6j0Var.h;
        zmd zmdVar2 = x6j0Var.i;
        ArrayList arrayList2 = zmdVar.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            smd smdVar = (smd) obj;
            if (smdVar instanceof zmd) {
                a((zmd) smdVar, i, arrayList, null);
            } else if (smdVar instanceof x6j0) {
                a(((x6j0) smdVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = zmdVar2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            smd smdVar2 = (smd) obj2;
            if (smdVar2 instanceof zmd) {
                a((zmd) smdVar2, i, arrayList, null);
            } else if (smdVar2 instanceof x6j0) {
                a(((x6j0) smdVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((c3i0) x6j0Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                smd smdVar3 = (smd) obj3;
                if (smdVar3 instanceof zmd) {
                    a((zmd) smdVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(ixa ixaVar, ixa.a aVar, int i, ixa.a aVar2, int i2) {
        n92.a aVar3 = this.g;
        aVar3.a = aVar;
        aVar3.b = aVar2;
        aVar3.c = i;
        aVar3.d = i2;
        this.f.b(ixaVar, aVar3);
        ixaVar.T(aVar3.e);
        ixaVar.O(aVar3.f);
        ixaVar.F = aVar3.h;
        ixaVar.K(aVar3.g);
    }

    public final void g() {
        s82 s82Var;
        ymd ymdVar = this;
        ArrayList<ixa> arrayList = ymdVar.a.v0;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ixa ixaVar = arrayList.get(i);
            if (!ixaVar.a) {
                ixa.a[] aVarArr = ixaVar.V;
                ixa.a aVar = aVarArr[c];
                ixa.a aVar2 = aVarArr[1];
                int i3 = ixaVar.s;
                int i4 = ixaVar.t;
                ixa.a aVar3 = ixa.a.c;
                ixa.a aVar4 = ixa.a.b;
                char c2 = (aVar == aVar4 || (aVar == aVar3 && i3 == 1)) ? (char) 1 : c;
                char c3 = (aVar2 == aVar4 || (aVar2 == aVar3 && i4 == 1)) ? (char) 1 : c;
                fqe fqeVar = ixaVar.d.e;
                boolean z = fqeVar.j;
                fqe fqeVar2 = ixaVar.e.e;
                boolean z2 = fqeVar2.j;
                char c4 = c2;
                ixa.a aVar5 = ixa.a.a;
                if (z && z2) {
                    ymdVar.f(ixaVar, aVar5, fqeVar.g, aVar5, fqeVar2.g);
                    ixaVar.a = true;
                } else if (z && c3 != 0) {
                    f(ixaVar, aVar5, fqeVar.g, aVar4, fqeVar2.g);
                    c3i0 c3i0Var = ixaVar.e;
                    if (aVar2 == aVar3) {
                        c3i0Var.e.m = ixaVar.m();
                    } else {
                        c3i0Var.e.d(ixaVar.m());
                        ixaVar.a = true;
                    }
                } else if (z2 && c4 != 0) {
                    f(ixaVar, aVar4, fqeVar.g, aVar5, fqeVar2.g);
                    vjm vjmVar = ixaVar.d;
                    if (aVar == aVar3) {
                        vjmVar.e.m = ixaVar.s();
                    } else {
                        vjmVar.e.d(ixaVar.s());
                        ixaVar.a = true;
                    }
                }
                if (ixaVar.a && (s82Var = ixaVar.e.l) != null) {
                    s82Var.d(ixaVar.d0);
                }
                c = 0;
                ymdVar = this;
            }
            i = i2;
        }
    }
}
