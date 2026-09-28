package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class i1i<T> implements myh {
    public final /* synthetic */ dq40<Object> a;
    public final /* synthetic */ gaj<Object, T, v1b<Object>, Object> b;
    public final /* synthetic */ myh<Object> c;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", l = {105, 106}, m = "emit")
    public static final class a extends x1b {
        public i1i a;
        public dq40 b;
        public /* synthetic */ Object c;
        public final /* synthetic */ i1i<T> d;
        public int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i1i<? super T> i1iVar, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.d = i1iVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1i(dq40<Object> dq40Var, gaj<Object, ? super T, ? super v1b<Object>, ? extends Object> gajVar, myh<Object> myhVar) {
        this.a = dq40Var;
        this.b = gajVar;
        this.c = myhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L22;
     */
    @Override // defpackage.myh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(T r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof i1i.a
            if (r0 == 0) goto L13
            r0 = r9
            i1i$a r0 = (i1i.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            i1i$a r0 = new i1i$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r9)
            goto L68
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L31:
            dq40 r7 = r0.b
            i1i r8 = r0.a
            defpackage.uj50.b(r9)
            goto L53
        L39:
            defpackage.uj50.b(r9)
            dq40<java.lang.Object> r9 = r7.a
            T r2 = r9.a
            r0.a = r7
            r0.b = r9
            r0.e = r5
            gaj<java.lang.Object, T, v1b<java.lang.Object>, java.lang.Object> r5 = r7.b
            java.lang.Object r8 = r5.invoke(r2, r8, r0)
            if (r8 != r1) goto L4f
            goto L67
        L4f:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L53:
            r7.a = r9
            myh<java.lang.Object> r7 = r8.c
            dq40<java.lang.Object> r8 = r8.a
            T r8 = r8.a
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i1i.emit(java.lang.Object, v1b):java.lang.Object");
    }
}
