package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
public final class t78 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public e9p a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lyh<Object> d;
    public final /* synthetic */ lyh<Object> e;
    public final /* synthetic */ myh<Object> f;
    public final /* synthetic */ gaj<Object, Object, v1b<Object>, Object> i;

    public static final class a implements Function1<Throwable, Unit> {
        public final /* synthetic */ e9p a;

        public a(e9p e9pVar) {
            this.a = e9pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            e9p e9pVar = this.a;
            if (e9pVar.isActive()) {
                e9pVar.t(new t1(e9pVar));
            }
            return Unit.a;
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<Object> b;
        public final /* synthetic */ CoroutineContext c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ dz20 e;
        public final /* synthetic */ myh<Object> f;
        public final /* synthetic */ gaj<Object, Object, v1b<Object>, Object> i;
        public final /* synthetic */ e9p v;

        public static final class a<T> implements myh {
            public final /* synthetic */ CoroutineContext a;
            public final /* synthetic */ Object b;
            public final /* synthetic */ dz20 c;
            public final /* synthetic */ myh<Object> d;
            public final /* synthetic */ gaj<Object, Object, v1b<Object>, Object> e;
            public final /* synthetic */ e9p f;

            /* JADX INFO: renamed from: t78$b$a$a, reason: collision with other inner class name */
            @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 129, 129}, m = "invokeSuspend")
            public static final class C1118a extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
                public myh a;
                public int b;
                public final /* synthetic */ dz20 c;
                public final /* synthetic */ myh<Object> d;
                public final /* synthetic */ gaj<Object, Object, v1b<Object>, Object> e;
                public final /* synthetic */ Object f;
                public final /* synthetic */ e9p i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1118a(dz20 dz20Var, myh myhVar, gaj gajVar, Object obj, e9p e9pVar, v1b v1bVar) {
                    super(2, v1bVar);
                    this.c = dz20Var;
                    this.d = myhVar;
                    this.e = gajVar;
                    this.f = obj;
                    this.i = e9pVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1118a(this.c, this.d, this.e, this.f, this.i, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
                    return ((C1118a) create(unit, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
                
                    if (r1.emit(r7, r6) == r0) goto L29;
                 */
                @Override // defpackage.pz1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        y5b r0 = defpackage.y5b.a
                        int r1 = r6.b
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L28
                        if (r1 == r5) goto L20
                        if (r1 == r4) goto L1a
                        if (r1 != r3) goto L14
                        defpackage.uj50.b(r7)
                        goto L69
                    L14:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r6)
                        return r2
                    L1a:
                        myh r1 = r6.a
                        defpackage.uj50.b(r7)
                        goto L5e
                    L20:
                        defpackage.uj50.b(r7)
                        h77 r7 = (defpackage.h77) r7
                        java.lang.Object r7 = r7.a
                        goto L36
                    L28:
                        defpackage.uj50.b(r7)
                        r6.b = r5
                        dz20 r7 = r6.c
                        java.lang.Object r7 = r7.e(r6)
                        if (r7 != r0) goto L36
                        goto L68
                    L36:
                        boolean r1 = r7 instanceof h77.b
                        if (r1 == 0) goto L48
                        java.lang.Throwable r7 = defpackage.h77.a(r7)
                        if (r7 != 0) goto L47
                        t1 r7 = new t1
                        e9p r6 = r6.i
                        r7.<init>(r6)
                    L47:
                        throw r7
                    L48:
                        toe0 r1 = defpackage.k5y.a
                        if (r7 != r1) goto L4d
                        r7 = r2
                    L4d:
                        myh<java.lang.Object> r1 = r6.d
                        r6.a = r1
                        r6.b = r4
                        gaj<java.lang.Object, java.lang.Object, v1b<java.lang.Object>, java.lang.Object> r4 = r6.e
                        java.lang.Object r5 = r6.f
                        java.lang.Object r7 = r4.invoke(r5, r7, r6)
                        if (r7 != r0) goto L5e
                        goto L68
                    L5e:
                        r6.a = r2
                        r6.b = r3
                        java.lang.Object r6 = r1.emit(r7, r6)
                        if (r6 != r0) goto L69
                    L68:
                        return r0
                    L69:
                        kotlin.Unit r6 = kotlin.Unit.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: t78.b.a.C1118a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: t78$b$a$b, reason: collision with other inner class name */
            @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", l = {125}, m = "emit")
            public static final class C1119b extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1119b(a<? super T> aVar, v1b<? super C1119b> v1bVar) {
                    super(v1bVar);
                    this.b = aVar;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.emit(null, this);
                }
            }

            public a(CoroutineContext coroutineContext, Object obj, dz20 dz20Var, myh myhVar, gaj gajVar, e9p e9pVar) {
                this.a = coroutineContext;
                this.b = obj;
                this.c = dz20Var;
                this.d = myhVar;
                this.e = gajVar;
                this.f = e9pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b<? super Unit> v1bVar) {
                C1119b c1119b;
                if (v1bVar instanceof C1119b) {
                    c1119b = (C1119b) v1bVar;
                    int i = c1119b.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1119b.c = i - Integer.MIN_VALUE;
                    } else {
                        c1119b = new C1119b(this, v1bVar);
                    }
                } else {
                    c1119b = new C1119b(this, v1bVar);
                }
                Object obj2 = c1119b.a;
                y5b y5bVar = y5b.a;
                int i2 = c1119b.c;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Unit unit = Unit.a;
                    C1118a c1118a = new C1118a(this.c, this.d, this.e, obj, this.f, null);
                    c1119b.c = 1;
                    if (ly60.a(this.a, unit, this.b, c1118a, c1119b) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lyh lyhVar, CoroutineContext coroutineContext, Object obj, dz20 dz20Var, myh myhVar, gaj gajVar, e9p e9pVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = coroutineContext;
            this.d = obj;
            this.e = dz20Var;
            this.f = myhVar;
            this.i = gajVar;
            this.v = e9pVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
            return ((b) create(unit, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.v);
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

    @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {86}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<ez20<? super Object>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh<Object> c;

        public static final class a<T> implements myh {
            public final /* synthetic */ ez20<Object> a;

            /* JADX INFO: renamed from: t78$c$a$a, reason: collision with other inner class name */
            @c0d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", l = {87}, m = "emit")
            public static final class C1120a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1120a(a<? super T> aVar, v1b<? super C1120a> v1bVar) {
                    super(v1bVar);
                    this.b = aVar;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.emit(null, this);
                }
            }

            public a(ez20<Object> ez20Var) {
                this.a = ez20Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b<? super Unit> v1bVar) {
                C1120a c1120a;
                if (v1bVar instanceof C1120a) {
                    c1120a = (C1120a) v1bVar;
                    int i = c1120a.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1120a.c = i - Integer.MIN_VALUE;
                    } else {
                        c1120a = new C1120a(this, v1bVar);
                    }
                } else {
                    c1120a = new C1120a(this, v1bVar);
                }
                Object obj2 = c1120a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1120a.c;
                if (i2 == 0) {
                    uj50.b(obj2);
                    dz20 dz20VarD = this.a.d();
                    if (obj == null) {
                        obj = k5y.a;
                    }
                    c1120a.c = 1;
                    if (dz20VarD.e.j(c1120a, obj) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lyh<Object> lyhVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = lyhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.c, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ez20<? super Object> ez20Var, v1b<? super Unit> v1bVar) {
            return ((c) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a((ez20) this.b);
                this.a = 1;
                if (this.c.collect(aVar, this) == y5bVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public t78(lyh<Object> lyhVar, lyh<Object> lyhVar2, myh<Object> myhVar, gaj<Object, Object, ? super v1b<Object>, ? extends Object> gajVar, v1b<? super t78> v1bVar) {
        super(2, v1bVar);
        this.d = lyhVar;
        this.e = lyhVar2;
        this.f = myhVar;
        this.i = gajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t78 t78Var = new t78(this.d, this.e, this.f, this.i, v1bVar);
        t78Var.c = obj;
        return t78Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t78) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:31:0x0099, B:36:0x00a1), top: B:41:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [a3, dz20, ec80, java.lang.Object, q67] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wf40] */
    /* JADX WARN: Type inference failed for: r2v10, types: [wf40] */
    /* JADX WARN: Type inference failed for: r2v12, types: [wf40] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        e9p e9pVar;
        ?? r2;
        ?? r3;
        y5b y5bVar = y5b.a;
        ?? r4 = this.b;
        try {
            if (r4 == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.c;
                c cVar = new c(this.d, null);
                e eVar = e.a;
                pb5 pb5Var = pb5.a;
                a6b a6bVar = a6b.a;
                ?? dz20Var = new dz20(g5b.b(v5bVar, eVar), d77.b(0, 4, pb5Var));
                dz20Var.n0(a6bVar, dz20Var, cVar);
                e9p e9pVarA = i9p.a();
                dz20Var.b(new a(e9pVarA));
                try {
                    try {
                        CoroutineContext coroutineContext = v5bVar.getCoroutineContext();
                        Object objB = uof0.b(coroutineContext);
                        CoroutineContext coroutineContextPlus = v5bVar.getCoroutineContext().plus(e9pVarA);
                        Unit unit = Unit.a;
                        try {
                            b bVar = new b(this.e, coroutineContext, objB, dz20Var, this.f, this.i, e9pVarA, null);
                            this.c = dz20Var;
                            this.a = e9pVarA;
                            this.b = 1;
                            if (ly60.a(coroutineContextPlus, unit, uof0.b(coroutineContextPlus), bVar, this) == y5bVar) {
                                return y5bVar;
                            }
                            r3 = dz20Var;
                        } catch (t1 e) {
                            e = e;
                            e9pVarA = e9pVarA;
                            e9pVar = e9pVarA;
                            r2 = dz20Var;
                            r3 = r2;
                            if (e.a != e9pVar) {
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r4 = dz20Var;
                        r4.cancel(null);
                        throw th;
                    }
                } catch (t1 e2) {
                    e = e2;
                }
            } else {
                if (r4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e9pVar = this.a;
                r2 = (wf40) this.c;
                try {
                    uj50.b(obj);
                    r3 = r2;
                } catch (t1 e3) {
                    e = e3;
                    r3 = r2;
                    if (e.a != e9pVar) {
                        throw e;
                    }
                }
            }
            r3.cancel(null);
            return Unit.a;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
