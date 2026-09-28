package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.ghaccount.password.GHSetPasswordViewModel$register$3", f = "GHSetPasswordViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dej extends tje0 implements Function2<lk50<? extends OTPCompleteResult>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ eej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dej(eej eejVar, v1b<? super dej> v1bVar) {
        super(2, v1bVar);
        this.b = eejVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dej dejVar = new dej(this.b, v1bVar);
        dejVar.a = obj;
        return dejVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPCompleteResult> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dej) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        eej eejVar = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = eej.B;
            eejVar.z1(awz.a(eejVar.x1(), null, null, wh80.c.a, null, 11));
        } else if (lk50Var instanceof lk50.c) {
            ku90<ycj> ku90Var = eejVar.y;
            ku90Var.a.a(new ycj.e(eejVar.A, (OTPCompleteResult) ((lk50.c) lk50Var).a, new cej(eejVar)));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            Throwable th = ((lk50.a) lk50Var).a;
            ohp<Object>[] ohpVarArr2 = eej.B;
            eejVar.y1(th);
        }
        return Unit.a;
    }
}
