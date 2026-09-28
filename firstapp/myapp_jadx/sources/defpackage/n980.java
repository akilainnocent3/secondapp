package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class n980 {
    public static final ResourceUiText a(int i) {
        if (i == 1) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.component_betslip__singles);
        }
        if (i == 2) {
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.component_betslip__doubles);
        }
        if (i == 3) {
            StringUiText stringUiText3 = vch0.a;
            return new ResourceUiText(R.string.component_betslip__trebles);
        }
        Object[] objArr = {Integer.valueOf(i)};
        StringUiText stringUiText4 = vch0.a;
        return new ResourceUiText(R.string.component_betslip__veventsize_folds, ay0.S(objArr));
    }
}
