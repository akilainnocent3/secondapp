package defpackage;

import android.content.Context;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.spinmatch.model.response.UserValidateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ft60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ft60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserValidateResponse userValidateResponse;
        String avatarUrl;
        UserValidateResponse userValidateResponse2;
        String userId;
        UserValidateResponse userValidateResponse3;
        xbg xbgVar;
        Context context;
        xbg xbgVar2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mt60 mt60Var = ((kt60) obj2).c;
                return Boolean.valueOf(mt60Var != null ? mt60Var.a(obj) : true);
            default:
                kab0 kab0Var = (kab0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = kab0.a.a[loadingState.getStatus().ordinal()];
                int i3 = 2;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (userValidateResponse = (UserValidateResponse) hTTPResponse.getData()) != null) {
                        if (userValidateResponse.isAllowedToPlay() || (xbgVar = kab0Var.I) == null || xbgVar.isShowing()) {
                            kab0Var.d = userValidateResponse;
                            String nickName = userValidateResponse.getNickName();
                            String str = "";
                            if (nickName == null) {
                                nickName = "";
                            }
                            UserValidateResponse userValidateResponse4 = kab0Var.d;
                            if (userValidateResponse4 == null || (avatarUrl = userValidateResponse4.getAvatarUrl()) == null) {
                                avatarUrl = "";
                            }
                            kab0Var.y0(nickName, avatarUrl);
                            fo80 fo80Var = kab0Var.c;
                            if (fo80Var != null) {
                                SGHamburgerMenu sGHamburgerMenu = fo80Var.F;
                                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                                sGHamburgerMenu.setUserDetails((hTTPResponse2 == null || (userValidateResponse3 = (UserValidateResponse) hTTPResponse2.getData()) == null) ? null : userValidateResponse3.getNickName(), userValidateResponse.getAvatarUrl());
                            }
                            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                            HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse3 != null && (userValidateResponse2 = (UserValidateResponse) hTTPResponse3.getData()) != null && (userId = userValidateResponse2.getUserId()) != null) {
                                str = userId;
                            }
                            sportyGamesManager.setUserId(str);
                            fo80 fo80Var2 = kab0Var.c;
                            if (fo80Var2 != null) {
                                fo80Var2.N.P();
                            }
                            nbb0 nbb0VarW0 = kab0Var.w0();
                            ej5.c(o8i0.d(nbb0VarW0), null, null, new qbb0(nbb0VarW0, null), 3);
                        } else {
                            e activity = kab0Var.getActivity();
                            if (activity != null && (context = kab0Var.getContext()) != null) {
                                t8b0 t8b0Var = t8b0.e;
                                kab0Var.v0();
                                jcg.d(t8b0Var, activity, "Spin Match", new ResultWrapper.GenericError(80001, new HTTPResponse(80001, kab0Var.getString(R.string.redblack_err_80001), null, null, null, null, null, 64, null)), new v07(kab0Var, i3), null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new c5k(kab0Var, i3), null, 97760);
                            }
                        }
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    Context context2 = kab0Var.getContext();
                    if (context2 != null) {
                        fo80 fo80Var3 = kab0Var.c;
                        if (fo80Var3 != null) {
                            fo80Var3.N.O(100);
                        }
                        if (loadingState.getError() != null) {
                            Integer code = loadingState.getError().getCode();
                            if (code != null && code.intValue() == 403) {
                                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            } else {
                                Integer code2 = loadingState.getError().getCode();
                                if ((code2 == null || code2.intValue() != 403) && (xbgVar2 = kab0Var.I) != null && !xbgVar2.isShowing()) {
                                    kab0Var.K0(context2, loadingState.getError());
                                }
                            }
                        } else {
                            kab0Var.K0(context2, null);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
