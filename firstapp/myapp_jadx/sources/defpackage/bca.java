package defpackage;

import android.content.Context;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.rush.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bca implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bca(l560 l560Var, Context context) {
        this.a = 2;
        this.b = l560Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CharSequence text;
        String string;
        CharSequence text2;
        int i = this.a;
        CharSequence charSequenceSubstring = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                wwd0 wwd0Var = ((xw4) obj).d;
                Boolean bool = Boolean.FALSE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                break;
            default:
                l560 l560Var = (l560) obj;
                if (l560Var.getActivity() != null) {
                    WalletInfoResponse walletInfoResponse = l560Var.U;
                    String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
                    eo80 eo80Var = l560Var.l0;
                    String string2 = (eo80Var == null || (text2 = eo80Var.r0.getText()) == null) ? null : text2.toString();
                    eo80 eo80Var2 = l560Var.l0;
                    if (eo80Var2 != null && (text = eo80Var2.C0.getText()) != null && (string = text.toString()) != null) {
                        eo80 eo80Var3 = l560Var.l0;
                        charSequenceSubstring = string.substring(0, String.valueOf(eo80Var3 != null ? eo80Var3.C0.getText() : null).length() - 1);
                    }
                    String str = charSequenceSubstring;
                    l560Var.F0().c = string2;
                    if (currency != null && currency.length() != 0 && string2 != null && string2.length() != 0 && str != 0 && str.length() != 0) {
                        l560Var.h1();
                        if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                            c760 c760VarF0 = l560Var.F0();
                            String str2 = l560Var.F0().c;
                            c760VarF0.A1(l560Var.getActivity(), l560Var.F0().b, currency, str2 == null ? "" : str2, str, l560Var.F0().e, l560Var.i0);
                        } else {
                            String str3 = currency;
                            c760 c760VarF1 = l560Var.F0();
                            String str4 = l560Var.F0().c;
                            c760VarF1.z1(str3, str4 == null ? "" : str4, str, l560Var.F0().e, l560Var.F0().b, l560Var.i0, null, false);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bca(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
