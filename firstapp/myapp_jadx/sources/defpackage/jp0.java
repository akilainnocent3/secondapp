package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jp0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jp0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i = this.a;
        size = 0;
        int size = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((i1g0) obj2).c(((Number) ((x5a0) ((vi0) obj).e).getValue()).floatValue());
                break;
            case 1:
                zy10 zy10Var = (zy10) obj2;
                CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                try {
                    zy10Var.P0 = campaignTopicResponse != null;
                    if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                        zy10Var.C1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                l560 l560Var = (l560) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (l560.b.a[loadingState.getStatus().ordinal()] == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        size = list.size();
                    }
                    if (size > 0) {
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        l560Var.g0 = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
