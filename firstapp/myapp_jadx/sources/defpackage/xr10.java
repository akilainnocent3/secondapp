package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.card3d.Card3DSInitiateAuthRequest;
import com.sporty.android.core.model.pocket.deposit.card3d.Card3DSInitiateAuthResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$card3DSInitiateAuth$2", f = "PocketRepositoryImpl.kt", l = {890, 888}, m = "invokeSuspend", v = 2)
public final class xr10 extends tje0 implements Function1<v1b<? super BaseResponse<Card3DSInitiateAuthResponse>>, Object> {
    public pr10 a;
    public int b;
    public int c;
    public final /* synthetic */ ms10 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr10(int i, v1b v1bVar, ms10 ms10Var, Integer num, String str) {
        super(1, v1bVar);
        this.d = ms10Var;
        this.e = i;
        this.f = num;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new xr10(this.e, v1bVar, this.d, this.f, this.i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<Card3DSInitiateAuthResponse>> v1bVar) {
        return ((xr10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pr10 pr10Var;
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.c;
        ms10 ms10Var = this.d;
        if (i2 == 0) {
            uj50.b(obj);
            pr10 pr10Var2 = ms10Var.a;
            mgb0 mgb0Var = ms10Var.c;
            this.a = pr10Var2;
            int i3 = this.e;
            this.b = i3;
            this.c = 1;
            Object userId = mgb0Var.getUserId(this);
            if (userId != y5bVar) {
                pr10Var = pr10Var2;
                obj = userId;
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
        Card3DSInitiateAuthRequest card3DSInitiateAuthRequest = new Card3DSInitiateAuthRequest((String) obj, ms10Var.d.P(), this.f, this.i);
        this.a = null;
        this.c = 2;
        Object objP = pr10Var.p(i, card3DSInitiateAuthRequest, this);
        return objP == y5bVar ? y5bVar : objP;
    }
}
