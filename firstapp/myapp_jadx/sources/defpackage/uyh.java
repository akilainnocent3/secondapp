package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {54, 55}, m = "invokeSuspend")
public final class uyh extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public dq40 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xzh d;
    public final /* synthetic */ zmz.b e;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<Object> a;
        public final /* synthetic */ zmz.b b;
        public final /* synthetic */ myh<Object> c;

        /* JADX INFO: renamed from: uyh$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", l = {56, 57}, m = "emit")
        public static final class C1192a extends x1b {
            public a a;
            public dq40 b;
            public /* synthetic */ Object c;
            public final /* synthetic */ a<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1192a(a<? super T> aVar, v1b<? super C1192a> v1bVar) {
                super(v1bVar);
                this.d = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        public a(dq40 dq40Var, zmz.b bVar, myh myhVar) {
            this.a = dq40Var;
            this.b = bVar;
            this.c = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, defpackage.v1b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uyh.a.C1192a
                if (r0 == 0) goto L13
                r0 = r9
                uyh$a$a r0 = (uyh.a.C1192a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                uyh$a$a r0 = new uyh$a$a
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
                uyh$a r8 = r0.a
                defpackage.uj50.b(r9)
                goto L53
            L39:
                defpackage.uj50.b(r9)
                dq40<java.lang.Object> r9 = r7.a
                T r2 = r9.a
                r0.a = r7
                r0.b = r9
                r0.e = r5
                zmz$b r5 = r7.b
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
            throw new UnsupportedOperationException("Method not decompiled: uyh.a.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyh(xzh xzhVar, zmz.b bVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = xzhVar;
        this.e = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uyh uyhVar = new uyh(this.d, this.e, v1bVar);
        uyhVar.c = obj;
        return uyhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        return ((uyh) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r6.d.collect(r7, r6) == r0) goto L16;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)
            goto L53
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            dq40 r1 = r6.a
            java.lang.Object r4 = r6.c
            myh r4 = (defpackage.myh) r4
            defpackage.uj50.b(r7)
            goto L3d
        L21:
            defpackage.uj50.b(r7)
            java.lang.Object r7 = r6.c
            myh r7 = (defpackage.myh) r7
            dq40 r1 = new dq40
            r1.<init>()
            r1.a = r2
            r6.c = r7
            r6.a = r1
            r6.b = r4
            java.lang.Object r4 = r7.emit(r2, r6)
            if (r4 != r0) goto L3c
            goto L52
        L3c:
            r4 = r7
        L3d:
            uyh$a r7 = new uyh$a
            zmz$b r5 = r6.e
            r7.<init>(r1, r5, r4)
            r6.c = r2
            r6.a = r2
            r6.b = r3
            xzh r1 = r6.d
            java.lang.Object r6 = r1.collect(r7, r6)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
