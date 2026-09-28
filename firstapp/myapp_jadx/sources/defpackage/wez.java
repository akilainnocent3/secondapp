package defpackage;

import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.TopBets;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wez implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wez(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ypk ypkVar = (ypk) obj2;
                GiftToast giftToast = (GiftToast) obj;
                giftToast.getClass();
                if (ypkVar instanceof ypk.b) {
                    ypk.b bVar = (ypk.b) ypkVar;
                    GiftToast.setToastText$default(giftToast, bVar.a, bVar.b, null, 4, null);
                } else {
                    if (!Intrinsics.g(ypkVar, ypk.a.a)) {
                        uhc.a();
                        return null;
                    }
                    giftToast.setCampaignCompletedText();
                }
                return Unit.a;
            default:
                qub0 qub0Var = (qub0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState.getStatus() != Status.SUCCESS) {
                    return Unit.a;
                }
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                if (hTTPResponse == null) {
                    return Unit.a;
                }
                gvi gviVar = qub0Var.z;
                if (gviVar != null) {
                    gviVar.Y.N();
                }
                List<TopBets> list = (List) hTTPResponse.getData();
                if (list != null) {
                    List<TopBets> list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        qub0Var.g4(list2, hTTPResponse.getTotal());
                    }
                }
                return Unit.a;
        }
    }
}
