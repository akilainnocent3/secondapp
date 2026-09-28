package defpackage;

import com.sporty.android.core.model.antest.CampaignVariantVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl$fetchCampaignVariant$4", f = "AnTestRepositoryImpl.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class qz extends tje0 implements Function2<CampaignVariantVO, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(tz tzVar, v1b<? super qz> v1bVar) {
        super(2, v1bVar);
        this.c = tzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qz qzVar = new qz(this.c, v1bVar);
        qzVar.b = obj;
        return qzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CampaignVariantVO campaignVariantVO, v1b<? super Unit> v1bVar) {
        return ((qz) create(campaignVariantVO, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CampaignVariantVO campaignVariantVO = (CampaignVariantVO) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            boolean canConvert = campaignVariantVO.getCanConvert();
            int campaignId = campaignVariantVO.getCampaignId();
            int variantId = campaignVariantVO.getVariantId();
            this.b = null;
            this.a = 1;
            if (this.c.n(canConvert, campaignId, variantId, this) == y5bVar) {
                return y5bVar;
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
