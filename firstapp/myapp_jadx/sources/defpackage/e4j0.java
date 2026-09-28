package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$rememberChallengeRewardAnimationState$1$1", f = "WelcomeRewardScreen.kt", l = {420}, m = "invokeSuspend", v = 2)
public final class e4j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n27 b;
    public final /* synthetic */ mmd c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ytw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4j0(n27 n27Var, mmd mmdVar, int i, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = n27Var;
        this.c = mmdVar;
        this.d = i;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e4j0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e4j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n27 n27Var = this.b;
            if (!((Boolean) ((x5a0) n27Var.f).getValue()).booleanValue() || !n27Var.b() || ((Boolean) ((x5a0) n27Var.g).getValue()).booleanValue()) {
                return Unit.a;
            }
            float fC1 = this.c.C1(c1j0.d);
            this.a = 1;
            if (n27Var.e(fC1, this.d, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((Function0) this.e.getValue()).invoke();
        return Unit.a;
    }
}
