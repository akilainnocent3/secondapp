package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class xzh implements lyh<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ lyh b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public xzh d;
        public myh e;
        public kr60 f;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return xzh.this.collect(null, this);
        }
    }

    public xzh(lyh lyhVar, Function2 function2) {
        this.a = function2;
        this.b = lyhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r6.collect(r7, r0) == r1) goto L27;
     */
    @Override // defpackage.lyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.myh<? super java.lang.Object> r7, defpackage.v1b<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xzh.a
            if (r0 == 0) goto L13
            r0 = r8
            xzh$a r0 = (xzh.a) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xzh$a r0 = new xzh$a
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
            goto L70
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            kr60 r6 = r0.f
            myh r7 = r0.e
            xzh r2 = r0.d
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L3b
            goto L5c
        L3b:
            r7 = move-exception
            goto L75
        L3d:
            defpackage.uj50.b(r8)
            kr60 r8 = new kr60
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            kotlin.jvm.functions.Function2 r2 = r6.a     // Catch: java.lang.Throwable -> L73
            r0.d = r6     // Catch: java.lang.Throwable -> L73
            r0.e = r7     // Catch: java.lang.Throwable -> L73
            r0.f = r8     // Catch: java.lang.Throwable -> L73
            r0.b = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L73
            if (r2 != r1) goto L5a
            goto L6f
        L5a:
            r2 = r6
            r6 = r8
        L5c:
            r6.releaseIntercepted()
            lyh r6 = r2.b
            r0.d = r5
            r0.e = r5
            r0.f = r5
            r0.b = r3
            java.lang.Object r6 = r6.collect(r7, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L73:
            r7 = move-exception
            r6 = r8
        L75:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzh.collect(myh, v1b):java.lang.Object");
    }
}
