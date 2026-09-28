package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.card3d.DepositCheckConstraintsRequest;
import com.sporty.android.core.model.pocket.deposit.card3d.DepositCheckConstraintsResponse;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$checkCardConstraints$2", f = "PocketRepositoryImpl.kt", l = {854}, m = "invokeSuspend", v = 2)
public final class zr10 extends tje0 implements Function1<v1b<? super BaseResponse<DepositCheckConstraintsResponse>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ BigDecimal d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ String i;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr10(ms10 ms10Var, int i, BigDecimal bigDecimal, String str, Integer num, String str2, String str3, v1b<? super zr10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
        this.c = i;
        this.d = bigDecimal;
        this.e = str;
        this.f = num;
        this.i = str2;
        this.v = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new zr10(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<DepositCheckConstraintsResponse>> v1bVar) {
        return ((zr10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        pr10 pr10Var = this.b.a;
        DepositCheckConstraintsRequest depositCheckConstraintsRequest = new DepositCheckConstraintsRequest(this.c, this.d.longValue(), this.e, this.f, this.i, this.v);
        this.a = 1;
        Object objM = pr10Var.m(depositCheckConstraintsRequest, this);
        return objM == y5bVar ? y5bVar : objM;
    }
}
