package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.spin2win.model.response.UserValidateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v620 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v620(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserValidateResponse userValidateResponse;
        String userId;
        UserValidateResponse userValidateResponse2;
        xbg xbgVar;
        Context context;
        xbg xbgVar2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj2).setValue((g0w) obj);
                return Unit.a;
            case 1:
                ((cny) obj).getClass();
                ((zh60) obj2).dismiss();
                return Unit.a;
            default:
                final a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = a1b0.a.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (userValidateResponse = (UserValidateResponse) hTTPResponse.getData()) != null) {
                        if (!Intrinsics.g(userValidateResponse.isAllowedToPlay(), Boolean.FALSE) || (xbgVar = a1b0Var.w) == null || xbgVar.isShowing()) {
                            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse2 == null || (userValidateResponse2 = (UserValidateResponse) hTTPResponse2.getData()) == null || (userId = userValidateResponse2.getUserId()) == null) {
                                userId = "";
                            }
                            sportyGamesManager.setUserId(userId);
                            a1b0Var.U = (UserValidateResponse) ((HTTPResponse) loadingState.getData()).getData();
                            wxi wxiVar = a1b0Var.v;
                            if (wxiVar != null) {
                                wxiVar.M.P();
                            }
                            v4b0 v4b0VarW0 = a1b0Var.w0();
                            ej5.c(o8i0.d(v4b0VarW0), null, null, new y4b0(v4b0VarW0, null), 3);
                            v4b0 v4b0VarW1 = a1b0Var.w0();
                            ej5.c(o8i0.d(v4b0VarW1), null, null, new z4b0(v4b0VarW1, null), 3);
                            a1b0Var.w0().A1();
                        } else {
                            e activity = a1b0Var.getActivity();
                            if (activity != null && (context = a1b0Var.getContext()) != null) {
                                wxi wxiVar2 = a1b0Var.v;
                                if (wxiVar2 != null) {
                                    wxiVar2.M.O(100);
                                }
                                nya0 nya0Var = nya0.e;
                                a1b0Var.z0();
                                jcg.d(nya0Var, activity, "Spin2Win", new ResultWrapper.GenericError(80001, new HTTPResponse(80001, a1b0Var.getString(R.string.redblack_err_80001), null, null, null, null, null, 64, null)), new Function0() { // from class: pza0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        a1b0Var.H0(true);
                                        return Unit.a;
                                    }
                                }, null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new d4f(a1b0Var, i3), null, 97760);
                            }
                        }
                    }
                } else if (i2 == 2) {
                    a1b0Var.s0();
                    Context context2 = a1b0Var.getContext();
                    if (context2 != null) {
                        wxi wxiVar3 = a1b0Var.v;
                        if (wxiVar3 != null) {
                            wxiVar3.M.O(100);
                        }
                        if (loadingState.getError() != null) {
                            Integer code = loadingState.getError().getCode();
                            if (code != null && code.intValue() == 403) {
                                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            } else {
                                Integer code2 = loadingState.getError().getCode();
                                if ((code2 == null || code2.intValue() != 403) && (xbgVar2 = a1b0Var.w) != null && !xbgVar2.isShowing()) {
                                    a1b0Var.Q0(context2, loadingState.getError());
                                }
                            }
                        } else {
                            a1b0Var.Q0(context2, null);
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
