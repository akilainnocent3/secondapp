package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.evenodd.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qfg implements Function1 {
    public final /* synthetic */ fgg a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ qfg(fgg fggVar, boolean z) {
        this.a = fggVar;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WalletInfo walletInfo;
        WalletInfo walletInfo2;
        String currency;
        WalletInfo walletInfo3;
        WalletInfo walletInfo4;
        WalletInfo walletInfo5;
        String currency2;
        AppCompatImageView redMark;
        WalletInfo walletInfo6;
        WalletInfo walletInfo7;
        WalletInfo walletInfo8;
        LoadingState loadingState = (LoadingState) obj;
        fgg fggVar = this.a;
        fggVar.j0 = false;
        jhg jhgVar = (jhg) fggVar.b;
        if (jhgVar != null) {
            jhgVar.J.setAlpha(1.0f);
        }
        int i = fgg.a.a[loadingState.getStatus().ordinal()];
        int i2 = 1;
        Double balance = null;
        if (i == 1) {
            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
            String currency3 = (hTTPResponse == null || (walletInfo8 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo8.getCurrency();
            if (currency3 != null && !StringsKt.U(currency3)) {
                fggVar.n0 = 0;
            } else {
                if (fggVar.n0 < 3) {
                    bo1 bo1Var = (bo1) fggVar.a;
                    if (bo1Var != null) {
                        bo1Var.B1();
                    }
                    fggVar.n0++;
                    return Unit.a;
                }
                jhg jhgVar2 = (jhg) fggVar.b;
                if (jhgVar2 != null) {
                    jhgVar2.W.O(100);
                }
                e activity = fggVar.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            Double d = fggVar.E;
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                Double balance2 = (hTTPResponse2 == null || (walletInfo7 = (WalletInfo) hTTPResponse2.getData()) == null) ? null : walletInfo7.getBalance();
                balance2.getClass();
                fggVar.k0 = dDoubleValue - balance2.doubleValue();
            }
            String str = "";
            if (fggVar.O) {
                HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                if (hTTPResponse3 != null && (walletInfo2 = (WalletInfo) hTTPResponse3.getData()) != null && (currency = walletInfo2.getCurrency()) != null) {
                    str = currency;
                }
                fggVar.B = str;
                HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                if (hTTPResponse4 != null && (walletInfo = (WalletInfo) hTTPResponse4.getData()) != null) {
                    balance = walletInfo.getBalance();
                }
                fggVar.E = balance;
            } else {
                if (this.b) {
                    jhg jhgVar3 = (jhg) fggVar.b;
                    if (jhgVar3 != null) {
                        jhgVar3.W.P();
                    }
                    bo1 bo1Var2 = (bo1) fggVar.a;
                    if (bo1Var2 != null) {
                        ej5.c(o8i0.d(bo1Var2), null, null, new hm1(bo1Var2, fggVar.h0, null), 3);
                    }
                }
                HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                Double balance3 = (hTTPResponse5 == null || (walletInfo6 = (WalletInfo) hTTPResponse5.getData()) == null) ? null : walletInfo6.getBalance();
                fggVar.E = balance3;
                if ((balance3 != null ? balance3.doubleValue() : 0.0d) < fggVar.L) {
                    fggVar.l0 = R.drawable.hamberger_add_more_red;
                    jhg jhgVar4 = (jhg) fggVar.b;
                    if (jhgVar4 != null && (redMark = jhgVar4.J.getRedMark()) != null) {
                        redMark.setVisibility(0);
                    }
                    jhg jhgVar5 = (jhg) fggVar.b;
                    if (jhgVar5 != null) {
                        jhgVar5.M.F(R.drawable.hamberger_add_more_red);
                    }
                }
                HTTPResponse hTTPResponse6 = (HTTPResponse) loadingState.getData();
                if (hTTPResponse6 != null && (walletInfo5 = (WalletInfo) hTTPResponse6.getData()) != null && (currency2 = walletInfo5.getCurrency()) != null) {
                    str = currency2;
                }
                fggVar.B = str;
                jhg jhgVar6 = (jhg) fggVar.b;
                if (jhgVar6 != null) {
                    WalletText walletText = jhgVar6.d0;
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
            if (fggVar.n0 < 3) {
                bo1 bo1Var3 = (bo1) fggVar.a;
                if (bo1Var3 != null) {
                    bo1Var3.B1();
                }
                fggVar.n0++;
                return Unit.a;
            }
            jhg jhgVar7 = (jhg) fggVar.b;
            if (jhgVar7 != null) {
                jhgVar7.W.O(100);
            }
            e activity2 = fggVar.getActivity();
            if (activity2 != null) {
                xbg xbgVar = fggVar.z;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string = fggVar.getString(R.string.unable_to_fetch_wallet_balance);
                string.getClass();
                String string2 = fggVar.getString(R.string.retry);
                string2.getClass();
                xbg.c(xbgVar, string, string2, new ax2(fggVar, i2), new zfg(), activity2.getColor(R.color.try_again_color), 192);
                xbgVar.a();
            }
        }
        return Unit.a;
    }
}
