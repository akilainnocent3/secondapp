package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawBankV2Fragment$initView$1$1$1$1$1", f = "WithdrawBankV2Fragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bjj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ijj0 b;
    public final /* synthetic */ phx c;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawBankV2Fragment$initView$1$1$1$1$1$1", f = "WithdrawBankV2Fragment.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ijj0 b;
        public final /* synthetic */ phx c;

        /* JADX INFO: renamed from: bjj0$a$a, reason: collision with other inner class name */
        public static final class C0129a<T> implements myh {
            public final /* synthetic */ phx a;

            public C0129a(phx phxVar) {
                this.a = phxVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                vu60 vu60VarA;
                kqj0 kqj0Var = (kqj0) obj;
                if (kqj0Var instanceof kqj0.d) {
                    phx phxVar = this.a;
                    ifx ifxVarH = phxVar.b.h();
                    if (ifxVarH != null && (vu60VarA = ifxVarH.a()) != null) {
                        vu60VarA.e(((kqj0.d) kqj0Var).a, "confirmation");
                    }
                    yfx.i(phxVar, "Confirm", null, 6);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ijj0 ijj0Var, phx phxVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ijj0Var;
            this.c = phxVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ku90 ku90Var = this.b.P0().e0;
            C0129a c0129a = new C0129a(this.c);
            this.a = 1;
            ku90Var.collect(c0129a, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawBankV2Fragment$initView$1$1$1$1$1$2", f = "WithdrawBankV2Fragment.kt", l = {134}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ijj0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ ijj0 a;

            public a(ijj0 ijj0Var) {
                this.a = ijj0Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xyi xyiVar = this.a.c0;
                if (xyiVar != null) {
                    xyiVar.i.setVisibility(zBooleanValue ? 0 : 8);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ijj0 ijj0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = ijj0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
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
                ijj0 ijj0Var = this.b;
                vl50 vl50VarF = bm50.f(ijj0Var.P0().C0);
                a aVar = new a(ijj0Var);
                this.a = 1;
                if (vl50VarF.collect(aVar, this) == y5bVar) {
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
    public bjj0(ijj0 ijj0Var, phx phxVar, v1b<? super bjj0> v1bVar) {
        super(2, v1bVar);
        this.b = ijj0Var;
        this.c = phxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bjj0 bjj0Var = new bjj0(this.b, this.c, v1bVar);
        bjj0Var.a = obj;
        return bjj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bjj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        phx phxVar = this.c;
        ijj0 ijj0Var = this.b;
        ej5.c(v5bVar, null, null, new a(ijj0Var, phxVar, null), 3);
        ej5.c(v5bVar, null, null, new b(ijj0Var, null), 3);
        return Unit.a;
    }
}
