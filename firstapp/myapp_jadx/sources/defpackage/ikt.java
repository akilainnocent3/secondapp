package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGConfirmDialogActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spin2win.components.Spin2WinHeader;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ikt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ikt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double balance;
        String currency;
        iq80 iq80Var;
        Double balance2;
        Double balance3;
        ProgressMeterComponent progressMeterComponent;
        j1b j1bVar;
        WalletInfoResponse walletInfoResponse;
        Context context;
        iq80 iq80Var2;
        iq80 iq80Var3;
        int i = this.a;
        upperCase = null;
        String upperCase = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fff0) obj2).b(((gly) obj).a);
                return Unit.a;
            case 1:
                SGConfirmDialogActivity sGConfirmDialogActivity = (SGConfirmDialogActivity) obj2;
                int i2 = SGConfirmDialogActivity.z;
                ((View) obj).getClass();
                sGConfirmDialogActivity.v.invoke(Boolean.TRUE);
                sGConfirmDialogActivity.setResult(106);
                String stringExtra = sGConfirmDialogActivity.getIntent().getStringExtra("dialogName");
                if (stringExtra != null) {
                    mn80 mn80Var = (mn80) sGConfirmDialogActivity.a;
                    String strValueOf = String.valueOf(mn80Var != null ? mn80Var.d.getText() : null);
                    String stringExtra2 = sGConfirmDialogActivity.getIntent().getStringExtra("game");
                    stringExtra2.getClass();
                    SGConfirmDialogActivity.A1(stringExtra, strValueOf, stringExtra2);
                }
                sGConfirmDialogActivity.finish();
                return Unit.a;
            default:
                final a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i3 = a1b0.a.a[loadingState.getStatus().ordinal()];
                if (i3 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    String currency2 = (hTTPResponse == null || (walletInfoResponse = (WalletInfoResponse) hTTPResponse.getData()) == null) ? null : walletInfoResponse.getCurrency();
                    if (currency2 == null || StringsKt.U(currency2)) {
                        int i4 = a1b0Var.E;
                        if (i4 < 3) {
                            a1b0Var.E = i4 + 1;
                            a1b0Var.w0().A1();
                            return Unit.a;
                        }
                        wxi wxiVar = a1b0Var.v;
                        if (wxiVar != null) {
                            wxiVar.M.O(100);
                        }
                        e activity = a1b0Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    } else {
                        a1b0Var.E = 0;
                    }
                    wxi wxiVar2 = a1b0Var.v;
                    if (wxiVar2 != null && (j1bVar = (progressMeterComponent = wxiVar2.M).J) != null) {
                        ej5.c(j1bVar, null, null, new a430(progressMeterComponent, null), 3);
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    WalletInfoResponse walletInfoResponse2 = hTTPResponse2 != null ? (WalletInfoResponse) hTTPResponse2.getData() : null;
                    zp40 zp40Var = new zp40();
                    WalletInfoResponse walletInfoResponse3 = a1b0Var.P;
                    if (walletInfoResponse3 != null && (balance2 = walletInfoResponse3.getBalance()) != null) {
                        double dDoubleValue = balance2.doubleValue();
                        if (walletInfoResponse2 != null && (balance3 = walletInfoResponse2.getBalance()) != null) {
                            zp40Var.a = dDoubleValue - balance3.doubleValue();
                        }
                    }
                    double d = zp40Var.a;
                    if (d < 0.0d) {
                        nas nasVarA = ebs.a(a1b0Var.getLifecycle());
                        pfd pfdVar = fse.a;
                        ej5.c(nasVarA, gku.a, null, new j1b0(a1b0Var, zp40Var, null), 2);
                    } else if (d > 0.0d) {
                        nas nasVarA2 = ebs.a(a1b0Var.getLifecycle());
                        pfd pfdVar2 = fse.a;
                        ej5.c(nasVarA2, gku.a, null, new k1b0(a1b0Var, zp40Var, null), 2);
                    }
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    a1b0Var.P = hTTPResponse3 != null ? (WalletInfoResponse) hTTPResponse3.getData() : null;
                    wxi wxiVar3 = a1b0Var.v;
                    if (wxiVar3 != null && (iq80Var = wxiVar3.z.binding) != null) {
                        iq80Var.A.setVisibility(4);
                    }
                    HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                    WalletInfoResponse walletInfoResponse4 = hTTPResponse4 != null ? (WalletInfoResponse) hTTPResponse4.getData() : null;
                    wxi wxiVar4 = a1b0Var.v;
                    if (wxiVar4 != null) {
                        Spin2WinHeader spin2WinHeader = wxiVar4.z;
                        String strC = qw.c(walletInfoResponse4 != null ? walletInfoResponse4.getBalance() : null, 10, false, null);
                        op5 op5Var = op5.a;
                        if (walletInfoResponse4 != null && (currency = walletInfoResponse4.getCurrency()) != null) {
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            upperCase = currency.toUpperCase(locale);
                            upperCase.getClass();
                        }
                        if (upperCase == null) {
                            upperCase = "";
                        }
                        op5Var.getClass();
                        spin2WinHeader.setAmountToWallet(strC, op5.i(upperCase));
                    }
                    wxi wxiVar5 = a1b0Var.v;
                    if (wxiVar5 != null) {
                        wxiVar5.z.setEnableDisableHamMenu(true);
                    }
                    WalletInfoResponse walletInfoResponse5 = a1b0Var.P;
                    double dDoubleValue2 = (walletInfoResponse5 == null || (balance = walletInfoResponse5.getBalance()) == null) ? 0.0d : balance.doubleValue();
                    wxi wxiVar6 = a1b0Var.v;
                    if (dDoubleValue2 <= 0.0d) {
                        if (wxiVar6 != null) {
                            wxiVar6.E.F(R.drawable.hamberger_add_more_red);
                        }
                    } else if (wxiVar6 != null) {
                        wxiVar6.E.F(R.drawable.menu_add_more_bg_plain);
                    }
                } else if (i3 == 2) {
                    wxi wxiVar7 = a1b0Var.v;
                    if (wxiVar7 != null) {
                        wxiVar7.z.setEnableDisableHamMenu(false);
                    }
                    wxi wxiVar8 = a1b0Var.v;
                    if (wxiVar8 != null && (iq80Var2 = wxiVar8.z.binding) != null) {
                        iq80Var2.A.setVisibility(0);
                    }
                    if (a1b0Var.getActivity() != null && (context = a1b0Var.getContext()) != null) {
                        a1b0Var.s0();
                        wxi wxiVar9 = a1b0Var.v;
                        if (wxiVar9 != null) {
                            wxiVar9.M.O(100);
                        }
                        if (loadingState.getError() != null) {
                            Integer code = loadingState.getError().getCode();
                            if (code != null && code.intValue() == 403) {
                                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            } else {
                                if (a1b0Var.E < 3) {
                                    a1b0Var.w0().A1();
                                    a1b0Var.E++;
                                    return Unit.a;
                                }
                                xbg xbgVar = a1b0Var.w;
                                if (xbgVar != null) {
                                    String string = a1b0Var.getString(R.string.sg_unable_to_fetch_wallet_balance);
                                    string.getClass();
                                    String string2 = a1b0Var.getString(R.string.retry);
                                    string2.getClass();
                                    xbg.c(xbgVar, string, string2, new Function0() { // from class: rza0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            a1b0 a1b0Var2 = a1b0Var;
                                            a1b0Var2.E = 1;
                                            a1b0Var2.w0().A1();
                                            return Unit.a;
                                        }
                                    }, new d920(1), context.getColor(R.color.try_again_color), 192);
                                    xbgVar.a();
                                }
                            }
                        }
                    }
                } else {
                    if (i3 != 3) {
                        uhc.a();
                        return null;
                    }
                    a1b0Var.s0();
                    wxi wxiVar10 = a1b0Var.v;
                    if (wxiVar10 != null) {
                        wxiVar10.z.setEnableDisableHamMenu(false);
                    }
                    wxi wxiVar11 = a1b0Var.v;
                    if (wxiVar11 != null && (iq80Var3 = wxiVar11.z.binding) != null) {
                        iq80Var3.A.setVisibility(0);
                    }
                }
                return Unit.a;
        }
    }
}
