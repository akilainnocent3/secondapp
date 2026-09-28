package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pay.pix.data.dto.PixPendingDepositResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixPendingDepositsUseCase$fetchPendingDepositsAsync$1", f = "GetPixPendingDepositsUseCase.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class fbk extends tje0 implements Function2<v5b, v1b<? super List<? extends PixPendingDepositResponse>>, Object> {
    public int a;
    public final /* synthetic */ ebk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbk(ebk ebkVar, v1b<? super fbk> v1bVar) {
        super(2, v1bVar);
        this.b = ebkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fbk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends PixPendingDepositResponse>> v1bVar) {
        return ((fbk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sr10 sr10Var = this.b.b;
            this.a = 1;
            obj = sr10Var.n(this);
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
        return n52.b((BaseResponse) obj);
    }
}
