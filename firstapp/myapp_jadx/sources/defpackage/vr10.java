package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.card3d.Card3DSAuthPayerRequest;
import com.sporty.android.core.model.pocket.deposit.card3d.Card3DSAuthPayerResponse;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$card3DSAuthPayer$2", f = "PocketRepositoryImpl.kt", l = {914, 912}, m = "invokeSuspend", v = 2)
public final class vr10 extends tje0 implements Function1<v1b<? super BaseResponse<Card3DSAuthPayerResponse>>, Object> {
    public pr10 a;
    public int b;
    public int c;
    public final /* synthetic */ ms10 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ BigDecimal f;
    public final /* synthetic */ String i;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Integer y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr10(ms10 ms10Var, int i, BigDecimal bigDecimal, String str, String str2, String str3, Integer num, String str4, v1b<? super vr10> v1bVar) {
        super(1, v1bVar);
        this.d = ms10Var;
        this.e = i;
        this.f = bigDecimal;
        this.i = str;
        this.v = str2;
        this.w = str3;
        this.y = num;
        this.z = str4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new vr10(this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<Card3DSAuthPayerResponse>> v1bVar) {
        return ((vr10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object userId;
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
            userId = mgb0Var.getUserId(this);
            if (userId != y5bVar) {
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
        pr10 pr10Var3 = this.a;
        uj50.b(obj);
        pr10Var = pr10Var3;
        userId = obj;
        Card3DSAuthPayerRequest card3DSAuthPayerRequest = new Card3DSAuthPayerRequest((String) userId, ms10Var.d.P(), this.f.longValue(), this.i, this.v, this.w, this.y, this.z, null, null, 768, null);
        this.a = null;
        this.c = 2;
        Object objL = pr10Var.l(i, card3DSAuthPayerRequest, this);
        return objL == y5bVar ? y5bVar : objL;
    }
}
