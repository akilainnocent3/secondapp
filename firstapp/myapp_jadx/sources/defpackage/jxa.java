package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jxa extends t6j0 {
    public int C0;
    public int D0;
    public int y0;
    public n92 w0 = new n92(this);
    public ymd x0 = new ymd(this);
    public n92.b z0 = null;
    public boolean A0 = false;
    public ofs B0 = new ofs();
    public int E0 = 0;
    public int F0 = 0;
    public ew6[] G0 = new ew6[4];
    public ew6[] H0 = new ew6[4];
    public int I0 = 257;
    public boolean J0 = false;
    public boolean K0 = false;
    public WeakReference<ewa> L0 = null;
    public WeakReference<ewa> M0 = null;
    public WeakReference<ewa> N0 = null;
    public WeakReference<ewa> O0 = null;
    public HashSet<ixa> P0 = new HashSet<>();
    public n92.a Q0 = new n92.a();

    public static void c0(ixa ixaVar, n92.b bVar, n92.a aVar) {
        int i;
        int i2;
        if (bVar == null) {
            return;
        }
        int i3 = ixaVar.j0;
        int[] iArr = ixaVar.u;
        if (i3 == 8 || (ixaVar instanceof qal) || (ixaVar instanceof vx1)) {
            aVar.e = 0;
            aVar.f = 0;
            return;
        }
        ixa.a[] aVarArr = ixaVar.V;
        aVar.a = aVarArr[0];
        aVar.b = aVarArr[1];
        aVar.c = ixaVar.s();
        aVar.d = ixaVar.m();
        aVar.i = false;
        aVar.j = 0;
        ixa.a aVar2 = aVar.a;
        ixa.a aVar3 = ixa.a.c;
        boolean z = aVar2 == aVar3;
        boolean z2 = aVar.b == aVar3;
        boolean z3 = z && ixaVar.Z > 0.0f;
        boolean z4 = z2 && ixaVar.Z > 0.0f;
        ixa.a aVar4 = ixa.a.b;
        ixa.a aVar5 = ixa.a.a;
        if (z && ixaVar.v(0) && ixaVar.s == 0 && !z3) {
            aVar.a = aVar4;
            if (z2 && ixaVar.t == 0) {
                aVar.a = aVar5;
            }
            z = false;
        }
        if (z2 && ixaVar.v(1) && ixaVar.t == 0 && !z4) {
            aVar.b = aVar4;
            if (z && ixaVar.s == 0) {
                aVar.b = aVar5;
            }
            z2 = false;
        }
        if (ixaVar.C()) {
            aVar.a = aVar5;
            z = false;
        }
        if (ixaVar.D()) {
            aVar.b = aVar5;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                aVar.a = aVar5;
            } else if (!z2) {
                if (aVar.b == aVar5) {
                    i2 = aVar.d;
                } else {
                    aVar.a = aVar4;
                    bVar.b(ixaVar, aVar);
                    i2 = aVar.f;
                }
                aVar.a = aVar5;
                aVar.c = (int) (ixaVar.Z * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                aVar.b = aVar5;
            } else if (!z) {
                if (aVar.a == aVar5) {
                    i = aVar.c;
                } else {
                    aVar.b = aVar4;
                    bVar.b(ixaVar, aVar);
                    i = aVar.e;
                }
                aVar.b = aVar5;
                int i4 = ixaVar.a0;
                float f = ixaVar.Z;
                if (i4 == -1) {
                    aVar.d = (int) (i / f);
                } else {
                    aVar.d = (int) (f * i);
                }
            }
        }
        bVar.b(ixaVar, aVar);
        ixaVar.T(aVar.e);
        ixaVar.O(aVar.f);
        ixaVar.F = aVar.h;
        ixaVar.K(aVar.g);
        aVar.j = 0;
    }

    @Override // defpackage.t6j0, defpackage.ixa
    public final void E() {
        this.B0.t();
        this.C0 = 0;
        this.D0 = 0;
        super.E();
    }

    @Override // defpackage.ixa
    public final void U(boolean z, boolean z2) {
        super.U(z, z2);
        int size = this.v0.size();
        for (int i = 0; i < size; i++) {
            this.v0.get(i).U(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:338:0x060c  */
    /* JADX WARN: Code duplicated, block: B:340:0x0615  */
    /* JADX WARN: Code duplicated, block: B:347:0x062e  */
    /* JADX WARN: Code duplicated, block: B:348:0x0635  */
    /* JADX WARN: Code duplicated, block: B:354:0x0648  */
    /* JADX WARN: Code duplicated, block: B:360:0x0660  */
    /* JADX WARN: Code duplicated, block: B:363:0x0666  */
    /* JADX WARN: Code duplicated, block: B:365:0x066e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:368:0x067c  */
    /* JADX WARN: Code duplicated, block: B:374:0x068c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0697  */
    /* JADX WARN: Code duplicated, block: B:381:0x06a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:383:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:386:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:390:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:393:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:395:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:399:0x06df  */
    /* JADX WARN: Code duplicated, block: B:404:0x06f3 A[Catch: Exception -> 0x0701, LOOP:12: B:403:0x06f1->B:404:0x06f3, LOOP_END, TryCatch #7 {Exception -> 0x0701, blocks: (B:402:0x06e9, B:404:0x06f3, B:407:0x0709), top: B:538:0x06e9 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x0710 A[Catch: Exception -> 0x0742, TryCatch #6 {Exception -> 0x0742, blocks: (B:408:0x070c, B:410:0x0710, B:412:0x0716), top: B:536:0x070c }] */
    /* JADX WARN: Code duplicated, block: B:426:0x074a  */
    /* JADX WARN: Code duplicated, block: B:429:0x0754 A[Catch: Exception -> 0x0735, TRY_ENTER, TryCatch #3 {Exception -> 0x0735, blocks: (B:416:0x072e, B:429:0x0754, B:431:0x075a, B:434:0x0778, B:436:0x077e, B:440:0x0794), top: B:530:0x072e }] */
    /* JADX WARN: Code duplicated, block: B:434:0x0778 A[Catch: Exception -> 0x0735, TRY_ENTER, TryCatch #3 {Exception -> 0x0735, blocks: (B:416:0x072e, B:429:0x0754, B:431:0x075a, B:434:0x0778, B:436:0x077e, B:440:0x0794), top: B:530:0x072e }] */
    /* JADX WARN: Code duplicated, block: B:446:0x07a3 A[Catch: Exception -> 0x07c9, TryCatch #2 {Exception -> 0x07c9, blocks: (B:427:0x0750, B:432:0x0774, B:444:0x079f, B:446:0x07a3, B:448:0x07a9), top: B:528:0x0750 }] */
    /* JADX WARN: Code duplicated, block: B:455:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:463:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:465:0x080c  */
    /* JADX WARN: Code duplicated, block: B:467:0x0822  */
    /* JADX WARN: Code duplicated, block: B:469:0x0826  */
    /* JADX WARN: Code duplicated, block: B:472:0x0832  */
    /* JADX WARN: Code duplicated, block: B:474:0x083b A[LOOP:15: B:473:0x0839->B:474:0x083b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:478:0x084e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:493:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:496:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:499:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:500:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:502:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:504:0x08fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:507:0x0903  */
    /* JADX WARN: Code duplicated, block: B:510:0x0915 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:514:0x092b A[PHI: r15 r23
      0x092b: PHI (r15v10 ??) = (r15v9 ??), (r15v14 ??), (r15v14 ??), (r15v14 ??) binds: [B:501:0x08f1, B:509:0x0913, B:510:0x0915, B:512:0x091b] A[DONT_GENERATE, DONT_INLINE]
      0x092b: PHI (r23v6 boolean) = (r23v5 boolean), (r23v7 boolean), (r23v7 boolean), (r23v7 boolean) binds: [B:501:0x08f1, B:509:0x0913, B:510:0x0915, B:512:0x091b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:516:0x0932  */
    /* JADX WARN: Code duplicated, block: B:517:0x0934  */
    /* JADX WARN: Code duplicated, block: B:521:0x0944  */
    /* JADX WARN: Code duplicated, block: B:586:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r32v0, types: [ixa, jxa, t6j0] */
    @Override // defpackage.t6j0
    public final void X() {
        ewa ewaVar;
        int i;
        ixa.a aVar;
        ixa.a aVar2;
        ixa.a aVar3;
        ewa ewaVar2;
        ixa.a aVar4;
        ofs ofsVar;
        int i2;
        boolean z;
        boolean z2;
        char c;
        ixa.a[] aVarArr;
        boolean z3;
        int i3;
        int i4;
        boolean zD0;
        boolean z4;
        int i5;
        ?? r15;
        boolean z5;
        int i6;
        ixa.a aVar5;
        boolean z6;
        boolean z7;
        ?? r16;
        boolean[] zArr;
        boolean[] zArr2;
        int i7;
        boolean z8;
        int iMax;
        boolean z9;
        int iMax2;
        ?? r14;
        ?? r17;
        ?? r2;
        int i8;
        ?? r18;
        boolean zD1;
        int size;
        int i9;
        boolean z10;
        ixa ixaVar;
        ?? r19;
        int i10;
        WeakReference<ewa> weakReference;
        ewa ewaVar3;
        WeakReference<ewa> weakReference2;
        WeakReference<ewa> weakReference3;
        WeakReference<ewa> weakReference4;
        ewa ewaVar4;
        ixa ixaVar2;
        ixa.a aVar6;
        int i11;
        ixa.a aVar7;
        v6j0 v6j0Var;
        v6j0 v6j0Var2;
        int i12;
        int iS;
        int i13;
        int iM;
        int size2;
        int i14;
        int i15;
        v6j0 v6j0Var3;
        int iB;
        v6j0 v6j0Var4;
        v6j0 v6j0Var5;
        int i16;
        ewa ewaVar5;
        ofs ofsVar2 = this.B0;
        this.b0 = 0;
        this.c0 = 0;
        this.J0 = false;
        this.K0 = false;
        int size3 = this.v0.size();
        int iMax3 = Math.max(0, s());
        int iMax4 = Math.max(0, m());
        ixa.a[] aVarArr2 = this.V;
        ixa.a aVar8 = aVarArr2[1];
        ixa.a aVar9 = aVarArr2[0];
        int i17 = this.y0;
        ixa.a aVar10 = ixa.a.c;
        ewa ewaVar6 = this.L;
        ewa ewaVar7 = this.K;
        ixa.a aVar11 = ixa.a.a;
        if (i17 == 0 && g2z.b(this.I0, 1)) {
            n92.b bVar = this.z0;
            ixa.a[] aVarArr3 = this.V;
            ixa.a aVar12 = aVarArr3[0];
            ixa.a aVar13 = aVarArr3[1];
            G();
            ArrayList<ixa> arrayList = this.v0;
            int size4 = arrayList.size();
            for (int i18 = 0; i18 < size4; i18++) {
                arrayList.get(i18).G();
            }
            boolean z11 = this.A0;
            if (aVar12 == aVar11) {
                M(0, s());
            } else {
                ewaVar7.l(0);
                this.b0 = 0;
            }
            boolean z12 = false;
            int i19 = 0;
            boolean z13 = false;
            while (i19 < size4) {
                boolean z14 = z12;
                ixa ixaVar3 = arrayList.get(i19);
                int i20 = i19;
                if (ixaVar3 instanceof qal) {
                    qal qalVar = (qal) ixaVar3;
                    ewaVar5 = ewaVar7;
                    if (qalVar.z0 == 1) {
                        int i21 = qalVar.w0;
                        if (i21 != -1) {
                            qalVar.W(i21);
                        } else if (qalVar.x0 != -1 && C()) {
                            qalVar.W(s() - qalVar.x0);
                        } else if (C()) {
                            qalVar.W((int) ((qalVar.v0 * s()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else {
                    ewaVar5 = ewaVar7;
                    if ((ixaVar3 instanceof vx1) && ((vx1) ixaVar3).b0() == 0) {
                        z12 = z14;
                        z13 = true;
                    }
                    i19 = i20 + 1;
                    ewaVar7 = ewaVar5;
                }
                z12 = z14;
                i19 = i20 + 1;
                ewaVar7 = ewaVar5;
            }
            ewaVar = ewaVar7;
            if (z12) {
                for (int i22 = 0; i22 < size4; i22 = i16 + 1) {
                    ixa ixaVar4 = arrayList.get(i22);
                    if (ixaVar4 instanceof qal) {
                        qal qalVar2 = (qal) ixaVar4;
                        i16 = i22;
                        if (qalVar2.z0 == 1) {
                            iqe.b(0, bVar, qalVar2, z11);
                        }
                    } else {
                        i16 = i22;
                    }
                }
            }
            iqe.b(0, bVar, this, z11);
            if (z13) {
                for (int i23 = 0; i23 < size4; i23++) {
                    ixa ixaVar5 = arrayList.get(i23);
                    if (ixaVar5 instanceof vx1) {
                        vx1 vx1Var = (vx1) ixaVar5;
                        if (vx1Var.b0() == 0 && vx1Var.a0()) {
                            iqe.b(1, bVar, vx1Var, z11);
                        }
                    }
                }
            }
            if (aVar13 == aVar11) {
                N(0, m());
            } else {
                ewaVar6.l(0);
                this.c0 = 0;
            }
            int i24 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i24 < size4) {
                ixa ixaVar6 = arrayList.get(i24);
                int i25 = i24;
                if (ixaVar6 instanceof qal) {
                    qal qalVar3 = (qal) ixaVar6;
                    if (qalVar3.z0 == 0) {
                        int i26 = qalVar3.w0;
                        if (i26 != -1) {
                            qalVar3.W(i26);
                        } else if (qalVar3.x0 != -1 && D()) {
                            qalVar3.W(m() - qalVar3.x0);
                        } else if (D()) {
                            qalVar3.W((int) ((qalVar3.v0 * m()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((ixaVar6 instanceof vx1) && ((vx1) ixaVar6).b0() == 1) {
                    z16 = true;
                }
                i24 = i25 + 1;
            }
            if (z15) {
                for (int i27 = 0; i27 < size4; i27++) {
                    ixa ixaVar7 = arrayList.get(i27);
                    if (ixaVar7 instanceof qal) {
                        qal qalVar4 = (qal) ixaVar7;
                        if (qalVar4.z0 == 0) {
                            iqe.g(1, bVar, qalVar4);
                        }
                    }
                }
            }
            iqe.g(0, bVar, this);
            if (z16) {
                for (int i28 = 0; i28 < size4; i28++) {
                    ixa ixaVar8 = arrayList.get(i28);
                    if (ixaVar8 instanceof vx1) {
                        vx1 vx1Var2 = (vx1) ixaVar8;
                        if (vx1Var2.b0() == 1 && vx1Var2.a0()) {
                            iqe.g(1, bVar, vx1Var2);
                        }
                    }
                }
            }
            for (int i29 = 0; i29 < size4; i29++) {
                ixa ixaVar9 = arrayList.get(i29);
                if (ixaVar9.B() && iqe.a(ixaVar9)) {
                    c0(ixaVar9, bVar, iqe.a);
                    if (!(ixaVar9 instanceof qal)) {
                        iqe.b(0, bVar, ixaVar9, z11);
                        iqe.g(0, bVar, ixaVar9);
                    } else if (((qal) ixaVar9).z0 == 0) {
                        iqe.g(0, bVar, ixaVar9);
                    } else {
                        iqe.b(0, bVar, ixaVar9, z11);
                    }
                }
            }
            for (int i30 = 0; i30 < size3; i30++) {
                ixa ixaVar10 = this.v0.get(i30);
                if (ixaVar10.B() && !(ixaVar10 instanceof qal) && !(ixaVar10 instanceof vx1) && !(ixaVar10 instanceof rfi0) && !ixaVar10.H) {
                    ixa.a aVarL = ixaVar10.l(0);
                    ixa.a aVarL2 = ixaVar10.l(1);
                    if (aVarL != aVar10 || ixaVar10.s == 1 || aVarL2 != aVar10 || ixaVar10.t == 1) {
                        c0(ixaVar10, this.z0, new n92.a());
                    }
                }
            }
        } else {
            ofsVar2 = ofsVar2;
            ewaVar = ewaVar7;
        }
        ixa.a aVar14 = ixa.a.b;
        if (size3 <= 2 || !((aVar9 == aVar14 || aVar8 == aVar14) && g2z.b(this.I0, 1024))) {
            i = size3;
            aVar = aVar14;
            aVar2 = aVar9;
            aVar3 = aVar8;
            ewaVar2 = ewaVar6;
            aVar4 = aVar11;
            ofsVar = ofsVar2;
            i2 = iMax3;
        } else {
            n92.b bVar2 = this.z0;
            ArrayList<ixa> arrayList2 = this.v0;
            int size5 = arrayList2.size();
            int i31 = 0;
            while (true) {
                if (i31 < size5) {
                    ixa ixaVar11 = arrayList2.get(i31);
                    ixa.a[] aVarArr4 = this.V;
                    ixa.a aVar15 = aVarArr4[0];
                    ixa.a aVar16 = aVarArr4[1];
                    int i32 = i31;
                    ixa.a[] aVarArr5 = ixaVar11.V;
                    ewaVar2 = ewaVar6;
                    if (d9l.b(aVar15, aVar16, aVarArr5[0], aVarArr5[1]) && !(ixaVar11 instanceof kyh)) {
                        i31 = i32 + 1;
                        ewaVar6 = ewaVar2;
                    } else {
                        i11 = iMax3;
                        i = size3;
                        aVar = aVar14;
                        aVar7 = aVar9;
                        aVar6 = aVar8;
                        aVar4 = aVar11;
                        ofsVar = ofsVar2;
                    }
                } else {
                    ewaVar2 = ewaVar6;
                    i = size3;
                    aVar6 = aVar8;
                    int i33 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i33 < size5) {
                        int i34 = i33;
                        ixa ixaVar12 = arrayList2.get(i33);
                        int i35 = iMax3;
                        ixa.a[] aVarArr6 = this.V;
                        ixa.a aVar17 = aVarArr6[0];
                        ixa.a aVar18 = aVar9;
                        ixa.a aVar19 = aVarArr6[1];
                        ixa.a aVar20 = aVar11;
                        ixa.a[] aVarArr7 = ixaVar12.V;
                        ixa.a aVar21 = aVar14;
                        if (!d9l.b(aVar17, aVar19, aVarArr7[0], aVarArr7[1])) {
                            c0(ixaVar12, bVar2, this.Q0);
                        }
                        boolean z17 = ixaVar12 instanceof qal;
                        if (z17) {
                            qal qalVar5 = (qal) ixaVar12;
                            if (qalVar5.z0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(qalVar5);
                            }
                            if (qalVar5.z0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(qalVar5);
                            }
                        }
                        if (ixaVar12 instanceof yil) {
                            if (ixaVar12 instanceof vx1) {
                                vx1 vx1Var3 = (vx1) ixaVar12;
                                if (vx1Var3.b0() == 0) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(vx1Var3);
                                }
                                if (vx1Var3.b0() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(vx1Var3);
                                }
                            } else {
                                yil yilVar = (yil) ixaVar12;
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(yilVar);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(yilVar);
                            }
                        }
                        if (ixaVar12.K.f == null && ixaVar12.M.f == null && !z17 && !(ixaVar12 instanceof vx1)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(ixaVar12);
                        }
                        if (ixaVar12.L.f == null && ixaVar12.N.f == null && ixaVar12.O.f == null && !z17 && !(ixaVar12 instanceof vx1)) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(ixaVar12);
                        }
                        i33 = i34 + 1;
                        iMax3 = i35;
                        aVar11 = aVar20;
                        aVar9 = aVar18;
                        aVar14 = aVar21;
                    }
                    i11 = iMax3;
                    ixa.a aVar22 = aVar14;
                    aVar7 = aVar9;
                    ixa.a aVar23 = aVar11;
                    ArrayList<v6j0> arrayList9 = new ArrayList<>();
                    if (arrayList3 != null) {
                        int size6 = arrayList3.size();
                        int i36 = 0;
                        while (i36 < size6) {
                            Object obj = arrayList3.get(i36);
                            i36++;
                            d9l.a((qal) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size7 = arrayList6.size();
                        int i37 = 0;
                        while (i37 < size7) {
                            Object obj2 = arrayList6.get(i37);
                            i37++;
                            yil yilVar2 = (yil) obj2;
                            v6j0 v6j0VarA = d9l.a(yilVar2, 0, arrayList9, null);
                            yilVar2.X(0, v6j0VarA, arrayList9);
                            v6j0VarA.a(arrayList9);
                        }
                    }
                    HashSet<ewa> hashSet = k(ewa.a.a).a;
                    if (hashSet != null) {
                        Iterator<ewa> it = hashSet.iterator();
                        while (it.hasNext()) {
                            d9l.a(it.next().d, 0, arrayList9, null);
                        }
                    }
                    HashSet<ewa> hashSet2 = k(ewa.a.c).a;
                    if (hashSet2 != null) {
                        Iterator<ewa> it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            d9l.a(it2.next().d, 0, arrayList9, null);
                        }
                    }
                    ewa.a aVar24 = ewa.a.f;
                    HashSet<ewa> hashSet3 = k(aVar24).a;
                    if (hashSet3 != null) {
                        Iterator<ewa> it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            d9l.a(it3.next().d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size8 = arrayList4.size();
                        int i38 = 0;
                        while (i38 < size8) {
                            Object obj3 = arrayList4.get(i38);
                            i38++;
                            d9l.a((ixa) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i39 = 0;
                        while (i39 < size9) {
                            Object obj4 = arrayList7.get(i39);
                            i39++;
                            d9l.a((qal) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i40 = 0;
                        while (i40 < size10) {
                            Object obj5 = arrayList8.get(i40);
                            i40++;
                            yil yilVar3 = (yil) obj5;
                            v6j0 v6j0VarA2 = d9l.a(yilVar3, 1, arrayList9, null);
                            yilVar3.X(1, v6j0VarA2, arrayList9);
                            v6j0VarA2.a(arrayList9);
                        }
                    }
                    HashSet<ewa> hashSet4 = k(ewa.a.b).a;
                    if (hashSet4 != null) {
                        Iterator<ewa> it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            d9l.a(it4.next().d, 1, arrayList9, null);
                        }
                    }
                    HashSet<ewa> hashSet5 = k(ewa.a.e).a;
                    if (hashSet5 != null) {
                        Iterator<ewa> it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            d9l.a(it5.next().d, 1, arrayList9, null);
                        }
                    }
                    HashSet<ewa> hashSet6 = k(ewa.a.d).a;
                    if (hashSet6 != null) {
                        Iterator<ewa> it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            d9l.a(it6.next().d, 1, arrayList9, null);
                        }
                    }
                    HashSet<ewa> hashSet7 = k(aVar24).a;
                    if (hashSet7 != null) {
                        Iterator<ewa> it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            d9l.a(it7.next().d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size11 = arrayList5.size();
                        int i41 = 0;
                        while (i41 < size11) {
                            Object obj6 = arrayList5.get(i41);
                            i41++;
                            d9l.a((ixa) obj6, 1, arrayList9, null);
                        }
                    }
                    char c2 = 1;
                    int i42 = 0;
                    while (i42 < size5) {
                        ixa ixaVar13 = arrayList2.get(i42);
                        ixa.a[] aVarArr8 = ixaVar13.V;
                        if (aVarArr8[0] == aVar10 && aVarArr8[c2] == aVar10) {
                            int i43 = ixaVar13.t0;
                            int size12 = arrayList9.size();
                            int i44 = 0;
                            while (true) {
                                if (i44 >= size12) {
                                    v6j0Var4 = null;
                                    break;
                                }
                                v6j0Var4 = arrayList9.get(i44);
                                if (i43 == v6j0Var4.b) {
                                    break;
                                } else {
                                    i44++;
                                }
                            }
                            int i45 = ixaVar13.u0;
                            int size13 = arrayList9.size();
                            int i46 = 0;
                            while (true) {
                                if (i46 >= size13) {
                                    v6j0Var5 = null;
                                    break;
                                }
                                v6j0Var5 = arrayList9.get(i46);
                                if (i45 == v6j0Var5.b) {
                                    break;
                                } else {
                                    i46++;
                                }
                            }
                            if (v6j0Var4 != null && v6j0Var5 != null) {
                                v6j0Var4.c(0, v6j0Var5);
                                v6j0Var5.c = 2;
                                arrayList9.remove(v6j0Var4);
                            }
                        }
                        i42++;
                        c2 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        aVar = aVar22;
                        if (this.V[0] == aVar) {
                            int size14 = arrayList9.size();
                            int i47 = 0;
                            int i48 = 0;
                            v6j0Var = null;
                            while (i48 < size14) {
                                v6j0 v6j0Var6 = arrayList9.get(i48);
                                i48++;
                                v6j0 v6j0Var7 = v6j0Var6;
                                if (v6j0Var7.c != 1) {
                                    ofs ofsVar3 = ofsVar2;
                                    int iB2 = v6j0Var7.b(ofsVar3, 0);
                                    if (iB2 > i47) {
                                        v6j0Var = v6j0Var7;
                                        i47 = iB2;
                                    }
                                    ofsVar2 = ofsVar3;
                                }
                            }
                            ofsVar = ofsVar2;
                            aVar4 = aVar23;
                            if (v6j0Var != null) {
                                P(aVar4);
                                T(i47);
                            }
                            if (this.V[1] == aVar) {
                                size2 = arrayList9.size();
                                i14 = 0;
                                i15 = 0;
                                v6j0Var2 = null;
                                while (i15 < size2) {
                                    v6j0 v6j0Var8 = arrayList9.get(i15);
                                    i15++;
                                    v6j0Var3 = v6j0Var8;
                                    if (v6j0Var3.c != 0 && (iB = v6j0Var3.b(ofsVar, 1)) > i14) {
                                        v6j0Var2 = v6j0Var3;
                                        i14 = iB;
                                    }
                                }
                                if (v6j0Var2 != null) {
                                    R(aVar4);
                                    O(i14);
                                } else {
                                    v6j0Var2 = null;
                                }
                            } else {
                                v6j0Var2 = null;
                            }
                            if (v6j0Var == null || v6j0Var2 != null) {
                                aVar2 = aVar7;
                                if (aVar2 == aVar) {
                                    i12 = i11;
                                    if (i12 < s() || i12 <= 0) {
                                        iS = s();
                                    } else {
                                        T(i12);
                                        this.J0 = true;
                                    }
                                    aVar3 = aVar6;
                                    if (aVar3 == aVar) {
                                        i13 = iMax4;
                                        if (i13 < m() || i13 <= 0) {
                                            iM = m();
                                        } else {
                                            O(i13);
                                            this.K0 = true;
                                        }
                                        iMax4 = iM;
                                        i2 = iS;
                                        z = true;
                                    } else {
                                        i13 = iMax4;
                                    }
                                    iM = i13;
                                    iMax4 = iM;
                                    i2 = iS;
                                    z = true;
                                } else {
                                    i12 = i11;
                                }
                                iS = i12;
                                aVar3 = aVar6;
                                if (aVar3 == aVar) {
                                    i13 = iMax4;
                                    if (i13 < m()) {
                                    }
                                    iM = m();
                                    iMax4 = iM;
                                    i2 = iS;
                                    z = true;
                                } else {
                                    i13 = iMax4;
                                }
                                iM = i13;
                                iMax4 = iM;
                                i2 = iS;
                                z = true;
                            }
                            if (!d0(64) || d0(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ofsVar.getClass();
                            ofsVar.h = false;
                            if (this.I0 == 0 && z2) {
                                c = 1;
                                ofsVar.h = true;
                            } else {
                                c = 1;
                            }
                            ArrayList<ixa> arrayList10 = this.v0;
                            aVarArr = this.V;
                            if (aVarArr[0] != aVar || aVarArr[c] == aVar) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.E0 = 0;
                            this.F0 = 0;
                            i3 = i;
                            for (i4 = 0; i4 < i3; i4++) {
                                ixaVar2 = this.v0.get(i4);
                                if (ixaVar2 instanceof t6j0) {
                                    ((t6j0) ixaVar2).X();
                                }
                            }
                            zD0 = d0(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                try {
                                    ofsVar.t();
                                    aVar5 = aVar4;
                                    try {
                                        this.E0 = 0;
                                        this.F0 = 0;
                                        i(ofsVar);
                                        for (i10 = 0; i10 < i3; i10++) {
                                            this.v0.get(i10).i(ofsVar);
                                        }
                                        Z(ofsVar);
                                        try {
                                            weakReference = this.L0;
                                            if (weakReference != null || weakReference.get() == null) {
                                                z6 = z3;
                                                z7 = z4;
                                                ewaVar3 = ewaVar2;
                                            } else {
                                                ewaVar3 = ewaVar2;
                                                try {
                                                    z6 = z3;
                                                    z7 = z4;
                                                    try {
                                                        ofsVar.f(ofsVar.k(this.L0.get()), ofsVar.k(ewaVar3), 0, 5);
                                                        this.L0 = null;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        ewaVar2 = ewaVar3;
                                                        r19 = 1;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r16 = r19;
                                                        zArr = g2z.a;
                                                        if (r16 != 0) {
                                                            zArr[2] = false;
                                                            zD1 = d0(64);
                                                            V(ofsVar, zD1);
                                                            size = this.v0.size();
                                                            i9 = 0;
                                                            z10 = false;
                                                            while (i9 < size) {
                                                                boolean[] zArr3 = zArr;
                                                                ixaVar = this.v0.get(i9);
                                                                ixaVar.V(ofsVar, zD1);
                                                                int i49 = i9;
                                                                boolean z18 = zD1;
                                                                if (ixaVar.h == -1) {
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = true;
                                                                }
                                                                i9 = i49 + 1;
                                                                zArr = zArr3;
                                                                zD1 = z18;
                                                                z10 = z10;
                                                            }
                                                            zArr2 = zArr;
                                                            z8 = z10;
                                                        } else {
                                                            zArr2 = zArr;
                                                            V(ofsVar, zD0);
                                                            for (i7 = 0; i7 < i3; i7++) {
                                                                this.v0.get(i7).V(ofsVar, zD0);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (!z6) {
                                                        }
                                                        iMax = Math.max(this.e0, s());
                                                        z9 = z8;
                                                        if (iMax > s()) {
                                                            T(iMax);
                                                            this.V[0] = aVar5;
                                                            z9 = true;
                                                            z7 = true;
                                                        }
                                                        iMax2 = Math.max(this.f0, m());
                                                        if (iMax2 > m()) {
                                                            O(iMax2);
                                                            r14 = 1;
                                                            this.V[1] = aVar5;
                                                            r17 = 1;
                                                            z7 = true;
                                                        } else {
                                                            r14 = 1;
                                                        }
                                                        if (z7) {
                                                            r17 = z9;
                                                            r2 = r17;
                                                            z4 = z7;
                                                            i8 = 8;
                                                        } else {
                                                            r17 = z9;
                                                            if (this.V[0] == aVar) {
                                                                r17 = r17;
                                                                if (s() > i2) {
                                                                    this.J0 = r14;
                                                                    this.V[0] = aVar5;
                                                                    T(i2);
                                                                    ?? r110 = r14;
                                                                    z7 = r110 == true ? 1 : 0;
                                                                    r17 = r110;
                                                                }
                                                            }
                                                            r17 = r17;
                                                            r17 = r17;
                                                            if (this.V[r14] == aVar) {
                                                                r17 = z9;
                                                                r2 = r17;
                                                                z4 = z7;
                                                                i8 = 8;
                                                            } else {
                                                                r17 = z9;
                                                                r2 = r17;
                                                                z4 = z7;
                                                                i8 = 8;
                                                            }
                                                        }
                                                        if (i6 > i8) {
                                                            r18 = 0;
                                                        } else {
                                                            r18 = r2;
                                                        }
                                                        i5 = i6;
                                                        z3 = z6;
                                                        aVar4 = aVar5;
                                                        r15 = r18;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    z6 = z3;
                                                    z7 = z4;
                                                }
                                            }
                                            try {
                                                weakReference2 = this.N0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                                    this.N0 = null;
                                                }
                                                weakReference3 = this.M0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    ewaVar4 = ewaVar;
                                                    try {
                                                        ewaVar = ewaVar4;
                                                        ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                                        this.M0 = null;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        ewaVar = ewaVar4;
                                                        ewaVar2 = ewaVar3;
                                                        r19 = 1;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r16 = r19;
                                                    }
                                                }
                                                weakReference4 = this.O0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    ofsVar.f(ofsVar.k(this.M), ofsVar.k(this.O0.get()), 0, 5);
                                                    try {
                                                        this.O0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        ewaVar2 = ewaVar3;
                                                        r19 = 1;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r16 = r19;
                                                    }
                                                }
                                                ofsVar.p();
                                                ewaVar2 = ewaVar3;
                                                r16 = 1;
                                            } catch (Exception e5) {
                                                e = e5;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            z6 = z3;
                                            z7 = z4;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        z6 = z3;
                                        z7 = z4;
                                        r19 = r15;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        r16 = r19;
                                        zArr = g2z.a;
                                        if (r16 != 0) {
                                            zArr[2] = false;
                                            zD1 = d0(64);
                                            V(ofsVar, zD1);
                                            size = this.v0.size();
                                            i9 = 0;
                                            z10 = false;
                                            while (i9 < size) {
                                                boolean[] zArr4 = zArr;
                                                ixaVar = this.v0.get(i9);
                                                ixaVar.V(ofsVar, zD1);
                                                int i410 = i9;
                                                boolean z19 = zD1;
                                                if (ixaVar.h == -1) {
                                                    z10 = true;
                                                } else {
                                                    z10 = true;
                                                }
                                                i9 = i410 + 1;
                                                zArr = zArr4;
                                                zD1 = z19;
                                                z10 = z10;
                                            }
                                            zArr2 = zArr;
                                            z8 = z10;
                                        } else {
                                            zArr2 = zArr;
                                            V(ofsVar, zD0);
                                            while (i7 < i3) {
                                                this.v0.get(i7).V(ofsVar, zD0);
                                            }
                                            z8 = false;
                                        }
                                        if (!z6) {
                                        }
                                        iMax = Math.max(this.e0, s());
                                        z9 = z8;
                                        if (iMax > s()) {
                                            T(iMax);
                                            this.V[0] = aVar5;
                                            z9 = true;
                                            z7 = true;
                                        }
                                        iMax2 = Math.max(this.f0, m());
                                        if (iMax2 > m()) {
                                            O(iMax2);
                                            r14 = 1;
                                            this.V[1] = aVar5;
                                            r17 = 1;
                                            z7 = true;
                                        } else {
                                            r14 = 1;
                                        }
                                        if (z7) {
                                            r17 = z9;
                                            if (this.V[0] == aVar) {
                                                r17 = r17;
                                                if (s() > i2) {
                                                    this.J0 = r14;
                                                    this.V[0] = aVar5;
                                                    T(i2);
                                                    ?? r111 = r14;
                                                    z7 = r111 == true ? 1 : 0;
                                                    r17 = r111;
                                                }
                                            }
                                            r17 = r17;
                                            r17 = r17;
                                            if (this.V[r14] == aVar) {
                                                r17 = z9;
                                                r2 = r17;
                                                z4 = z7;
                                                i8 = 8;
                                            } else {
                                                r17 = z9;
                                                r2 = r17;
                                                z4 = z7;
                                                i8 = 8;
                                            }
                                        } else {
                                            r17 = z9;
                                            r2 = r17;
                                            z4 = z7;
                                            i8 = 8;
                                        }
                                        if (i6 > i8) {
                                            r18 = 0;
                                        } else {
                                            r18 = r2;
                                        }
                                        i5 = i6;
                                        z3 = z6;
                                        aVar4 = aVar5;
                                        r15 = r18;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    aVar5 = aVar4;
                                }
                                zArr = g2z.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(ofsVar, zD1);
                                    size = this.v0.size();
                                    i9 = 0;
                                    z10 = false;
                                    while (i9 < size) {
                                        boolean[] zArr5 = zArr;
                                        ixaVar = this.v0.get(i9);
                                        ixaVar.V(ofsVar, zD1);
                                        int i411 = i9;
                                        boolean z110 = zD1;
                                        if (ixaVar.h == -1 || ixaVar.i != -1) {
                                            z10 = true;
                                        }
                                        i9 = i411 + 1;
                                        zArr = zArr5;
                                        zD1 = z110;
                                        z10 = z10;
                                    }
                                    zArr2 = zArr;
                                    z8 = z10;
                                } else {
                                    zArr2 = zArr;
                                    V(ofsVar, zD0);
                                    while (i7 < i3) {
                                        this.v0.get(i7).V(ofsVar, zD0);
                                    }
                                    z8 = false;
                                }
                                if (!z6 && i6 < 8) {
                                    if (zArr2[2]) {
                                        int iMax5 = 0;
                                        int iMax6 = 0;
                                        for (int i50 = 0; i50 < i3; i50++) {
                                            ixa ixaVar14 = this.v0.get(i50);
                                            iMax6 = Math.max(iMax6, ixaVar14.s() + ixaVar14.b0);
                                            iMax5 = Math.max(iMax5, ixaVar14.m() + ixaVar14.c0);
                                        }
                                        int iMax7 = Math.max(this.e0, iMax6);
                                        int iMax8 = Math.max(this.f0, iMax5);
                                        z8 = z8;
                                        if (aVar2 == aVar && s() < iMax7) {
                                            z8 = z8;
                                            T(iMax7);
                                            this.V[0] = aVar;
                                            z8 = true;
                                            z7 = true;
                                        }
                                        if (aVar3 == aVar && m() < iMax8) {
                                            O(iMax8);
                                            this.V[1] = aVar;
                                            z8 = true;
                                            z7 = true;
                                        }
                                    }
                                }
                                iMax = Math.max(this.e0, s());
                                z9 = z8;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.V[0] = aVar5;
                                    z9 = true;
                                    z7 = true;
                                }
                                iMax2 = Math.max(this.f0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r14 = 1;
                                    this.V[1] = aVar5;
                                    r17 = 1;
                                    z7 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z7) {
                                    r17 = z9;
                                    if (this.V[0] == aVar && i2 > 0) {
                                        r17 = r17;
                                        if (s() > i2) {
                                            this.J0 = r14;
                                            this.V[0] = aVar5;
                                            T(i2);
                                            ?? r112 = r14;
                                            z7 = r112 == true ? 1 : 0;
                                            r17 = r112;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.V[r14] == aVar || iMax4 <= 0 || m() <= iMax4) {
                                        r17 = z9;
                                        r2 = r17;
                                        z4 = z7;
                                        i8 = 8;
                                    } else {
                                        this.K0 = r14;
                                        this.V[r14] = aVar5;
                                        O(iMax4);
                                        i8 = 8;
                                        r2 = 1;
                                        z4 = true;
                                    }
                                } else {
                                    r17 = z9;
                                    r2 = r17;
                                    z4 = z7;
                                    i8 = 8;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                } else {
                                    r18 = r2;
                                }
                                i5 = i6;
                                z3 = z6;
                                aVar4 = aVar5;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.v0 = arrayList10;
                            if (z5) {
                                ixa.a[] aVarArr9 = this.V;
                                aVarArr9[0] = aVar2;
                                aVarArr9[1] = aVar3;
                            }
                            H(ofsVar.m);
                        }
                        ofsVar = ofsVar2;
                        aVar4 = aVar23;
                        v6j0Var = null;
                        if (this.V[1] == aVar) {
                            size2 = arrayList9.size();
                            i14 = 0;
                            i15 = 0;
                            v6j0Var2 = null;
                            while (i15 < size2) {
                                v6j0 v6j0Var9 = arrayList9.get(i15);
                                i15++;
                                v6j0Var3 = v6j0Var9;
                                if (v6j0Var3.c != 0) {
                                    v6j0Var2 = v6j0Var3;
                                    i14 = iB;
                                }
                            }
                            if (v6j0Var2 != null) {
                                R(aVar4);
                                O(i14);
                            } else {
                                v6j0Var2 = null;
                            }
                        } else {
                            v6j0Var2 = null;
                        }
                        if (v6j0Var == null) {
                        }
                        aVar2 = aVar7;
                        if (aVar2 == aVar) {
                            i12 = i11;
                            if (i12 < s()) {
                            }
                            iS = s();
                            aVar3 = aVar6;
                            if (aVar3 == aVar) {
                                i13 = iMax4;
                                if (i13 < m()) {
                                }
                                iM = m();
                                iMax4 = iM;
                                i2 = iS;
                                z = true;
                                if (d0(64)) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                ofsVar.getClass();
                                ofsVar.h = false;
                                if (this.I0 == 0) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                ArrayList<ixa> arrayList11 = this.v0;
                                aVarArr = this.V;
                                if (aVarArr[0] != aVar) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.E0 = 0;
                                this.F0 = 0;
                                i3 = i;
                                while (i4 < i3) {
                                    ixaVar2 = this.v0.get(i4);
                                    if (ixaVar2 instanceof t6j0) {
                                        ((t6j0) ixaVar2).X();
                                    }
                                }
                                zD0 = d0(64);
                                z4 = z;
                                i5 = 0;
                                r15 = 1;
                                while (r15 != 0) {
                                    i6 = i5 + 1;
                                    ofsVar.t();
                                    aVar5 = aVar4;
                                    this.E0 = 0;
                                    this.F0 = 0;
                                    i(ofsVar);
                                    while (i10 < i3) {
                                        this.v0.get(i10).i(ofsVar);
                                    }
                                    Z(ofsVar);
                                    weakReference = this.L0;
                                    if (weakReference != null) {
                                        z6 = z3;
                                        z7 = z4;
                                        ewaVar3 = ewaVar2;
                                        weakReference2 = this.N0;
                                        if (weakReference2 != null) {
                                            ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                            this.N0 = null;
                                        }
                                        weakReference3 = this.M0;
                                        if (weakReference3 != null) {
                                            ewaVar4 = ewaVar;
                                            ewaVar = ewaVar4;
                                            ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                            this.M0 = null;
                                        }
                                        weakReference4 = this.O0;
                                        if (weakReference4 == null) {
                                        }
                                        ofsVar.p();
                                        ewaVar2 = ewaVar3;
                                        r16 = 1;
                                    } else {
                                        z6 = z3;
                                        z7 = z4;
                                        ewaVar3 = ewaVar2;
                                        weakReference2 = this.N0;
                                        if (weakReference2 != null) {
                                            ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                            this.N0 = null;
                                        }
                                        weakReference3 = this.M0;
                                        if (weakReference3 != null) {
                                            ewaVar4 = ewaVar;
                                            ewaVar = ewaVar4;
                                            ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                            this.M0 = null;
                                        }
                                        weakReference4 = this.O0;
                                        if (weakReference4 == null) {
                                        }
                                        ofsVar.p();
                                        ewaVar2 = ewaVar3;
                                        r16 = 1;
                                    }
                                    zArr = g2z.a;
                                    if (r16 != 0) {
                                        zArr[2] = false;
                                        zD1 = d0(64);
                                        V(ofsVar, zD1);
                                        size = this.v0.size();
                                        i9 = 0;
                                        z10 = false;
                                        while (i9 < size) {
                                            boolean[] zArr6 = zArr;
                                            ixaVar = this.v0.get(i9);
                                            ixaVar.V(ofsVar, zD1);
                                            int i412 = i9;
                                            boolean z111 = zD1;
                                            if (ixaVar.h == -1) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            i9 = i412 + 1;
                                            zArr = zArr6;
                                            zD1 = z111;
                                            z10 = z10;
                                        }
                                        zArr2 = zArr;
                                        z8 = z10;
                                    } else {
                                        zArr2 = zArr;
                                        V(ofsVar, zD0);
                                        while (i7 < i3) {
                                            this.v0.get(i7).V(ofsVar, zD0);
                                        }
                                        z8 = false;
                                    }
                                    if (!z6) {
                                    }
                                    iMax = Math.max(this.e0, s());
                                    z9 = z8;
                                    if (iMax > s()) {
                                        T(iMax);
                                        this.V[0] = aVar5;
                                        z9 = true;
                                        z7 = true;
                                    }
                                    iMax2 = Math.max(this.f0, m());
                                    if (iMax2 > m()) {
                                        O(iMax2);
                                        r14 = 1;
                                        this.V[1] = aVar5;
                                        r17 = 1;
                                        z7 = true;
                                    } else {
                                        r14 = 1;
                                    }
                                    if (z7) {
                                        r17 = z9;
                                        if (this.V[0] == aVar) {
                                            r17 = r17;
                                            if (s() > i2) {
                                                this.J0 = r14;
                                                this.V[0] = aVar5;
                                                T(i2);
                                                ?? r113 = r14;
                                                z7 = r113 == true ? 1 : 0;
                                                r17 = r113;
                                            }
                                        }
                                        r17 = r17;
                                        r17 = r17;
                                        if (this.V[r14] == aVar) {
                                            r17 = z9;
                                            r2 = r17;
                                            z4 = z7;
                                            i8 = 8;
                                        } else {
                                            r17 = z9;
                                            r2 = r17;
                                            z4 = z7;
                                            i8 = 8;
                                        }
                                    } else {
                                        r17 = z9;
                                        r2 = r17;
                                        z4 = z7;
                                        i8 = 8;
                                    }
                                    if (i6 > i8) {
                                        r18 = 0;
                                    } else {
                                        r18 = r2;
                                    }
                                    i5 = i6;
                                    z3 = z6;
                                    aVar4 = aVar5;
                                    r15 = r18;
                                }
                                z5 = z4;
                                this.v0 = arrayList11;
                                if (z5) {
                                    ixa.a[] aVarArr10 = this.V;
                                    aVarArr10[0] = aVar2;
                                    aVarArr10[1] = aVar3;
                                }
                                H(ofsVar.m);
                            }
                            i13 = iMax4;
                            iM = i13;
                            iMax4 = iM;
                            i2 = iS;
                            z = true;
                            if (d0(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            ofsVar.getClass();
                            ofsVar.h = false;
                            if (this.I0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList<ixa> arrayList12 = this.v0;
                            aVarArr = this.V;
                            if (aVarArr[0] != aVar) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.E0 = 0;
                            this.F0 = 0;
                            i3 = i;
                            while (i4 < i3) {
                                ixaVar2 = this.v0.get(i4);
                                if (ixaVar2 instanceof t6j0) {
                                    ((t6j0) ixaVar2).X();
                                }
                            }
                            zD0 = d0(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                ofsVar.t();
                                aVar5 = aVar4;
                                this.E0 = 0;
                                this.F0 = 0;
                                i(ofsVar);
                                while (i10 < i3) {
                                    this.v0.get(i10).i(ofsVar);
                                }
                                Z(ofsVar);
                                weakReference = this.L0;
                                if (weakReference != null) {
                                    z6 = z3;
                                    z7 = z4;
                                    ewaVar3 = ewaVar2;
                                    weakReference2 = this.N0;
                                    if (weakReference2 != null) {
                                        ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                        this.N0 = null;
                                    }
                                    weakReference3 = this.M0;
                                    if (weakReference3 != null) {
                                        ewaVar4 = ewaVar;
                                        ewaVar = ewaVar4;
                                        ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference4 = this.O0;
                                    if (weakReference4 == null) {
                                    }
                                    ofsVar.p();
                                    ewaVar2 = ewaVar3;
                                    r16 = 1;
                                } else {
                                    z6 = z3;
                                    z7 = z4;
                                    ewaVar3 = ewaVar2;
                                    weakReference2 = this.N0;
                                    if (weakReference2 != null) {
                                        ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                        this.N0 = null;
                                    }
                                    weakReference3 = this.M0;
                                    if (weakReference3 != null) {
                                        ewaVar4 = ewaVar;
                                        ewaVar = ewaVar4;
                                        ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference4 = this.O0;
                                    if (weakReference4 == null) {
                                    }
                                    ofsVar.p();
                                    ewaVar2 = ewaVar3;
                                    r16 = 1;
                                }
                                zArr = g2z.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(ofsVar, zD1);
                                    size = this.v0.size();
                                    i9 = 0;
                                    z10 = false;
                                    while (i9 < size) {
                                        boolean[] zArr7 = zArr;
                                        ixaVar = this.v0.get(i9);
                                        ixaVar.V(ofsVar, zD1);
                                        int i413 = i9;
                                        boolean z112 = zD1;
                                        if (ixaVar.h == -1) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        i9 = i413 + 1;
                                        zArr = zArr7;
                                        zD1 = z112;
                                        z10 = z10;
                                    }
                                    zArr2 = zArr;
                                    z8 = z10;
                                } else {
                                    zArr2 = zArr;
                                    V(ofsVar, zD0);
                                    while (i7 < i3) {
                                        this.v0.get(i7).V(ofsVar, zD0);
                                    }
                                    z8 = false;
                                }
                                if (!z6) {
                                }
                                iMax = Math.max(this.e0, s());
                                z9 = z8;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.V[0] = aVar5;
                                    z9 = true;
                                    z7 = true;
                                }
                                iMax2 = Math.max(this.f0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r14 = 1;
                                    this.V[1] = aVar5;
                                    r17 = 1;
                                    z7 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z7) {
                                    r17 = z9;
                                    if (this.V[0] == aVar) {
                                        r17 = r17;
                                        if (s() > i2) {
                                            this.J0 = r14;
                                            this.V[0] = aVar5;
                                            T(i2);
                                            ?? r114 = r14;
                                            z7 = r114 == true ? 1 : 0;
                                            r17 = r114;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.V[r14] == aVar) {
                                        r17 = z9;
                                        r2 = r17;
                                        z4 = z7;
                                        i8 = 8;
                                    } else {
                                        r17 = z9;
                                        r2 = r17;
                                        z4 = z7;
                                        i8 = 8;
                                    }
                                } else {
                                    r17 = z9;
                                    r2 = r17;
                                    z4 = z7;
                                    i8 = 8;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                } else {
                                    r18 = r2;
                                }
                                i5 = i6;
                                z3 = z6;
                                aVar4 = aVar5;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.v0 = arrayList12;
                            if (z5) {
                                ixa.a[] aVarArr11 = this.V;
                                aVarArr11[0] = aVar2;
                                aVarArr11[1] = aVar3;
                            }
                            H(ofsVar.m);
                        }
                        i12 = i11;
                        iS = i12;
                        aVar3 = aVar6;
                        if (aVar3 == aVar) {
                            i13 = iMax4;
                            if (i13 < m()) {
                            }
                            iM = m();
                            iMax4 = iM;
                            i2 = iS;
                            z = true;
                            if (d0(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            ofsVar.getClass();
                            ofsVar.h = false;
                            if (this.I0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList<ixa> arrayList13 = this.v0;
                            aVarArr = this.V;
                            if (aVarArr[0] != aVar) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.E0 = 0;
                            this.F0 = 0;
                            i3 = i;
                            while (i4 < i3) {
                                ixaVar2 = this.v0.get(i4);
                                if (ixaVar2 instanceof t6j0) {
                                    ((t6j0) ixaVar2).X();
                                }
                            }
                            zD0 = d0(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                ofsVar.t();
                                aVar5 = aVar4;
                                this.E0 = 0;
                                this.F0 = 0;
                                i(ofsVar);
                                while (i10 < i3) {
                                    this.v0.get(i10).i(ofsVar);
                                }
                                Z(ofsVar);
                                weakReference = this.L0;
                                if (weakReference != null) {
                                    z6 = z3;
                                    z7 = z4;
                                    ewaVar3 = ewaVar2;
                                    weakReference2 = this.N0;
                                    if (weakReference2 != null) {
                                        ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                        this.N0 = null;
                                    }
                                    weakReference3 = this.M0;
                                    if (weakReference3 != null) {
                                        ewaVar4 = ewaVar;
                                        ewaVar = ewaVar4;
                                        ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference4 = this.O0;
                                    if (weakReference4 == null) {
                                    }
                                    ofsVar.p();
                                    ewaVar2 = ewaVar3;
                                    r16 = 1;
                                } else {
                                    z6 = z3;
                                    z7 = z4;
                                    ewaVar3 = ewaVar2;
                                    weakReference2 = this.N0;
                                    if (weakReference2 != null) {
                                        ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                        this.N0 = null;
                                    }
                                    weakReference3 = this.M0;
                                    if (weakReference3 != null) {
                                        ewaVar4 = ewaVar;
                                        ewaVar = ewaVar4;
                                        ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference4 = this.O0;
                                    if (weakReference4 == null) {
                                    }
                                    ofsVar.p();
                                    ewaVar2 = ewaVar3;
                                    r16 = 1;
                                }
                                zArr = g2z.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(ofsVar, zD1);
                                    size = this.v0.size();
                                    i9 = 0;
                                    z10 = false;
                                    while (i9 < size) {
                                        boolean[] zArr8 = zArr;
                                        ixaVar = this.v0.get(i9);
                                        ixaVar.V(ofsVar, zD1);
                                        int i414 = i9;
                                        boolean z113 = zD1;
                                        if (ixaVar.h == -1) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        i9 = i414 + 1;
                                        zArr = zArr8;
                                        zD1 = z113;
                                        z10 = z10;
                                    }
                                    zArr2 = zArr;
                                    z8 = z10;
                                } else {
                                    zArr2 = zArr;
                                    V(ofsVar, zD0);
                                    while (i7 < i3) {
                                        this.v0.get(i7).V(ofsVar, zD0);
                                    }
                                    z8 = false;
                                }
                                if (!z6) {
                                }
                                iMax = Math.max(this.e0, s());
                                z9 = z8;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.V[0] = aVar5;
                                    z9 = true;
                                    z7 = true;
                                }
                                iMax2 = Math.max(this.f0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r14 = 1;
                                    this.V[1] = aVar5;
                                    r17 = 1;
                                    z7 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z7) {
                                    r17 = z9;
                                    if (this.V[0] == aVar) {
                                        r17 = r17;
                                        if (s() > i2) {
                                            this.J0 = r14;
                                            this.V[0] = aVar5;
                                            T(i2);
                                            ?? r115 = r14;
                                            z7 = r115 == true ? 1 : 0;
                                            r17 = r115;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.V[r14] == aVar) {
                                        r17 = z9;
                                        r2 = r17;
                                        z4 = z7;
                                        i8 = 8;
                                    } else {
                                        r17 = z9;
                                        r2 = r17;
                                        z4 = z7;
                                        i8 = 8;
                                    }
                                } else {
                                    r17 = z9;
                                    r2 = r17;
                                    z4 = z7;
                                    i8 = 8;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                } else {
                                    r18 = r2;
                                }
                                i5 = i6;
                                z3 = z6;
                                aVar4 = aVar5;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.v0 = arrayList13;
                            if (z5) {
                                ixa.a[] aVarArr12 = this.V;
                                aVarArr12[0] = aVar2;
                                aVarArr12[1] = aVar3;
                            }
                            H(ofsVar.m);
                        }
                        i13 = iMax4;
                        iM = i13;
                        iMax4 = iM;
                        i2 = iS;
                        z = true;
                        if (d0(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        ofsVar.getClass();
                        ofsVar.h = false;
                        if (this.I0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList<ixa> arrayList14 = this.v0;
                        aVarArr = this.V;
                        if (aVarArr[0] != aVar) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.E0 = 0;
                        this.F0 = 0;
                        i3 = i;
                        while (i4 < i3) {
                            ixaVar2 = this.v0.get(i4);
                            if (ixaVar2 instanceof t6j0) {
                                ((t6j0) ixaVar2).X();
                            }
                        }
                        zD0 = d0(64);
                        z4 = z;
                        i5 = 0;
                        r15 = 1;
                        while (r15 != 0) {
                            i6 = i5 + 1;
                            ofsVar.t();
                            aVar5 = aVar4;
                            this.E0 = 0;
                            this.F0 = 0;
                            i(ofsVar);
                            while (i10 < i3) {
                                this.v0.get(i10).i(ofsVar);
                            }
                            Z(ofsVar);
                            weakReference = this.L0;
                            if (weakReference != null) {
                                z6 = z3;
                                z7 = z4;
                                ewaVar3 = ewaVar2;
                                weakReference2 = this.N0;
                                if (weakReference2 != null) {
                                    ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                    this.N0 = null;
                                }
                                weakReference3 = this.M0;
                                if (weakReference3 != null) {
                                    ewaVar4 = ewaVar;
                                    ewaVar = ewaVar4;
                                    ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                    this.M0 = null;
                                }
                                weakReference4 = this.O0;
                                if (weakReference4 == null) {
                                }
                                ofsVar.p();
                                ewaVar2 = ewaVar3;
                                r16 = 1;
                            } else {
                                z6 = z3;
                                z7 = z4;
                                ewaVar3 = ewaVar2;
                                weakReference2 = this.N0;
                                if (weakReference2 != null) {
                                    ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                                    this.N0 = null;
                                }
                                weakReference3 = this.M0;
                                if (weakReference3 != null) {
                                    ewaVar4 = ewaVar;
                                    ewaVar = ewaVar4;
                                    ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                                    this.M0 = null;
                                }
                                weakReference4 = this.O0;
                                if (weakReference4 == null) {
                                }
                                ofsVar.p();
                                ewaVar2 = ewaVar3;
                                r16 = 1;
                            }
                            zArr = g2z.a;
                            if (r16 != 0) {
                                zArr[2] = false;
                                zD1 = d0(64);
                                V(ofsVar, zD1);
                                size = this.v0.size();
                                i9 = 0;
                                z10 = false;
                                while (i9 < size) {
                                    boolean[] zArr9 = zArr;
                                    ixaVar = this.v0.get(i9);
                                    ixaVar.V(ofsVar, zD1);
                                    int i415 = i9;
                                    boolean z114 = zD1;
                                    if (ixaVar.h == -1) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    i9 = i415 + 1;
                                    zArr = zArr9;
                                    zD1 = z114;
                                    z10 = z10;
                                }
                                zArr2 = zArr;
                                z8 = z10;
                            } else {
                                zArr2 = zArr;
                                V(ofsVar, zD0);
                                while (i7 < i3) {
                                    this.v0.get(i7).V(ofsVar, zD0);
                                }
                                z8 = false;
                            }
                            if (!z6) {
                            }
                            iMax = Math.max(this.e0, s());
                            z9 = z8;
                            if (iMax > s()) {
                                T(iMax);
                                this.V[0] = aVar5;
                                z9 = true;
                                z7 = true;
                            }
                            iMax2 = Math.max(this.f0, m());
                            if (iMax2 > m()) {
                                O(iMax2);
                                r14 = 1;
                                this.V[1] = aVar5;
                                r17 = 1;
                                z7 = true;
                            } else {
                                r14 = 1;
                            }
                            if (z7) {
                                r17 = z9;
                                if (this.V[0] == aVar) {
                                    r17 = r17;
                                    if (s() > i2) {
                                        this.J0 = r14;
                                        this.V[0] = aVar5;
                                        T(i2);
                                        ?? r116 = r14;
                                        z7 = r116 == true ? 1 : 0;
                                        r17 = r116;
                                    }
                                }
                                r17 = r17;
                                r17 = r17;
                                if (this.V[r14] == aVar) {
                                    r17 = z9;
                                    r2 = r17;
                                    z4 = z7;
                                    i8 = 8;
                                } else {
                                    r17 = z9;
                                    r2 = r17;
                                    z4 = z7;
                                    i8 = 8;
                                }
                            } else {
                                r17 = z9;
                                r2 = r17;
                                z4 = z7;
                                i8 = 8;
                            }
                            if (i6 > i8) {
                                r18 = 0;
                            } else {
                                r18 = r2;
                            }
                            i5 = i6;
                            z3 = z6;
                            aVar4 = aVar5;
                            r15 = r18;
                        }
                        z5 = z4;
                        this.v0 = arrayList14;
                        if (z5) {
                            ixa.a[] aVarArr13 = this.V;
                            aVarArr13[0] = aVar2;
                            aVarArr13[1] = aVar3;
                        }
                        H(ofsVar.m);
                    }
                    ofsVar = ofsVar2;
                    aVar4 = aVar23;
                    aVar = aVar22;
                }
                aVar3 = aVar6;
                i2 = i11;
                aVar2 = aVar7;
            }
        }
        z = false;
        if (d0(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        ofsVar.getClass();
        ofsVar.h = false;
        if (this.I0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList<ixa> arrayList15 = this.v0;
        aVarArr = this.V;
        if (aVarArr[0] != aVar) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.E0 = 0;
        this.F0 = 0;
        i3 = i;
        while (i4 < i3) {
            ixaVar2 = this.v0.get(i4);
            if (ixaVar2 instanceof t6j0) {
                ((t6j0) ixaVar2).X();
            }
        }
        zD0 = d0(64);
        z4 = z;
        i5 = 0;
        r15 = 1;
        while (r15 != 0) {
            i6 = i5 + 1;
            ofsVar.t();
            aVar5 = aVar4;
            this.E0 = 0;
            this.F0 = 0;
            i(ofsVar);
            while (i10 < i3) {
                this.v0.get(i10).i(ofsVar);
            }
            Z(ofsVar);
            weakReference = this.L0;
            if (weakReference != null) {
                z6 = z3;
                z7 = z4;
                ewaVar3 = ewaVar2;
                weakReference2 = this.N0;
                if (weakReference2 != null) {
                    ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                    this.N0 = null;
                }
                weakReference3 = this.M0;
                if (weakReference3 != null) {
                    ewaVar4 = ewaVar;
                    ewaVar = ewaVar4;
                    ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                    this.M0 = null;
                }
                weakReference4 = this.O0;
                if (weakReference4 == null) {
                }
                ofsVar.p();
                ewaVar2 = ewaVar3;
                r16 = 1;
            } else {
                z6 = z3;
                z7 = z4;
                ewaVar3 = ewaVar2;
                weakReference2 = this.N0;
                if (weakReference2 != null) {
                    ofsVar.f(ofsVar.k(this.N), ofsVar.k(this.N0.get()), 0, 5);
                    this.N0 = null;
                }
                weakReference3 = this.M0;
                if (weakReference3 != null) {
                    ewaVar4 = ewaVar;
                    ewaVar = ewaVar4;
                    ofsVar.f(ofsVar.k(this.M0.get()), ofsVar.k(ewaVar4), 0, 5);
                    this.M0 = null;
                }
                weakReference4 = this.O0;
                if (weakReference4 == null) {
                }
                ofsVar.p();
                ewaVar2 = ewaVar3;
                r16 = 1;
            }
            zArr = g2z.a;
            if (r16 != 0) {
                zArr[2] = false;
                zD1 = d0(64);
                V(ofsVar, zD1);
                size = this.v0.size();
                i9 = 0;
                z10 = false;
                while (i9 < size) {
                    boolean[] zArr10 = zArr;
                    ixaVar = this.v0.get(i9);
                    ixaVar.V(ofsVar, zD1);
                    int i416 = i9;
                    boolean z115 = zD1;
                    if (ixaVar.h == -1) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    i9 = i416 + 1;
                    zArr = zArr10;
                    zD1 = z115;
                    z10 = z10;
                }
                zArr2 = zArr;
                z8 = z10;
            } else {
                zArr2 = zArr;
                V(ofsVar, zD0);
                while (i7 < i3) {
                    this.v0.get(i7).V(ofsVar, zD0);
                }
                z8 = false;
            }
            if (!z6) {
            }
            iMax = Math.max(this.e0, s());
            z9 = z8;
            if (iMax > s()) {
                T(iMax);
                this.V[0] = aVar5;
                z9 = true;
                z7 = true;
            }
            iMax2 = Math.max(this.f0, m());
            if (iMax2 > m()) {
                O(iMax2);
                r14 = 1;
                this.V[1] = aVar5;
                r17 = 1;
                z7 = true;
            } else {
                r14 = 1;
            }
            if (z7) {
                r17 = z9;
                if (this.V[0] == aVar) {
                    r17 = r17;
                    if (s() > i2) {
                        this.J0 = r14;
                        this.V[0] = aVar5;
                        T(i2);
                        ?? r117 = r14;
                        z7 = r117 == true ? 1 : 0;
                        r17 = r117;
                    }
                }
                r17 = r17;
                r17 = r17;
                if (this.V[r14] == aVar) {
                    r17 = z9;
                    r2 = r17;
                    z4 = z7;
                    i8 = 8;
                } else {
                    r17 = z9;
                    r2 = r17;
                    z4 = z7;
                    i8 = 8;
                }
            } else {
                r17 = z9;
                r2 = r17;
                z4 = z7;
                i8 = 8;
            }
            if (i6 > i8) {
                r18 = 0;
            } else {
                r18 = r2;
            }
            i5 = i6;
            z3 = z6;
            aVar4 = aVar5;
            r15 = r18;
        }
        z5 = z4;
        this.v0 = arrayList15;
        if (z5) {
            ixa.a[] aVarArr14 = this.V;
            aVarArr14[0] = aVar2;
            aVarArr14[1] = aVar3;
        }
        H(ofsVar.m);
    }

    public final void Y(ixa ixaVar, int i) {
        if (i == 0) {
            int i2 = this.E0 + 1;
            ew6[] ew6VarArr = this.H0;
            if (i2 >= ew6VarArr.length) {
                ew6VarArr = (ew6[]) Arrays.copyOf(ew6VarArr, ew6VarArr.length * 2);
                this.H0 = ew6VarArr;
            }
            int i3 = this.E0;
            ew6VarArr[i3] = new ew6(ixaVar, 0, this.A0);
            this.E0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.F0 + 1;
            ew6[] ew6VarArr2 = this.G0;
            if (i4 >= ew6VarArr2.length) {
                ew6VarArr2 = (ew6[]) Arrays.copyOf(ew6VarArr2, ew6VarArr2.length * 2);
                this.G0 = ew6VarArr2;
            }
            int i5 = this.F0;
            ew6VarArr2[i5] = new ew6(ixaVar, 1, this.A0);
            this.F0 = i5 + 1;
        }
    }

    public final void Z(ofs ofsVar) {
        jxa jxaVar;
        ofs ofsVar2;
        HashSet<ixa> hashSet = this.P0;
        boolean zD0 = d0(64);
        c(ofsVar, zD0);
        int size = this.v0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ixa ixaVar = this.v0.get(i);
            boolean[] zArr = ixaVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (ixaVar instanceof vx1) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ixa ixaVar2 = this.v0.get(i2);
                if (ixaVar2 instanceof vx1) {
                    vx1 vx1Var = (vx1) ixaVar2;
                    for (int i3 = 0; i3 < vx1Var.w0; i3++) {
                        ixa ixaVar3 = vx1Var.v0[i3];
                        if (vx1Var.y0 || ixaVar3.d()) {
                            int i4 = vx1Var.x0;
                            if (i4 == 0 || i4 == 1) {
                                ixaVar3.U[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                ixaVar3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ixa ixaVar4 = this.v0.get(i5);
            ixaVar4.getClass();
            boolean z2 = ixaVar4 instanceof rfi0;
            if (z2 || (ixaVar4 instanceof qal)) {
                if (z2) {
                    hashSet.add(ixaVar4);
                } else {
                    ixaVar4.c(ofsVar, zD0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ixa> it = hashSet.iterator();
            while (it.hasNext()) {
                rfi0 rfi0Var = (rfi0) it.next();
                for (int i6 = 0; i6 < rfi0Var.w0; i6++) {
                    if (hashSet.contains(rfi0Var.v0[i6])) {
                        rfi0Var.c(ofsVar, zD0);
                        hashSet.remove(rfi0Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ixa> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().c(ofsVar, zD0);
                }
                hashSet.clear();
            }
        }
        boolean z3 = ofs.q;
        ixa.a aVar = ixa.a.b;
        if (z3) {
            HashSet<ixa> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                ixa ixaVar5 = this.v0.get(i7);
                ixaVar5.getClass();
                if (!(ixaVar5 instanceof rfi0) && !(ixaVar5 instanceof qal)) {
                    hashSet2.add(ixaVar5);
                }
            }
            jxaVar = this;
            ofsVar2 = ofsVar;
            jxaVar.b(this, ofsVar2, hashSet2, this.V[0] == aVar ? 0 : 1, false);
            for (ixa ixaVar6 : hashSet2) {
                g2z.a(jxaVar, ofsVar2, ixaVar6);
                ixaVar6.c(ofsVar2, zD0);
            }
        } else {
            jxaVar = this;
            ofsVar2 = ofsVar;
            for (int i8 = 0; i8 < size; i8++) {
                ixa ixaVar7 = jxaVar.v0.get(i8);
                if (ixaVar7 instanceof jxa) {
                    ixa.a[] aVarArr = ixaVar7.V;
                    ixa.a aVar2 = aVarArr[0];
                    ixa.a aVar3 = aVarArr[1];
                    ixa.a aVar4 = ixa.a.a;
                    if (aVar2 == aVar) {
                        ixaVar7.P(aVar4);
                    }
                    if (aVar3 == aVar) {
                        ixaVar7.R(aVar4);
                    }
                    ixaVar7.c(ofsVar2, zD0);
                    if (aVar2 == aVar) {
                        ixaVar7.P(aVar2);
                    }
                    if (aVar3 == aVar) {
                        ixaVar7.R(aVar3);
                    }
                } else {
                    g2z.a(jxaVar, ofsVar2, ixaVar7);
                    if (!(ixaVar7 instanceof rfi0) && !(ixaVar7 instanceof qal)) {
                        ixaVar7.c(ofsVar2, zD0);
                    }
                }
            }
        }
        if (jxaVar.E0 > 0) {
            dw6.a(jxaVar, ofsVar2, null, 0);
        }
        if (jxaVar.F0 > 0) {
            dw6.a(jxaVar, ofsVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    public final boolean a0(int i, boolean z) {
        boolean z2;
        ixa.a aVar;
        boolean z3;
        ymd ymdVar = this.x0;
        ArrayList<x6j0> arrayList = ymdVar.e;
        jxa jxaVar = ymdVar.a;
        boolean z4 = false;
        ixa.a aVarL = jxaVar.l(0);
        ixa.a aVarL2 = jxaVar.l(1);
        int iT = jxaVar.t();
        int iU = jxaVar.u();
        ixa.a aVar2 = ixa.a.a;
        if (z && (aVarL == (aVar = ixa.a.b) || aVarL2 == aVar)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = z;
                    break;
                }
                x6j0 x6j0Var = arrayList.get(i2);
                i2++;
                x6j0 x6j0Var2 = x6j0Var;
                if (x6j0Var2.f == i && !x6j0Var2.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && aVarL == aVar) {
                    jxaVar.P(aVar2);
                    jxaVar.T(ymdVar.d(jxaVar, 0));
                    jxaVar.d.e.d(jxaVar.s());
                }
            } else if (z3 && aVarL2 == aVar) {
                jxaVar.R(aVar2);
                jxaVar.O(ymdVar.d(jxaVar, 1));
                jxaVar.e.e.d(jxaVar.m());
            }
        }
        ixa.a[] aVarArr = jxaVar.V;
        ixa.a aVar3 = ixa.a.d;
        if (i == 0) {
            ixa.a aVar4 = aVarArr[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int iS = jxaVar.s() + iT;
                jxaVar.d.i.d(iS);
                jxaVar.d.e.d(iS - iT);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            ixa.a aVar5 = aVarArr[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int iM = jxaVar.m() + iU;
                jxaVar.e.i.d(iM);
                jxaVar.e.e.d(iM - iU);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        ymdVar.g();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            x6j0 x6j0Var3 = arrayList.get(i3);
            i3++;
            x6j0 x6j0Var4 = x6j0Var3;
            if (x6j0Var4.f == i && (x6j0Var4.b != jxaVar || x6j0Var4.g)) {
                x6j0Var4.e();
            }
        }
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            x6j0 x6j0Var5 = arrayList.get(i4);
            i4++;
            x6j0 x6j0Var6 = x6j0Var5;
            if (x6j0Var6.f == i && (z2 || x6j0Var6.b != jxaVar)) {
                if (!x6j0Var6.h.j || !x6j0Var6.i.j || (!(x6j0Var6 instanceof hw6) && !x6j0Var6.e.j)) {
                    jxaVar.P(aVarL);
                    jxaVar.R(aVarL2);
                    return z4;
                }
            }
        }
        z4 = true;
        jxaVar.P(aVarL);
        jxaVar.R(aVarL2);
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x036d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    public final void b0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        char c;
        ?? r1;
        int i8;
        jxa jxaVar;
        int i9;
        int i10;
        int i11;
        boolean zA0;
        int i12;
        ewa.a aVar;
        ewa.a aVar2;
        int i13;
        int i14;
        int i15;
        n92.b bVar;
        int i16;
        int i17;
        n92.b bVar2;
        int i18;
        int i19;
        vjm vjmVar;
        c3i0 c3i0Var;
        ?? r2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z;
        boolean z2;
        ?? r3;
        this.C0 = i6;
        this.D0 = i7;
        n92 n92Var = this.w0;
        jxa jxaVar2 = n92Var.c;
        ArrayList<ixa> arrayList = n92Var.a;
        n92.b bVar3 = this.z0;
        ymd ymdVar = this.x0;
        int size = this.v0.size();
        int iS = s();
        int iM = m();
        boolean zB = g2z.b(i, 128);
        boolean z3 = zB || g2z.b(i, 64);
        ixa.a aVar3 = ixa.a.c;
        boolean z4 = false;
        if (z3) {
            int i25 = 0;
            while (true) {
                if (i25 < size) {
                    c = 1;
                    ixa ixaVar = this.v0.get(i25);
                    boolean z5 = z3;
                    ixa.a[] aVarArr = ixaVar.V;
                    boolean z6 = (aVarArr[0] == aVar3) && (aVarArr[1] == aVar3) && ixaVar.Z > 0.0f;
                    if ((ixaVar.z() && z6) || ((ixaVar.A() && z6) || (ixaVar instanceof rfi0) || ixaVar.z() || ixaVar.A())) {
                        r1 = 0;
                    } else {
                        i25++;
                        z3 = z5;
                    }
                } else {
                    c = 1;
                    r1 = z3;
                }
            }
        } else {
            c = 1;
            r1 = z3;
        }
        int i26 = r1 & (((i2 == 1073741824 && i4 == 1073741824) || zB) ? c : (char) 0);
        ixa.a aVar4 = ixa.a.b;
        if (i26 != 0) {
            i8 = i26;
            int iMin = Math.min(this.D[0], i3);
            i9 = size;
            int iMin2 = Math.min(this.D[c], i5);
            int i27 = 1073741824;
            if (i2 == 1073741824) {
                if (s() != iMin) {
                    T(iMin);
                    ?? r4 = c;
                    ymdVar.b = r4;
                    r3 = r4;
                } else {
                    r3 = c;
                }
                i27 = 1073741824;
                r2 = r3;
            } else {
                r2 = c;
            }
            if (i4 == i27) {
                if (m() != iMin2) {
                    O(iMin2);
                    ymdVar.b = r2;
                }
                i27 = 1073741824;
            }
            if (i2 == i27 && i4 == i27) {
                ArrayList<x6j0> arrayList2 = ymdVar.e;
                jxa jxaVar3 = ymdVar.a;
                if (ymdVar.b || ymdVar.c) {
                    ArrayList<ixa> arrayList3 = jxaVar3.v0;
                    int size2 = arrayList3.size();
                    int i28 = 0;
                    while (i28 < size2) {
                        ixa ixaVar2 = arrayList3.get(i28);
                        int i29 = i28 + 1;
                        ixa ixaVar3 = ixaVar2;
                        ixaVar3.j();
                        ixaVar3.a = z4;
                        ixaVar3.d.n();
                        ixaVar3.e.m();
                        i28 = i29;
                        size2 = size2;
                        z4 = false;
                    }
                    jxaVar3.j();
                    i22 = 0;
                    jxaVar3.a = false;
                    jxaVar3.d.n();
                    jxaVar3.e.m();
                    ymdVar.c = false;
                } else {
                    i22 = 0;
                }
                ymdVar.b(ymdVar.d);
                jxaVar3.b0 = i22;
                jxaVar3.c0 = i22;
                ixa.a aVarL = jxaVar3.l(i22);
                ixa.a aVarL2 = jxaVar3.l(1);
                if (ymdVar.b) {
                    ymdVar.c();
                }
                int iT = jxaVar3.t();
                jxaVar = jxaVar2;
                int iU = jxaVar3.u();
                i10 = iS;
                jxaVar3.d.h.d(iT);
                jxaVar3.e.h.d(iU);
                ymdVar.g();
                ixa.a aVar5 = ixa.a.a;
                if (aVarL == aVar4 || aVarL2 == aVar4) {
                    i23 = iU;
                    if (zB) {
                        int size3 = arrayList2.size();
                        i24 = iT;
                        int i30 = 0;
                        while (i30 < size3) {
                            x6j0 x6j0Var = arrayList2.get(i30);
                            i30++;
                            if (!x6j0Var.k()) {
                                zB = false;
                                break;
                            }
                        }
                    } else {
                        i24 = iT;
                    }
                    if (zB && aVarL == aVar4) {
                        jxaVar3.P(aVar5);
                        jxaVar3.T(ymdVar.d(jxaVar3, 0));
                        jxaVar3.d.e.d(jxaVar3.s());
                    }
                    if (zB && aVarL2 == aVar4) {
                        jxaVar3.R(aVar5);
                        jxaVar3.O(ymdVar.d(jxaVar3, 1));
                        jxaVar3.e.e.d(jxaVar3.m());
                    }
                } else {
                    i23 = iU;
                    i24 = iT;
                }
                ixa.a aVar6 = jxaVar3.V[0];
                ixa.a aVar7 = ixa.a.d;
                if (aVar6 == aVar5 || aVar6 == aVar7) {
                    int iS2 = jxaVar3.s() + i24;
                    jxaVar3.d.i.d(iS2);
                    jxaVar3.d.e.d(iS2 - i24);
                    ymdVar.g();
                    ixa.a aVar8 = jxaVar3.V[1];
                    if (aVar8 == aVar5 || aVar8 == aVar7) {
                        int iM2 = jxaVar3.m() + i23;
                        jxaVar3.e.i.d(iM2);
                        jxaVar3.e.e.d(iM2 - i23);
                    }
                    ymdVar.g();
                    z = true;
                } else {
                    z = false;
                }
                int size4 = arrayList2.size();
                int i31 = 0;
                while (i31 < size4) {
                    x6j0 x6j0Var2 = arrayList2.get(i31);
                    i31++;
                    x6j0 x6j0Var3 = x6j0Var2;
                    if (x6j0Var3.b != jxaVar3 || x6j0Var3.g) {
                        x6j0Var3.e();
                    }
                }
                int size5 = arrayList2.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size5) {
                        z2 = true;
                        break;
                    }
                    x6j0 x6j0Var4 = arrayList2.get(i32);
                    i32++;
                    x6j0 x6j0Var5 = x6j0Var4;
                    if (z || x6j0Var5.b != jxaVar3) {
                        if (!x6j0Var5.h.j || ((!x6j0Var5.i.j && !(x6j0Var5 instanceof ral)) || (!x6j0Var5.e.j && !(x6j0Var5 instanceof hw6) && !(x6j0Var5 instanceof ral)))) {
                            z2 = false;
                            break;
                        }
                    }
                }
                jxaVar3.P(aVarL);
                jxaVar3.R(aVarL2);
                zA0 = z2;
                i11 = 2;
                i21 = 1073741824;
            } else {
                jxaVar = jxaVar2;
                arrayList = arrayList;
                bVar3 = bVar3;
                i10 = iS;
                jxa jxaVar4 = ymdVar.a;
                if (ymdVar.b) {
                    ArrayList<ixa> arrayList4 = jxaVar4.v0;
                    int size6 = arrayList4.size();
                    int i33 = 0;
                    while (i33 < size6) {
                        ixa ixaVar4 = arrayList4.get(i33);
                        i33++;
                        ixa ixaVar5 = ixaVar4;
                        ixaVar5.j();
                        ixaVar5.a = false;
                        vjm vjmVar2 = ixaVar5.d;
                        ArrayList<ixa> arrayList5 = arrayList4;
                        vjmVar2.e.j = false;
                        vjmVar2.g = false;
                        vjmVar2.n();
                        c3i0 c3i0Var2 = ixaVar5.e;
                        c3i0Var2.e.j = false;
                        c3i0Var2.g = false;
                        c3i0Var2.m();
                        arrayList4 = arrayList5;
                    }
                    i20 = 0;
                    jxaVar4.j();
                    jxaVar4.a = false;
                    vjm vjmVar3 = jxaVar4.d;
                    vjmVar3.e.j = false;
                    vjmVar3.g = false;
                    vjmVar3.n();
                    c3i0 c3i0Var3 = jxaVar4.e;
                    c3i0Var3.e.j = false;
                    c3i0Var3.g = false;
                    c3i0Var3.m();
                    ymdVar.c();
                } else {
                    i20 = 0;
                }
                ymdVar.b(ymdVar.d);
                jxaVar4.b0 = i20;
                jxaVar4.c0 = i20;
                jxaVar4.d.h.d(i20);
                jxaVar4.e.h.d(i20);
                i21 = 1073741824;
                if (i2 == 1073741824) {
                    zA0 = a0(i20, zB);
                    i11 = 1;
                } else {
                    i11 = 0;
                    zA0 = true;
                }
                if (i4 == 1073741824) {
                    zA0 &= a0(1, zB);
                    i11++;
                }
            }
            if (zA0) {
                U(i2 == i21, i4 == i21);
            }
        } else {
            i8 = i26;
            jxaVar = jxaVar2;
            arrayList = arrayList;
            bVar3 = bVar3;
            i9 = size;
            i10 = iS;
            i11 = 0;
            zA0 = false;
        }
        if (zA0 && i11 == 2) {
            return;
        }
        int i34 = this.I0;
        if (i9 > 0) {
            int size7 = this.v0.size();
            boolean zD0 = d0(64);
            n92.b bVar4 = this.z0;
            for (int i35 = 0; i35 < size7; i35++) {
                ixa ixaVar6 = this.v0.get(i35);
                if (!(ixaVar6 instanceof qal) && !(ixaVar6 instanceof vx1) && !ixaVar6.H && (!zD0 || (vjmVar = ixaVar6.d) == null || (c3i0Var = ixaVar6.e) == null || !vjmVar.e.j || !c3i0Var.e.j)) {
                    ixa.a aVarL3 = ixaVar6.l(0);
                    ixa.a aVarL4 = ixaVar6.l(1);
                    boolean z7 = aVarL3 == aVar3 && ixaVar6.s != 1 && aVarL4 == aVar3 && ixaVar6.t != 1;
                    if (!z7 && d0(1) && !(ixaVar6 instanceof rfi0)) {
                        if (aVarL3 == aVar3 && ixaVar6.s == 0 && aVarL4 != aVar3 && !ixaVar6.z()) {
                            z7 = true;
                        }
                        if (aVarL4 == aVar3 && ixaVar6.t == 0 && aVarL3 != aVar3 && !ixaVar6.z()) {
                            z7 = true;
                        }
                        if ((aVarL3 == aVar3 || aVarL4 == aVar3) && ixaVar6.Z > 0.0f) {
                            z7 = true;
                        }
                    }
                    if (!z7) {
                        n92Var.a(0, bVar4, ixaVar6);
                    }
                }
            }
            i12 = 0;
            bVar4.a();
        } else {
            i12 = 0;
        }
        n92Var.c(this);
        int size8 = arrayList.size();
        int i36 = i10;
        if (i9 > 0) {
            n92Var.b(this, i12, i36, iM);
        }
        if (size8 > 0) {
            ixa.a[] aVarArr2 = this.V;
            int i37 = aVarArr2[i12] == aVar4 ? 1 : i12;
            int i38 = aVarArr2[1] == aVar4 ? 1 : i12;
            jxa jxaVar5 = jxaVar;
            int iMax = Math.max(s(), jxaVar5.e0);
            int iMax2 = Math.max(m(), jxaVar5.f0);
            int i39 = i12;
            int i40 = i39;
            while (true) {
                aVar = ewa.a.d;
                aVar2 = ewa.a.c;
                if (i39 >= size8) {
                    break;
                }
                ArrayList<ixa> arrayList6 = arrayList;
                ixa ixaVar7 = arrayList6.get(i39);
                int i41 = i38;
                if (ixaVar7 instanceof rfi0) {
                    int iS3 = ixaVar7.s();
                    i17 = i37;
                    int iM3 = ixaVar7.m();
                    bVar2 = bVar3;
                    int i42 = i40 | (n92Var.a(1, bVar2, ixaVar7) ? 1 : 0);
                    int iS4 = ixaVar7.s();
                    int iM4 = ixaVar7.m();
                    if (iS4 != iS3) {
                        ixaVar7.T(iS4);
                        if (i17 != 0 && ixaVar7.t() + ixaVar7.X > iMax) {
                            iMax = Math.max(iMax, ixaVar7.k(aVar2).e() + ixaVar7.t() + ixaVar7.X);
                        }
                        i18 = 1;
                    } else {
                        i18 = i42;
                    }
                    if (iM4 != iM3) {
                        ixaVar7.O(iM4);
                        if (i41 != 0 && ixaVar7.u() + ixaVar7.Y > iMax2) {
                            iMax2 = Math.max(iMax2, ixaVar7.k(aVar).e() + ixaVar7.u() + ixaVar7.Y);
                        }
                        i19 = 1;
                    } else {
                        i19 = i18;
                    }
                    i40 = i19 | (((rfi0) ixaVar7).D0 ? 1 : 0);
                } else {
                    i17 = i37;
                    bVar2 = bVar3;
                }
                i38 = i41;
                i37 = i17;
                bVar3 = bVar2;
                arrayList = arrayList6;
                i39++;
                i34 = i34;
            }
            int i43 = i34;
            int i44 = i38;
            int i45 = i37;
            n92.b bVar5 = bVar3;
            ArrayList<ixa> arrayList7 = arrayList;
            int i46 = i40;
            int i47 = 0;
            while (i47 < 2) {
                int i48 = 0;
                while (i48 < size8) {
                    ixa ixaVar8 = arrayList7.get(i48);
                    if ((!(ixaVar8 instanceof yil) || (ixaVar8 instanceof rfi0)) && !(ixaVar8 instanceof qal)) {
                        i13 = size8;
                        if (ixaVar8.j0 != 8 && ((i8 == 0 || !ixaVar8.d.e.j || !ixaVar8.e.e.j) && !(ixaVar8 instanceof rfi0))) {
                            int iS5 = ixaVar8.s();
                            int iM5 = ixaVar8.m();
                            int i49 = i46;
                            int i50 = ixaVar8.d0;
                            i14 = i48;
                            int i51 = i49 | (n92Var.a(i47 == 1 ? 2 : 1, bVar5, ixaVar8) ? 1 : 0);
                            i15 = i47;
                            int iS6 = ixaVar8.s();
                            bVar = bVar5;
                            int iM6 = ixaVar8.m();
                            if (iS6 != iS5) {
                                ixaVar8.T(iS6);
                                if (i45 != 0 && ixaVar8.t() + ixaVar8.X > iMax) {
                                    iMax = Math.max(iMax, ixaVar8.k(aVar2).e() + ixaVar8.t() + ixaVar8.X);
                                }
                                i16 = 1;
                            } else {
                                i16 = i51;
                            }
                            if (iM6 != iM5) {
                                ixaVar8.O(iM6);
                                if (i44 != 0 && ixaVar8.u() + ixaVar8.Y > iMax2) {
                                    iMax2 = Math.max(iMax2, ixaVar8.k(aVar).e() + ixaVar8.u() + ixaVar8.Y);
                                }
                                i16 = 1;
                            }
                            i46 = (!ixaVar8.F || i50 == ixaVar8.d0) ? i16 : 1;
                        }
                        i48 = i14 + 1;
                        size8 = i13;
                        i47 = i15;
                        bVar5 = bVar;
                    } else {
                        i13 = size8;
                    }
                    i15 = i47;
                    bVar = bVar5;
                    i14 = i48;
                    i48 = i14 + 1;
                    size8 = i13;
                    i47 = i15;
                    bVar5 = bVar;
                }
                int i52 = size8;
                int i53 = i47;
                n92.b bVar6 = bVar5;
                if (i46 == 0) {
                    break;
                }
                i47 = i53 + 1;
                n92Var.b(this, i47, i36, iM);
                size8 = i52;
                bVar5 = bVar6;
                i46 = 0;
            }
            i34 = i43;
        }
        this.I0 = i34;
        ofs.q = d0(512);
    }

    public final boolean d0(int i) {
        return (this.I0 & i) == i;
    }

    @Override // defpackage.ixa
    public final void p(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        ArrayList<ixa> arrayList = this.v0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ixa ixaVar = arrayList.get(i);
            i++;
            ixaVar.p(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
