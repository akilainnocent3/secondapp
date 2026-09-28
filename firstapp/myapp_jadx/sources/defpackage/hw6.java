package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hw6 extends x6j0 {
    public final ArrayList<x6j0> k;
    public int l;

    public hw6(ixa ixaVar, int i) {
        ixa ixaVar2;
        super(ixaVar);
        ArrayList<x6j0> arrayList = new ArrayList<>();
        this.k = arrayList;
        this.f = i;
        ixa ixaVar3 = this.b;
        ixa ixaVarO = ixaVar3.o(i);
        while (true) {
            ixaVar2 = ixaVar3;
            ixaVar3 = ixaVarO;
            if (ixaVar3 == null) {
                break;
            } else {
                ixaVarO = ixaVar3.o(this.f);
            }
        }
        this.b = ixaVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? ixaVar2.d : i2 == 1 ? ixaVar2.e : null);
        ixa ixaVarN = ixaVar2.n(this.f);
        while (ixaVarN != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? ixaVarN.d : i3 == 1 ? ixaVarN.e : null);
            ixaVarN = ixaVarN.n(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            x6j0 x6j0Var = arrayList.get(i4);
            i4++;
            x6j0 x6j0Var2 = x6j0Var;
            int i5 = this.f;
            if (i5 == 0) {
                x6j0Var2.b.b = this;
            } else if (i5 == 1) {
                x6j0Var2.b.c = this;
            }
        }
        if (this.f == 0 && ((jxa) this.b.W).A0 && arrayList.size() > 1) {
            this.b = ((x6j0) rh6.a(1, arrayList)).b;
        }
        int i6 = this.f;
        ixa ixaVar4 = this.b;
        this.l = i6 == 0 ? ixaVar4.m0 : ixaVar4.n0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6 A[ADDED_TO_REGION] */
    @Override // defpackage.x6j0, defpackage.smd
    public final void a(smd smdVar) {
        int i;
        int i2;
        ixa.a aVar;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        zmd zmdVar = this.h;
        if (zmdVar.j) {
            zmd zmdVar2 = this.i;
            if (zmdVar2.j) {
                ixa ixaVar = this.b.W;
                boolean z2 = ixaVar instanceof jxa ? ((jxa) ixaVar).A0 : false;
                int i13 = zmdVar2.g - zmdVar.g;
                ArrayList<x6j0> arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (arrayList.get(i14).b.j0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (arrayList.get(i16).b.j0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    aVar = ixa.a.c;
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        x6j0 x6j0Var = arrayList.get(i18);
                        boolean z3 = z2;
                        ixa ixaVar2 = x6j0Var.b;
                        int i21 = i17;
                        if (ixaVar2.j0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += x6j0Var.h.f;
                            }
                            fqe fqeVar = x6j0Var.e;
                            int i22 = fqeVar.g;
                            boolean z4 = x6j0Var.d != aVar;
                            if (z4) {
                                int i23 = this.f;
                                if (i23 == 0 && !ixaVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !ixaVar2.e.e.j) {
                                    return;
                                } else {
                                    i11 = i5;
                                }
                            } else {
                                i11 = i5;
                                if (x6j0Var.a == 1 && i21 == 0) {
                                    i12 = fqeVar.m;
                                    i19++;
                                } else {
                                    if (fqeVar.j) {
                                        i12 = i22;
                                    }
                                    if (z4) {
                                        i5 = i11 + i12;
                                    } else {
                                        i19++;
                                        f3 = ixaVar2.o0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i5 = i11;
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -x6j0Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = ixaVar2.o0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i11;
                                } else {
                                    i5 = i11 + i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i22;
                            if (z4) {
                                i19++;
                                f3 = ixaVar2.o0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i5 = i11;
                            } else {
                                i5 = i11 + i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i21;
                        i2 = 8;
                    }
                    z = z2;
                    int i24 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i24 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i25 = zmdVar.g;
                if (z) {
                    i25 = zmdVar2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i25 = z ? i25 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        x6j0 x6j0Var2 = arrayList.get(i27);
                        int i29 = i25;
                        ixa ixaVar3 = x6j0Var2.b;
                        int i30 = i3;
                        fqe fqeVar2 = x6j0Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (ixaVar3.j0 != 8 && x6j0Var2.d == aVar && !fqeVar2.j) {
                            int i32 = f > 0.0f ? (int) (((ixaVar3.o0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = ixaVar3.w;
                                i10 = ixaVar3.v;
                            } else {
                                i9 = ixaVar3.z;
                                i10 = ixaVar3.y;
                            }
                            int iMax = Math.max(i10, x6j0Var2.a == 1 ? Math.min(i32, fqeVar2.m) : i32);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i32) {
                                i28++;
                                i32 = iMax;
                            }
                            fqeVar2.d(i32);
                        }
                        i27++;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            x6j0 x6j0Var3 = arrayList.get(i34);
                            if (x6j0Var3.b.j0 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i5 += x6j0Var3.h.f;
                                }
                                i5 += x6j0Var3.e.g;
                                if (i34 < i15 && i34 < i) {
                                    i5 += -x6j0Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        x6j0 x6j0Var4 = arrayList.get(z ? size - (i38 + 1) : i38);
                        ixa ixaVar4 = x6j0Var4.b;
                        zmd zmdVar3 = x6j0Var4.i;
                        zmd zmdVar4 = x6j0Var4.h;
                        if (ixaVar4.j0 == 8) {
                            zmdVar4.d(i37);
                            zmdVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - zmdVar4.f : i37 + zmdVar4.f;
                            }
                            if (z) {
                                zmdVar3.d(i37);
                            } else {
                                zmdVar4.d(i37);
                            }
                            fqe fqeVar3 = x6j0Var4.e;
                            int i39 = fqeVar3.g;
                            if (x6j0Var4.d == aVar && x6j0Var4.a == 1) {
                                i39 = fqeVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                zmdVar4.d(i37);
                            } else {
                                zmdVar3.d(i37);
                            }
                            x6j0Var4.g = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-zmdVar3.f) : i37 + (-zmdVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        x6j0 x6j0Var5 = arrayList.get(z ? size - (i42 + 1) : i42);
                        ixa ixaVar5 = x6j0Var5.b;
                        zmd zmdVar5 = x6j0Var5.i;
                        zmd zmdVar6 = x6j0Var5.h;
                        if (ixaVar5.j0 == 8) {
                            zmdVar6.d(i41);
                            zmdVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - zmdVar6.f : i43 + zmdVar6.f;
                            }
                            if (z) {
                                zmdVar5.d(i43);
                            } else {
                                zmdVar6.d(i43);
                            }
                            fqe fqeVar4 = x6j0Var5.e;
                            int iMin = fqeVar4.g;
                            if (x6j0Var5.d == aVar && x6j0Var5.a == 1) {
                                iMin = Math.min(iMin, fqeVar4.m);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                zmdVar6.d(i41);
                            } else {
                                zmdVar5.d(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-zmdVar5.f) : i41 + (-zmdVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i44 = this.f;
                    ixa ixaVar6 = this.b;
                    float f8 = i44 == 0 ? ixaVar6.g0 : ixaVar6.h0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i45 = (int) (((i13 - i5) * f8) + f2);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        x6j0 x6j0Var6 = arrayList.get(z ? size - (i47 + 1) : i47);
                        ixa ixaVar7 = x6j0Var6.b;
                        zmd zmdVar7 = x6j0Var6.i;
                        zmd zmdVar8 = x6j0Var6.h;
                        if (ixaVar7.j0 == 8) {
                            zmdVar8.d(i46);
                            zmdVar7.d(i46);
                        } else {
                            if (i47 > 0 && i47 >= i14) {
                                i46 = z ? i46 - zmdVar8.f : i46 + zmdVar8.f;
                            }
                            if (z) {
                                zmdVar7.d(i46);
                            } else {
                                zmdVar8.d(i46);
                            }
                            fqe fqeVar5 = x6j0Var6.e;
                            int i48 = fqeVar5.g;
                            if (x6j0Var6.d == aVar && x6j0Var6.a == 1) {
                                i48 = fqeVar5.m;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                zmdVar8.d(i46);
                            } else {
                                zmdVar7.d(i46);
                            }
                            if (i47 < i15 && i47 < i) {
                                i46 = z ? i46 - (-zmdVar7.f) : i46 + (-zmdVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.x6j0
    public final void d() {
        ArrayList<x6j0> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            x6j0 x6j0Var = arrayList.get(i);
            i++;
            x6j0Var.d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        ixa ixaVar = arrayList.get(0).b;
        ixa ixaVar2 = arrayList.get(size2 - 1).b;
        int i2 = this.f;
        zmd zmdVar = this.i;
        zmd zmdVar2 = this.h;
        if (i2 == 0) {
            ewa ewaVar = ixaVar.K;
            ewa ewaVar2 = ixaVar2.M;
            zmd zmdVarI = x6j0.i(ewaVar, 0);
            int iE = ewaVar.e();
            ixa ixaVarM = m();
            if (ixaVarM != null) {
                iE = ixaVarM.K.e();
            }
            if (zmdVarI != null) {
                x6j0.b(zmdVar2, zmdVarI, iE);
            }
            zmd zmdVarI2 = x6j0.i(ewaVar2, 0);
            int iE2 = ewaVar2.e();
            ixa ixaVarN = n();
            if (ixaVarN != null) {
                iE2 = ixaVarN.M.e();
            }
            if (zmdVarI2 != null) {
                x6j0.b(zmdVar, zmdVarI2, -iE2);
            }
        } else {
            ewa ewaVar3 = ixaVar.L;
            ewa ewaVar4 = ixaVar2.N;
            zmd zmdVarI3 = x6j0.i(ewaVar3, 1);
            int iE3 = ewaVar3.e();
            ixa ixaVarM2 = m();
            if (ixaVarM2 != null) {
                iE3 = ixaVarM2.L.e();
            }
            if (zmdVarI3 != null) {
                x6j0.b(zmdVar2, zmdVarI3, iE3);
            }
            zmd zmdVarI4 = x6j0.i(ewaVar4, 1);
            int iE4 = ewaVar4.e();
            ixa ixaVarN2 = n();
            if (ixaVarN2 != null) {
                iE4 = ixaVarN2.N.e();
            }
            if (zmdVarI4 != null) {
                x6j0.b(zmdVar, zmdVarI4, -iE4);
            }
        }
        zmdVar2.a = this;
        zmdVar.a = this;
    }

    @Override // defpackage.x6j0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<x6j0> arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // defpackage.x6j0
    public final void f() {
        this.c = null;
        ArrayList<x6j0> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            x6j0 x6j0Var = arrayList.get(i);
            i++;
            x6j0Var.f();
        }
    }

    @Override // defpackage.x6j0
    public final long j() {
        ArrayList<x6j0> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            x6j0 x6j0Var = arrayList.get(i);
            j = ((long) x6j0Var.i.f) + x6j0Var.j() + j + ((long) x6j0Var.h.f);
        }
        return j;
    }

    @Override // defpackage.x6j0
    public final boolean k() {
        ArrayList<x6j0> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final ixa m() {
        int i = 0;
        while (true) {
            ArrayList<x6j0> arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ixa ixaVar = arrayList.get(i).b;
            if (ixaVar.j0 != 8) {
                return ixaVar;
            }
            i++;
        }
    }

    public final ixa n() {
        ArrayList<x6j0> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ixa ixaVar = arrayList.get(size).b;
            if (ixaVar.j0 != 8) {
                return ixaVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<x6j0> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            x6j0 x6j0Var = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append(x6j0Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
