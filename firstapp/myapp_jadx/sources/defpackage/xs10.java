package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getDepositHistoryData$2", f = "PocketRepositoryImpl.kt", l = {239}, m = "invokeSuspend", v = 2)
public final class xs10 extends tje0 implements Function2<v5b, v1b<? super ng50<DepositHistoryStatusData>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs10(ms10 ms10Var, v1b<? super xs10> v1bVar) {
        super(2, v1bVar);
        this.b = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xs10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ng50<DepositHistoryStatusData>> v1bVar) {
        return ((xs10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                pr10 pr10Var = this.b.a;
                this.a = 1;
                obj = pr10Var.G(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a(LxHElgWAiSeM.btUneNakOHBo);
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
