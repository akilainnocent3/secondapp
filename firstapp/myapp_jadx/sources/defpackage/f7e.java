package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.data.repository.DepositStatusRepositoryImpl$hasNoDeposits$2", f = "DepositStatusRepositoryImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class f7e extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g7e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7e(g7e g7eVar, v1b<? super f7e> v1bVar) {
        super(2, v1bVar);
        this.c = g7eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f7e f7eVar = new f7e(this.c, v1bVar);
        f7eVar.b = obj;
        return f7eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((f7e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        boolean z = true;
        try {
            if (i == 0) {
                uj50.b(obj);
                g7e g7eVar = this.c;
                zi50.a aVar = zi50.b;
                pr10 pr10Var = g7eVar.a;
                this.b = null;
                this.a = 1;
                obj = pr10Var.G(this);
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
            DepositHistoryStatusData depositHistoryStatusData = (DepositHistoryStatusData) ((BaseResponse) obj).data;
            if (depositHistoryStatusData == null || depositHistoryStatusData.getState() != 90) {
                z = false;
            }
            bVar = Boolean.valueOf(z);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            return bVar;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        return Boolean.FALSE;
    }
}
