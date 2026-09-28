package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bsj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bsj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double dDoubleValue;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                msj.a.g((String) obj2).d();
                break;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                ((View) obj).getClass();
                ArrayList arrayList = a1b0Var.J;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    dDoubleValue = 0.0d;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        Double betAmount = ((LocalGameDetailsEntity) obj3).getBetAmount();
                        dDoubleValue += betAmount != null ? betAmount.doubleValue() : 0.0d;
                    }
                } else {
                    dDoubleValue = 0.0d;
                }
                Context context = a1b0Var.getContext();
                if (context != null && dDoubleValue != 0.0d) {
                    SharedPreferences sharedPreferences = a1b0Var.y;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_one_tap", false)) : null;
                    String.valueOf(dDoubleValue);
                    a1b0Var.w0();
                    if (Intrinsics.g(boolValueOf, Boolean.TRUE)) {
                        a1b0Var.J0();
                    } else {
                        String string = context.getString(R.string.key_place_bet_confirm);
                        string.getClass();
                        HashMap map = new HashMap();
                        String string2 = context.getString(R.string.currency_cms);
                        op5 op5Var = op5.a;
                        WalletInfoResponse walletInfoResponse = a1b0Var.P;
                        String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                        if (currency == null) {
                            currency = "";
                        }
                        op5Var.getClass();
                        map.put(string2, op5.i(currency));
                        map.put(context.getString(R.string.amount_cms), krh0.l(dDoubleValue));
                        WalletInfoResponse walletInfoResponse2 = a1b0Var.P;
                        String currency2 = walletInfoResponse2 != null ? walletInfoResponse2.getCurrency() : null;
                        String strI = op5.i(currency2 != null ? currency2 : "");
                        TreeMap treeMap = pw.a;
                        String string3 = context.getString(R.string.sg_spin2win_place_bet_text, tug.a(strI, " ", pw.a(krh0.l(dDoubleValue))));
                        string3.getClass();
                        a1b0Var.z0();
                        String strB = op5.b(string, string3, map);
                        String string4 = context.getString(R.string.confirm_btn_cms);
                        string4.getClass();
                        String string5 = context.getString(R.string.confirm_bet);
                        string5.getClass();
                        String strB2 = op5.b(string4, string5, null);
                        String string6 = context.getString(R.string.cancel_btn_cms);
                        string6.getClass();
                        String string7 = context.getString(R.string.cancel_bet);
                        string7.getClass();
                        a1b0Var.B = a.C0437a.a("Spin2Win", "place bet", strB, "", strB2, op5.b(string6, string7, null), new eb20(a1b0Var, 2), new y7f(1), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 8192);
                        e activity = a1b0Var.getActivity();
                        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
                        a aVar = a1b0Var.B;
                        if (aVar != null && supportFragmentManager != null) {
                            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                            aVar2.f(R.id.flContent, aVar, null);
                            aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                            aVar2.d();
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
