package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadMaxRegisteredAccountsConfig$1", f = "PixBtgDepositViewModel.kt", l = {532}, m = "invokeSuspend", v = 2)
public final class e910 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public g a;
    public int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e910(g gVar, v1b<? super e910> v1bVar) {
        super(1, v1bVar);
        this.c = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new e910(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((e910) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        g gVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            g gVar2 = this.c;
            f200 f200VarI = gVar2.c.i();
            this.a = gVar2;
            this.b = 1;
            Object objA = s0i.a(f200VarI, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            gVar = gVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = this.a;
            uj50.b(obj);
        }
        gVar.R = ((Number) obj).intValue();
        return Unit.a;
    }
}
