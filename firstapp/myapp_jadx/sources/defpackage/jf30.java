package defpackage;

import com.sporty.android.core.model.MyLog;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$checkMayReFetchOutcomeDataWhenOnResume$1", f = "QuickBetViewModel.kt", l = {378}, m = "invokeSuspend", v = 2)
public final class jf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public final /* synthetic */ tf30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf30(tf30 tf30Var, v1b<? super jf30> v1bVar) {
        super(2, v1bVar);
        this.c = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jf30(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        y5b y5bVar = y5b.a;
        int i = this.b;
        tf30 tf30Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            Long l = tf30Var.c0;
            if (l == null) {
                return Unit.a;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.g("paused " + jCurrentTimeMillis + "ms", new Object[0]);
            ot3 ot3Var = tf30Var.f;
            this.a = jCurrentTimeMillis;
            this.b = 1;
            obj = ot3Var.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.a;
            uj50.b(obj);
        }
        aw3 aw3Var = (aw3) obj;
        if (!aw3Var.a || j < aw3Var.b || tf30Var.y.U().isEmpty()) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_QUICK_BET);
            aVar2.g("not hit stale odds resume policy, re-fetch odds data skipped.", new Object[0]);
            return Unit.a;
        }
        itf0.a aVar3 = itf0.a;
        aVar3.q(MyLog.TAG_QUICK_BET);
        aVar3.g("hit stale odds resume policy, re-fetch the odds data.", new Object[0]);
        ArrayList arrayListU = tf30Var.y.U();
        String requestBody = g880.k(arrayListU, true).getRequestBody();
        aak aakVar = aak.a;
        jvd0 jvd0Var = tf30Var.e0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        tf30Var.e0 = ej5.c(o8i0.d(tf30Var), null, null, new of30(tf30Var, requestBody, arrayListU, null), 3);
        return Unit.a;
    }
}
