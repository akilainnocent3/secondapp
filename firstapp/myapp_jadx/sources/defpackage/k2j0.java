package defpackage;

import com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.welcomereward.WelcomeRewardDebugViewModel$saveConfig$1", f = "WelcomeRewardDebugViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class k2j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h2j0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2j0(h2j0 h2j0Var, v1b<? super k2j0> v1bVar) {
        super(2, v1bVar);
        this.b = h2j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k2j0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k2j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        h2j0 h2j0Var = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                String json = h2j0Var.b.toJson((WelcomeRewardTimingConfig) h2j0Var.c.getValue());
                w1j0 w1j0Var = h2j0Var.a;
                wm20 wm20VarA = w1j0Var.d.a(w1j0Var, w1j0.i[2]);
                json.getClass();
                this.a = 1;
                if (wm20VarA.g(this, json) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }
}
