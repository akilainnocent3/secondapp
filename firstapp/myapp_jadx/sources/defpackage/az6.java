package defpackage;

import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class az6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((iz6) obj2).n ? 180.0f : 0.0f);
                break;
            case 1:
                kab0 kab0Var = (kab0) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                try {
                    kab0Var.d0 = campaignTopicResponse != null;
                    if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                        kab0Var.J0();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                h0f0 h0f0Var = (h0f0) obj;
                h0f0Var.getClass();
                ((Function1) obj2).invoke(new qve0.x(h0f0Var));
                break;
        }
        return Unit.a;
    }
}
