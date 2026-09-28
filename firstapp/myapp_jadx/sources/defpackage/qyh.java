package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
public final class qyh extends tje0 implements Function2<bz20<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s9s c;
    public final /* synthetic */ s9s.b d;
    public final /* synthetic */ CoroutineContext e;
    public final /* synthetic */ lyh<Object> f;

    @c0d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ CoroutineContext b;
        public final /* synthetic */ lyh<Object> c;
        public final /* synthetic */ bz20<Object> d;

        /* JADX INFO: renamed from: qyh$a$a, reason: collision with other inner class name */
        public static final class C1025a<T> implements myh {
            public final /* synthetic */ bz20<T> a;

            public C1025a(bz20<T> bz20Var) {
                this.a = bz20Var;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                this.a.setValue(t);
                return Unit.a;
            }
        }

        @c0d(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend")
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ lyh<Object> b;
            public final /* synthetic */ bz20<Object> c;

            /* JADX INFO: renamed from: qyh$a$b$a, reason: collision with other inner class name */
            public static final class C1026a<T> implements myh {
                public final /* synthetic */ bz20<T> a;

                public C1026a(bz20<T> bz20Var) {
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
                    C1026a c1026a = new C1026a(this.c);
                    this.a = 1;
                    if (this.b.collect(c1026a, this) == y5bVar) {
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
        public a(CoroutineContext coroutineContext, lyh<Object> lyhVar, bz20<Object> bz20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = coroutineContext;
            this.c = lyhVar;
            this.d = bz20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r6.collect(r8, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (defpackage.ej5.d(r1, r8, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
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
                goto L45
            L18:
                defpackage.uj50.b(r8)
                kotlin.coroutines.e r8 = kotlin.coroutines.e.a
                kotlin.coroutines.CoroutineContext r1 = r7.b
                boolean r8 = kotlin.jvm.internal.Intrinsics.g(r1, r8)
                bz20<java.lang.Object> r5 = r7.d
                lyh<java.lang.Object> r6 = r7.c
                if (r8 == 0) goto L37
                qyh$a$a r8 = new qyh$a$a
                r8.<init>(r5)
                r7.a = r4
                java.lang.Object r7 = r6.collect(r8, r7)
                if (r7 != r0) goto L45
                goto L44
            L37:
                qyh$a$b r8 = new qyh$a$b
                r8.<init>(r6, r5, r2)
                r7.a = r3
                java.lang.Object r7 = defpackage.ej5.d(r1, r8, r7)
                if (r7 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qyh.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyh(s9s s9sVar, s9s.b bVar, CoroutineContext coroutineContext, lyh<Object> lyhVar, v1b<? super qyh> v1bVar) {
        super(2, v1bVar);
        this.c = s9sVar;
        this.d = bVar;
        this.e = coroutineContext;
        this.f = lyhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qyh qyhVar = new qyh(this.c, this.d, this.e, this.f, v1bVar);
        qyhVar.b = obj;
        return qyhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bz20<Object> bz20Var, v1b<? super Unit> v1bVar) {
        return ((qyh) create(bz20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.e, this.f, (bz20) this.b, null);
            this.a = 1;
            if (m850.a(this.c, this.d, aVar, this) == y5bVar) {
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
