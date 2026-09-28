package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class m800 {
    public final psm a;

    public m800(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public static ResourceUiText a(int i) {
        c100 c100Var = c100.e;
        if (i == 31001) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_payment__card);
        }
        if (i == 31006) {
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.int_provider_nuvei_oxxo);
        }
        if (i == 31004 || i == 31008) {
            StringUiText stringUiText3 = vch0.a;
            return new ResourceUiText(R.string.int_provider_spei);
        }
        if (i == 34001 || i == 34002) {
            StringUiText stringUiText4 = vch0.a;
            return new ResourceUiText(R.string.int_spei_by_stp);
        }
        if (i == 35001 || i == 36001) {
            StringUiText stringUiText5 = vch0.a;
            return new ResourceUiText(R.string.int_mtn_mobile_money);
        }
        if (i != 35002 && i != 36002) {
            return null;
        }
        StringUiText stringUiText6 = vch0.a;
        return new ResourceUiText(R.string.int_orange_mobile_money);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final UiText b(TypeData typeData) {
        if (!this.a.r()) {
            String type = typeData.getType();
            type.getClass();
            if (type.equals("Ewallet")) {
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.page_payment__e_wallet);
            }
            StringUiText stringUiText2 = vch0.a;
            return new StringUiText(type);
        }
        String type2 = typeData.getType();
        switch (type2.hashCode()) {
            case -1984987966:
                if (type2.equals("Mobile")) {
                    StringUiText stringUiText3 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__mobile_money);
                }
                break;
            case -855814525:
                if (type2.equals("Debit Credit Card")) {
                    StringUiText stringUiText4 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__credit_debit_card);
                }
                break;
            case 68563:
                if (type2.equals("EFT")) {
                    StringUiText stringUiText5 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__transfer);
                }
                break;
            case 2092848:
                if (type2.equals("Card")) {
                    StringUiText stringUiText6 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__cards);
                }
                break;
            case 2092883:
                if (type2.equals("Cash")) {
                    StringUiText stringUiText7 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__cash_payments);
                }
                break;
            case 76517104:
                if (type2.equals("Other")) {
                    StringUiText stringUiText8 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__other);
                }
                break;
            case 313019518:
                if (type2.equals("Ewallet")) {
                    StringUiText stringUiText9 = vch0.a;
                    return new ResourceUiText(R.string.page_payment__e_wallet);
                }
                break;
            case 1825161854:
                if (type2.equals("Pix Payments by BTG")) {
                    StringUiText stringUiText10 = vch0.a;
                    return new ResourceUiText(R.string.int_provider_pix);
                }
                break;
        }
        return vch0.d(typeData.getName());
    }
}
