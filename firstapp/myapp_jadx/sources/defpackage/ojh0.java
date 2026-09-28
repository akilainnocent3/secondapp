package defpackage;

import com.sporty.android.common_analytics.sportytracking.model.Config;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.usecase.UpdateBetSlipParamsUseCase$generateConfig$2", f = "UpdateBetSlipParamsUseCase.kt", l = {30, 35}, m = "invokeSuspend", v = 2)
public final class ojh0 extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public String a;
    public boolean b;
    public int c;
    public final /* synthetic */ pjh0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojh0(pjh0 pjh0Var, v1b<? super ojh0> v1bVar) {
        super(2, v1bVar);
        this.d = pjh0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ojh0(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((ojh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        String str2;
        mgb0 mgb0Var = this.d.a;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            str = "user_accept_change";
            this.a = "user_accept_change";
            this.c = 1;
            obj = mgb0Var.getUserId(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            str = this.a;
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.b;
            str2 = this.a;
            uj50.b(obj);
        }
        return new eal().j(new Config(Boolean.valueOf(vn20.c(str2, (String) obj, false)), Boolean.valueOf(z)));
        boolean zC = vn20.c(str, (String) obj, false);
        this.a = "suspend_event_change";
        this.b = zC;
        this.c = 2;
        Object userId = mgb0Var.getUserId(this);
        if (userId != y5bVar) {
            z = zC;
            obj = userId;
            str2 = "suspend_event_change";
            return new eal().j(new Config(Boolean.valueOf(vn20.c(str2, (String) obj, false)), Boolean.valueOf(z)));
        }
        return y5bVar;
    }
}
