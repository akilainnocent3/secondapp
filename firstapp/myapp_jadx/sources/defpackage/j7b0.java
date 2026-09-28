package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spindabottle.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j7b0 implements Function1 {
    public final /* synthetic */ b8b0 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ j7b0(b8b0 b8b0Var, boolean z) {
        this.a = b8b0Var;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dcb0 dcb0Var;
        WalletInfo walletInfo;
        String currency;
        WalletInfo walletInfo2;
        WalletInfo walletInfo3;
        WalletInfo walletInfo4;
        WalletInfo walletInfo5;
        String currency2;
        AppCompatImageView redMark;
        WalletInfo walletInfo6;
        AppCompatImageView navigation;
        WalletInfo walletInfo7;
        WalletInfo walletInfo8;
        LoadingState loadingState = (LoadingState) obj;
        int i = b8b0.a.a[loadingState.getStatus().ordinal()];
        b8b0 b8b0Var = this.a;
        int i2 = 0;
        Double balance = null;
        if (i == 1) {
            b8b0Var.W = false;
            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
            String currency3 = (hTTPResponse == null || (walletInfo8 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo8.getCurrency();
            if (currency3 != null && !StringsKt.U(currency3)) {
                b8b0Var.g0 = 0;
            } else {
                if (b8b0Var.g0 < 3) {
                    fm1 fm1Var = (fm1) b8b0Var.a;
                    if (fm1Var != null) {
                        fm1Var.z1();
                    }
                    b8b0Var.g0++;
                    return Unit.a;
                }
                dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                if (dcb0Var2 != null) {
                    dcb0Var2.M.O(100);
                }
                e activity = b8b0Var.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            Double d = b8b0Var.I;
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                Double balance2 = (hTTPResponse2 == null || (walletInfo7 = (WalletInfo) hTTPResponse2.getData()) == null) ? null : walletInfo7.getBalance();
                balance2.getClass();
                b8b0Var.c0 = dDoubleValue - balance2.doubleValue();
            }
            dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
            if (dcb0Var3 != null && (navigation = dcb0Var3.C.getNavigation()) != null) {
                navigation.setAlpha(1.0f);
            }
            String str = "";
            if (b8b0Var.S) {
                HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                if (hTTPResponse3 != null && (walletInfo2 = (WalletInfo) hTTPResponse3.getData()) != null) {
                    balance = walletInfo2.getBalance();
                }
                b8b0Var.I = balance;
                HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                if (hTTPResponse4 != null && (walletInfo = (WalletInfo) hTTPResponse4.getData()) != null && (currency = walletInfo.getCurrency()) != null) {
                    str = currency;
                }
                b8b0Var.C = str;
                Double d2 = b8b0Var.I;
                if ((d2 != null ? d2.doubleValue() : 0.0d) < b8b0Var.N && (dcb0Var = (dcb0) b8b0Var.b) != null) {
                    dcb0Var.F.F(R.drawable.hamberger_add_more_red);
                }
                dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                if (dcb0Var4 != null && dcb0Var4.b.getVisibility() == 0) {
                    b8b0Var.w = true;
                    dcb0 dcb0Var5 = (dcb0) b8b0Var.b;
                    if (dcb0Var5 != null) {
                        dcb0Var5.b.setVisibility(4);
                    }
                }
            } else {
                if (this.b) {
                    fm1 fm1Var2 = (fm1) b8b0Var.a;
                    if (fm1Var2 != null) {
                        ej5.c(o8i0.d(fm1Var2), null, null, new km1(fm1Var2, b8b0Var.f, null), 3);
                    }
                    dcb0 dcb0Var6 = (dcb0) b8b0Var.b;
                    if (dcb0Var6 != null) {
                        dcb0Var6.M.P();
                    }
                }
                HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                Double balance3 = (hTTPResponse5 == null || (walletInfo6 = (WalletInfo) hTTPResponse5.getData()) == null) ? null : walletInfo6.getBalance();
                b8b0Var.I = balance3;
                if ((balance3 != null ? balance3.doubleValue() : 0.0d) < b8b0Var.N) {
                    dcb0 dcb0Var7 = (dcb0) b8b0Var.b;
                    if (dcb0Var7 != null && (redMark = dcb0Var7.C.getRedMark()) != null) {
                        redMark.setVisibility(0);
                    }
                    dcb0 dcb0Var8 = (dcb0) b8b0Var.b;
                    if (dcb0Var8 != null) {
                        dcb0Var8.F.F(R.drawable.hamberger_add_more_red);
                    }
                }
                HTTPResponse hTTPResponse6 = (HTTPResponse) loadingState.getData();
                if (hTTPResponse6 != null && (walletInfo5 = (WalletInfo) hTTPResponse6.getData()) != null && (currency2 = walletInfo5.getCurrency()) != null) {
                    str = currency2;
                }
                b8b0Var.C = str;
                dcb0 dcb0Var9 = (dcb0) b8b0Var.b;
                if (dcb0Var9 != null) {
                    WalletText walletText = dcb0Var9.Y;
                    HTTPResponse hTTPResponse7 = (HTTPResponse) loadingState.getData();
                    String currency4 = (hTTPResponse7 == null || (walletInfo4 = (WalletInfo) hTTPResponse7.getData()) == null) ? null : walletInfo4.getCurrency();
                    HTTPResponse hTTPResponse8 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse8 != null && (walletInfo3 = (WalletInfo) hTTPResponse8.getData()) != null) {
                        balance = walletInfo3.getBalance();
                    }
                    walletText.setBalance(currency4, balance);
                }
            }
        } else if (i == 3) {
            if (b8b0Var.g0 < 3) {
                fm1 fm1Var3 = (fm1) b8b0Var.a;
                if (fm1Var3 != null) {
                    fm1Var3.z1();
                }
                b8b0Var.g0++;
                return Unit.a;
            }
            dcb0 dcb0Var10 = (dcb0) b8b0Var.b;
            if (dcb0Var10 != null) {
                dcb0Var10.M.O(100);
            }
            e activity2 = b8b0Var.getActivity();
            if (activity2 != null) {
                xbg xbgVar = b8b0Var.B;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string = b8b0Var.getString(R.string.unable_to_fetch_wallet_balance);
                string.getClass();
                String string2 = b8b0Var.getString(R.string.retry);
                string2.getClass();
                xbg.c(xbgVar, string, string2, new x7b0(b8b0Var, i2), new ajf(1), activity2.getColor(R.color.try_again_color), 192);
                xbgVar.a();
            }
        }
        return Unit.a;
    }
}
