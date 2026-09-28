package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.g;
import com.sportybet.android.cashoutphase3.h;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$onJsWebViewInitialized$1", f = "CashOutViewModel.kt", l = {743}, m = "invokeSuspend", v = 2)
public final class jo6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo6(h hVar, v1b<? super jo6> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jo6(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jo6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(500L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        aVar.g("Collecting CashoutData", new Object[0]);
        h hVar = this.b;
        jvd0 jvd0Var = hVar.B0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        hVar.B0 = kzh.d(new g1i(hVar.B.b(), new g(hVar, null)), o8i0.d(hVar));
        return Unit.a;
    }
}
