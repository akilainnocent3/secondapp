package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class t2 extends qxf0 {
    public static final /* synthetic */ int d = 0;
    public final int b;
    public final tb90 c;

    public t2(tb90 tb90Var) {
        this.c = tb90Var;
        this.b = tb90Var.getLength();
    }

    @Override // defpackage.qxf0
    public final int a(boolean z) {
        if (this.b != 0) {
            int iF = z ? this.c.f() : 0;
            do {
                br10 br10Var = (br10) this;
                qxf0[] qxf0VarArr = br10Var.i;
                if (!qxf0VarArr[iF].p()) {
                    return qxf0VarArr[iF].a(z) + br10Var.h[iF];
                }
                iF = q(iF, z);
            } while (iF != -1);
        }
        return -1;
    }

    @Override // defpackage.qxf0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            br10 br10Var = (br10) this;
            Integer num = br10Var.k.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = br10Var.i[iIntValue].b(obj3)) != -1) {
                return br10Var.g[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.qxf0
    public final int c(boolean z) {
        int i = this.b;
        if (i != 0) {
            tb90 tb90Var = this.c;
            int iD = z ? tb90Var.d() : i - 1;
            do {
                br10 br10Var = (br10) this;
                qxf0[] qxf0VarArr = br10Var.i;
                if (!qxf0VarArr[iD].p()) {
                    return qxf0VarArr[iD].c(z) + br10Var.h[iD];
                }
                if (z) {
                    iD = tb90Var.b(iD);
                } else {
                    iD = iD > 0 ? iD - 1 : -1;
                }
            } while (iD != -1);
        }
        return -1;
    }

    @Override // defpackage.qxf0
    public final int e(int i, int i2, boolean z) {
        br10 br10Var = (br10) this;
        int[] iArr = br10Var.h;
        int iD = jrh0.d(iArr, i + 1, false, false);
        int i3 = iArr[iD];
        qxf0[] qxf0VarArr = br10Var.i;
        int iE = qxf0VarArr[iD].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iD, z);
        while (iQ != -1 && qxf0VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return qxf0VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.qxf0
    public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
        br10 br10Var = (br10) this;
        int[] iArr = br10Var.g;
        int iD = jrh0.d(iArr, i + 1, false, false);
        int i2 = br10Var.h[iD];
        br10Var.i[iD].f(i - iArr[iD], bVar, z);
        bVar.c += i2;
        if (z) {
            Object obj = br10Var.j[iD];
            Object obj2 = bVar.b;
            obj2.getClass();
            bVar.b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // defpackage.qxf0
    public final qxf0.b g(Object obj, qxf0.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        br10 br10Var = (br10) this;
        Integer num = br10Var.k.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = br10Var.h[iIntValue];
        br10Var.i[iIntValue].g(obj3, bVar);
        bVar.c += i;
        bVar.b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        r1 = r1 - 1;
     */
    @Override // defpackage.qxf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            r0 = r7
            br10 r0 = (defpackage.br10) r0
            int r1 = r8 + 1
            int[] r2 = r0.h
            r3 = 0
            int r1 = defpackage.jrh0.d(r2, r1, r3, r3)
            r4 = r2[r1]
            qxf0[] r0 = r0.i
            r5 = r0[r1]
            int r8 = r8 - r4
            r6 = 2
            if (r9 != r6) goto L17
            goto L18
        L17:
            r3 = r9
        L18:
            int r8 = r5.k(r8, r3, r10)
            r3 = -1
            if (r8 == r3) goto L21
            int r4 = r4 + r8
            return r4
        L21:
            tb90 r8 = r7.c
            if (r10 == 0) goto L2a
            int r1 = r8.b(r1)
            goto L30
        L2a:
            if (r1 <= 0) goto L2f
        L2c:
            int r1 = r1 + (-1)
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 == r3) goto L44
            r4 = r0[r1]
            boolean r4 = r4.p()
            if (r4 == 0) goto L44
            if (r10 == 0) goto L41
            int r1 = r8.b(r1)
            goto L30
        L41:
            if (r1 <= 0) goto L2f
            goto L2c
        L44:
            if (r1 == r3) goto L50
            r7 = r2[r1]
            r8 = r0[r1]
            int r8 = r8.c(r10)
            int r8 = r8 + r7
            return r8
        L50:
            if (r9 != r6) goto L57
            int r7 = r7.c(r10)
            return r7
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2.k(int, int, boolean):int");
    }

    @Override // defpackage.qxf0
    public final Object l(int i) {
        br10 br10Var = (br10) this;
        int[] iArr = br10Var.g;
        int iD = jrh0.d(iArr, i + 1, false, false);
        return Pair.create(br10Var.j[iD], br10Var.i[iD].l(i - iArr[iD]));
    }

    @Override // defpackage.qxf0
    public final qxf0.c m(int i, qxf0.c cVar, long j) {
        br10 br10Var = (br10) this;
        int[] iArr = br10Var.h;
        int iD = jrh0.d(iArr, i + 1, false, false);
        int i2 = iArr[iD];
        int i3 = br10Var.g[iD];
        br10Var.i[iD].m(i - i2, cVar, j);
        Object objCreate = br10Var.j[iD];
        Object obj = qxf0.c.p;
        Object obj2 = cVar.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        cVar.a = objCreate;
        cVar.m += i3;
        cVar.n += i3;
        return cVar;
    }

    public final int q(int i, boolean z) {
        if (z) {
            return this.c.c(i);
        }
        if (i < this.b - 1) {
            return i + 1;
        }
        return -1;
    }
}
