package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pwg implements flx {
    public final /* synthetic */ qwg a;

    @c0d(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {3434, 3436}, m = "onPostFling-RZ2iAVY")
    public static final class a extends x1b {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return pwg.this.X1(0L, 0L, this);
        }
    }

    public pwg(qwg qwgVar) {
        this.a = qwgVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r15 == r2) goto L26;
     */
    @Override // defpackage.flx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X1(long r11, long r13, defpackage.v1b<? super defpackage.exh0> r15) {
        /*
            r10 = this;
            qwg r0 = r10.a
            i1g0 r1 = r0.a
            boolean r2 = r15 instanceof pwg.a
            if (r2 == 0) goto L18
            r2 = r15
            pwg$a r2 = (pwg.a) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.d = r3
        L16:
            r8 = r2
            goto L20
        L18:
            pwg$a r2 = new pwg$a
            x1b r15 = (defpackage.x1b) r15
            r2.<init>(r15)
            goto L16
        L20:
            java.lang.Object r15 = r8.b
            y5b r2 = defpackage.y5b.a
            int r3 = r8.d
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 == r4) goto L3b
            if (r3 != r9) goto L34
            long r10 = r8.a
            defpackage.uj50.b(r15)
            goto L7a
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L3b:
            long r13 = r8.a
            defpackage.uj50.b(r15)
            goto L63
        L41:
            defpackage.uj50.b(r15)
            float r15 = defpackage.exh0.c(r13)
            r3 = 0
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 <= 0) goto L54
            isw r15 = r1.b
            t5a0 r15 = (defpackage.t5a0) r15
            r15.A(r3)
        L54:
            r8.a = r13
            r8.d = r4
            r3 = r10
            r4 = r11
            r6 = r13
            java.lang.Object r15 = super.X1(r4, r6, r8)
            if (r15 != r2) goto L62
            goto L79
        L62:
            r13 = r6
        L63:
            exh0 r15 = (defpackage.exh0) r15
            long r10 = r15.a
            float r12 = defpackage.exh0.c(r13)
            h4d<java.lang.Float> r13 = r0.c
            xi0<java.lang.Float> r14 = r0.b
            r8.a = r10
            r8.d = r9
            java.lang.Object r15 = defpackage.vp0.e(r1, r12, r13, r14, r8)
            if (r15 != r2) goto L7a
        L79:
            return r2
        L7a:
            exh0 r15 = (defpackage.exh0) r15
            long r12 = r15.a
            long r10 = defpackage.exh0.e(r10, r12)
            exh0 r12 = new exh0
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwg.X1(long, long, v1b):java.lang.Object");
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        qwg qwgVar = this.a;
        i1g0 i1g0Var = qwgVar.a;
        if (!qwgVar.d.invoke().booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return 0L;
        }
        float fB = i1g0Var.b();
        i1g0Var.c(Float.intBitsToFloat(i2) + i1g0Var.b());
        if (fB == i1g0Var.b()) {
            return 0L;
        }
        return gly.b(0.0f, 0.0f, 2, j);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        qwg qwgVar = this.a;
        i1g0 i1g0Var = qwgVar.a;
        if (!qwgVar.d.invoke().booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        ((t5a0) i1g0Var.b).A(Float.intBitsToFloat(i2) + ((t5a0) i1g0Var.b).j());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float fB = i1g0Var.b();
            i1g0Var.c(Float.intBitsToFloat(i2) + i1g0Var.b());
            return (((long) Float.floatToRawIntBits(i1g0Var.b() - fB)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return 0L;
        }
        float fB2 = i1g0Var.b();
        i1g0Var.c(Float.intBitsToFloat(i3) + i1g0Var.b());
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(i1g0Var.b() - fB2)) & 4294967295L);
    }
}
