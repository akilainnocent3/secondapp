package defpackage;

import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vwx extends jxx {
    public final d.c c;
    public final l020 d;
    public final qkt<m020> e;
    public ywx f;
    public b020 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public vwx(d.c cVar) {
        this.c = cVar;
        l020 l020Var = new l020();
        l020Var.b = new long[2];
        this.d = l020Var;
        this.e = new qkt<>(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0287  */
    /* JADX WARN: Code duplicated, block: B:136:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0294 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // defpackage.jxx
    public final boolean a(qkt<m020> qktVar, urr urrVar, czo czoVar, boolean z) {
        l020 l020Var;
        qkt<m020> qktVar2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        b020 b020Var;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        boolean zA = super.a(qktVar, urrVar, czoVar, z);
        ?? C = this.c;
        if (C.C) {
            ?? duwVar = 0;
            while (C != 0) {
                if (C instanceof s020) {
                    this.f = pkd.d((s020) C, 16);
                } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                    d.c cVar = ((tkd) C).E;
                    int i5 = 0;
                    while (cVar != null) {
                        if ((cVar.c & 16) != 0) {
                            i5++;
                            if (i5 == 1) {
                                C = C;
                                duwVar = duwVar;
                                duwVar = duwVar;
                                C = cVar;
                            } else {
                                if (duwVar == 0) {
                                    duwVar = new duw(new d.c[16]);
                                }
                                if (C != 0) {
                                    duwVar.b(C);
                                    C = 0;
                                }
                                duwVar.b(cVar);
                            }
                        } else {
                            C = C;
                            duwVar = duwVar;
                        }
                        cVar = cVar.f;
                        C = C;
                        duwVar = duwVar;
                    }
                    if (i5 == 1) {
                        C = C;
                        duwVar = duwVar;
                    } else {
                        C = C;
                        duwVar = duwVar;
                    }
                }
                C = pkd.c(duwVar);
            }
            if (this.f != null) {
                int iH = qktVar.h();
                int i6 = 0;
                while (true) {
                    l020Var = this.d;
                    qktVar2 = this.e;
                    if (i6 >= iH) {
                        break;
                    }
                    long jE = qktVar.e(i6);
                    m020 m020VarI = qktVar.i(i6);
                    if (l020Var.b(jE)) {
                        long j = m020VarI.g;
                        List list = m020VarI.k;
                        i4 = i6;
                        long j2 = m020VarI.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList((list == null ? m2g.a : list).size());
                            if (list == null) {
                                list = m2g.a;
                            }
                            int size = list.size();
                            int i7 = 0;
                            while (i7 < size) {
                                int i8 = size;
                                z9m z9mVar = (z9m) list.get(i7);
                                int i9 = i7;
                                List list2 = list;
                                long j3 = z9mVar.b;
                                if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j4 = z9mVar.a;
                                    ywx ywxVar = this.f;
                                    ywxVar.getClass();
                                    arrayList.add(new z9m(j4, ywxVar.Q(urrVar, j3, true), z9mVar.c));
                                }
                                i7 = i9 + 1;
                                list = list2;
                                size = i8;
                                qktVar2 = qktVar2;
                                jE = jE;
                            }
                            qkt<m020> qktVar3 = qktVar2;
                            long j5 = jE;
                            ywx ywxVar2 = this.f;
                            ywxVar2.getClass();
                            long jQ = ywxVar2.Q(urrVar, j, true);
                            ywx ywxVar3 = this.f;
                            ywxVar3.getClass();
                            m020 m020Var = new m020(m020VarI.a, m020VarI.b, ywxVar3.Q(urrVar, j2, true), m020VarI.d, m020VarI.e, m020VarI.f, jQ, m020VarI.h, m020VarI.i, arrayList, m020VarI.j, m020VarI.l);
                            m020 m020Var2 = m020VarI.o;
                            if (m020Var2 == null) {
                                m020Var2 = m020VarI;
                            }
                            m020Var.o = m020Var2;
                            m020 m020Var3 = m020VarI.o;
                            if (m020Var3 != null) {
                                m020VarI = m020Var3;
                            }
                            m020Var.o = m020VarI;
                            qktVar3.f(m020Var, j5);
                        }
                    } else {
                        i4 = i6;
                    }
                    i6 = i4 + 1;
                    iH = iH;
                    zA = zA;
                }
                boolean z7 = zA;
                if (qktVar2.d()) {
                    l020Var.a = 0;
                    this.a.g();
                    return true;
                }
                int i10 = l020Var.a;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    if (qktVar.c(l020Var.b[i10]) < 0 && i10 < (i3 = l020Var.a)) {
                        int i11 = i3 - 1;
                        int i12 = i10;
                        while (i12 < i11) {
                            long[] jArr = l020Var.b;
                            int i13 = i12 + 1;
                            jArr[i12] = jArr[i13];
                            i12 = i13;
                        }
                        l020Var.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qktVar2.h());
                int iH2 = qktVar2.h();
                for (int i14 = 0; i14 < iH2; i14++) {
                    arrayList2.add(qktVar2.i(i14));
                }
                b020 b020Var2 = new b020(arrayList2, czoVar);
                int size2 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i15);
                    if (czoVar.a(((m020) obj).a)) {
                        break;
                    }
                    i15++;
                }
                m020 m020Var4 = (m020) obj;
                if (m020Var4 != null) {
                    boolean z8 = m020Var4.d;
                    if (z) {
                        z2 = false;
                        z5 = this.i;
                        if (!z5 && (z8 || m020Var4.h)) {
                            ywx ywxVar4 = this.f;
                            ywxVar4.getClass();
                            long j6 = ywxVar4.c;
                            long j7 = m020Var4.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            z3 = true;
                            z5 = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j6 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j6 & 4294967295L)))));
                            this.i = z5;
                        }
                        z6 = this.h;
                        if (z5 == z6 && ((i2 = b020Var2.e) == 3 || i2 == 4 || i2 == 5)) {
                            b020Var2.e = z5 ? 4 : 5;
                        } else {
                            i = b020Var2.e;
                            if (i != 4 && z6 && !this.j) {
                                b020Var2.e = 3;
                            } else if (i == 5 && z5 && z8) {
                                b020Var2.e = 3;
                            }
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z5 = false;
                    }
                    z3 = true;
                    z6 = this.h;
                    if (z5 == z6) {
                        i = b020Var2.e;
                        if (i != 4) {
                            if (i == 5) {
                                b020Var2.e = 3;
                            }
                        } else if (i == 5) {
                            b020Var2.e = 3;
                        }
                    } else {
                        i = b020Var2.e;
                        if (i != 4) {
                            if (i == 5) {
                                b020Var2.e = 3;
                            }
                        } else if (i == 5) {
                            b020Var2.e = 3;
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z7 && b020Var2.e == 3 && (b020Var = this.g) != null) {
                    List<m020> list3 = b020Var.a;
                    int size3 = list3.size();
                    List<m020> list4 = b020Var2.a;
                    if (size3 != list4.size()) {
                        z4 = z3;
                        break;
                    }
                    int size4 = list4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z4 = z2;
                            break;
                        }
                        if (!gly.c(list3.get(r5).c, list4.get(r5).c)) {
                            z4 = z3;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z4 = z3;
                    break;
                }
                this.g = b020Var2;
                return z4;
            }
        }
        return true;
    }

    @Override // defpackage.jxx
    public final void b(czo czoVar) {
        super.b(czoVar);
        b020 b020Var = this.g;
        if (b020Var == null) {
            return;
        }
        this.h = this.i;
        List<m020> list = b020Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m020 m020Var = list.get(i);
            boolean z = m020Var.d;
            long j = m020Var.a;
            boolean zA = czoVar.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.c(j);
            }
        }
        this.i = false;
        this.j = b020Var.e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [duw] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [duw] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        duw<vwx> duwVar = this.a;
        vwx[] vwxVarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            vwxVarArr[i2].c();
        }
        ?? C = this.c;
        ?? duwVar2 = 0;
        while (C != 0) {
            if (C instanceof s020) {
                ((s020) C).n1();
            } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                d.c cVar = ((tkd) C).E;
                int i3 = 0;
                duwVar2 = duwVar2;
                C = C;
                while (cVar != null) {
                    if ((cVar.c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            duwVar2 = duwVar2;
                            C = cVar;
                        } else {
                            if (duwVar2 == 0) {
                                duwVar2 = new duw(new d.c[16]);
                            }
                            if (C != 0) {
                                duwVar2.b(C);
                                C = 0;
                            }
                            duwVar2.b(cVar);
                        }
                    }
                    cVar = cVar.f;
                    duwVar2 = duwVar2;
                    C = C;
                }
                if (i3 == 1) {
                }
            }
            C = pkd.c(duwVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(czo czoVar) {
        qkt<m020> qktVar = this.e;
        boolean z = false;
        z = false;
        if (!qktVar.d()) {
            d.c cVar = this.c;
            if (cVar.C) {
                b020 b020Var = this.g;
                b020Var.getClass();
                ywx ywxVar = this.f;
                ywxVar.getClass();
                long j = ywxVar.c;
                ?? C = cVar;
                ?? duwVar = 0;
                while (C != 0) {
                    if (C instanceof s020) {
                        ((s020) C).W(b020Var, c020.c, j);
                    } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                        d.c cVar2 = ((tkd) C).E;
                        int i = 0;
                        while (cVar2 != null) {
                            if ((cVar2.c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    C = C;
                                    duwVar = duwVar;
                                    duwVar = duwVar;
                                    C = cVar2;
                                } else {
                                    if (duwVar == 0) {
                                        duwVar = new duw(new d.c[16]);
                                    }
                                    if (C != 0) {
                                        duwVar.b(C);
                                        C = 0;
                                    }
                                    duwVar.b(cVar2);
                                }
                            } else {
                                C = C;
                                duwVar = duwVar;
                            }
                            cVar2 = cVar2.f;
                            C = C;
                            duwVar = duwVar;
                        }
                        if (i == 1) {
                            C = C;
                            duwVar = duwVar;
                        } else {
                            C = C;
                            duwVar = duwVar;
                        }
                    }
                    C = pkd.c(duwVar);
                }
                if (cVar.C) {
                    duw<vwx> duwVar2 = this.a;
                    vwx[] vwxVarArr = duwVar2.a;
                    int i2 = duwVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        vwxVarArr[i3].d(czoVar);
                    }
                }
                z = true;
            }
        }
        b(czoVar);
        qktVar.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [duw] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [duw] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [duw] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(czo czoVar, boolean z) {
        if (!this.e.d()) {
            ?? C = this.c;
            if (C.C) {
                b020 b020Var = this.g;
                b020Var.getClass();
                ywx ywxVar = this.f;
                ywxVar.getClass();
                long j = ywxVar.c;
                ?? C2 = C;
                ?? duwVar = 0;
                while (C2 != 0) {
                    if (C2 instanceof s020) {
                        ((s020) C2).W(b020Var, c020.a, j);
                    } else if ((C2.c & 16) != 0 && (C2 instanceof tkd)) {
                        d.c cVar = ((tkd) C2).E;
                        int i = 0;
                        while (cVar != null) {
                            if ((cVar.c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    C2 = C2;
                                    duwVar = duwVar;
                                    duwVar = duwVar;
                                    C2 = cVar;
                                } else {
                                    if (duwVar == 0) {
                                        duwVar = new duw(new d.c[16]);
                                    }
                                    if (C2 != 0) {
                                        duwVar.b(C2);
                                        C2 = 0;
                                    }
                                    duwVar.b(cVar);
                                }
                            } else {
                                C2 = C2;
                                duwVar = duwVar;
                            }
                            cVar = cVar.f;
                            C2 = C2;
                            duwVar = duwVar;
                        }
                        if (i == 1) {
                            C2 = C2;
                            duwVar = duwVar;
                        } else {
                            C2 = C2;
                            duwVar = duwVar;
                        }
                    }
                    C2 = pkd.c(duwVar);
                }
                if (C.C) {
                    duw<vwx> duwVar2 = this.a;
                    vwx[] vwxVarArr = duwVar2.a;
                    int i2 = duwVar2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        vwx vwxVar = vwxVarArr[i3];
                        this.f.getClass();
                        vwxVar.e(czoVar, z);
                    }
                }
                if (C.C) {
                    ?? duwVar3 = 0;
                    while (C != 0) {
                        if (C instanceof s020) {
                            ((s020) C).W(b020Var, c020.b, j);
                        } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                            d.c cVar2 = ((tkd) C).E;
                            int i4 = 0;
                            while (cVar2 != null) {
                                if ((cVar2.c & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        C = C;
                                        duwVar3 = duwVar3;
                                        duwVar3 = duwVar3;
                                        C = cVar2;
                                    } else {
                                        if (duwVar3 == 0) {
                                            duwVar3 = new duw(new d.c[16]);
                                        }
                                        if (C != 0) {
                                            duwVar3.b(C);
                                            C = 0;
                                        }
                                        duwVar3.b(cVar2);
                                    }
                                } else {
                                    C = C;
                                    duwVar3 = duwVar3;
                                }
                                cVar2 = cVar2.f;
                                C = C;
                                duwVar3 = duwVar3;
                            }
                            if (i4 == 1) {
                                C = C;
                                duwVar3 = duwVar3;
                            } else {
                                C = C;
                                duwVar3 = duwVar3;
                            }
                        }
                        C = pkd.c(duwVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, etw<vwx> etwVar) {
        l020 l020Var = this.d;
        if (l020Var.b(j) && etwVar.c(this) < 0) {
            l020Var.c(j);
            this.e.g(j);
        }
        duw<vwx> duwVar = this.a;
        vwx[] vwxVarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            vwxVarArr[i2].f(j, etwVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
