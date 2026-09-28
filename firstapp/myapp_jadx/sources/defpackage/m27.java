package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.ChallengeRewardAnimationState$runSwapAnimation$2", f = "WelcomeRewardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m27 extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ n27 b;

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.ChallengeRewardAnimationState$runSwapAnimation$2$1", f = "WelcomeRewardScreen.kt", l = {359}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ n27 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n27 n27Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = n27Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = this.b.m;
                Float f = new Float(1.0f);
                gzg0 gzg0VarE = yi0.e(300, 0, c1j0.a, 2);
                this.a = 1;
                if (wd0.a(wd0Var, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.ChallengeRewardAnimationState$runSwapAnimation$2$2", f = "WelcomeRewardScreen.kt", l = {368}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ n27 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n27 n27Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = n27Var;
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
                wd0<Float, ij0> wd0Var = this.b.n;
                Float f = new Float(0.0f);
                gzg0 gzg0VarE = yi0.e(300, 0, c1j0.a, 2);
                this.a = 1;
                if (wd0.a(wd0Var, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
    public m27(n27 n27Var, v1b<? super m27> v1bVar) {
        super(2, v1bVar);
        this.b = n27Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m27 m27Var = new m27(this.b, v1bVar);
        m27Var.a = obj;
        return m27Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
        return ((m27) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        n27 n27Var = this.b;
        ej5.c(v5bVar, null, null, new a(n27Var, null), 3);
        return ej5.c(v5bVar, null, null, new b(n27Var, null), 3);
    }
}
