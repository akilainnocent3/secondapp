package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
public final class qzh extends tje0 implements gaj<v5b, myh<Object>, v1b<? super Unit>, Object> {
    public dq40 a;
    public cq40 b;
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Function1<Object, Long> f;
    public final /* synthetic */ lyh<Object> i;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ myh<Object> b;
        public final /* synthetic */ dq40<Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, myh myhVar, dq40 dq40Var) {
            super(1, v1bVar);
            this.b = myhVar;
            this.c = dq40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            dq40<Object> dq40Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                Object obj2 = dq40Var.a;
                if (obj2 == k5y.a) {
                    obj2 = null;
                }
                this.a = 1;
                if (this.b.emit(obj2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            dq40Var.a = null;
            return Unit.a;
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<h77<? extends Object>, v1b<? super Unit>, Object> {
        public dq40 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ dq40<Object> d;
        public final /* synthetic */ myh<Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, myh myhVar, dq40 dq40Var) {
            super(2, v1bVar);
            this.d = dq40Var;
            this.e = myhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.e, this.d);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h77<? extends Object> h77Var, v1b<? super Unit> v1bVar) {
            h77<? extends Object> h77Var2 = h77Var;
            Object obj = h77Var2.a;
            return ((b) create(h77Var2, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [T, toe0] */
        /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            dq40<Object> dq40Var;
            dq40<Object> dq40Var2;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                ?? r7 = ((h77) this.c).a;
                boolean z = r7 instanceof h77.b;
                dq40Var = this.d;
                if (!z) {
                    dq40Var.a = r7;
                }
                if (z) {
                    Throwable thA = h77.a(r7);
                    if (thA != null) {
                        throw thA;
                    }
                    Object obj2 = dq40Var.a;
                    if (obj2 != null) {
                        Object obj3 = obj2 != k5y.a ? obj2 : null;
                        this.c = r7;
                        this.a = dq40Var;
                        this.b = 1;
                        if (this.e.emit(obj3, this) == y5bVar) {
                            return y5bVar;
                        }
                        dq40Var2 = dq40Var;
                    }
                    dq40Var.a = k5y.c;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var2 = this.a;
            uj50.b(obj);
            dq40Var = dq40Var2;
            dq40Var.a = k5y.c;
            return Unit.a;
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<ez20<? super Object>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh<Object> c;

        public static final class a<T> implements myh {
            public final /* synthetic */ ez20<Object> a;

            /* JADX INFO: renamed from: qzh$c$a$a, reason: collision with other inner class name */
            @c0d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit")
            public static final class C1027a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1027a(a<? super T> aVar, v1b<? super C1027a> v1bVar) {
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
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                C1027a c1027a;
                if (v1bVar instanceof C1027a) {
                    c1027a = (C1027a) v1bVar;
                    int i = c1027a.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1027a.c = i - Integer.MIN_VALUE;
                    } else {
                        c1027a = new C1027a(this, v1bVar);
                    }
                } else {
                    c1027a = new C1027a(this, v1bVar);
                }
                Object obj = c1027a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1027a.c;
                if (i2 == 0) {
                    uj50.b(obj);
                    if (t == null) {
                        t = (T) k5y.a;
                    }
                    c1027a.c = 1;
                    if (this.a.j(c1027a, t) == y5bVar) {
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
    public qzh(v1b v1bVar, lyh lyhVar, Function1 function1) {
        super(3, v1bVar);
        this.f = function1;
        this.i = lyhVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        qzh qzhVar = new qzh(v1bVar, this.i, this.f);
        qzhVar.d = v5bVar;
        qzhVar.e = myhVar;
        return qzhVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[PHI: r2 r7 r8 r9
      0x00ab: PHI (r2v5 cq40) = (r2v7 cq40), (r2v10 cq40), (r2v10 cq40) binds: [B:27:0x00a9, B:14:0x0075, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r7v2 dq40) = (r7v11 dq40), (r7v12 dq40), (r7v12 dq40) binds: [B:27:0x00a9, B:14:0x0075, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r8v2 ??) = (r8v12 ??), (r8v13 ??), (r8v14 ??) binds: [B:27:0x00a9, B:14:0x0075, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r9v4 myh) = (r9v5 myh), (r9v6 myh), (r9v6 myh) binds: [B:27:0x00a9, B:14:0x0075, B:20:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    /* JADX WARN: Code duplicated, block: B:37:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, wf40] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
