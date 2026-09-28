package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.rush.model.response.GameAvailableResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h460 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h460(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GameAvailableResponse gameAvailableResponse;
        xbg xbgVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = l560.b.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if ((hTTPResponse == null || (gameAvailableResponse = (GameAvailableResponse) hTTPResponse.getData()) == null) ? false : Intrinsics.g(gameAvailableResponse.isAvailable(), Boolean.FALSE)) {
                        e activity = l560Var.getActivity();
                        if (activity != null) {
                            eo80 eo80Var = l560Var.l0;
                            if (eo80Var != null) {
                                eo80Var.o0.O(100);
                            }
                            l260 l260Var = l260.e;
                            l560Var.E0();
                            jcg.d(l260Var, activity, "Rush", new ResultWrapper.GenericError(80001, new HTTPResponse(9005, l560Var.getString(R.string.game_not_available), null, null, null, null, null, 64, null)), new tej(l560Var, i3), new s460(), null, 0, activity.getColor(R.color.try_again_color), null, null, null, new vej(l560Var, i3), null, 97728);
                        }
                        return Unit.a;
                    }
                    eo80 eo80Var2 = l560Var.l0;
                    if (eo80Var2 != null) {
                        eo80Var2.o0.P();
                    }
                    l560Var.F0().y1();
                } else if (i2 == 2) {
                    l560Var.o0();
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    l560Var.o0();
                    Context context = l560Var.getContext();
                    if (context != null) {
                        eo80 eo80Var3 = l560Var.l0;
                        if (eo80Var3 != null) {
                            eo80Var3.o0.O(100);
                        }
                        if (loadingState.getError() != null) {
                            Integer code = loadingState.getError().getCode();
                            if ((code == null || code.intValue() != 403) && (xbgVar = l560Var.N) != null && !xbgVar.isShowing()) {
                                l560Var.i1(context, loadingState.getError());
                            }
                        } else {
                            l560Var.i1(context, null);
                        }
                    }
                }
                return Unit.a;
            default:
                ((eoa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                return Unit.a;
        }
    }
}
