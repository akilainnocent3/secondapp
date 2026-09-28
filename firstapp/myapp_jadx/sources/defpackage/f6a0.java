package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", l = {68, 69}, m = "invokeSuspend")
public final class f6a0 extends tje0 implements Function2<bz20<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CoroutineContext c;
    public final /* synthetic */ lyh<Object> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ bz20<Object> a;

        public a(bz20<Object> bz20Var) {
            this.a = bz20Var;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            this.a.setValue(t);
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", l = {69}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<Object> b;
        public final /* synthetic */ bz20<Object> c;

        public static final class a<T> implements myh {
            public final /* synthetic */ bz20<Object> a;

            public a(bz20<Object> bz20Var) {
                this.a = bz20Var;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                this.a.setValue(t);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lyh<Object> lyhVar, bz20<Object> bz20Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = bz20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a(this.c);
                this.a = 1;
                if (this.b.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6a0(CoroutineContext coroutineContext, lyh<Object> lyhVar, v1b<? super f6a0> v1bVar) {
        super(2, v1bVar);
        this.c = coroutineContext;
        this.d = lyhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f6a0 f6a0Var = new f6a0(this.c, this.d, v1bVar);
        f6a0Var.b = obj;
        return f6a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bz20<Object> bz20Var, v1b<? super Unit> v1bVar) {
        return ((f6a0) create(bz20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r6.collect(r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (defpackage.ej5.d(r5, r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L14:
            defpackage.uj50.b(r8)
            goto L47
        L18:
            defpackage.uj50.b(r8)
            java.lang.Object r8 = r7.b
            bz20 r8 = (defpackage.bz20) r8
            kotlin.coroutines.e r1 = kotlin.coroutines.e.a
            kotlin.coroutines.CoroutineContext r5 = r7.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.g(r5, r1)
            lyh<java.lang.Object> r6 = r7.d
            if (r1 == 0) goto L39
            f6a0$a r1 = new f6a0$a
            r1.<init>(r8)
            r7.a = r4
            java.lang.Object r7 = r6.collect(r1, r7)
            if (r7 != r0) goto L47
            goto L46
        L39:
            f6a0$b r1 = new f6a0$b
            r1.<init>(r6, r8, r2)
            r7.a = r3
            java.lang.Object r7 = defpackage.ej5.d(r5, r1, r7)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
