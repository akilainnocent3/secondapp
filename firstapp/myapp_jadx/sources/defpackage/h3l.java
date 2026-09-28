package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh3l;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h3l extends j8i0 {
    public boolean A;
    public jvd0 B;
    public final uqm a;
    public final psm b;
    public final b700 c;
    public final v800 d;
    public final iym e;
    public final y1p f;
    public final k5k i;
    public final f1i v;
    public boolean w;
    public final ku90<g3l> y;
    public final ku90 z;

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$1", f = "GlobalWithdrawViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: h3l$a$a, reason: collision with other inner class name */
        public static final class C0621a<T> implements myh {
            public final /* synthetic */ h3l a;

            public C0621a(h3l h3lVar) {
                this.a = h3lVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.x1(new g3l.c(((Number) obj).intValue()));
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h3l.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            h3l h3lVar = h3l.this;
            ku90<Integer> ku90Var = h3lVar.d.h;
            C0621a c0621a = new C0621a(h3lVar);
            this.a = 1;
            ku90Var.collect(c0621a, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$2", f = "GlobalWithdrawViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ h3l a;

            public a(h3l h3lVar) {
                this.a = h3lVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.x1(g3l.b.a);
                return Unit.a;
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h3l.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            h3l h3lVar = h3l.this;
            ku90<Unit> ku90Var = h3lVar.d.k;
            a aVar = new a(h3lVar);
            this.a = 1;
            ku90Var.collect(aVar, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$emitSideEffect$1", f = "GlobalWithdrawViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ g3l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g3l g3lVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = g3lVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h3l.this.new c(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<g3l> ku90Var = h3l.this.y;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    public h3l(uqm uqmVar, psm psmVar, b700 b700Var, v800 v800Var, iym iymVar, y1p y1pVar, k5k k5kVar) {
        uqmVar.getClass();
        psmVar.getClass();
        b700Var.getClass();
        v800Var.getClass();
        iymVar.getClass();
        this.a = uqmVar;
        this.b = psmVar;
        this.c = b700Var;
        this.d = v800Var;
        this.e = iymVar;
        this.f = y1pVar;
        this.i = k5kVar;
        this.v = v800Var.g;
        ku90<g3l> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = ku90Var;
        v800Var.m = o8i0.d(this);
        x1(g3l.d.a);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void x1(g3l g3lVar) {
        ej5.c(o8i0.d(this), null, null, new c(g3lVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(x1b x1bVar) {
        l3l l3lVar;
        if (x1bVar instanceof l3l) {
            l3lVar = (l3l) x1bVar;
            int i = l3lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3lVar.c = i - Integer.MIN_VALUE;
            } else {
                l3lVar = new l3l(this, x1bVar);
            }
        } else {
            l3lVar = new l3l(this, x1bVar);
        }
        Object obj = l3lVar.a;
        y5b y5bVar = y5b.a;
        int i2 = l3lVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            uqm uqmVar = this.a;
            if (uqmVar.getAccountInfo() != null) {
                return Unit.a;
            }
            l3lVar.c = 1;
            bc6 bc6Var = new bc6(1, yzo.b(l3lVar));
            bc6Var.q();
            uqmVar.loadAccountInfo(new m3l(bc6Var));
            if (bc6Var.o() == y5bVar) {
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
