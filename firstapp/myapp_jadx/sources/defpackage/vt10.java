package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.SportBet;
import com.sporty.android.core.model.realsports.TransactionStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$innerGetTxList$2", f = "PocketRepositoryImpl.kt", l = {217}, m = "invokeSuspend", v = 2)
public final class vt10 extends tje0 implements Function2<v5b, v1b<? super ng50<SportBet>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ TransactionStatus v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt10(ms10 ms10Var, int i, String str, int i2, String str2, String str3, TransactionStatus transactionStatus, v1b<? super vt10> v1bVar) {
        super(2, v1bVar);
        this.b = ms10Var;
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = str2;
        this.i = str3;
        this.v = transactionStatus;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vt10(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ng50<SportBet>> v1bVar) {
        return ((vt10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                pr10 pr10Var = this.b.a;
                int i2 = this.c;
                String str = this.d;
                int i3 = this.e;
                String str2 = this.f;
                String str3 = this.i;
                TransactionStatus transactionStatus = this.v;
                Integer num = transactionStatus != null ? new Integer(transactionStatus.getStatus()) : null;
                this.a = 1;
                obj = pr10Var.I(i2, str, i3, str2, str3, num, 0, this);
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
            BaseResponse baseResponse = (BaseResponse) obj;
            if (!baseResponse.hasData()) {
                return new ng50.a("No data", 6, null);
            }
            T t = baseResponse.data;
            t.getClass();
            return new ng50.b(t, null);
        } catch (Exception e) {
            return new ng50.a("Exception happened", 4, e);
        }
    }
}
