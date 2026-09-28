package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.g;
import com.sportybet.android.globalpay.pixBtg.deposit.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$onDialogAction$8", f = "PixBtgDepositViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
public final class m910 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m910(g gVar, v1b<? super m910> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m910(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m910) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        g gVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = gVar.x1(this);
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
        whn whnVar = (whn) obj;
        if (gVar.D1(whnVar.c, whnVar.d)) {
            gVar.F1(false);
        } else {
            gVar.H1(new x810());
            ej5.c(o8i0.d(gVar), null, null, new k(gVar, null), 3);
        }
        return Unit.a;
    }
}
