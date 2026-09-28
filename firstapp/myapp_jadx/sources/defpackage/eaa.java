package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.rush.model.response.UserValidateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eaa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eaa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        nk2 binding8;
        nk2 binding9;
        UserValidateResponse userValidateResponse;
        UserValidateResponse userValidateResponse2;
        UserValidateResponse userValidateResponse3;
        xbg xbgVar;
        Context context;
        Integer code;
        xbg xbgVar2;
        int i = this.a;
        String userId = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((ytw) obj2).setValue(Integer.valueOf((int) (urrVar.a() & 4294967295L)));
                return Unit.a;
            case 1:
                zy10 zy10Var = (zy10) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null && (binding9 = zt50Var.S.getBinding()) != null) {
                    binding9.d.setAlpha(1.0f);
                }
                zt50 zt50Var2 = zy10Var.b;
                if (zt50Var2 != null && (binding8 = zt50Var2.R.getBinding()) != null) {
                    binding8.d.setAlpha(1.0f);
                }
                zt50 zt50Var3 = zy10Var.b;
                if (zt50Var3 != null && (binding7 = zt50Var3.z.getBinding()) != null) {
                    binding7.d.setAlpha(1.0f);
                }
                String str = zBooleanValue ? "OneTapBetOn" : "OneTapBetOff";
                GameDetails gameDetails = zy10Var.B;
                wz.a(str, gameDetails != null ? gameDetails.getName() : null, "HamMenu");
                SharedPreferences.Editor editor = zy10Var.y;
                if (editor != null) {
                    editor.putBoolean("ROCKET_ONE_TAP", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = zy10Var.y;
                if (editor2 != null) {
                    editor2.apply();
                }
                zt50 zt50Var4 = zy10Var.b;
                if (zBooleanValue) {
                    if (zt50Var4 != null && (binding6 = zt50Var4.S.getBinding()) != null) {
                        binding6.d.setAlpha(1.0f);
                    }
                    zt50 zt50Var5 = zy10Var.b;
                    if (zt50Var5 != null && (binding5 = zt50Var5.R.getBinding()) != null) {
                        binding5.d.setAlpha(1.0f);
                    }
                    zt50 zt50Var6 = zy10Var.b;
                    if (zt50Var6 != null && (binding4 = zt50Var6.z.getBinding()) != null) {
                        binding4.d.setAlpha(1.0f);
                    }
                } else {
                    if (zt50Var4 != null && (binding3 = zt50Var4.S.getBinding()) != null) {
                        binding3.d.setAlpha(0.65f);
                    }
                    zt50 zt50Var7 = zy10Var.b;
                    if (zt50Var7 != null && (binding2 = zt50Var7.R.getBinding()) != null) {
                        binding2.d.setAlpha(0.65f);
                    }
                    zt50 zt50Var8 = zy10Var.b;
                    if (zt50Var8 != null && (binding = zt50Var8.z.getBinding()) != null) {
                        binding.d.setAlpha(0.65f);
                    }
                    zt50 zt50Var9 = zy10Var.b;
                    if (zt50Var9 != null) {
                        BetContainer betContainer = zt50Var9.S;
                        betContainer.binding.d.setStatus(false);
                        zy10Var.R = false;
                        zy10Var.T = 0;
                        Unit unit = Unit.a;
                        betContainer.autoBetPlace = false;
                    }
                    zt50 zt50Var10 = zy10Var.b;
                    if (zt50Var10 != null) {
                        BetContainer betContainer2 = zt50Var10.z;
                        betContainer2.binding.d.setStatus(false);
                        zy10Var.V = false;
                        zy10Var.U = 0;
                        Unit unit2 = Unit.a;
                        betContainer2.autoBetPlace = false;
                    }
                    zt50 zt50Var11 = zy10Var.b;
                    if (zt50Var11 != null) {
                        BetContainer betContainer3 = zt50Var11.R;
                        betContainer3.binding.d.setStatus(false);
                        zy10Var.Y = false;
                        zy10Var.X = 0;
                        Unit unit3 = Unit.a;
                        betContainer3.autoBetPlace = false;
                    }
                }
                return Unit.a;
            case 2:
                l560 l560Var = (l560) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = l560.b.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (userValidateResponse = (UserValidateResponse) hTTPResponse.getData()) != null) {
                        if (userValidateResponse.getInsufficientBalanceMessage() == null || (xbgVar = l560Var.N) == null || xbgVar.isShowing()) {
                            l560Var.a0 = userValidateResponse;
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            String nickName = (hTTPResponse2 == null || (userValidateResponse3 = (UserValidateResponse) hTTPResponse2.getData()) == null) ? null : userValidateResponse3.getNickName();
                            String avatarUrl = userValidateResponse.getAvatarUrl();
                            HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse3 != null && (userValidateResponse2 = (UserValidateResponse) hTTPResponse3.getData()) != null) {
                                userId = userValidateResponse2.getUserId();
                            }
                            l560Var.d1(nickName, avatarUrl, userId);
                        } else {
                            e activity = l560Var.getActivity();
                            if (activity != null && (context = l560Var.getContext()) != null) {
                                eo80 eo80Var = l560Var.l0;
                                if (eo80Var != null) {
                                    eo80Var.o0.O(100);
                                }
                                l260 l260Var = l260.e;
                                l560Var.E0();
                                jcg.d(l260Var, activity, "Rush", new ResultWrapper.GenericError(80001, new HTTPResponse(80001, l560Var.getString(R.string.redblack_err_80001), null, null, null, null, null, 64, null)), new pw10(l560Var, i3), null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new rej(l560Var, i3), null, 97760);
                            }
                        }
                    }
                } else if (i2 == 2) {
                    l560Var.o0();
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    l560Var.o0();
                    eo80 eo80Var2 = l560Var.l0;
                    if (eo80Var2 != null) {
                        eo80Var2.o0.O(100);
                    }
                    Context context2 = l560Var.getContext();
                    if (context2 != null) {
                        if (loadingState.getError() != null) {
                            Integer code2 = loadingState.getError().getCode();
                            if ((code2 == null || code2.intValue() != 403) && (((code = loadingState.getError().getCode()) == null || code.intValue() != 403) && (xbgVar2 = l560Var.N) != null && !xbgVar2.isShowing())) {
                                l560Var.i1(context2, loadingState.getError());
                            }
                        } else {
                            l560Var.i1(context2, null);
                        }
                    }
                }
                return Unit.a;
            default:
                ((foa0) obj2).w.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                return Unit.a;
        }
    }
}
