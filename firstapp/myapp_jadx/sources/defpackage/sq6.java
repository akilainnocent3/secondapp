package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutRepositoryImpl$fetchBOConfigs$2", f = "CashoutRepositoryImpl.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class sq6 extends tje0 implements Function2<v5b, v1b<? super xo6>, Object> {
    public int a;
    public final /* synthetic */ fr6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq6(fr6 fr6Var, v1b<? super sq6> v1bVar) {
        super(2, v1bVar);
        this.b = fr6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sq6(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super xo6> v1bVar) {
        return ((sq6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lq1 lq1Var = this.b.a;
            this.a = 1;
            obj = lq1Var.b(this);
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
        xo6 xo6VarB = fr6.b((BOConfigValueBundle) obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        aVar.g(xo6VarB.toString(), new Object[0]);
        return xo6VarB;
    }
}
