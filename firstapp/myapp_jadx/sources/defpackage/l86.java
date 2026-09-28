package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.common.network.campaign.CampaignsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.CampaignRepository$getTierNotReachedData$2", f = "CampaignRepository.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 1)
public final class l86 extends tje0 implements Function1<v1b<? super HTTPResponse<CampaignsData>>, Object> {
    public int a;
    public final /* synthetic */ w86 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l86(w86 w86Var, v1b<? super l86> v1bVar) {
        super(1, v1bVar);
        this.b = w86Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new l86(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<CampaignsData>> v1bVar) {
        return ((l86) create(v1bVar)).invokeSuspend(Unit.a);
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
        f46 f46Var = (f46) this.b.d.getValue();
        this.a = 1;
        Object objB = f46Var.b("BonusCup", this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
