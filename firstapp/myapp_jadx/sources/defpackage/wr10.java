package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.card3d.Card3DSCheckAuthPayerStatusRequest;
import com.sporty.android.core.model.pocket.deposit.card3d.Card3DSCheckAuthPayerStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$card3DSCheckAuthPayerStatus$2", f = "PocketRepositoryImpl.kt", l = {938, 936}, m = "invokeSuspend", v = 2)
public final class wr10 extends tje0 implements Function1<v1b<? super BaseResponse<Card3DSCheckAuthPayerStatusResponse>>, Object> {
    public pr10 a;
    public int b;
    public int c;
    public final /* synthetic */ ms10 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr10(ms10 ms10Var, int i, String str, String str2, v1b<? super wr10> v1bVar) {
        super(1, v1bVar);
        this.d = ms10Var;
        this.e = i;
        this.f = str;
        this.i = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new wr10(this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<Card3DSCheckAuthPayerStatusResponse>> v1bVar) {
        return ((wr10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pr10 pr10Var;
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.c;
        if (i2 == 0) {
            uj50.b(obj);
            ms10 ms10Var = this.d;
            pr10 pr10Var2 = ms10Var.a;
            mgb0 mgb0Var = ms10Var.c;
            this.a = pr10Var2;
            int i3 = this.e;
            this.b = i3;
            this.c = 1;
            obj = mgb0Var.getUserId(this);
            if (obj != y5bVar) {
                pr10Var = pr10Var2;
                i = i3;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.b;
        pr10Var = this.a;
        uj50.b(obj);
        Card3DSCheckAuthPayerStatusRequest card3DSCheckAuthPayerStatusRequest = new Card3DSCheckAuthPayerStatusRequest((String) obj, this.f, this.i);
        this.a = null;
        this.c = 2;
        Object objE = pr10Var.e(i, card3DSCheckAuthPayerStatusRequest, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
