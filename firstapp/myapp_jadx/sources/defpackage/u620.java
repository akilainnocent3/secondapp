package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.spin2win.model.response.GameAvailableResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u620 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u620(Object obj, int i) {
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
                ((ytw) obj2).setValue((z7n) obj);
                return Unit.a;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = a1b0.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if ((hTTPResponse == null || (gameAvailableResponse = (GameAvailableResponse) hTTPResponse.getData()) == null) ? false : Intrinsics.g(gameAvailableResponse.isAvailable(), Boolean.FALSE)) {
                        e activity = a1b0Var.getActivity();
                        if (activity != null) {
                            wxi wxiVar = a1b0Var.v;
                            if (wxiVar != null) {
                                wxiVar.M.O(100);
                            }
                            nya0 nya0Var = nya0.e;
                            a1b0Var.z0();
                            jcg.d(nya0Var, activity, "Spin Match", new ResultWrapper.GenericError(80001, new HTTPResponse(9005, a1b0Var.getString(R.string.game_not_available), null, null, null, null, null, 64, null)), new fra(a1b0Var, i3), new q0b0(), null, 0, activity.getColor(R.color.try_again_color), null, null, null, new cb20(a1b0Var, i3), null, 97728);
                        }
                        return Unit.a;
                    }
                    wxi wxiVar2 = a1b0Var.v;
                    if (wxiVar2 != null) {
                        wxiVar2.M.P();
                    }
                    v4b0 v4b0VarW0 = a1b0Var.w0();
                    ej5.c(o8i0.d(v4b0VarW0), null, null, new g5b0(v4b0VarW0, null), 3);
                } else if (i2 == 2) {
                    a1b0Var.s0();
                    Context context = a1b0Var.getContext();
                    if (context != null) {
                        wxi wxiVar3 = a1b0Var.v;
                        if (wxiVar3 != null) {
                            wxiVar3.M.O(100);
                        }
                        if (loadingState.getError() != null) {
                            Integer code = loadingState.getError().getCode();
                            if ((code == null || code.intValue() != 403) && (xbgVar = a1b0Var.w) != null && !xbgVar.isShowing()) {
                                a1b0Var.Q0(context, loadingState.getError());
                            }
                        } else {
                            a1b0Var.Q0(context, null);
                        }
                    }
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    a1b0Var.s0();
                }
                return Unit.a;
        }
    }
}
