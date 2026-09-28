package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dw6 {
    /* JADX WARN: Code duplicated, block: B:190:0x0290  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x02db  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:213:0x0302  */
    /* JADX WARN: Code duplicated, block: B:236:0x0370  */
    /* JADX WARN: Code duplicated, block: B:238:0x038a  */
    /* JADX WARN: Code duplicated, block: B:240:0x038f  */
    /* JADX WARN: Code duplicated, block: B:244:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:254:0x0420  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:414:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:417:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:418:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:420:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:425:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    public static void a(jxa jxaVar, ofs ofsVar, ArrayList<ixa> arrayList, int i) {
        int i2;
        ew6[] ew6VarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        ixa ixaVar;
        ofs ofsVar2;
        ixa ixaVar2;
        uoa0 uoa0Var;
        ewa ewaVar;
        uoa0 uoa0Var2;
        ixa ixaVar3;
        int i6;
        ewa[] ewaVarArr;
        ewa ewaVar2;
        uoa0 uoa0Var3;
        int i7;
        ewa[] ewaVarArr2;
        int i8;
        ewa ewaVar3;
        ewa ewaVar4;
        uoa0 uoa0Var4;
        ewa ewaVar5;
        uoa0 uoa0Var5;
        int size;
        ArrayList<ixa> arrayList2;
        float f;
        float f2;
        float f3;
        uoa0 uoa0Var6;
        uoa0 uoa0Var7;
        uoa0 uoa0Var8;
        uoa0 uoa0Var9;
        rx0 rx0VarL;
        float f4;
        ewa ewaVar6;
        ixa ixaVar4;
        int i9;
        int i10;
        int i11;
        ixa ixaVar5;
        float f5;
        jxa jxaVar2 = jxaVar;
        if (i == 0) {
            i2 = jxaVar2.E0;
            ew6VarArr = jxaVar2.H0;
            i3 = 0;
        } else {
            i2 = jxaVar2.F0;
            ew6VarArr = jxaVar2.G0;
            i3 = 2;
        }
        int i12 = i2;
        ew6[] ew6VarArr2 = ew6VarArr;
        int i13 = 0;
        while (i13 < i12) {
            ew6 ew6Var = ew6VarArr2[i13];
            boolean z4 = ew6Var.q;
            ixa ixaVar6 = ew6Var.a;
            ewa[] ewaVarArr3 = ixaVar6.S;
            ixa.a aVar = ixa.a.c;
            int i14 = 8;
            float f6 = 0.0f;
            if (z4) {
                i4 = i13;
            } else {
                int i15 = ew6Var.l;
                int i16 = i15 * 2;
                ixa ixaVar7 = ixaVar6;
                ixa ixaVar8 = ixaVar7;
                boolean z5 = false;
                while (!z5) {
                    ew6Var.i++;
                    ixa[] ixaVarArr = ixaVar7.q0;
                    ewa[] ewaVarArr4 = ixaVar7.S;
                    ixaVarArr[i15] = null;
                    ixaVar7.p0[i15] = null;
                    if (ixaVar7.j0 != i14) {
                        ixaVar7.l(i15);
                        ewaVarArr4[i16].e();
                        int i17 = i16 + 1;
                        ewaVarArr4[i17].e();
                        ewaVarArr4[i16].e();
                        ewaVarArr4[i17].e();
                        if (ew6Var.b == null) {
                            ew6Var.b = ixaVar7;
                        }
                        ew6Var.d = ixaVar7;
                        ixa.a aVar2 = ixaVar7.V[i15];
                        if (aVar2 == aVar) {
                            int i18 = ixaVar7.u[i15];
                            i10 = i13;
                            if (i18 == 0 || i18 == 3 || i18 == 2) {
                                ew6Var.j++;
                                float f7 = ixaVar7.o0[i15];
                                if (f7 > 0.0f) {
                                    f5 = f7;
                                    ew6Var.k += f5;
                                } else {
                                    f5 = f7;
                                }
                                i11 = i15;
                                if (ixaVar7.j0 != 8 && aVar2 == aVar && (i18 == 0 || i18 == 3)) {
                                    if (f5 < 0.0f) {
                                        ew6Var.n = true;
                                    } else {
                                        ew6Var.o = true;
                                    }
                                    ArrayList<ixa> arrayList3 = ew6Var.h;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList<>();
                                        ew6Var.h = arrayList3;
                                    }
                                    arrayList3.add(ixaVar7);
                                }
                                if (ew6Var.f == null) {
                                    ew6Var.f = ixaVar7;
                                }
                                ixa ixaVar9 = ew6Var.g;
                                if (ixaVar9 != null) {
                                    ixaVar9.p0[i11] = ixaVar7;
                                }
                                ew6Var.g = ixaVar7;
                            } else {
                                i11 = i15;
                            }
                            if (i11 == 0) {
                                if (ixaVar7.s == 0 && ixaVar7.v == 0) {
                                    int i19 = ixaVar7.w;
                                }
                            } else if (ixaVar7.t == 0 && ixaVar7.y == 0) {
                                int i20 = ixaVar7.z;
                            }
                        } else {
                            i10 = i13;
                            i11 = i15;
                        }
                    } else {
                        i10 = i13;
                        i11 = i15;
                    }
                    ixa ixaVar10 = ixaVar8;
                    if (ixaVar10 != ixaVar7) {
                        ixaVar10.q0[i11] = ixaVar7;
                    }
                    ewa ewaVar7 = ewaVarArr4[i16 + 1].f;
                    if (ewaVar7 != null) {
                        ixaVar5 = ewaVar7.d;
                        ewa ewaVar8 = ixaVar5.S[i16].f;
                        if (ewaVar8 == null || ewaVar8.d != ixaVar7) {
                            ixaVar5 = null;
                        }
                    } else {
                        ixaVar5 = null;
                    }
                    if (ixaVar5 == null) {
                        ixaVar5 = ixaVar7;
                        z5 = true;
                    }
                    ixaVar8 = ixaVar7;
                    i15 = i11;
                    i14 = 8;
                    ixaVar7 = ixaVar5;
                    i13 = i10;
                }
                i4 = i13;
                int i21 = i15;
                ixa ixaVar11 = ew6Var.b;
                if (ixaVar11 != null) {
                    ixaVar11.S[i16].e();
                }
                ixa ixaVar12 = ew6Var.d;
                if (ixaVar12 != null) {
                    ixaVar12.S[i16 + 1].e();
                }
                ew6Var.c = ixaVar7;
                if (i21 == 0 && ew6Var.m) {
                    ew6Var.e = ixaVar7;
                } else {
                    ew6Var.e = ixaVar6;
                }
                ew6Var.p = ew6Var.o && ew6Var.n;
            }
            ew6Var.q = true;
            if (arrayList == 0 || arrayList.contains(ixaVar6)) {
                ixa ixaVar13 = ew6Var.c;
                ixa ixaVar14 = ew6Var.b;
                ixa ixaVar15 = ew6Var.d;
                ixa ixaVar16 = ew6Var.e;
                float f8 = ew6Var.k;
                ixa.a[] aVarArr = jxaVar2.V;
                ewa[] ewaVarArr5 = ewaVarArr3;
                ewa[] ewaVarArr6 = jxaVar2.S;
                boolean z6 = aVarArr[i] == ixa.a.b;
                if (i == 0) {
                    int i22 = ixaVar16.m0;
                    boolean z7 = i22 == 0;
                    z2 = i22 == 1;
                    z3 = i22 == 2;
                    z = z7;
                } else {
                    int i23 = ixaVar16.n0;
                    z = i23 == 0;
                    z2 = i23 == 1;
                    z3 = i23 == 2;
                }
                boolean z8 = z2;
                boolean z9 = false;
                while (!z9) {
                    ewa[] ewaVarArr7 = ixaVar6.S;
                    ewa ewaVar9 = ewaVarArr7[i3];
                    int i24 = z3 ? 1 : 4;
                    int iE = ewaVar9.e();
                    boolean z10 = z3;
                    boolean z11 = ixaVar6.V[i] == aVar && ixaVar6.u[i] == 0;
                    ewa ewaVar10 = ewaVar9.f;
                    if (ewaVar10 != null && ixaVar6 != ixaVar6) {
                        iE = ewaVar10.e() + iE;
                    }
                    int i25 = iE;
                    if (z10 && ixaVar6 != ixaVar6 && ixaVar6 != ixaVar14) {
                        i24 = 8;
                    }
                    ixa ixaVar17 = ixaVar6;
                    ewa ewaVar11 = ewaVar9.f;
                    if (ewaVar11 != null) {
                        uoa0 uoa0Var10 = ewaVar9.i;
                        uoa0 uoa0Var11 = ewaVar11.i;
                        if (ixaVar6 == ixaVar14) {
                            ofsVar.f(uoa0Var10, uoa0Var11, i25, 6);
                        } else {
                            ofsVar.f(uoa0Var10, uoa0Var11, i25, 8);
                        }
                        if (z11 && !z10) {
                            i24 = 5;
                        }
                        ofsVar.e(ewaVar9.i, ewaVar9.f.i, i25, (ixaVar6 == ixaVar14 && z10 && ixaVar6.U[i]) ? 5 : i24);
                    } else {
                        i12 = i12;
                    }
                    if (z6) {
                        if (ixaVar6.j0 == 8 || ixaVar6.V[i] != aVar) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            ofsVar.f(ewaVarArr7[i3 + 1].i, ewaVarArr7[i3].i, 0, 5);
                        }
                        ofsVar.f(ewaVarArr7[i3].i, ewaVarArr6[i3].i, i9, 8);
                    }
                    ewa ewaVar12 = ewaVarArr7[i3 + 1].f;
                    if (ewaVar12 != null) {
                        ixaVar4 = ewaVar12.d;
                        ewa ewaVar13 = ixaVar4.S[i3].f;
                        if (ewaVar13 == null || ewaVar13.d != ixaVar6) {
                            ixaVar4 = null;
                        }
                    } else {
                        ixaVar4 = null;
                    }
                    if (ixaVar4 != null) {
                        ixaVar6 = ixaVar4;
                    } else {
                        z9 = true;
                    }
                    ixaVar6 = ixaVar17;
                    z3 = z10;
                    i12 = i12;
                }
                boolean z12 = z3;
                i5 = i12;
                if (ixaVar15 != null) {
                    int i26 = i3 + 1;
                    if (ixaVar13.S[i26].f != null) {
                        ewa ewaVar14 = ixaVar15.S[i26];
                        if (ixaVar15.V[i] == aVar && ixaVar15.u[i] == 0 && !z12) {
                            ewa ewaVar15 = ewaVar14.f;
                            if (ewaVar15.d == jxaVar2) {
                                ofsVar.e(ewaVar14.i, ewaVar15.i, -ewaVar14.e(), 5);
                            } else if (z12) {
                                ewaVar6 = ewaVar14.f;
                                if (ewaVar6.d == jxaVar2) {
                                    ofsVar.e(ewaVar14.i, ewaVar6.i, -ewaVar14.e(), 4);
                                }
                            }
                        } else if (z12) {
                            ewaVar6 = ewaVar14.f;
                            if (ewaVar6.d == jxaVar2) {
                                ofsVar.e(ewaVar14.i, ewaVar6.i, -ewaVar14.e(), 4);
                            }
                        }
                        ofsVar.g(ewaVar14.i, ixaVar13.S[i26].f.i, -ewaVar14.e(), 6);
                    }
                }
                if (z6 != 0) {
                    int i27 = i3 + 1;
                    uoa0 uoa0Var12 = ewaVarArr6[i27].i;
                    ewa ewaVar16 = ixaVar13.S[i27];
                    ofsVar.f(uoa0Var12, ewaVar16.i, ewaVar16.e(), 8);
                }
                ArrayList<ixa> arrayList4 = ew6Var.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    float f9 = (!ew6Var.n || ew6Var.p) ? f8 : ew6Var.j;
                    ixa ixaVar18 = null;
                    float f10 = 0.0f;
                    int i28 = 0;
                    while (i28 < size) {
                        ixa ixaVar19 = arrayList4.get(i28);
                        float[] fArr = ixaVar19.o0;
                        ewa[] ewaVarArr8 = ixaVar19.S;
                        float f11 = fArr[i];
                        if (f11 >= f6) {
                            arrayList2 = arrayList4;
                            if (f11 == f6) {
                                ofsVar.e(ewaVarArr8[i3 + 1].i, ewaVarArr8[i3].i, 0, 8);
                                size = size;
                                f2 = f6;
                                f3 = f9;
                            } else {
                                i28 = i28;
                                if (ixaVar18 != null) {
                                    ewa[] ewaVarArr9 = ixaVar18.S;
                                    uoa0Var6 = ewaVarArr9[i3].i;
                                    int i29 = i3 + 1;
                                    uoa0Var7 = ewaVarArr9[i29].i;
                                    uoa0Var8 = ewaVarArr8[i3].i;
                                    uoa0Var9 = ewaVarArr8[i29].i;
                                    rx0VarL = ofsVar.l();
                                    f4 = f6;
                                    rx0VarL.b = f4;
                                    f2 = f4;
                                    if (f9 != f4 || f10 == f11) {
                                        f3 = f9;
                                        f = f11;
                                        rx0VarL.d.k(uoa0Var6, 1.0f);
                                        rx0VarL.d.k(uoa0Var7, -1.0f);
                                        rx0VarL.d.k(uoa0Var9, 1.0f);
                                        rx0VarL.d.k(uoa0Var8, -1.0f);
                                    } else {
                                        rx0.a aVar3 = rx0VarL.d;
                                        if (f10 == f2) {
                                            f3 = f9;
                                            aVar3.k(uoa0Var6, 1.0f);
                                            rx0VarL.d.k(uoa0Var7, -1.0f);
                                            f = f11;
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            if (f11 == f6) {
                                                aVar3.k(uoa0Var8, 1.0f);
                                                rx0VarL.d.k(uoa0Var9, -1.0f);
                                            } else {
                                                float f12 = (f10 / f3) / (f / f3);
                                                aVar3.k(uoa0Var6, 1.0f);
                                                rx0VarL.d.k(uoa0Var7, -1.0f);
                                                rx0VarL.d.k(uoa0Var9, f12);
                                                rx0VarL.d.k(uoa0Var8, -f12);
                                            }
                                        }
                                    }
                                    ofsVar.c(rx0VarL);
                                } else {
                                    f = f11;
                                    f2 = f6;
                                    f3 = f9;
                                }
                                ixaVar18 = ixaVar19;
                                f10 = f;
                            }
                        } else {
                            if (ew6Var.p) {
                                arrayList2 = arrayList4;
                                ofsVar.e(ewaVarArr8[i3 + 1].i, ewaVarArr8[i3].i, 0, 4);
                            } else {
                                f11 = 1.0f;
                                arrayList2 = arrayList4;
                                if (f11 == f6) {
                                    ofsVar.e(ewaVarArr8[i3 + 1].i, ewaVarArr8[i3].i, 0, 8);
                                } else {
                                    i28 = i28;
                                    if (ixaVar18 != null) {
                                        ewa[] ewaVarArr10 = ixaVar18.S;
                                        uoa0Var6 = ewaVarArr10[i3].i;
                                        int i210 = i3 + 1;
                                        uoa0Var7 = ewaVarArr10[i210].i;
                                        uoa0Var8 = ewaVarArr8[i3].i;
                                        uoa0Var9 = ewaVarArr8[i210].i;
                                        rx0VarL = ofsVar.l();
                                        f4 = f6;
                                        rx0VarL.b = f4;
                                        f2 = f4;
                                        if (f9 != f4) {
                                            f3 = f9;
                                            f = f11;
                                            rx0VarL.d.k(uoa0Var6, 1.0f);
                                            rx0VarL.d.k(uoa0Var7, -1.0f);
                                            rx0VarL.d.k(uoa0Var9, 1.0f);
                                            rx0VarL.d.k(uoa0Var8, -1.0f);
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            rx0VarL.d.k(uoa0Var6, 1.0f);
                                            rx0VarL.d.k(uoa0Var7, -1.0f);
                                            rx0VarL.d.k(uoa0Var9, 1.0f);
                                            rx0VarL.d.k(uoa0Var8, -1.0f);
                                        }
                                        ofsVar.c(rx0VarL);
                                    } else {
                                        f = f11;
                                        f2 = f6;
                                        f3 = f9;
                                    }
                                    ixaVar18 = ixaVar19;
                                    f10 = f;
                                }
                            }
                            size = size;
                            f2 = f6;
                            f3 = f9;
                        }
                        i28++;
                        f9 = f3;
                        arrayList4 = arrayList2;
                        size = size;
                        f6 = f2;
                    }
                }
                if (ixaVar14 == null || !(ixaVar14 == ixaVar15 || z12)) {
                    ixaVar = ixaVar15;
                    if (z && ixaVar14 != null) {
                        int i30 = ew6Var.j;
                        boolean z13 = i30 > 0 && ew6Var.i == i30;
                        ixa ixaVar20 = ixaVar14;
                        ixa ixaVar21 = ixaVar20;
                        while (true) {
                            ewa[] ewaVarArr11 = ixaVar21.S;
                            if (ixaVar20 == null) {
                                break;
                            }
                            ewa[] ewaVarArr12 = ixaVar20.S;
                            ixa ixaVar22 = ixaVar20.q0[i];
                            while (true) {
                                if (ixaVar22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (ixaVar22.j0 != 8) {
                                    break;
                                } else {
                                    ixaVar22 = ixaVar22.q0[i];
                                }
                            }
                            if (ixaVar22 != null || ixaVar20 == ixaVar) {
                                ewa ewaVar17 = ewaVarArr12[i3];
                                uoa0 uoa0Var13 = ewaVar17.i;
                                ewa ewaVar18 = ewaVar17.f;
                                uoa0 uoa0Var14 = ewaVar18 != null ? ewaVar18.i : null;
                                if (ixaVar21 != ixaVar20) {
                                    uoa0Var14 = ewaVarArr11[i3 + 1].i;
                                } else if (ixaVar20 == ixaVar14) {
                                    ewa ewaVar19 = ewaVarArr5[i3].f;
                                    uoa0Var14 = ewaVar19 != null ? ewaVar19.i : null;
                                }
                                int iE2 = ewaVar17.e();
                                int i31 = i3 + 1;
                                int iE3 = ewaVarArr12[i31].e();
                                if (ixaVar22 != null) {
                                    ewaVar2 = ixaVar22.S[i3];
                                    ewaVarArr = ewaVarArr11;
                                    uoa0Var3 = ewaVar2.i;
                                } else {
                                    ewaVarArr = ewaVarArr11;
                                    ewaVar2 = ixaVar13.S[i31].f;
                                    uoa0Var3 = ewaVar2 != null ? ewaVar2.i : null;
                                }
                                uoa0 uoa0Var15 = ewaVarArr12[i31].i;
                                if (ewaVar2 != null) {
                                    iE3 += ewaVar2.e();
                                }
                                int iE4 = ewaVarArr[i31].e() + iE2;
                                if (uoa0Var13 == null || uoa0Var14 == null || uoa0Var3 == null || uoa0Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (ixaVar20 == ixaVar14) {
                                        iE4 = ixaVar14.S[i3].e();
                                    }
                                    int i32 = iE4;
                                    if (ixaVar20 == ixaVar) {
                                        iE3 = ixaVar.S[i31].e();
                                    }
                                    i7 = 8;
                                    ofsVar.b(uoa0Var13, uoa0Var14, i32, 0.5f, uoa0Var3, uoa0Var15, iE3, z13 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (ixaVar20.j0 != i7) {
                                ixaVar21 = ixaVar20;
                            }
                            ixaVar20 = ixaVar22;
                            ixaVar21 = ixaVar21;
                            ewaVarArr5 = ewaVarArr5;
                        }
                    } else {
                        int i33 = 8;
                        if (z8 && ixaVar14 != null) {
                            int i34 = ew6Var.j;
                            boolean z14 = i34 > 0 && ew6Var.i == i34;
                            ixa ixaVar23 = ixaVar14;
                            ixa ixaVar24 = ixaVar23;
                            while (true) {
                                ewa[] ewaVarArr13 = ixaVar23.S;
                                if (ixaVar24 == null) {
                                    break;
                                }
                                ewa[] ewaVarArr14 = ixaVar24.S;
                                ixa ixaVar25 = ixaVar24.q0[i];
                                while (ixaVar25 != null && ixaVar25.j0 == i33) {
                                    ixaVar25 = ixaVar25.q0[i];
                                }
                                if (ixaVar24 == ixaVar14 || ixaVar24 == ixaVar || ixaVar25 == null) {
                                    ixaVar2 = ixaVar23;
                                } else {
                                    if (ixaVar25 == ixaVar) {
                                        ixaVar25 = null;
                                    }
                                    ewa ewaVar20 = ewaVarArr14[i3];
                                    uoa0 uoa0Var16 = ewaVar20.i;
                                    int i35 = i3 + 1;
                                    uoa0 uoa0Var17 = ewaVarArr13[i35].i;
                                    int iE5 = ewaVar20.e();
                                    int iE6 = ewaVarArr14[i35].e();
                                    if (ixaVar25 != null) {
                                        ewaVar = ixaVar25.S[i3];
                                        uoa0Var = ewaVar.i;
                                        ixaVar2 = ixaVar23;
                                        ewa ewaVar21 = ewaVar.f;
                                        uoa0Var2 = ewaVar21 != null ? ewaVar21.i : null;
                                    } else {
                                        ixaVar2 = ixaVar23;
                                        ewa ewaVar22 = ixaVar.S[i3];
                                        uoa0Var = ewaVar22 != null ? ewaVar22.i : null;
                                        uoa0 uoa0Var18 = ewaVarArr14[i35].i;
                                        ewaVar = ewaVar22;
                                        uoa0Var2 = uoa0Var18;
                                    }
                                    if (ewaVar != null) {
                                        iE6 += ewaVar.e();
                                    }
                                    int iE7 = ewaVarArr13[i35].e() + iE5;
                                    ixa ixaVar26 = ixaVar25;
                                    int i36 = iE6;
                                    int i37 = z14 ? 8 : 4;
                                    if (uoa0Var16 == null || uoa0Var17 == null || uoa0Var == null || uoa0Var2 == null) {
                                        ixaVar3 = ixaVar26;
                                    } else {
                                        uoa0 uoa0Var19 = uoa0Var;
                                        ixaVar3 = ixaVar26;
                                        ofsVar.b(uoa0Var16, uoa0Var17, iE7, 0.5f, uoa0Var19, uoa0Var2, i36, i37);
                                    }
                                    ixaVar25 = ixaVar3;
                                }
                                i33 = 8;
                                if (ixaVar24.j0 != 8) {
                                    ixaVar2 = ixaVar24;
                                }
                                ixaVar24 = ixaVar25;
                                ixaVar23 = ixaVar2;
                            }
                            ofsVar2 = ofsVar;
                            ewa ewaVar23 = ixaVar14.S[i3];
                            ewa ewaVar24 = ewaVarArr5[i3].f;
                            int i38 = i3 + 1;
                            ewa ewaVar25 = ixaVar.S[i38];
                            ewa ewaVar26 = ixaVar13.S[i38].f;
                            if (ewaVar24 != null) {
                                if (ixaVar14 != ixaVar) {
                                    ofsVar2.e(ewaVar23.i, ewaVar24.i, ewaVar23.e(), 5);
                                } else if (ewaVar26 != null) {
                                    ofsVar2.b(ewaVar23.i, ewaVar24.i, ewaVar23.e(), 0.5f, ewaVar25.i, ewaVar26.i, ewaVar25.e(), 5);
                                }
                            }
                            if (ewaVar26 != null && ixaVar14 != ixaVar) {
                                ofsVar2.e(ewaVar25.i, ewaVar26.i, -ewaVar25.e(), 5);
                            }
                        }
                        if ((z || z8) && ixaVar14 != null && ixaVar14 != ixaVar) {
                            ewaVarArr2 = ixaVar14.S;
                            ewa ewaVar27 = ewaVarArr2[i3];
                            if (ixaVar == null) {
                                ixaVar = ixaVar14;
                            }
                            ewa[] ewaVarArr15 = ixaVar.S;
                            i8 = i3 + 1;
                            ewaVar3 = ewaVarArr15[i8];
                            ewaVar4 = ewaVar27.f;
                            if (ewaVar4 != null) {
                                uoa0Var4 = ewaVar4.i;
                            } else {
                                uoa0Var4 = null;
                            }
                            ewaVar5 = ewaVar3.f;
                            if (ewaVar5 != null) {
                                uoa0Var5 = ewaVar5.i;
                            } else {
                                uoa0Var5 = null;
                            }
                            if (ixaVar13 != ixaVar) {
                                ewa ewaVar28 = ixaVar13.S[i8].f;
                                uoa0Var5 = ewaVar28 != null ? ewaVar28.i : null;
                            }
                            if (ixaVar14 == ixaVar) {
                                ewaVar3 = ewaVarArr2[i8];
                            }
                            if (uoa0Var4 == null && uoa0Var5 != null) {
                                ofsVar2.b(ewaVar27.i, uoa0Var4, ewaVar27.e(), 0.5f, uoa0Var5, ewaVar3.i, ewaVarArr15[i8].e(), 5);
                            }
                        }
                    }
                } else {
                    ewa ewaVar29 = ewaVarArr5[i3];
                    int i39 = i3 + 1;
                    ewa ewaVar30 = ixaVar13.S[i39];
                    ewa ewaVar31 = ewaVar29.f;
                    uoa0 uoa0Var20 = ewaVar31 != null ? ewaVar31.i : null;
                    ewa ewaVar32 = ewaVar30.f;
                    uoa0 uoa0Var21 = ewaVar32 != null ? ewaVar32.i : null;
                    ewa ewaVar33 = ixaVar14.S[i3];
                    if (ixaVar15 != null) {
                        ewaVar30 = ixaVar15.S[i39];
                    }
                    if (uoa0Var20 == null || uoa0Var21 == null) {
                        ixaVar = ixaVar15;
                    } else {
                        float f13 = i == 0 ? ixaVar16.g0 : ixaVar16.h0;
                        int iE8 = ewaVar33.e();
                        int iE9 = ewaVar30.e();
                        uoa0 uoa0Var22 = ewaVar33.i;
                        uoa0 uoa0Var23 = ewaVar30.i;
                        uoa0 uoa0Var24 = uoa0Var20;
                        ixaVar = ixaVar15;
                        ofsVar.b(uoa0Var22, uoa0Var24, iE8, f13, uoa0Var21, uoa0Var23, iE9, 7);
                    }
                }
                ofsVar2 = ofsVar;
                if (z) {
                    ewaVarArr2 = ixaVar14.S;
                    ewa ewaVar210 = ewaVarArr2[i3];
                    if (ixaVar == null) {
                        ixaVar = ixaVar14;
                    }
                    ewa[] ewaVarArr16 = ixaVar.S;
                    i8 = i3 + 1;
                    ewaVar3 = ewaVarArr16[i8];
                    ewaVar4 = ewaVar210.f;
                    if (ewaVar4 != null) {
                        uoa0Var4 = ewaVar4.i;
                    } else {
                        uoa0Var4 = null;
                    }
                    ewaVar5 = ewaVar3.f;
                    if (ewaVar5 != null) {
                        uoa0Var5 = ewaVar5.i;
                    } else {
                        uoa0Var5 = null;
                    }
                    if (ixaVar13 != ixaVar) {
                        ewa ewaVar211 = ixaVar13.S[i8].f;
                        uoa0Var5 = ewaVar211 != null ? ewaVar211.i : null;
                    }
                    if (ixaVar14 == ixaVar) {
                        ewaVar3 = ewaVarArr2[i8];
                    }
                    if (uoa0Var4 == null) {
                    }
                } else {
                    ewaVarArr2 = ixaVar14.S;
                    ewa ewaVar212 = ewaVarArr2[i3];
                    if (ixaVar == null) {
                        ixaVar = ixaVar14;
                    }
                    ewa[] ewaVarArr17 = ixaVar.S;
                    i8 = i3 + 1;
                    ewaVar3 = ewaVarArr17[i8];
                    ewaVar4 = ewaVar212.f;
                    if (ewaVar4 != null) {
                        uoa0Var4 = ewaVar4.i;
                    } else {
                        uoa0Var4 = null;
                    }
                    ewaVar5 = ewaVar3.f;
                    if (ewaVar5 != null) {
                        uoa0Var5 = ewaVar5.i;
                    } else {
                        uoa0Var5 = null;
                    }
                    if (ixaVar13 != ixaVar) {
                        ewa ewaVar213 = ixaVar13.S[i8].f;
                        uoa0Var5 = ewaVar213 != null ? ewaVar213.i : null;
                    }
                    if (ixaVar14 == ixaVar) {
                        ewaVar3 = ewaVarArr2[i8];
                    }
                    if (uoa0Var4 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            jxaVar2 = jxaVar;
            i12 = i5;
        }
    }
}
