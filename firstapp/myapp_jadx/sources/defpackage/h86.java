package defpackage;

import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.CampaignRepository$getCampaigns$2", f = "CampaignRepository.kt", l = {20}, m = "invokeSuspend", v = 1)
public final class h86 extends tje0 implements Function1<v1b<? super HTTPResponse<CampaignsData>>, Object> {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h86(String str, v1b<? super h86> v1bVar) {
        super(1, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new h86(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<CampaignsData>> v1bVar) {
        return ((h86) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        Object value = on0.c.getValue();
        value.getClass();
        this.a = 1;
        Object objB = ((e46) value).b(this.b, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
