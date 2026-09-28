package defpackage;

import androidx.compose.ui.layout.y;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class udg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ udg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgg fggVar = (fgg) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                try {
                    fggVar.C0 = campaignTopicResponse != null;
                    if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                        fggVar.N0();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                ((y.a) obj).s((y) obj2, 0, 0, 0.0f);
                break;
        }
        return Unit.a;
    }
}
