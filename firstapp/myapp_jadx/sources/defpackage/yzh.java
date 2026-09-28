package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class yzh implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ gaj b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public yzh d;
        public myh e;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return yzh.this.collect(null, this);
        }
    }

    public yzh(lyh lyhVar, gaj gajVar) {
        this.a = lyhVar;
        this.b = gajVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r6.invoke(r7, r8, r0) == r1) goto L23;
     */
    @Override // defpackage.lyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.myh<? super java.lang.Object> r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof yzh.a
            if (r0 == 0) goto L13
            r0 = r8
            yzh$a r0 = (yzh.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yzh$a r0 = new yzh$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r8)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            myh r7 = r0.e
            yzh r6 = r0.d
            defpackage.uj50.b(r8)
            goto L4b
        L39:
            defpackage.uj50.b(r8)
            r0.d = r6
            r0.e = r7
            r0.b = r5
            lyh r8 = r6.a
            java.io.Serializable r8 = defpackage.c0i.a(r8, r7, r0)
            if (r8 != r1) goto L4b
            goto L5d
        L4b:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            if (r8 == 0) goto L5e
            gaj r6 = r6.b
            r0.d = r3
            r0.e = r3
            r0.b = r4
            java.lang.Object r6 = r6.invoke(r7, r8, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzh.collect(myh, v1b):java.lang.Object");
    }
}
