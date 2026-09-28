package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class kb0 {
    public final tx90 a;
    public final mx90 b;
    public final zi0 c;

    public kb0(tx90 tx90Var) {
        this.a = tx90Var;
        mx90 mx90Var = new mx90(tx90Var);
        this.b = mx90Var;
        this.c = new zi0(new bj0(tx90Var));
        mx90Var.k(mx90.a.a);
    }

    public static kb0 a(File file, File file2) {
        try {
            pc0 pc0Var = new pc0(pc0.b(file), new sq20());
            v20 v20Var = new v20();
            v20Var.a = pc0Var;
            t12 ay90Var = file2.getPath().endsWith(".json") ? new ay90(v20Var) : new ox90(v20Var);
            ckh ckhVar = new ckh();
            ckhVar.a = file2;
            ckhVar.b = llh.d;
            return new kb0(ay90Var.d(ckhVar));
        } catch (Exception e) {
            gqm.a(e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:115:0x021b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0238  */
    /* JADX WARN: Code duplicated, block: B:124:0x0242 A[DONT_INVERT, PHI: r20
      0x0242: PHI (r20v5 ??) = (r20v18 ??), (r20v10 ??) binds: [B:123:0x0240, B:121:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0244  */
    /* JADX WARN: Code duplicated, block: B:128:0x024a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0252  */
    /* JADX WARN: Code duplicated, block: B:131:0x0264  */
    /* JADX WARN: Code duplicated, block: B:134:0x0293  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[LOOP:1: B:23:0x0061->B:25:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[PHI: r17
      0x0081: PHI (r17v6 zi0$e) = (r17v5 zi0$e), (r17v5 zi0$e), (r17v7 zi0$e) binds: [B:27:0x0072, B:29:0x0076, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[LOOP:2: B:38:0x0095->B:39:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zi0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [zi0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zi0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [zi0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(float f) {
        int i;
        float f2;
        mx90 mx90Var;
        zi0.e[] eVarArr;
        int i2;
        int i3;
        float f3;
        ?? r6;
        int i4;
        float f4;
        float fA;
        int i5;
        lh0.m0[] m0VarArr;
        lh0.l lVar;
        ?? r20;
        ?? r1;
        zi0.e eVar;
        int[] iArr;
        int i6;
        ?? r27;
        float[] fArr;
        int i7;
        zi0.e eVar2;
        lh0.m0 m0Var;
        lh0.k kVar;
        float[] fArr2;
        ?? r21;
        int i8;
        ?? r22;
        lh0.m0 m0Var2;
        ?? r2;
        mx90 mx90Var2;
        int i9;
        ncy<String> ncyVar;
        int i10;
        zi0.e[] eVarArr2;
        int i11;
        float f5;
        ncy<String> ncyVar2;
        zi0.e[] eVarArr3;
        int i12;
        zi0.e eVar3;
        zi0.e eVar4;
        zi0.e eVar5;
        zi0.e eVar6;
        float f6;
        zi0.e eVar7;
        kb0 kb0Var = this;
        zi0 zi0Var = kb0Var.c;
        zi0.c cVar = zi0Var.e;
        float f7 = zi0Var.h * f;
        mw0<zi0.e> mw0Var = zi0Var.b;
        zi0.e[] eVarArr4 = mw0Var.a;
        int i13 = mw0Var.b;
        int i14 = 0;
        while (true) {
            i = 1;
            f2 = 0.0f;
            if (i14 >= i13) {
                break;
            }
            zi0.e eVar8 = eVarArr4[i14];
            if (eVar8 != null) {
                eVar8.h = eVar8.i;
                float f8 = eVar8.m;
                eVar8.l = f8;
                float f9 = eVar8.o;
                float f10 = f7 * f9;
                float f11 = eVar8.j;
                if (f11 > 0.0f) {
                    float f12 = f11 - f10;
                    eVar8.j = f12;
                    if (f12 <= 0.0f) {
                        f10 = -f12;
                        eVar8.j = 0.0f;
                        eVar3 = eVar8.b;
                        if (eVar3 != null) {
                            eVar4 = null;
                            f6 = f8 - eVar3.j;
                            if (f6 >= 0.0f) {
                                eVar3.j = 0.0f;
                                eVar3.k = eVar3.k + (f9 != 0.0f ? eVar3.o * ((f6 / f9) + f7) : 0.0f);
                                eVar8.k += f10;
                                zi0Var.n(i14, eVar3, true);
                                while (true) {
                                    eVar7 = eVar3.c;
                                    if (eVar7 != null) {
                                        eVar3.q += f7;
                                        eVar3 = eVar7;
                                    }
                                }
                            } else {
                                if (eVar8.c != null && zi0Var.p(eVar8, f7)) {
                                    eVar5 = eVar8.c;
                                    eVar6 = eVar4;
                                    eVar8.c = eVar6;
                                    if (eVar5 != null) {
                                        eVar5.d = eVar6;
                                    }
                                    while (eVar5 != null) {
                                        cVar.b(eVar5);
                                        eVar5 = eVar5.c;
                                    }
                                }
                                eVar8.k += f10;
                            }
                        } else {
                            eVar4 = null;
                            if (f8 >= eVar8.n || eVar8.c != null) {
                                if (eVar8.c != null) {
                                    eVar5 = eVar8.c;
                                    eVar6 = eVar4;
                                    eVar8.c = eVar6;
                                    if (eVar5 != null) {
                                        eVar5.d = eVar6;
                                    }
                                    while (eVar5 != null) {
                                        cVar.b(eVar5);
                                        eVar5 = eVar5.c;
                                    }
                                }
                                eVar8.k += f10;
                            } else {
                                eVarArr4[i14] = null;
                                cVar.b(eVar8);
                                zi0Var.f(eVar8);
                            }
                        }
                    }
                } else {
                    eVar3 = eVar8.b;
                    if (eVar3 != null) {
                        eVar4 = null;
                        f6 = f8 - eVar3.j;
                        if (f6 >= 0.0f) {
                            eVar3.j = 0.0f;
                            if (f9 != 0.0f) {
                            }
                            eVar3.k = eVar3.k + (f9 != 0.0f ? eVar3.o * ((f6 / f9) + f7) : 0.0f);
                            eVar8.k += f10;
                            zi0Var.n(i14, eVar3, true);
                            while (true) {
                                eVar7 = eVar3.c;
                                if (eVar7 != null) {
                                    eVar3.q += f7;
                                    eVar3 = eVar7;
                                }
                            }
                        } else {
                            if (eVar8.c != null) {
                                eVar5 = eVar8.c;
                                eVar6 = eVar4;
                                eVar8.c = eVar6;
                                if (eVar5 != null) {
                                    eVar5.d = eVar6;
                                }
                                while (eVar5 != null) {
                                    cVar.b(eVar5);
                                    eVar5 = eVar5.c;
                                }
                            }
                            eVar8.k += f10;
                        }
                    } else {
                        eVar4 = null;
                        if (f8 >= eVar8.n) {
                            if (eVar8.c != null) {
                                eVar5 = eVar8.c;
                                eVar6 = eVar4;
                                eVar8.c = eVar6;
                                if (eVar5 != null) {
                                    eVar5.d = eVar6;
                                }
                                while (eVar5 != null) {
                                    cVar.b(eVar5);
                                    eVar5 = eVar5.c;
                                }
                            }
                            eVar8.k += f10;
                        } else {
                            if (eVar8.c != null) {
                                eVar5 = eVar8.c;
                                eVar6 = eVar4;
                                eVar8.c = eVar6;
                                if (eVar5 != null) {
                                    eVar5.d = eVar6;
                                }
                                while (eVar5 != null) {
                                    cVar.b(eVar5);
                                    eVar5 = eVar5.c;
                                }
                            }
                            eVar8.k += f10;
                        }
                    }
                }
            }
            i14++;
        }
        cVar.a();
        if (zi0Var.g) {
            zi0Var.g = false;
            ncy<String> ncyVar3 = zi0Var.f;
            ncyVar3.b(2048);
            int i15 = mw0Var.b;
            zi0.e[] eVarArr5 = mw0Var.a;
            int i16 = 0;
            while (i16 < i15) {
                zi0.e eVar9 = eVarArr5[i16];
                if (eVar9 == null) {
                    ncyVar = ncyVar3;
                    i10 = i15;
                    eVarArr2 = eVarArr5;
                    i11 = i16;
                    i9 = i;
                    f5 = f2;
                } else {
                    while (true) {
                        zi0.e eVar10 = eVar9.c;
                        if (eVar10 == null) {
                            break;
                        } else {
                            eVar9 = eVar10;
                        }
                    }
                    while (true) {
                        zi0.e eVar11 = eVar9.d;
                        mw0<lh0.m0> mw0Var2 = eVar9.a.b;
                        lh0.m0[] m0VarArr2 = mw0Var2.a;
                        int i17 = mw0Var2.b;
                        int[] iArrA = eVar9.u.a(i17);
                        i9 = i;
                        mw0<zi0.e> mw0Var3 = eVar9.v;
                        mw0Var3.clear();
                        zi0.e[] eVarArrH = mw0Var3.h(i17);
                        int i18 = 0;
                        while (i18 < i17) {
                            float f13 = f2;
                            lh0.m0 m0Var3 = m0VarArr2[i18];
                            int i19 = i15;
                            String[] strArr = m0Var3.a;
                            if (ncyVar3.a(strArr)) {
                                ncyVar2 = ncyVar3;
                                if (eVar11 == null || (m0Var3 instanceof lh0.b) || (m0Var3 instanceof lh0.g) || (m0Var3 instanceof lh0.h)) {
                                    eVarArr3 = eVarArr5;
                                } else {
                                    lh0 lh0Var = eVar11.a;
                                    lh0Var.getClass();
                                    int length = strArr.length;
                                    eVarArr3 = eVarArr5;
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 < length) {
                                            int i21 = i20;
                                            i12 = i16;
                                            if (lh0Var.c.e(strArr[i21]) >= 0) {
                                                zi0.e eVar12 = eVar11.d;
                                                while (true) {
                                                    if (eVar12 != null) {
                                                        lh0 lh0Var2 = eVar12.a;
                                                        lh0Var2.getClass();
                                                        int length2 = strArr.length;
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 < length2) {
                                                                String[] strArr2 = strArr;
                                                                int i23 = length2;
                                                                if (lh0Var2.c.e(strArr2[i22]) >= 0) {
                                                                    eVar12 = eVar12.d;
                                                                    strArr = strArr2;
                                                                } else {
                                                                    i22++;
                                                                    length2 = i23;
                                                                    strArr = strArr2;
                                                                }
                                                            } else if (eVar12.r > f13) {
                                                                iArrA[i18] = 4;
                                                                eVarArrH[i18] = eVar12;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    iArrA[i18] = 3;
                                                    break;
                                                }
                                            } else {
                                                i20 = i21 + 1;
                                                i16 = i12;
                                            }
                                        }
                                    }
                                }
                                i12 = i16;
                                iArrA[i18] = i9;
                            } else {
                                iArrA[i18] = 0;
                                ncyVar2 = ncyVar3;
                                eVarArr3 = eVarArr5;
                                i12 = i16;
                            }
                            i18++;
                            i15 = i19;
                            f2 = f13;
                            ncyVar3 = ncyVar2;
                            eVarArr5 = eVarArr3;
                            i16 = i12;
                        }
                        ncyVar = ncyVar3;
                        i10 = i15;
                        eVarArr2 = eVarArr5;
                        i11 = i16;
                        f5 = f2;
                        eVar9 = eVar9.d;
                        if (eVar9 == null) {
                            break;
                        }
                        i = i9;
                        i15 = i10;
                        f2 = f5;
                        ncyVar3 = ncyVar;
                        eVarArr5 = eVarArr2;
                        i16 = i11;
                    }
                }
                i16 = i11 + 1;
                i = i9;
                i15 = i10;
                f2 = f5;
                ncyVar3 = ncyVar;
                eVarArr5 = eVarArr2;
            }
        }
        int i24 = i;
        float f14 = f2;
        mw0<whg> mw0Var4 = zi0Var.c;
        zi0.e[] eVarArr6 = mw0Var.a;
        int i25 = mw0Var.b;
        int i26 = 0;
        ?? r3 = zi0Var;
        while (true) {
            mx90Var = kb0Var.b;
            if (i26 >= i25) {
                break;
            }
            zi0.e eVar13 = eVarArr6[i26];
            if (eVar13 != null) {
                owh owhVar = eVar13.w;
                if (eVar13.j > f14) {
                    eVarArr = eVarArr6;
                    i2 = i25;
                    i3 = i26;
                } else {
                    lh0.k kVar2 = i26 == 0 ? lh0.k.b : lh0.k.c;
                    float fD = eVar13.p;
                    if (eVar13.c != null) {
                        fD *= r3.d(eVar13, mx90Var, kVar2);
                    } else {
                        if (eVar13.k >= eVar13.n && eVar13.b == null) {
                            f3 = f14;
                        }
                        if (f3 >= f14) {
                            r6 = i24;
                        } else {
                            r6 = 0;
                        }
                        i4 = i26;
                        f4 = eVar13.h;
                        fA = eVar13.a();
                        mw0<lh0.m0> mw0Var5 = eVar13.a.b;
                        i5 = mw0Var5.b;
                        m0VarArr = mw0Var5.a;
                        lVar = lh0.l.a;
                        if (i4 == 0 || f3 != 1.0f) {
                            r20 = r3;
                            r21 = r20;
                            if (kVar2 != lh0.k.d) {
                                i2 = i25;
                                i3 = i4;
                                r1 = r20;
                                eVarArr = eVarArr6;
                                eVar = eVar13;
                                iArr = eVar.u.a;
                                i6 = i5 << 1;
                                if (owhVar.b != i6) {
                                    r27 = i24;
                                } else {
                                    r27 = 0;
                                }
                                if (r27 != 0) {
                                    owhVar.d(i6);
                                }
                                fArr = owhVar.a;
                                i7 = 0;
                                while (i7 < i5) {
                                    m0Var = m0VarArr[i7];
                                    if (iArr[i7] == 0) {
                                        kVar = kVar2;
                                    } else {
                                        kVar = lh0.k.a;
                                    }
                                    int i27 = i5;
                                    if (m0Var instanceof lh0.d0) {
                                        fArr2 = fArr;
                                        zi0.e((lh0.d0) m0Var, mx90Var, fA, f3, kVar, fArr2, i7 << 1, r27);
                                    } else {
                                        fArr2 = fArr;
                                        if (m0Var instanceof lh0.b) {
                                            r1.c((lh0.b) m0Var, mx90Var, fA, kVar2, r6);
                                        } else {
                                            eVar = eVar;
                                            m0Var.b(mx90Var, f4, fA, mw0Var4, f3, kVar, lVar);
                                        }
                                        i7++;
                                        eVar = eVar;
                                        iArr = iArr;
                                        fArr = fArr2;
                                        i5 = i27;
                                    }
                                    i7++;
                                    eVar = eVar;
                                    iArr = iArr;
                                    fArr = fArr2;
                                    i5 = i27;
                                }
                                eVar2 = eVar;
                                r3 = r1;
                            }
                            r3.k(eVar2, fA);
                            mw0Var4.clear();
                            eVar2.i = fA;
                            eVar2.m = eVar2.k;
                        } else {
                            r21 = r3;
                        }
                        if (i4 == 0) {
                            r6 = i24;
                        }
                        i8 = 0;
                        r22 = r21;
                        while (i8 < i5) {
                            m0Var2 = m0VarArr[i8];
                            int i28 = i8;
                            if (m0Var2 instanceof lh0.b) {
                                r2 = r22;
                                r2.c((lh0.b) m0Var2, mx90Var, fA, kVar2, r6);
                                mx90Var2 = mx90Var;
                            } else {
                                r2 = r22;
                                mx90Var2 = mx90Var;
                                m0Var2.b(mx90Var2, f4, fA, mw0Var4, f3, kVar2, lVar);
                            }
                            r22 = r2;
                            i8 = i28 + 1;
                            eVar13 = eVar13;
                            mx90Var = mx90Var2;
                            eVarArr6 = eVarArr6;
                            i25 = i25;
                            i4 = i4;
                            m0VarArr = m0VarArr;
                        }
                        eVarArr = eVarArr6;
                        i2 = i25;
                        i3 = i4;
                        eVar2 = eVar13;
                        r3 = r22;
                        r3.k(eVar2, fA);
                        mw0Var4.clear();
                        eVar2.i = fA;
                        eVar2.m = eVar2.k;
                    }
                    f3 = fD;
                    if (f3 >= f14) {
                        r6 = i24;
                    } else {
                        r6 = 0;
                    }
                    i4 = i26;
                    f4 = eVar13.h;
                    fA = eVar13.a();
                    mw0<lh0.m0> mw0Var6 = eVar13.a.b;
                    i5 = mw0Var6.b;
                    m0VarArr = mw0Var6.a;
                    lVar = lh0.l.a;
                    if (i4 == 0) {
                        r20 = r3;
                        r21 = r20;
                        if (kVar2 != lh0.k.d) {
                            if (i4 == 0) {
                                r6 = i24;
                            }
                            i8 = 0;
                            r22 = r21;
                            while (i8 < i5) {
                                m0Var2 = m0VarArr[i8];
                                int i29 = i8;
                                if (m0Var2 instanceof lh0.b) {
                                    r2 = r22;
                                    r2.c((lh0.b) m0Var2, mx90Var, fA, kVar2, r6);
                                    mx90Var2 = mx90Var;
                                } else {
                                    r2 = r22;
                                    mx90Var2 = mx90Var;
                                    m0Var2.b(mx90Var2, f4, fA, mw0Var4, f3, kVar2, lVar);
                                }
                                r22 = r2;
                                i8 = i29 + 1;
                                eVar13 = eVar13;
                                mx90Var = mx90Var2;
                                eVarArr6 = eVarArr6;
                                i25 = i25;
                                i4 = i4;
                                m0VarArr = m0VarArr;
                            }
                            eVarArr = eVarArr6;
                            i2 = i25;
                            i3 = i4;
                            eVar2 = eVar13;
                            r3 = r22;
                        } else {
                            i2 = i25;
                            i3 = i4;
                            r1 = r20;
                            eVarArr = eVarArr6;
                            eVar = eVar13;
                            iArr = eVar.u.a;
                            i6 = i5 << 1;
                            if (owhVar.b != i6) {
                                r27 = i24;
                            } else {
                                r27 = 0;
                            }
                            if (r27 != 0) {
                                owhVar.d(i6);
                            }
                            fArr = owhVar.a;
                            i7 = 0;
                            while (i7 < i5) {
                                m0Var = m0VarArr[i7];
                                if (iArr[i7] == 0) {
                                    kVar = kVar2;
                                } else {
                                    kVar = lh0.k.a;
                                }
                                int i210 = i5;
                                if (m0Var instanceof lh0.d0) {
                                    fArr2 = fArr;
                                    zi0.e((lh0.d0) m0Var, mx90Var, fA, f3, kVar, fArr2, i7 << 1, r27);
                                } else {
                                    fArr2 = fArr;
                                    if (m0Var instanceof lh0.b) {
                                        r1.c((lh0.b) m0Var, mx90Var, fA, kVar2, r6);
                                    } else {
                                        eVar = eVar;
                                        m0Var.b(mx90Var, f4, fA, mw0Var4, f3, kVar, lVar);
                                    }
                                    i7++;
                                    eVar = eVar;
                                    iArr = iArr;
                                    fArr = fArr2;
                                    i5 = i210;
                                }
                                i7++;
                                eVar = eVar;
                                iArr = iArr;
                                fArr = fArr2;
                                i5 = i210;
                            }
                            eVar2 = eVar;
                            r3 = r1;
                        }
                    } else {
                        r20 = r3;
                        r21 = r20;
                        if (kVar2 != lh0.k.d) {
                            if (i4 == 0) {
                                r6 = i24;
                            }
                            i8 = 0;
                            r22 = r21;
                            while (i8 < i5) {
                                m0Var2 = m0VarArr[i8];
                                int i211 = i8;
                                if (m0Var2 instanceof lh0.b) {
                                    r2 = r22;
                                    r2.c((lh0.b) m0Var2, mx90Var, fA, kVar2, r6);
                                    mx90Var2 = mx90Var;
                                } else {
                                    r2 = r22;
                                    mx90Var2 = mx90Var;
                                    m0Var2.b(mx90Var2, f4, fA, mw0Var4, f3, kVar2, lVar);
                                }
                                r22 = r2;
                                i8 = i211 + 1;
                                eVar13 = eVar13;
                                mx90Var = mx90Var2;
                                eVarArr6 = eVarArr6;
                                i25 = i25;
                                i4 = i4;
                                m0VarArr = m0VarArr;
                            }
                            eVarArr = eVarArr6;
                            i2 = i25;
                            i3 = i4;
                            eVar2 = eVar13;
                            r3 = r22;
                        } else {
                            i2 = i25;
                            i3 = i4;
                            r1 = r20;
                            eVarArr = eVarArr6;
                            eVar = eVar13;
                            iArr = eVar.u.a;
                            i6 = i5 << 1;
                            if (owhVar.b != i6) {
                                r27 = i24;
                            } else {
                                r27 = 0;
                            }
                            if (r27 != 0) {
                                owhVar.d(i6);
                            }
                            fArr = owhVar.a;
                            i7 = 0;
                            while (i7 < i5) {
                                m0Var = m0VarArr[i7];
                                if (iArr[i7] == 0) {
                                    kVar = kVar2;
                                } else {
                                    kVar = lh0.k.a;
                                }
                                int i212 = i5;
                                if (m0Var instanceof lh0.d0) {
                                    fArr2 = fArr;
                                    zi0.e((lh0.d0) m0Var, mx90Var, fA, f3, kVar, fArr2, i7 << 1, r27);
                                } else {
                                    fArr2 = fArr;
                                    if (m0Var instanceof lh0.b) {
                                        r1.c((lh0.b) m0Var, mx90Var, fA, kVar2, r6);
                                    } else {
                                        eVar = eVar;
                                        m0Var.b(mx90Var, f4, fA, mw0Var4, f3, kVar, lVar);
                                    }
                                    i7++;
                                    eVar = eVar;
                                    iArr = iArr;
                                    fArr = fArr2;
                                    i5 = i212;
                                }
                                i7++;
                                eVar = eVar;
                                iArr = iArr;
                                fArr = fArr2;
                                i5 = i212;
                            }
                            eVar2 = eVar;
                            r3 = r1;
                        }
                    }
                    r3.k(eVar2, fA);
                    mw0Var4.clear();
                    eVar2.i = fA;
                    eVar2.m = eVar2.k;
                }
            } else {
                eVarArr = eVarArr6;
                i2 = i25;
                i3 = i26;
            }
            i26 = i3 + 1;
            kb0Var = this;
            eVarArr6 = eVarArr;
            i25 = i2;
            r3 = r3;
        }
        int i30 = r3.i + 1;
        mw0<g1a0> mw0Var7 = mx90Var.c;
        g1a0[] g1a0VarArr = mw0Var7.a;
        int i31 = mw0Var7.b;
        for (int i32 = 0; i32 < i31; i32++) {
            g1a0 g1a0Var = g1a0VarArr[i32];
            if (g1a0Var.h == i30) {
                h1a0 h1a0Var = g1a0Var.a;
                String str = h1a0Var.f;
                g1a0Var.a(str == null ? null : mx90Var.a(h1a0Var.a, str));
            }
        }
        r3.i += 2;
        cVar.a();
        mx90Var.p += f;
        mx90Var.k(mx90.a.b);
    }
}
