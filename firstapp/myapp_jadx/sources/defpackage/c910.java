package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.g;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$hotButtonVariant$1", f = "PixBtgDepositViewModel.kt", l = {163}, m = "invokeSuspend", v = 2)
public final class c910 extends tje0 implements Function2<v5b, v1b<? super w75>, Object> {
    public int a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c910(g gVar, v1b<? super c910> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c910(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super w75> v1bVar) {
        return ((c910) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                yzh yzhVarJ = this.b.H.j(z76.v);
                this.a = 1;
                obj = bm50.q(yzhVarJ, this);
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
            return w75Var == null ? w75.CONTROL : w75Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            itf0.a.f(e2, "Failed to resolve hot button variant", new Object[0]);
            return w75.CONTROL;
        }
    }
}
