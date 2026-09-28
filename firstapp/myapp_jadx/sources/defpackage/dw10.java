package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.rush.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dw10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dw10(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ro80 binding;
        WalletInfoResponse walletInfoResponse;
        ro80 binding2;
        xbg xbgVar;
        xbg xbgVar2;
        ro80 binding3;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) fragment;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = zBooleanValue ? "SoundOn" : "SoundOff";
                GameDetails gameDetails = zy10Var.B;
                wz.a(str, gameDetails != null ? gameDetails.getName() : null, "HamMenu");
                SharedPreferences.Editor editor = zy10Var.y;
                if (editor != null) {
                    editor.putBoolean("ROCKET_SOUND", zBooleanValue);
                }
                zy10Var.a1().y1().d = zBooleanValue;
                SharedPreferences.Editor editor2 = zy10Var.y;
                if (editor2 != null) {
                    editor2.apply();
                }
                zy10Var.a1().J1(zy10Var.a1().y1().d);
                return Unit.a;
            default:
                l560 l560Var = (l560) fragment;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = l560.b.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    String currency = (hTTPResponse == null || (walletInfoResponse = (WalletInfoResponse) hTTPResponse.getData()) == null) ? null : walletInfoResponse.getCurrency();
                    if (currency == null || StringsKt.U(currency)) {
                        int i4 = l560Var.d;
                        if (i4 < 3) {
                            l560Var.d = i4 + 1;
                            l560Var.F0().y1();
                            return Unit.a;
                        }
                        eo80 eo80Var = l560Var.l0;
                        if (eo80Var != null) {
                            eo80Var.o0.O(100);
                        }
                        e activity = l560Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    } else {
                        l560Var.d = 0;
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    l560Var.U = hTTPResponse2 != null ? (WalletInfoResponse) hTTPResponse2.getData() : null;
                    eo80 eo80Var2 = l560Var.l0;
                    if (eo80Var2 != null && (binding = eo80Var2.W.getBinding()) != null) {
                        binding.A.setVisibility(4);
                    }
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    l560Var.m0(hTTPResponse3 != null ? (WalletInfoResponse) hTTPResponse3.getData() : null);
                    l560Var.r0(true);
                    eo80 eo80Var3 = l560Var.l0;
                    if (eo80Var3 != null) {
                        eo80Var3.o0.P();
                    }
                    if (l560Var.M0()) {
                        c760 c760VarF0 = l560Var.F0();
                        ej5.c(o8i0.d(c760VarF0), null, null, new h760(c760VarF0, null), 3);
                    } else {
                        l560Var.d1("", "", "");
                    }
                } else if (i2 == 2) {
                    l560Var.o0();
                    l560Var.r0(false);
                    eo80 eo80Var4 = l560Var.l0;
                    if (eo80Var4 != null && (binding2 = eo80Var4.W.getBinding()) != null) {
                        binding2.A.setVisibility(0);
                    }
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    l560Var.r0(false);
                    eo80 eo80Var5 = l560Var.l0;
                    if (eo80Var5 != null && (binding3 = eo80Var5.W.getBinding()) != null) {
                        binding3.A.setVisibility(0);
                    }
                    if (l560Var.getActivity() != null && l560Var.getContext() != null) {
                        eo80 eo80Var6 = l560Var.l0;
                        if (eo80Var6 != null) {
                            eo80Var6.o0.O(100);
                        }
                        if (loadingState.getError() != null) {
                            Integer code = loadingState.getError().getCode();
                            if (code == null || code.intValue() != 403) {
                                if (l560Var.d < 3) {
                                    l560Var.F0().y1();
                                    l560Var.d++;
                                    return Unit.a;
                                }
                                e activity2 = l560Var.getActivity();
                                if (activity2 != null && (xbgVar2 = l560Var.N) != null) {
                                    String string = l560Var.getString(R.string.unable_to_fetch_wallet_balance);
                                    string.getClass();
                                    String string2 = l560Var.getString(R.string.retry);
                                    string2.getClass();
                                    xbg.c(xbgVar2, string, string2, new yrx(l560Var, 1), new g560(), activity2.getColor(R.color.try_again_color), 192);
                                    xbgVar2.a();
                                }
                            }
                        } else {
                            if (l560Var.d < 3) {
                                l560Var.F0().y1();
                                l560Var.d++;
                                return Unit.a;
                            }
                            e activity3 = l560Var.getActivity();
                            if (activity3 != null && (xbgVar = l560Var.N) != null) {
                                String string3 = l560Var.getString(R.string.unable_to_fetch_wallet_balance);
                                string3.getClass();
                                String string4 = l560Var.getString(R.string.retry);
                                string4.getClass();
                                xbg.c(xbgVar, string3, string4, new vpo(l560Var, i3), new h560(), activity3.getColor(R.color.try_again_color), 192);
                                xbgVar.a();
                            }
                        }
                    }
                }
                return Unit.a;
        }
    }
}
