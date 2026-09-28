package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class b720 implements lyh<m0u> {
    public final /* synthetic */ a720 a;
    public final /* synthetic */ vxt b;

    @c0d(c = "com.sportybet.feature.loyalty.api.login.PostLoginTierMismatchKt$nonIronPostLoginTierTransitions$$inlined$mapNotNull$1", f = "PostLoginTierMismatch.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return b720.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ vxt b;

        @c0d(c = "com.sportybet.feature.loyalty.api.login.PostLoginTierMismatchKt$nonIronPostLoginTierTransitions$$inlined$mapNotNull$1$2", f = "PostLoginTierMismatch.kt", l = {51, 62}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, vxt vxtVar) {
            this.a = myhVar;
            this.b = vxtVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L28;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, defpackage.v1b r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof b720.b.a
                if (r0 == 0) goto L13
                r0 = r8
                b720$b$a r0 = (b720.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                b720$b$a r0 = new b720$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L37
                if (r2 == r4) goto L31
                if (r2 != r3) goto L2b
                defpackage.uj50.b(r8)
                goto L85
            L2b:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L31:
                myh r6 = r0.d
                defpackage.uj50.b(r8)
                goto L61
            L37:
                defpackage.uj50.b(r8)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                r7.getClass()
                vxt r7 = r6.b
                wm20 r7 = r7.a()
                java.lang.Integer r8 = new java.lang.Integer
                r2 = -1
                r8.<init>(r2)
                lyh r7 = r7.d(r8)
                c720 r8 = new c720
                r8.<init>(r7)
                myh r6 = r6.a
                r0.d = r6
                r0.b = r4
                java.lang.Object r8 = defpackage.s0i.a(r8, r0)
                if (r8 != r1) goto L61
                goto L84
            L61:
                java.lang.Number r8 = (java.lang.Number) r8
                int r7 = r8.intValue()
                m0u$a r8 = defpackage.m0u.b
                r8.getClass()
                m0u r7 = m0u.a.a(r7)
                if (r7 == 0) goto L77
                m0u r8 = defpackage.m0u.Tier0
                if (r7 == r8) goto L77
                goto L78
            L77:
                r7 = r5
            L78:
                if (r7 == 0) goto L85
                r0.d = r5
                r0.b = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L85
            L84:
                return r1
            L85:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: b720.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public b720(a720 a720Var, vxt vxtVar) {
        this.a = a720Var;
        this.b = vxtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super m0u> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
