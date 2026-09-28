package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class llx extends d.c implements hvg0, flx {
    public flx D;
    public glx E;
    public llx F;
    public final String G;

    @c0d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {122, 127}, m = "onPostFling-RZ2iAVY")
    public static final class a extends x1b {
        public long a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return llx.this.X1(0L, 0L, this);
        }
    }

    @c0d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {115, 116}, m = "onPreFling-QWom1Mo")
    public static final class b extends x1b {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public b(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return llx.this.k1(0L, this);
        }
    }

    public llx(flx flxVar, glx glxVar) {
        this.D = flxVar;
        this.E = glxVar == null ? new glx() : glxVar;
        this.G = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.hvg0
    public final Object J() {
        return this.G;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.flx
    public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
        a aVar;
        long j3;
        long j4;
        long j5;
        long j6;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        a aVar2 = aVar;
        Object objX1 = aVar2.c;
        y5b y5bVar = y5b.a;
        int i2 = aVar2.e;
        llx llxVar = null;
        if (i2 == 0) {
            uj50.b(objX1);
            flx flxVar = this.D;
            aVar2.a = j;
            aVar2.b = j2;
            aVar2.e = 1;
            objX1 = flxVar.X1(j, j2, aVar2);
            if (objX1 != y5bVar) {
                j3 = j2;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            long j7 = aVar2.b;
            long j8 = aVar2.a;
            uj50.b(objX1);
            j3 = j7;
            j = j8;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = aVar2.a;
            uj50.b(objX1);
        }
        j5 = ((exh0) objX1).a;
        j4 = j6;
        return new exh0(exh0.e(j4, j5));
        j4 = ((exh0) objX1).a;
        boolean z = this.C;
        if (!z) {
            llxVar = this.F;
        } else if (z && z) {
            llxVar = (llx) obl0.a(this);
        }
        llx llxVar2 = llxVar;
        if (llxVar2 != null) {
            long jE = exh0.e(j, j4);
            long jD = exh0.d(j3, j4);
            aVar2.a = j4;
            aVar2.e = 2;
            objX1 = llxVar2.X1(jE, jD, aVar2);
            if (objX1 != y5bVar) {
                j6 = j4;
                j5 = ((exh0) objX1).a;
                j4 = j6;
            }
            return y5bVar;
        }
        j5 = 0;
        return new exh0(exh0.e(j4, j5));
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        boolean z = this.C;
        llx llxVar = null;
        if (z && z) {
            llxVar = (llx) obl0.a(this);
        }
        long jH0 = llxVar != null ? llxVar.h0(i, j) : 0L;
        return gly.f(jH0, this.D.h0(i, gly.e(j, jH0)));
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        glx glxVar = this.E;
        glxVar.a = this;
        glxVar.b = null;
        this.F = null;
        glxVar.c = new mlx(this);
        this.E.d = d2();
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        dq40 dq40Var = new dq40();
        obl0.c(this, new nlx(dq40Var));
        llx llxVar = (llx) ((hvg0) dq40Var.a);
        this.F = llxVar;
        glx glxVar = this.E;
        glxVar.b = llxVar;
        if (glxVar.a == this) {
            glxVar.a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r9 == r1) goto L28;
     */
    @Override // defpackage.flx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k1(long r7, defpackage.v1b<? super defpackage.exh0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof llx.b
            if (r0 == 0) goto L13
            r0 = r9
            llx$b r0 = (llx.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            llx$b r0 = new llx$b
            x1b r9 = (defpackage.x1b) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            long r6 = r0.a
            defpackage.uj50.b(r9)
            goto L71
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L35:
            long r7 = r0.a
            defpackage.uj50.b(r9)
            goto L58
        L3b:
            defpackage.uj50.b(r9)
            boolean r9 = r6.C
            if (r9 == 0) goto L4b
            if (r9 == 0) goto L4b
            hvg0 r9 = defpackage.obl0.a(r6)
            r3 = r9
            llx r3 = (defpackage.llx) r3
        L4b:
            if (r3 == 0) goto L5d
            r0.a = r7
            r0.d = r5
            java.lang.Object r9 = r3.k1(r7, r0)
            if (r9 != r1) goto L58
            goto L6f
        L58:
            exh0 r9 = (defpackage.exh0) r9
            long r2 = r9.a
            goto L5f
        L5d:
            r2 = 0
        L5f:
            flx r6 = r6.D
            long r7 = defpackage.exh0.d(r7, r2)
            r0.a = r2
            r0.d = r4
            java.lang.Object r9 = r6.k1(r7, r0)
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            r6 = r2
        L71:
            exh0 r9 = (defpackage.exh0) r9
            long r8 = r9.a
            long r6 = defpackage.exh0.e(r6, r8)
            exh0 r8 = new exh0
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llx.k1(long, v1b):java.lang.Object");
    }

    public final v5b p2() {
        llx llxVar = this.C ? (llx) obl0.a(this) : null;
        v5b v5bVarP2 = llxVar != null ? llxVar.p2() : null;
        if (v5bVarP2 != null && w5b.e(v5bVarP2)) {
            return v5bVarP2;
        }
        v5b v5bVar = this.E.d;
        if (v5bVar != null) {
            return v5bVar;
        }
        ib5.a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        long jW0 = this.D.w0(i, j, j2);
        boolean z = this.C;
        llx llxVar = null;
        if (z && z) {
            llxVar = (llx) obl0.a(this);
        }
        llx llxVar2 = llxVar;
        return gly.f(jW0, llxVar2 != null ? llxVar2.w0(i, gly.f(j, jW0), gly.e(j2, jW0)) : 0L);
    }
}
