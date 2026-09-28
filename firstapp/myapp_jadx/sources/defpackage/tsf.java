package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class tsf {
    public static uf00 a(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Object[] objArr = {str, Double.valueOf(bigDecimal != null ? bigDecimal.doubleValue() : 0.0d)};
        StringUiText stringUiText = vch0.a;
        return a4h.a(new ResourceUiText(R.string.page_limits__the_minimum_stake_amount_is_vcurrency_vnum_tip, ay0.S(objArr)), new ResourceUiText(R.string.page_limits__the_maximum_stake_amount_is_vcurrency_vnum_tip, ay0.S(new Object[]{str, Double.valueOf(bigDecimal2 != null ? bigDecimal2.doubleValue() : 0.0d)})), new ResourceUiText(R.string.page_limits__if_you_reach_any_real_sports_virtuals_casino_limit_tip));
    }

    public static uf00 b() {
        StringUiText stringUiText = vch0.a;
        return a4h.a(new ResourceUiText(R.string.page_limits__loss_limits_are_calculated_tip), new ResourceUiText(R.string.page_limits__if_you_reach_any_real_sports_virtuals_casino_limit_tip));
    }
}
