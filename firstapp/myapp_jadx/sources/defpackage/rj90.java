package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rj90 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {49}, m = "invokeSuspend")
    public static final class a<T> extends tje0 implements Function2<myh<? super T>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<hk90<T>, v1b<? super Unit>, Object> c;

        /* JADX INFO: renamed from: rj90$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {67, 68}, m = "invokeSuspend")
        public static final class C1052a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public c77 a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ myh<T> d;
            public final /* synthetic */ Function2<hk90<T>, v1b<? super Unit>, Object> e;

            /* JADX INFO: renamed from: rj90$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {55}, m = "invokeSuspend")
            public static final class C1053a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ tb5 b;
                public final /* synthetic */ Function2<hk90<T>, v1b<? super Unit>, Object> c;

                /* JADX INFO: renamed from: rj90$a$a$a$a, reason: collision with other inner class name */
                @c0d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {60}, m = "invokeSuspend")
                public static final class C1054a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                    public int a;
                    public /* synthetic */ Object b;
                    public final /* synthetic */ tb5 c;
                    public final /* synthetic */ Function2<hk90<T>, v1b<? super Unit>, Object> d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1054a(tb5 tb5Var, Function2 function2, v1b v1bVar) {
                        super(2, v1bVar);
                        this.c = tb5Var;
                        this.d = function2;
                    }

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        C1054a c1054a = new C1054a(this.c, this.d, v1bVar);
                        c1054a.b = obj;
                        return c1054a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                        return ((C1054a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        y5b y5bVar = y5b.a;
                        int i = this.a;
                        if (i == 0) {
                            uj50.b(obj);
                            kk90 kk90Var = new kk90((v5b) this.b, this.c);
                            this.a = 1;
                            if (this.d.invoke(kk90Var, this) == y5bVar) {
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
                public C1053a(tb5 tb5Var, Function2 function2, v1b v1bVar) {
                    super(2, v1bVar);
                    this.b = tb5Var;
                    this.c = function2;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1053a(this.b, this.c, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1053a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    tb5 tb5Var = this.b;
                    try {
                        if (i == 0) {
                            uj50.b(obj);
                            C1054a c1054a = new C1054a(tb5Var, this.c, null);
                            this.a = 1;
                            if (w5b.d(c1054a, this) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (i != 1) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uj50.b(obj);
                        }
                        tb5Var.k(null);
                    } catch (Throwable th) {
                        tb5Var.i(th, false);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1052a(myh<? super T> myhVar, Function2<? super hk90<T>, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super C1052a> v1bVar) {
                super(2, v1bVar);
                this.d = myhVar;
                this.e = function2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1052a c1052a = new C1052a(this.d, this.e, v1bVar);
                c1052a.c = obj;
                return c1052a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1052a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:7:0x0016). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to rj90$a$a for r8v2 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r8.b
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L19
                    c77 r1 = r8.a
                    java.lang.Object r5 = r8.c
                    c9p r5 = (defpackage.c9p) r5
                    defpackage.uj50.b(r9)
                L16:
                    r9 = r5
                    r5 = r1
                    goto L47
                L19:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r8)
                    return r4
                L1f:
                    c77 r1 = r8.a
                    java.lang.Object r5 = r8.c
                    c9p r5 = (defpackage.c9p) r5
                    defpackage.uj50.b(r9)
                    goto L58
                L29:
                    defpackage.uj50.b(r9)
                    java.lang.Object r9 = r8.c
                    v5b r9 = (defpackage.v5b) r9
                    r1 = 0
                    r5 = 6
                    tb5 r1 = defpackage.d77.b(r1, r5, r4)
                    rj90$a$a$a r5 = new rj90$a$a$a
                    kotlin.jvm.functions.Function2<hk90<T>, v1b<? super kotlin.Unit>, java.lang.Object> r6 = r8.e
                    r5.<init>(r1, r6, r4)
                    r6 = 3
                    jvd0 r9 = defpackage.ej5.c(r9, r4, r4, r5, r6)
                    tb5$a r5 = new tb5$a
                    r5.<init>()
                L47:
                    r8.c = r9
                    r8.a = r5
                    r8.b = r3
                    java.lang.Object r1 = r5.b(r8)
                    if (r1 != r0) goto L54
                    goto L72
                L54:
                    r7 = r5
                    r5 = r9
                    r9 = r1
                    r1 = r7
                L58:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L73
                    java.lang.Object r9 = r1.next()
                    r8.c = r5
                    r8.a = r1
                    r8.b = r2
                    myh<T> r6 = r8.d
                    java.lang.Object r9 = r6.emit(r9, r8)
                    if (r9 != r0) goto L16
                L72:
                    return r0
                L73:
                    r5.cancel(r4)
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: rj90.a.C1052a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super hk90<T>, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((a) create((myh) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1052a c1052a = new C1052a((myh) this.b, this.c, null);
                this.a = 1;
                if (w5b.d(c1052a, this) == y5bVar) {
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

    public static final <T> lyh<T> a(Function2<? super hk90<T>, ? super v1b<? super Unit>, ? extends Object> function2) {
        return ozh.b(new or60(new a(function2, null)), -2, 2);
    }
}
