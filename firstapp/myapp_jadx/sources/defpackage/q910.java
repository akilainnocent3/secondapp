package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$trackDepositPageView$1", f = "PixBtgDepositViewModel.kt", l = {864}, m = "invokeSuspend", v = 2)
public final class q910 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q910(g gVar, v1b<? super q910> v1bVar) {
        super(1, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new q910(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((q910) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        g gVar = this.b;
        psm psmVar = gVar.f;
        rdd0 rdd0Var = gVar.I;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pjd pjdVar = gVar.N;
            this.a = 1;
            obj = pjdVar.q(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        w75 w75Var = (w75) obj;
        boolean z = w75Var == w75.VARIANT_1;
        rdd0Var.a(new rnd(gVar.S, null, Boolean.valueOf(z), 5), k00.d);
        rdd0Var.a(new xnd(gVar.S, Boolean.valueOf(z), w75Var.a, psmVar.getCountryCode().getCode(), psmVar.getCountryCode().getCode()), k00.c);
        return Unit.a;
    }
}
