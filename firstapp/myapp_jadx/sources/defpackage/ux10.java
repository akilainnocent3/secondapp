package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ux10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ux10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        nle nleVar;
        st binding;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = zy10.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        if (!zy10Var.J) {
                            zt50 zt50Var = zy10Var.b;
                            if (zt50Var != null) {
                                zt50Var.Q.P();
                            }
                            zy10Var.J = true;
                        } else if (!zy10Var.d && ((nleVar = zy10Var.j0) == null || !nleVar.isShowing())) {
                            zy10Var.b1().x1();
                        }
                        if (list.isEmpty()) {
                            zt50 zt50Var2 = zy10Var.b;
                            if (zt50Var2 != null && (binding = zt50Var2.e.getBinding()) != null) {
                                binding.e.setVisibility(0);
                            }
                        } else {
                            RoundBetResponse roundBetResponse = new RoundBetResponse(((BetDetails) list.get(0)).getRoundId(), ((BetDetails) list.get(0)).getUserId(), "", ((HTTPResponse) loadingState.getData()).getTotal(), y8h0.b(list), null);
                            zt50 zt50Var3 = zy10Var.b;
                            if (zt50Var3 != null) {
                                zt50Var3.e.setBets(roundBetResponse, zt50Var3.M);
                            }
                            zt50 zt50Var4 = zy10Var.b;
                            if (zt50Var4 != null) {
                                zt50Var4.d.setText("(" + String.valueOf(((HTTPResponse) loadingState.getData()).getTotal()) + ")");
                            }
                        }
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    zt50 zt50Var5 = zy10Var.b;
                    if (zt50Var5 != null) {
                        zt50Var5.Q.P();
                    }
                    zy10Var.b1().x1();
                    zy10Var.J = true;
                }
                return Unit.a;
            default:
                ((eoa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                return Unit.a;
        }
    }
}
