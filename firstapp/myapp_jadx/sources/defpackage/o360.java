package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.rush.model.response.WalletInfoResponse;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o360 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o360(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        eo80 eo80Var;
        String strSubstring;
        CharSequence text;
        String string;
        CharSequence text2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final l560 l560Var = (l560) obj2;
                String str = "0.00";
                ((View) obj).getClass();
                if (l560Var.N0()) {
                    l560Var.F0();
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                } else {
                    l560Var.F = false;
                    WalletInfoResponse walletInfoResponse = l560Var.U;
                    String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                    eo80 eo80Var2 = l560Var.l0;
                    final String string2 = (eo80Var2 == null || (text2 = eo80Var2.r0.getText()) == null) ? null : text2.toString();
                    eo80 eo80Var3 = l560Var.l0;
                    String strValueOf = String.valueOf(eo80Var3 != null ? eo80Var3.C0.getText() : null);
                    if ((strValueOf.length() == 0 || strValueOf.equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) && (eo80Var = l560Var.l0) != null) {
                        TextView textView = eo80Var.C0;
                        try {
                            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.A);
                            str2.getClass();
                            str = str2;
                        } catch (Exception unused) {
                        }
                        textView.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                    }
                    eo80 eo80Var4 = l560Var.l0;
                    if (eo80Var4 == null || (text = eo80Var4.C0.getText()) == null || (string = text.toString()) == null) {
                        strSubstring = null;
                    } else {
                        eo80 eo80Var5 = l560Var.l0;
                        strSubstring = string.substring(0, String.valueOf(eo80Var5 != null ? eo80Var5.C0.getText() : null).length() - 1);
                    }
                    l560Var.F0().c = string2;
                    if (currency == null || currency.length() == 0 || string2 == null || string2.length() == 0 || strSubstring == null || strSubstring.length() == 0) {
                        break;
                    } else {
                        SharedPreferences sharedPreferences = l560Var.O;
                        if (Intrinsics.g(sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_one_tap", false)) : null, Boolean.TRUE)) {
                            GameDetails gameDetails = l560Var.S;
                            wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, "On", "Manual", "1");
                            if (currency.length() > 0 && string2.length() > 0 && strSubstring.length() > 0) {
                                l560Var.h1();
                                l560Var.G = true;
                                if (yju.a("br")) {
                                    c760 c760VarF0 = l560Var.F0();
                                    String str3 = l560Var.F0().c;
                                    c760VarF0.A1(l560Var.getActivity(), l560Var.F0().b, currency, str3 == null ? "" : str3, strSubstring, l560Var.F0().e, l560Var.i0);
                                } else {
                                    String str4 = strSubstring;
                                    String str5 = currency;
                                    c760 c760VarF1 = l560Var.F0();
                                    String str6 = l560Var.F0().c;
                                    c760VarF1.z1(str5, str6 == null ? "" : str6, str4, l560Var.F0().e, l560Var.F0().b, l560Var.i0, null, false);
                                }
                            }
                        } else {
                            final String str7 = strSubstring;
                            final String str8 = currency;
                            Context context = l560Var.getContext();
                            if (context != null) {
                                String string3 = l560Var.getString(R.string.place_bet_message_cms);
                                string3.getClass();
                                HashMap map = new HashMap();
                                String string4 = l560Var.getString(R.string.currency_cms);
                                op5.a.getClass();
                                map.put(string4, op5.i(str8));
                                String string5 = l560Var.getString(R.string.amount_cms);
                                TreeMap treeMap = pw.a;
                                eo80 eo80Var6 = l560Var.l0;
                                String strA = pw.a(String.valueOf(eo80Var6 != null ? eo80Var6.r0.getText() : null));
                                if (strA == null) {
                                    strA = "";
                                }
                                map.put(string5, strA);
                                String string6 = l560Var.getString(R.string.cashout_at_cms);
                                eo80 eo80Var7 = l560Var.l0;
                                String strValueOf2 = String.valueOf(eo80Var7 != null ? eo80Var7.C0.getText() : null);
                                eo80 eo80Var8 = l560Var.l0;
                                String strA2 = pw.a(strValueOf2.substring(0, String.valueOf(eo80Var8 != null ? eo80Var8.C0.getText() : null).length() - 1));
                                if (strA2 == null) {
                                    strA2 = "";
                                }
                                map.put(string6, strA2);
                                GameDetails gameDetails2 = l560Var.S;
                                wz.a("BetPlaced", gameDetails2 != null ? gameDetails2.getName() : null, "Off", "Manual", "1");
                                WalletInfoResponse walletInfoResponse2 = l560Var.U;
                                String currency2 = walletInfoResponse2 != null ? walletInfoResponse2.getCurrency() : null;
                                String strI = op5.i(currency2 != null ? currency2 : "");
                                eo80 eo80Var9 = l560Var.l0;
                                String strA3 = tug.a(strI, " ", pw.a(String.valueOf(eo80Var9 != null ? eo80Var9.r0.getText() : null)));
                                eo80 eo80Var10 = l560Var.l0;
                                String strValueOf3 = String.valueOf(eo80Var10 != null ? eo80Var10.C0.getText() : null);
                                eo80 eo80Var11 = l560Var.l0;
                                String string7 = context.getString(R.string.sg_rush_place_bet_text_rush, strA3, yk10.a(pw.a(strValueOf3.substring(0, String.valueOf(eo80Var11 != null ? eo80Var11.C0.getText() : null).length() - 1)), "x"));
                                string7.getClass();
                                l560Var.E0();
                                String strB = op5.b(string3, string7, map);
                                String string8 = l560Var.getString(R.string.confirm_btn_cms);
                                string8.getClass();
                                String string9 = l560Var.getString(R.string.confirm_bet);
                                string9.getClass();
                                String strB2 = op5.b(string8, string9, null);
                                String string10 = l560Var.getString(R.string.cancel_btn_cms);
                                string10.getClass();
                                String string11 = l560Var.getString(R.string.cancel_bet);
                                string11.getClass();
                                l560Var.R = a.C0437a.a("Rush", "place bet", strB, "", strB2, op5.b(string10, string11, null), new Function1() { // from class: a560
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        eo80 eo80Var12;
                                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                        String str9 = "0.00";
                                        l560 l560Var2 = l560Var;
                                        GameDetails gameDetails3 = l560Var2.S;
                                        if (zBooleanValue) {
                                            wz.a("BetConfirmed", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
                                            String str10 = str8;
                                            if (str10.length() > 0) {
                                                String str11 = string2;
                                                if (str11.length() > 0) {
                                                    String str12 = str7;
                                                    if (str12.length() > 0) {
                                                        l560Var2.h1();
                                                        l560Var2.G = true;
                                                        Double d = l560Var2.F0().b;
                                                        if (d != null && !Double.isNaN(d.doubleValue()) && d.doubleValue() > Double.parseDouble(str11) && (eo80Var12 = l560Var2.l0) != null) {
                                                            TextView textView2 = eo80Var12.r0;
                                                            try {
                                                                String str13 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d.doubleValue());
                                                                str13.getClass();
                                                                str9 = str13;
                                                            } catch (Exception unused2) {
                                                            }
                                                            textView2.setText(str9);
                                                        }
                                                        if (yju.a("br")) {
                                                            c760 c760VarF2 = l560Var2.F0();
                                                            String str14 = l560Var2.F0().c;
                                                            c760VarF2.A1(l560Var2.getActivity(), l560Var2.F0().b, str10, str14 == null ? "" : str14, str12, l560Var2.F0().e, l560Var2.i0);
                                                        } else {
                                                            c760 c760VarF3 = l560Var2.F0();
                                                            String str15 = l560Var2.F0().c;
                                                            c760VarF3.z1(str10, str15 == null ? "" : str15, str12, l560Var2.F0().e, l560Var2.F0().b, l560Var2.i0, null, false);
                                                        }
                                                    }
                                                }
                                            }
                                            l560Var2.p0();
                                        } else {
                                            wz.a("BetCancelled", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
                                            l560Var2.p0();
                                        }
                                        l560Var2.R = null;
                                        return Unit.a;
                                    }
                                }, new b560(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 8192);
                                e activity = l560Var.getActivity();
                                FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
                                a aVar = l560Var.R;
                                if (aVar != null && supportFragmentManager != null) {
                                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                                    aVar2.f(R.id.flContent, aVar, null);
                                    aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                                    aVar2.d();
                                }
                            }
                        }
                    }
                }
                break;
            default:
                goa0 goa0Var = (goa0) obj2;
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                goa0Var.c.j("messageReceived");
                goa0Var.b.j(f1e0Var.c);
                break;
        }
        return Unit.a;
    }
}
