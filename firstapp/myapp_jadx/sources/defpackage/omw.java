package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class omw {
    public static dqk a(List list, m780 m780Var, BigDecimal bigDecimal, String str) {
        UiText uiTextA;
        bigDecimal.getClass();
        Integer numValueOf = null;
        if (!list.isEmpty()) {
            if (m780Var == null) {
                Object[] objArr = {Integer.valueOf(list.size())};
                StringUiText stringUiText = vch0.a;
                return new dqk(new ResourceUiText(R.string.component_coupon__use_gifts_with_num, ay0.S(objArr)), dqk.a.NONE, "gift_picker_button_unselected_text");
            }
            BigDecimal bigDecimalG = b.g(m780Var.a);
            if (bigDecimalG != null) {
                int kind = m780Var.b.getKind();
                if (kind == 1) {
                    numValueOf = Integer.valueOf(R.string.common_functions__cash_gift);
                } else if (kind == 2) {
                    numValueOf = Integer.valueOf(R.string.common_functions__discount_gift);
                } else if (kind == 3) {
                    numValueOf = Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    StringUiText stringUiText2 = vch0.a;
                    uiTextA = jz4.a(new ResourceUiText(iIntValue), ", ");
                } else {
                    uiTextA = vch0.a;
                }
                BigDecimal bigDecimalMin = bigDecimalG.min(bigDecimal);
                StringBuilder sbB = mq0.b(str, " -");
                sbB.append(bjb0.L(bigDecimalMin, Locale.US));
                return new dqk(uiTextA.h(new StringUiText(sbB.toString())), dqk.a.SELECTED, "gift_picker_button_selected_text");
            }
        }
        return null;
    }

    public static String b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            return gky.a.a(bjb0.L(bigDecimal2, Locale.US), false);
        }
        Locale locale = Locale.US;
        return oxc.a(gky.a.a(bjb0.L(bigDecimal, locale), false), " ~ ", gky.a.a(bjb0.L(bigDecimal2, locale), false));
    }
}
