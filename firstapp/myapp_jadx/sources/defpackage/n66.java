package defpackage;

import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.components.CampaignComponentKt$CampaignComponent$4$2$2$1", f = "CampaignComponent.kt", l = {227}, m = "invokeSuspend", v = 1)
public final class n66 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ CampaignTier b;
    public final /* synthetic */ Campaign c;
    public final /* synthetic */ zzr d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n66(CampaignTier campaignTier, Campaign campaign, zzr zzrVar, int i, v1b<? super n66> v1bVar) {
        super(2, v1bVar);
        this.b = campaignTier;
        this.c = campaign;
        this.d = zzrVar;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n66(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n66) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int iIndexOf;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            CampaignTier campaignTier = this.b;
            if (campaignTier != null && (iIndexOf = this.c.getTiers().indexOf(campaignTier)) != -1) {
                int i2 = -this.e;
                this.a = 1;
                if (this.d.k(iIndexOf, i2, this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
