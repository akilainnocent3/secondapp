package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.transfer.RecipientData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getTransferRecipients$1", f = "PocketRepositoryImpl.kt", l = {976}, m = "invokeSuspend", v = 2)
public final class lt10 extends tje0 implements Function1<v1b<? super List<? extends RecipientData>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt10(ms10 ms10Var, v1b<? super lt10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new lt10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super List<? extends RecipientData>> v1bVar) {
        return ((lt10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pr10 pr10Var = this.b.a;
            this.a = 1;
            obj = pr10Var.o(this);
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
