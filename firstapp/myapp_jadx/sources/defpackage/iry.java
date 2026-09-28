package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.header.CrashHeaderState;
import com.sportygames.crashInitiated.model.request.BetData;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class iry implements Function1<BetData, Unit> {
    public final /* synthetic */ zqy a;
    public final /* synthetic */ ComposeView b;

    public iry(zqy zqyVar, ComposeView composeView) {
        this.a = zqyVar;
        this.b = composeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BetData betData) {
        String strConcat;
        BetData betData2 = betData;
        betData2.getClass();
        Boolean boolIsSingleBet = betData2.isSingleBet();
        boolean zBooleanValue = boolIsSingleBet != null ? boolIsSingleBet.booleanValue() : true;
        ComposeView composeView = this.b;
        zqy zqyVar = this.a;
        if (zBooleanValue) {
            String string = zqyVar.getString(R.string.place_bet_message_android_cms);
            string.getClass();
            HashMap map = new HashMap();
            map.put(zqyVar.getString(R.string.currency_cms), ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode());
            String string2 = zqyVar.getString(R.string.amount_cms);
            TreeMap treeMap = pw.a;
            String strA = pw.a(String.valueOf(betData2.getBetValue()));
            if (strA == null) {
                strA = "";
            }
            map.put(string2, strA);
            String string3 = zqyVar.getString(R.string.cashout_at_cms);
            String strA2 = pw.a(String.valueOf(betData2.getBetCoeff()));
            map.put(string3, (strA2 != null ? strA2 : "").concat("x"));
            Context context = composeView.getContext();
            op5 op5Var = op5.a;
            String currencyCode = ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode();
            op5Var.getClass();
            String string4 = context.getString(R.string.sg_rush_place_bet_text_rush, tug.a(op5.i(currencyCode), " ", pw.a(String.valueOf(betData2.getBetValue()))), yk10.a(pw.a(String.valueOf(betData2.getBetCoeff()).substring(0, String.valueOf(betData2.getBetCoeff()).length() - 1)), "x"));
            string4.getClass();
            strConcat = op5.b(string, string4, map);
        } else {
            String string5 = zqyVar.getString(R.string.place_bet_auto_android_message_cms);
            string5.getClass();
            String string6 = zqyVar.getString(R.string.one_tap_bet_note_cms);
            string6.getClass();
            HashMap map2 = new HashMap();
            map2.put(zqyVar.getString(R.string.currency_cms), ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode());
            String string7 = zqyVar.getString(R.string.amount_cms);
            TreeMap treeMap2 = pw.a;
            String strA3 = pw.a(String.valueOf(betData2.getBetValue()));
            if (strA3 == null) {
                strA3 = "";
            }
            map2.put(string7, strA3);
            String string8 = zqyVar.getString(R.string.cashout_at_cms);
            String strA4 = pw.a(String.valueOf(betData2.getBetCoeff()));
            map2.put(string8, (strA4 != null ? strA4 : "").concat("x"));
            Context context2 = composeView.getContext();
            op5 op5Var2 = op5.a;
            String currencyCode2 = ((CrashHeaderState) zqyVar.s0().A.getValue()).getCurrencyCode();
            op5Var2.getClass();
            String string9 = context2.getString(R.string.sg_rush_place_auto_bet_text_rush, tug.a(op5.i(currencyCode2), " ", pw.a(String.valueOf(betData2.getBetValue()))), yk10.a(pw.a(String.valueOf(betData2.getBetCoeff()).substring(0, String.valueOf(betData2.getBetCoeff()).length() - 1)), "x"));
            string9.getClass();
            String strB = op5.b(string5, string9, map2);
            String string10 = zqyVar.getString(R.string.your_one_tap_will_be_on);
            string10.getClass();
            strConcat = strB.concat("<br>  <small><font color=\"#333333\">" + op5.b(string6, string10, null) + "</font></small>");
        }
        zqyVar.w0().d = String.valueOf(betData2.getBetCoeff());
        zqyVar.w0().c = String.valueOf(betData2.getBetValue());
        ((x5a0) zqyVar.u0().A).setValue(strConcat);
        ytw<String> ytwVar = zqyVar.u0().G;
        String string11 = zqyVar.getString(R.string.confirm_btn_cms);
        string11.getClass();
        String string12 = zqyVar.getString(R.string.confirm_bet);
        string12.getClass();
        ((x5a0) ytwVar).setValue(op5.b(string11, string12, null));
        ytw<String> ytwVar2 = zqyVar.u0().H;
        String string13 = zqyVar.getString(R.string.cancel_btn_cms);
        string13.getClass();
        String string14 = zqyVar.getString(R.string.cancel_bet);
        string14.getClass();
        ((x5a0) ytwVar2).setValue(op5.b(string13, string14, null));
        ((x5a0) zqyVar.X).setValue(Boolean.TRUE);
        ((x5a0) zqyVar.u0().B).setValue(betData2);
        betData2.setOnConfirmClick(((BetData) ((x5a0) zqyVar.u0().B).getValue()).getOnConfirmClick());
        return Unit.a;
    }
}
