package defpackage;

import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rhb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rhb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                try {
                    enbVar.A = campaignTopicResponse != null;
                    if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                        ibs viewLifecycleOwner = enbVar.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new wnb(enbVar, null), 3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) ((chp) obj2)).invoke(new lvk.c(str));
                break;
        }
        return Unit.a;
    }
}
