package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c3i0 extends x6j0 {
    public zmd k;
    public s82 l;

    @Override // defpackage.x6j0, defpackage.smd
    public final void a(smd smdVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            ixa ixaVar = this.b;
            l(ixaVar.L, ixaVar.N, 1);
            return;
        }
        fqe fqeVar = this.e;
        boolean z = fqeVar.c;
        ixa.a aVar = ixa.a.c;
        if (z && !fqeVar.j && this.d == aVar) {
            ixa ixaVar2 = this.b;
            int i2 = ixaVar2.t;
            if (i2 == 2) {
                ixa ixaVar3 = ixaVar2.W;
                if (ixaVar3 != null) {
                    fqe fqeVar2 = ixaVar3.e.e;
                    if (fqeVar2.j) {
                        fqeVar.d((int) ((fqeVar2.g * ixaVar2.A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                fqe fqeVar3 = ixaVar2.d.e;
                if (fqeVar3.j) {
                    int i3 = ixaVar2.a0;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = fqeVar3.g * ixaVar2.Z;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = fqeVar3.g;
                            f2 = ixaVar2.Z;
                        }
                        fqeVar.d(i);
                    } else {
                        f = fqeVar3.g;
                        f2 = ixaVar2.Z;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    fqeVar.d(i);
                }
            }
        }
        zmd zmdVar = this.h;
        boolean z2 = zmdVar.c;
        ArrayList arrayList = zmdVar.l;
        if (z2) {
            zmd zmdVar2 = this.i;
            boolean z3 = zmdVar2.c;
            ArrayList arrayList2 = zmdVar2.l;
            if (z3) {
                if (zmdVar.j && zmdVar2.j && fqeVar.j) {
                    return;
                }
                if (!fqeVar.j && this.d == aVar) {
                    ixa ixaVar4 = this.b;
                    if (ixaVar4.s == 0 && !ixaVar4.A()) {
                        zmd zmdVar3 = (zmd) arrayList.get(0);
                        zmd zmdVar4 = (zmd) arrayList2.get(0);
                        int i4 = zmdVar3.g + zmdVar.f;
                        int i5 = zmdVar4.g + zmdVar2.f;
                        zmdVar.d(i4);
                        zmdVar2.d(i5);
                        fqeVar.d(i5 - i4);
                        return;
                    }
                }
                if (!fqeVar.j && this.d == aVar && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    zmd zmdVar5 = (zmd) arrayList.get(0);
                    int i6 = (((zmd) arrayList2.get(0)).g + zmdVar2.f) - (zmdVar5.g + zmdVar.f);
                    int i7 = fqeVar.m;
                    if (i6 < i7) {
                        fqeVar.d(i6);
                    } else {
                        fqeVar.d(i7);
                    }
                }
                if (fqeVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    zmd zmdVar6 = (zmd) arrayList.get(0);
                    zmd zmdVar7 = (zmd) arrayList2.get(0);
                    int i8 = zmdVar6.g;
                    int i9 = zmdVar.f + i8;
                    int i10 = zmdVar7.g;
                    int i11 = zmdVar2.f + i10;
                    float f4 = this.b.h0;
                    if (zmdVar6 == zmdVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    zmdVar.d((int) ((((i10 - i8) - fqeVar.g) * f4) + i8 + 0.5f));
                    zmdVar2.d(zmdVar.g + fqeVar.g);
                }
            }
        }
    }

    @Override // defpackage.x6j0
    public final void d() {
        ixa ixaVar;
        ixa ixaVar2;
        ixa ixaVar3;
        ixa ixaVar4;
        zmd zmdVar = this.k;
        ixa ixaVar5 = this.b;
        boolean z = ixaVar5.a;
        fqe fqeVar = this.e;
        if (z) {
            fqeVar.d(ixaVar5.m());
        }
        boolean z2 = fqeVar.j;
        ArrayList arrayList = fqeVar.k;
        ArrayList arrayList2 = fqeVar.l;
        ixa.a aVar = ixa.a.d;
        ixa.a aVar2 = ixa.a.a;
        ixa.a aVar3 = ixa.a.c;
        zmd zmdVar2 = this.i;
        zmd zmdVar3 = this.h;
        if (!z2) {
            ixa ixaVar6 = this.b;
            this.d = ixaVar6.V[1];
            if (ixaVar6.F) {
                this.l = new s82(this);
            }
            ixa.a aVar4 = this.d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (ixaVar4 = this.b.W) != null && ixaVar4.V[1] == aVar2) {
                    int iM = (ixaVar4.m() - this.b.L.e()) - this.b.N.e();
                    x6j0.b(zmdVar3, ixaVar4.e.h, this.b.L.e());
                    x6j0.b(zmdVar2, ixaVar4.e.i, -this.b.N.e());
                    fqeVar.d(iM);
                    return;
                }
                if (aVar4 == aVar2) {
                    fqeVar.d(this.b.m());
                }
            }
        } else if (this.d == aVar && (ixaVar2 = (ixaVar = this.b).W) != null && ixaVar2.V[1] == aVar2) {
            x6j0.b(zmdVar3, ixaVar2.e.h, ixaVar.L.e());
            x6j0.b(zmdVar2, ixaVar2.e.i, -this.b.N.e());
            return;
        }
        boolean z3 = fqeVar.j;
        if (z3) {
            ixa ixaVar7 = this.b;
            if (ixaVar7.a) {
                ewa[] ewaVarArr = ixaVar7.S;
                ewa ewaVar = ewaVarArr[2];
                ewa ewaVar2 = ewaVar.f;
                if (ewaVar2 != null && ewaVarArr[3].f != null) {
                    boolean zA = ixaVar7.A();
                    ixa ixaVar8 = this.b;
                    if (zA) {
                        zmdVar3.f = ixaVar8.S[2].e();
                        zmdVar2.f = -this.b.S[3].e();
                    } else {
                        zmd zmdVarH = x6j0.h(ixaVar8.S[2]);
                        if (zmdVarH != null) {
                            x6j0.b(zmdVar3, zmdVarH, this.b.S[2].e());
                        }
                        zmd zmdVarH2 = x6j0.h(this.b.S[3]);
                        if (zmdVarH2 != null) {
                            x6j0.b(zmdVar2, zmdVarH2, -this.b.S[3].e());
                        }
                        zmdVar3.b = true;
                        zmdVar2.b = true;
                    }
                    ixa ixaVar9 = this.b;
                    if (ixaVar9.F) {
                        x6j0.b(zmdVar, zmdVar3, ixaVar9.d0);
                        return;
                    }
                    return;
                }
                if (ewaVar2 != null) {
                    zmd zmdVarH3 = x6j0.h(ewaVar);
                    if (zmdVarH3 != null) {
                        x6j0.b(zmdVar3, zmdVarH3, this.b.S[2].e());
                        x6j0.b(zmdVar2, zmdVar3, fqeVar.g);
                        ixa ixaVar10 = this.b;
                        if (ixaVar10.F) {
                            x6j0.b(zmdVar, zmdVar3, ixaVar10.d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ewa ewaVar3 = ewaVarArr[3];
                if (ewaVar3.f != null) {
                    zmd zmdVarH4 = x6j0.h(ewaVar3);
                    if (zmdVarH4 != null) {
                        x6j0.b(zmdVar2, zmdVarH4, -this.b.S[3].e());
                        x6j0.b(zmdVar3, zmdVar2, -fqeVar.g);
                    }
                    ixa ixaVar11 = this.b;
                    if (ixaVar11.F) {
                        x6j0.b(zmdVar, zmdVar3, ixaVar11.d0);
                        return;
                    }
                    return;
                }
                ewa ewaVar4 = ewaVarArr[4];
                if (ewaVar4.f != null) {
                    zmd zmdVarH5 = x6j0.h(ewaVar4);
                    if (zmdVarH5 != null) {
                        x6j0.b(zmdVar, zmdVarH5, 0);
                        x6j0.b(zmdVar3, zmdVar, -this.b.d0);
                        x6j0.b(zmdVar2, zmdVar3, fqeVar.g);
                        return;
                    }
                    return;
                }
                if ((ixaVar7 instanceof yil) || ixaVar7.W == null || ixaVar7.k(ewa.a.f).f != null) {
                    return;
                }
                ixa ixaVar12 = this.b;
                x6j0.b(zmdVar3, ixaVar12.W.e.h, ixaVar12.u());
                x6j0.b(zmdVar2, zmdVar3, fqeVar.g);
                ixa ixaVar13 = this.b;
                if (ixaVar13.F) {
                    x6j0.b(zmdVar, zmdVar3, ixaVar13.d0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != aVar3) {
            fqeVar.b(this);
        } else {
            ixa ixaVar14 = this.b;
            int i = ixaVar14.t;
            if (i == 2) {
                ixa ixaVar15 = ixaVar14.W;
                if (ixaVar15 != null) {
                    fqe fqeVar2 = ixaVar15.e.e;
                    arrayList2.add(fqeVar2);
                    fqeVar2.k.add(fqeVar);
                    fqeVar.b = true;
                    arrayList.add(zmdVar3);
                    arrayList.add(zmdVar2);
                }
            } else if (i == 3 && !ixaVar14.A()) {
                ixa ixaVar16 = this.b;
                if (ixaVar16.s != 3) {
                    fqe fqeVar3 = ixaVar16.d.e;
                    arrayList2.add(fqeVar3);
                    fqeVar3.k.add(fqeVar);
                    fqeVar.b = true;
                    arrayList.add(zmdVar3);
                    arrayList.add(zmdVar2);
                }
            }
        }
        ixa ixaVar17 = this.b;
        ewa[] ewaVarArr2 = ixaVar17.S;
        ewa ewaVar5 = ewaVarArr2[2];
        ewa ewaVar6 = ewaVar5.f;
        if (ewaVar6 != null && ewaVarArr2[3].f != null) {
            boolean zA2 = ixaVar17.A();
            ixa ixaVar18 = this.b;
            if (zA2) {
                zmdVar3.f = ixaVar18.S[2].e();
                zmdVar2.f = -this.b.S[3].e();
            } else {
                zmd zmdVarH6 = x6j0.h(ixaVar18.S[2]);
                zmd zmdVarH7 = x6j0.h(this.b.S[3]);
                if (zmdVarH6 != null) {
                    zmdVarH6.b(this);
                }
                if (zmdVarH7 != null) {
                    zmdVarH7.b(this);
                }
                this.j = x6j0.a.b;
            }
            if (this.b.F) {
                c(zmdVar, zmdVar3, 1, this.l);
            }
        } else if (ewaVar6 != null) {
            zmd zmdVarH8 = x6j0.h(ewaVar5);
            if (zmdVarH8 != null) {
                x6j0.b(zmdVar3, zmdVarH8, this.b.S[2].e());
                c(zmdVar2, zmdVar3, 1, fqeVar);
                if (this.b.F) {
                    c(zmdVar, zmdVar3, 1, this.l);
                }
                if (this.d == aVar3) {
                    ixa ixaVar19 = this.b;
                    if (ixaVar19.Z > 0.0f) {
                        vjm vjmVar = ixaVar19.d;
                        if (vjmVar.d == aVar3) {
                            vjmVar.e.k.add(fqeVar);
                            arrayList2.add(this.b.d.e);
                            fqeVar.a = this;
                        }
                    }
                }
            }
        } else {
            ewa ewaVar7 = ewaVarArr2[3];
            if (ewaVar7.f != null) {
                zmd zmdVarH9 = x6j0.h(ewaVar7);
                if (zmdVarH9 != null) {
                    x6j0.b(zmdVar2, zmdVarH9, -this.b.S[3].e());
                    c(zmdVar3, zmdVar2, -1, fqeVar);
                    if (this.b.F) {
                        c(zmdVar, zmdVar3, 1, this.l);
                    }
                }
            } else {
                ewa ewaVar8 = ewaVarArr2[4];
                if (ewaVar8.f != null) {
                    zmd zmdVarH10 = x6j0.h(ewaVar8);
                    if (zmdVarH10 != null) {
                        x6j0.b(zmdVar, zmdVarH10, 0);
                        c(zmdVar3, zmdVar, -1, this.l);
                        c(zmdVar2, zmdVar3, 1, fqeVar);
                    }
                } else if (!(ixaVar17 instanceof yil) && (ixaVar3 = ixaVar17.W) != null) {
                    x6j0.b(zmdVar3, ixaVar3.e.h, ixaVar17.u());
                    c(zmdVar2, zmdVar3, 1, fqeVar);
                    if (this.b.F) {
                        c(zmdVar, zmdVar3, 1, this.l);
                    }
                    if (this.d == aVar3) {
                        ixa ixaVar20 = this.b;
                        if (ixaVar20.Z > 0.0f) {
                            vjm vjmVar2 = ixaVar20.d;
                            if (vjmVar2.d == aVar3) {
                                vjmVar2.e.k.add(fqeVar);
                                arrayList2.add(this.b.d.e);
                                fqeVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            fqeVar.c = true;
        }
    }

    @Override // defpackage.x6j0
    public final void e() {
        zmd zmdVar = this.h;
        if (zmdVar.j) {
            this.b.c0 = zmdVar.g;
        }
    }

    @Override // defpackage.x6j0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.x6j0
    public final boolean k() {
        return this.d != ixa.a.c || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        zmd zmdVar = this.h;
        zmdVar.c();
        zmdVar.j = false;
        zmd zmdVar2 = this.i;
        zmdVar2.c();
        zmdVar2.j = false;
        zmd zmdVar3 = this.k;
        zmdVar3.c();
        zmdVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.l0;
    }
}
