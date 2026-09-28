package defpackage;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.rush.model.entity.DetailResponseEntity;
import com.sportygames.rush.model.response.UserValidateResponse;
import com.sportygames.rush.model.response.WalletInfoResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gge implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ gge(l560 l560Var) {
        this.b = l560Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar;
        ArrayList<Double> arrayList;
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hge.b((d) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final l560 l560Var = (l560) obj3;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Double dValueOf = Double.valueOf(0.0d);
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((Boolean) ((x5a0) l560Var.w0).getValue()).booleanValue()) {
                        aVar2.N(639752438);
                        HashMap map = new HashMap();
                        WalletInfoResponse walletInfoResponse = l560Var.U;
                        final String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                        op5 op5Var = op5.a;
                        String str = currency == null ? "" : currency;
                        op5Var.getClass();
                        map.put("{currency}", op5.i(str));
                        map.put("{amount}", String.valueOf(l560Var.F0().c));
                        String strB = op5.b("bet_per_round:sg_common", "Bet Per Round : ", map);
                        ytw ytwVarB = m.b(dValueOf);
                        ytw ytwVarB2 = m.b(dValueOf);
                        DetailResponseEntity detailResponseEntity = l560Var.T;
                        if (detailResponseEntity == null || (arrayList = detailResponseEntity.getAutoBetChips()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        String strI = op5.i(currency != null ? currency : "");
                        boolean zA = aVar2.A(l560Var);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new fw10(l560Var, i2);
                            aVar2.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar2.A(l560Var) | aVar2.M(currency);
                        Object objY2 = aVar2.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new Function1() { // from class: i460
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    eo80 eo80Var;
                                    String nickName;
                                    String avatarUrl;
                                    String str2 = "0.00";
                                    int iDoubleValue = (int) ((Double) obj4).doubleValue();
                                    l560 l560Var2 = l560Var;
                                    l560Var2.x0 = iDoubleValue;
                                    eo80 eo80Var2 = l560Var2.l0;
                                    String strValueOf = String.valueOf(eo80Var2 != null ? eo80Var2.r0.getText() : null);
                                    eo80 eo80Var3 = l560Var2.l0;
                                    String strValueOf2 = String.valueOf(eo80Var3 != null ? eo80Var3.C0.getText() : null);
                                    if ((strValueOf2.length() == 0 || strValueOf2.equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) && (eo80Var = l560Var2.l0) != null) {
                                        TextView textView = eo80Var.C0;
                                        try {
                                            String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var2.A);
                                            str3.getClass();
                                            str2 = str3;
                                        } catch (Exception unused) {
                                        }
                                        textView.setText(str2.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                                    }
                                    eo80 eo80Var4 = l560Var2.l0;
                                    String strValueOf3 = String.valueOf(eo80Var4 != null ? eo80Var4.C0.getText() : null);
                                    eo80 eo80Var5 = l560Var2.l0;
                                    String strSubstring = strValueOf3.substring(0, String.valueOf(eo80Var5 != null ? eo80Var5.C0.getText() : null).length() - 1);
                                    ((x5a0) l560Var2.w0).setValue(Boolean.FALSE);
                                    String str4 = currency;
                                    if (str4 != null && str4.length() != 0 && strValueOf.length() > 0 && strSubstring.length() > 0) {
                                        SharedPreferences.Editor editor = l560Var2.P;
                                        if (editor != null) {
                                            editor.putBoolean("rush_one_tap", true);
                                        }
                                        SharedPreferences.Editor editor2 = l560Var2.P;
                                        if (editor2 != null) {
                                            editor2.apply();
                                        }
                                        l560Var2.G = false;
                                        UserValidateResponse userValidateResponse = l560Var2.a0;
                                        if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
                                            nickName = "";
                                        }
                                        UserValidateResponse userValidateResponse2 = l560Var2.a0;
                                        if (userValidateResponse2 == null || (avatarUrl = userValidateResponse2.getAvatarUrl()) == null) {
                                            avatarUrl = "";
                                        }
                                        l560Var2.L0(nickName, avatarUrl);
                                        l560Var2.h1();
                                        String string = l560Var2.getString(R.string.sg_rush_auto_on);
                                        string.getClass();
                                        l560Var2.T0(string);
                                        if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                                            c760 c760VarF0 = l560Var2.F0();
                                            String str5 = l560Var2.F0().c;
                                            c760VarF0.A1(l560Var2.getActivity(), l560Var2.F0().b, str4, str5 == null ? "" : str5, strSubstring, l560Var2.F0().e, l560Var2.i0);
                                        } else {
                                            c760 c760VarF1 = l560Var2.F0();
                                            String str6 = l560Var2.F0().c;
                                            c760VarF1.z1(str4, str6 == null ? "" : str6, strSubstring, l560Var2.F0().e, l560Var2.F0().b, l560Var2.i0, null, false);
                                        }
                                        GameDetails gameDetails = l560Var2.S;
                                        wz.a("AutoBetOn", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        Function1 function1 = (Function1) objY2;
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = new j460();
                            aVar2.r(objY3);
                        }
                        Function0 function2 = (Function0) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = new k460();
                            aVar2.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        Object objY5 = aVar2.y();
                        if (objY5 == c0042a) {
                            objY5 = new l460(0);
                            aVar2.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        Object objY6 = aVar2.y();
                        if (objY6 == c0042a) {
                            objY6 = new n460();
                            aVar2.r(objY6);
                        }
                        f81.a(strB, arrayList, function0, function1, null, strI, null, null, null, ytwVarB, ytwVarB2, function2, function3, null, function4, (Function0) objY6, "", "", false, false, aVar2, 0, 920347056, 8656);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        aVar.N(624895750);
                    }
                    aVar.H();
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
