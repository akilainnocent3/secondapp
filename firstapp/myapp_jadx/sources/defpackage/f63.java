package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f63 implements Function1 {
    public final /* synthetic */ q73 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ng10 d;

    public /* synthetic */ f63(q73 q73Var, long j, boolean z, ng10 ng10Var) {
        this.a = q73Var;
        this.b = j;
        this.c = z;
        this.d = ng10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.p(th, "failed to parse place bet result", new Object[0]);
        th.getClass();
        w950.a("BetSlipActivity", "PlaceBet", th, null);
        q73 q73Var = this.a;
        if (!q73Var.L1) {
            tom tomVar = th instanceof tom ? (tom) th : null;
            q73Var.T1(new v03.s(tomVar != null ? tomVar.a : -1, -1, this.b, System.currentTimeMillis(), this.c));
        }
        q73Var.q0.j(new tg10(null, this.d));
        ej5.c(o8i0.d(q73Var), q73Var.S, null, new u73(q73Var, null, null, null), 2);
        return Unit.a;
    }
}
