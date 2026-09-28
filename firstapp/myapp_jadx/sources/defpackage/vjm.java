package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vjm extends x6j0 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // defpackage.x6j0, defpackage.smd
    public final void a(smd smdVar) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (this.j.ordinal() == 3) {
            ixa ixaVar = this.b;
            l(ixaVar.K, ixaVar.M, 0);
            return;
        }
        fqe fqeVar = this.e;
        boolean z = fqeVar.j;
        ixa.a aVar = ixa.a.c;
        zmd zmdVar = this.h;
        zmd zmdVar2 = this.i;
        if (z || this.d != aVar) {
            f = 0.5f;
        } else {
            ixa ixaVar2 = this.b;
            int i3 = ixaVar2.s;
            if (i3 == 2) {
                f = 0.5f;
                ixa ixaVar3 = ixaVar2.W;
                if (ixaVar3 != null) {
                    fqe fqeVar2 = ixaVar3.d.e;
                    if (fqeVar2.j) {
                        fqeVar.d((int) ((fqeVar2.g * ixaVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = ixaVar2.t;
                if (i4 == 0 || i4 == 3) {
                    c3i0 c3i0Var = ixaVar2.e;
                    zmd zmdVar3 = c3i0Var.h;
                    zmd zmdVar4 = c3i0Var.i;
                    boolean z2 = ixaVar2.K.f != null;
                    boolean z3 = ixaVar2.L.f != null;
                    boolean z4 = ixaVar2.M.f != null;
                    boolean z5 = ixaVar2.N.f != null;
                    f = 0.5f;
                    int i5 = ixaVar2.a0;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = ixaVar2.Z;
                        boolean z6 = zmdVar3.j;
                        ArrayList arrayList = zmdVar3.l;
                        int[] iArr = k;
                        if (z6 && zmdVar4.j) {
                            if (zmdVar.c && zmdVar2.c) {
                                m(iArr, ((zmd) zmdVar.l.get(0)).g + zmdVar.f, ((zmd) zmdVar2.l.get(0)).g - zmdVar2.f, zmdVar3.g + zmdVar3.f, zmdVar4.g - zmdVar4.f, f5, i5);
                                fqeVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (zmdVar.j && zmdVar2.j) {
                            if (!zmdVar3.c || !zmdVar4.c) {
                                return;
                            }
                            m(iArr, zmdVar.g + zmdVar.f, zmdVar2.g - zmdVar2.f, ((zmd) arrayList.get(0)).g + zmdVar3.f, ((zmd) zmdVar4.l.get(0)).g - zmdVar4.f, f5, i5);
                            fqeVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!zmdVar.c || !zmdVar2.c || !zmdVar3.c || !zmdVar4.c) {
                            return;
                        }
                        m(iArr, ((zmd) zmdVar.l.get(0)).g + zmdVar.f, ((zmd) zmdVar2.l.get(0)).g - zmdVar2.f, ((zmd) arrayList.get(0)).g + zmdVar3.f, ((zmd) zmdVar4.l.get(0)).g - zmdVar4.f, f5, i5);
                        fqeVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!zmdVar.c || !zmdVar2.c) {
                            return;
                        }
                        float f6 = ixaVar2.Z;
                        int i6 = ((zmd) zmdVar.l.get(0)).g + zmdVar.f;
                        int i7 = ((zmd) zmdVar2.l.get(0)).g - zmdVar2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            fqeVar.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            fqeVar.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!zmdVar3.c || !zmdVar4.c) {
                            return;
                        }
                        float f7 = ixaVar2.Z;
                        int i10 = ((zmd) zmdVar3.l.get(0)).g + zmdVar3.f;
                        int i11 = ((zmd) zmdVar4.l.get(0)).g - zmdVar4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            fqeVar.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            fqeVar.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            fqeVar.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = ixaVar2.a0;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = ixaVar2.e.e.g / ixaVar2.Z;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = ixaVar2.e.e.g;
                            f3 = ixaVar2.Z;
                        }
                        fqeVar.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = ixaVar2.e.e.g;
                        f3 = ixaVar2.Z;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    fqeVar.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = zmdVar.c;
        ArrayList arrayList2 = zmdVar.l;
        if (z7) {
            boolean z8 = zmdVar2.c;
            ArrayList arrayList3 = zmdVar2.l;
            if (z8) {
                if (zmdVar.j && zmdVar2.j && fqeVar.j) {
                    return;
                }
                if (!fqeVar.j && this.d == aVar) {
                    ixa ixaVar4 = this.b;
                    if (ixaVar4.s == 0 && !ixaVar4.z()) {
                        zmd zmdVar5 = (zmd) arrayList2.get(0);
                        zmd zmdVar6 = (zmd) arrayList3.get(0);
                        int i14 = zmdVar5.g + zmdVar.f;
                        int i15 = zmdVar6.g + zmdVar2.f;
                        zmdVar.d(i14);
                        zmdVar2.d(i15);
                        fqeVar.d(i15 - i14);
                        return;
                    }
                }
                if (!fqeVar.j && this.d == aVar && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((zmd) arrayList3.get(0)).g + zmdVar2.f) - (((zmd) arrayList2.get(0)).g + zmdVar.f), fqeVar.m);
                    ixa ixaVar5 = this.b;
                    int i16 = ixaVar5.w;
                    int iMax = Math.max(ixaVar5.v, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    fqeVar.d(iMax);
                }
                if (fqeVar.j) {
                    zmd zmdVar7 = (zmd) arrayList2.get(0);
                    zmd zmdVar8 = (zmd) arrayList3.get(0);
                    int i17 = zmdVar7.g;
                    int i18 = zmdVar.f + i17;
                    int i19 = zmdVar8.g;
                    int i20 = zmdVar2.f + i19;
                    float f8 = this.b.g0;
                    if (zmdVar7 == zmdVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    zmdVar.d((int) ((((i19 - i17) - fqeVar.g) * f8) + i17 + f));
                    zmdVar2.d(zmdVar.g + fqeVar.g);
                }
            }
        }
    }

    @Override // defpackage.x6j0
    public final void d() {
        ixa ixaVar;
        ixa ixaVar2;
        ixa.a aVar;
        ixa ixaVar3;
        ixa ixaVar4;
        ixa.a aVar2;
        ixa ixaVar5 = this.b;
        boolean z = ixaVar5.a;
        fqe fqeVar = this.e;
        if (z) {
            fqeVar.d(ixaVar5.s());
        }
        boolean z2 = fqeVar.j;
        ArrayList arrayList = fqeVar.k;
        ArrayList arrayList2 = fqeVar.l;
        ixa.a aVar3 = ixa.a.d;
        ixa.a aVar4 = ixa.a.c;
        ixa.a aVar5 = ixa.a.a;
        zmd zmdVar = this.i;
        zmd zmdVar2 = this.h;
        if (!z2) {
            ixa ixaVar6 = this.b;
            ixa.a aVar6 = ixaVar6.V[0];
            this.d = aVar6;
            if (aVar6 != aVar4) {
                if (aVar6 == aVar3 && (ixaVar4 = ixaVar6.W) != null && ((aVar2 = ixaVar4.V[0]) == aVar5 || aVar2 == aVar3)) {
                    int iS = (ixaVar4.s() - this.b.K.e()) - this.b.M.e();
                    x6j0.b(zmdVar2, ixaVar4.d.h, this.b.K.e());
                    x6j0.b(zmdVar, ixaVar4.d.i, -this.b.M.e());
                    fqeVar.d(iS);
                    return;
                }
                if (aVar6 == aVar5) {
                    fqeVar.d(ixaVar6.s());
                }
            }
        } else if (this.d == aVar3 && (ixaVar2 = (ixaVar = this.b).W) != null && ((aVar = ixaVar2.V[0]) == aVar5 || aVar == aVar3)) {
            x6j0.b(zmdVar2, ixaVar2.d.h, ixaVar.K.e());
            x6j0.b(zmdVar, ixaVar2.d.i, -this.b.M.e());
            return;
        }
        if (fqeVar.j) {
            ixa ixaVar7 = this.b;
            if (ixaVar7.a) {
                ewa[] ewaVarArr = ixaVar7.S;
                ewa ewaVar = ewaVarArr[0];
                ewa ewaVar2 = ewaVar.f;
                if (ewaVar2 != null && ewaVarArr[1].f != null) {
                    boolean z3 = ixaVar7.z();
                    ixa ixaVar8 = this.b;
                    if (z3) {
                        zmdVar2.f = ixaVar8.S[0].e();
                        zmdVar.f = -this.b.S[1].e();
                        return;
                    }
                    zmd zmdVarH = x6j0.h(ixaVar8.S[0]);
                    if (zmdVarH != null) {
                        x6j0.b(zmdVar2, zmdVarH, this.b.S[0].e());
                    }
                    zmd zmdVarH2 = x6j0.h(this.b.S[1]);
                    if (zmdVarH2 != null) {
                        x6j0.b(zmdVar, zmdVarH2, -this.b.S[1].e());
                    }
                    zmdVar2.b = true;
                    zmdVar.b = true;
                    return;
                }
                if (ewaVar2 != null) {
                    zmd zmdVarH3 = x6j0.h(ewaVar);
                    if (zmdVarH3 != null) {
                        x6j0.b(zmdVar2, zmdVarH3, this.b.S[0].e());
                        x6j0.b(zmdVar, zmdVar2, fqeVar.g);
                        return;
                    }
                    return;
                }
                ewa ewaVar3 = ewaVarArr[1];
                if (ewaVar3.f != null) {
                    zmd zmdVarH4 = x6j0.h(ewaVar3);
                    if (zmdVarH4 != null) {
                        x6j0.b(zmdVar, zmdVarH4, -this.b.S[1].e());
                        x6j0.b(zmdVar2, zmdVar, -fqeVar.g);
                        return;
                    }
                    return;
                }
                if ((ixaVar7 instanceof yil) || ixaVar7.W == null || ixaVar7.k(ewa.a.f).f != null) {
                    return;
                }
                ixa ixaVar9 = this.b;
                x6j0.b(zmdVar2, ixaVar9.W.d.h, ixaVar9.t());
                x6j0.b(zmdVar, zmdVar2, fqeVar.g);
                return;
            }
        }
        if (this.d == aVar4) {
            ixa ixaVar10 = this.b;
            int i = ixaVar10.s;
            if (i == 2) {
                ixa ixaVar11 = ixaVar10.W;
                if (ixaVar11 != null) {
                    fqe fqeVar2 = ixaVar11.e.e;
                    arrayList2.add(fqeVar2);
                    fqeVar2.k.add(fqeVar);
                    fqeVar.b = true;
                    arrayList.add(zmdVar2);
                    arrayList.add(zmdVar);
                }
            } else if (i == 3) {
                if (ixaVar10.t == 3) {
                    zmdVar2.a = this;
                    zmdVar.a = this;
                    c3i0 c3i0Var = ixaVar10.e;
                    c3i0Var.h.a = this;
                    c3i0Var.i.a = this;
                    fqeVar.a = this;
                    if (ixaVar10.A()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(fqeVar);
                        c3i0 c3i0Var2 = this.b.e;
                        c3i0Var2.e.a = this;
                        arrayList2.add(c3i0Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(fqeVar);
                        this.b.e.i.k.add(fqeVar);
                    } else {
                        boolean z4 = this.b.z();
                        ixa ixaVar12 = this.b;
                        if (z4) {
                            ixaVar12.e.e.l.add(fqeVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            ixaVar12.e.e.l.add(fqeVar);
                        }
                    }
                } else {
                    fqe fqeVar3 = ixaVar10.e.e;
                    arrayList2.add(fqeVar3);
                    fqeVar3.k.add(fqeVar);
                    this.b.e.h.k.add(fqeVar);
                    this.b.e.i.k.add(fqeVar);
                    fqeVar.b = true;
                    arrayList.add(zmdVar2);
                    arrayList.add(zmdVar);
                    zmdVar2.l.add(fqeVar);
                    zmdVar.l.add(fqeVar);
                }
            }
        }
        ixa ixaVar13 = this.b;
        ewa[] ewaVarArr2 = ixaVar13.S;
        ewa ewaVar4 = ewaVarArr2[0];
        ewa ewaVar5 = ewaVar4.f;
        if (ewaVar5 != null && ewaVarArr2[1].f != null) {
            boolean z5 = ixaVar13.z();
            ixa ixaVar14 = this.b;
            if (z5) {
                zmdVar2.f = ixaVar14.S[0].e();
                zmdVar.f = -this.b.S[1].e();
                return;
            }
            zmd zmdVarH5 = x6j0.h(ixaVar14.S[0]);
            zmd zmdVarH6 = x6j0.h(this.b.S[1]);
            if (zmdVarH5 != null) {
                zmdVarH5.b(this);
            }
            if (zmdVarH6 != null) {
                zmdVarH6.b(this);
            }
            this.j = x6j0.a.b;
            return;
        }
        if (ewaVar5 != null) {
            zmd zmdVarH7 = x6j0.h(ewaVar4);
            if (zmdVarH7 != null) {
                x6j0.b(zmdVar2, zmdVarH7, this.b.S[0].e());
                c(zmdVar, zmdVar2, 1, fqeVar);
                return;
            }
            return;
        }
        ewa ewaVar6 = ewaVarArr2[1];
        if (ewaVar6.f != null) {
            zmd zmdVarH8 = x6j0.h(ewaVar6);
            if (zmdVarH8 != null) {
                x6j0.b(zmdVar, zmdVarH8, -this.b.S[1].e());
                c(zmdVar2, zmdVar, -1, fqeVar);
                return;
            }
            return;
        }
        if ((ixaVar13 instanceof yil) || (ixaVar3 = ixaVar13.W) == null) {
            return;
        }
        x6j0.b(zmdVar2, ixaVar3.d.h, ixaVar13.t());
        c(zmdVar, zmdVar2, 1, fqeVar);
    }

    @Override // defpackage.x6j0
    public final void e() {
        zmd zmdVar = this.h;
        if (zmdVar.j) {
            this.b.b0 = zmdVar.g;
        }
    }

    @Override // defpackage.x6j0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.x6j0
    public final boolean k() {
        return this.d != ixa.a.c || this.b.s == 0;
    }

    public final void n() {
        this.g = false;
        zmd zmdVar = this.h;
        zmdVar.c();
        zmdVar.j = false;
        zmd zmdVar2 = this.i;
        zmdVar2.c();
        zmdVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.l0;
    }
}
