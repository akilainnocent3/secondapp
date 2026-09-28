package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class cg50 {
    /* JADX WARN: Multi-variable type inference failed */
    public static ra1 a(int i, int i2, int i3) {
        Pair pair;
        switch (i) {
            case 5101:
                StringUiText stringUiText = vch0.a;
                pair = new Pair(new ResourceUiText(R.string.component_betslip__unavailable_matches), new ResourceUiText(R.string.component_betslip__auto_bet_is_only_available_for_matches_within_the_next_days, ay0.S(new Object[]{Integer.valueOf(i2)})));
                break;
            case 5102:
                StringUiText stringUiText2 = vch0.a;
                pair = new Pair(new ResourceUiText(R.string.common_feedback__something_went_wrong), new ResourceUiText(R.string.component_betslip__auto_bet_is_not_available_please_try_again_later));
                break;
            case 5103:
                StringUiText stringUiText3 = vch0.a;
                pair = new Pair(new ResourceUiText(R.string.component_betslip__auto_bet_limit_reached), new ResourceUiText(R.string.component_betslip__you_ve_reached_the_maximum_of_auto_bet_rules, ay0.S(new Object[]{Integer.valueOf(i3)})));
                break;
            default:
                StringUiText stringUiText4 = vch0.a;
                pair = new Pair(new ResourceUiText(R.string.common_feedback__something_went_wrong), new ResourceUiText(R.string.component_betslip__auto_bet_is_not_available_please_try_again_later));
                break;
        }
        UiText uiText = (UiText) pair.a;
        UiText uiText2 = (UiText) pair.b;
        return i == 5103 ? new ra1.b(new ResourceUiText(R.string.component_betslip__go_to_bet_list), uiText, uiText2) : new ra1.a(uiText, uiText2);
    }
}
