package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class x67<T> extends u67<T> {
    public final lyh<lyh<T>> d;
    public final int e;

    public static final class a<T> implements myh {
        public final /* synthetic */ c9p a;
        public final /* synthetic */ bc80 b;
        public final /* synthetic */ ez20<T> c;
        public final /* synthetic */ rc80<T> d;

        /* JADX INFO: renamed from: x67$a$a, reason: collision with other inner class name */
        @c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {65}, m = "invokeSuspend")
        public static final class C1278a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ lyh<T> b;
            public final /* synthetic */ rc80<T> c;
            public final /* synthetic */ bc80 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1278a(lyh lyhVar, rc80 rc80Var, bc80 bc80Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = lyhVar;
                this.c = rc80Var;
                this.d = bc80Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1278a(this.b, this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1278a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                bc80 bc80Var = this.d;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        lyh<T> lyhVar = this.b;
                        rc80<T> rc80Var = this.c;
                        this.a = 1;
                        if (lyhVar.collect(rc80Var, this) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    bc80Var.c();
                    return Unit.a;
                } catch (Throwable th) {
                    bc80Var.c();
                    throw th;
                }
            }
        }

        @c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", l = {62}, m = "emit")
        public static final class b extends x1b {
            public a a;
            public lyh b;
            public /* synthetic */ Object c;
            public final /* synthetic */ a<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, v1b<? super b> v1bVar) {
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

        public a(c9p c9pVar, bc80 bc80Var, ez20 ez20Var, rc80 rc80Var) {
            this.a = c9pVar;
            this.b = bc80Var;
            this.c = ez20Var;
            this.d = rc80Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lyh<? extends T> lyhVar, v1b<? super Unit> v1bVar) {
            b bVar;
            if (v1bVar instanceof b) {
                bVar = (b) v1bVar;
                int i = bVar.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.e = i - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, v1bVar);
                }
            } else {
                bVar = new b(this, v1bVar);
            }
            Object obj = bVar.c;
            y5b y5bVar = y5b.a;
            int i2 = bVar.e;
            if (i2 == 0) {
                uj50.b(obj);
                c9p c9pVar = this.a;
                if (c9pVar != null && !c9pVar.isActive()) {
                    throw c9pVar.getCancellationException();
                }
                bVar.a = this;
                bVar.b = lyhVar;
                bVar.e = 1;
                if (this.b.a(bVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lyhVar = bVar.b;
                this = bVar.a;
                uj50.b(obj);
            }
            ej5.c(this.c, null, null, new C1278a(lyhVar, this.d, this.b, null), 3);
            return Unit.a;
        }
    }

    public x67(int i, int i2, pb5 pb5Var, lyh lyhVar, CoroutineContext coroutineContext) {
        super(coroutineContext, i2, pb5Var);
        this.d = lyhVar;
        this.e = i;
    }

    @Override // defpackage.u67
    public final String e() {
        return "concurrency=" + this.e;
    }

    @Override // defpackage.u67
    public final Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        Object objCollect = this.d.collect(new a((c9p) v1bVar.getContext().get(c9p.b.a), cc80.a(this.e), ez20Var, new rc80(ez20Var)), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }

    @Override // defpackage.u67
    public final u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new x67(this.e, i, pb5Var, this.d, coroutineContext);
    }

    @Override // defpackage.u67
    public final wf40<T> k(v5b v5bVar) {
        Function2 t67Var = new t67(this, null);
        pb5 pb5Var = pb5.a;
        a6b a6bVar = a6b.a;
        dz20 dz20Var = new dz20(g5b.b(v5bVar, this.a), d77.b(this.b, 4, pb5Var));
        dz20Var.n0(a6bVar, dz20Var, t67Var);
        return dz20Var;
    }
}
