package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class h1i implements lyh<Object> {
    public final /* synthetic */ Object a;
    public final /* synthetic */ lyh b;
    public final /* synthetic */ gaj c;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 111}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public h1i d;
        public myh e;
        public dq40 f;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return h1i.this.collect(null, this);
        }
    }

    public h1i(Object obj, lyh lyhVar, gaj gajVar) {
        this.a = obj;
        this.b = lyhVar;
        this.c = gajVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r2.collect(r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // defpackage.lyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.myh<? super java.lang.Object> r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof h1i.a
            if (r0 == 0) goto L13
            r0 = r8
            h1i$a r0 = (h1i.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            h1i$a r0 = new h1i$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r8)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            dq40 r6 = r0.f
            myh r7 = r0.e
            h1i r2 = r0.d
            defpackage.uj50.b(r8)
            r8 = r6
            r6 = r2
            goto L54
        L3d:
            dq40 r8 = defpackage.j6w.a(r8)
            java.lang.Object r2 = r6.a
            r8.a = r2
            r0.d = r6
            r0.e = r7
            r0.f = r8
            r0.b = r4
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L54
            goto L6b
        L54:
            lyh r2 = r6.b
            i1i r4 = new i1i
            gaj r6 = r6.c
            r4.<init>(r8, r6, r7)
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.b = r3
            java.lang.Object r6 = r2.collect(r4, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1i.collect(myh, v1b):java.lang.Object");
    }
}
