package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class acr {
    public static final qjq.b a(ojq ojqVar, ojq ojqVar2) {
        tjq.b bVar;
        int iOrdinal = ojqVar.ordinal();
        if (iOrdinal == 0) {
            StringUiText stringUiText = vch0.a;
            bVar = new tjq.b(new ResourceUiText(R.string.common_functions__all), ojqVar);
        } else if (iOrdinal == 1) {
            StringUiText stringUiText2 = vch0.a;
            bVar = new tjq.b(new ResourceUiText(R.string.bet_history__unsettled), ojqVar);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                uhc.a();
                return null;
            }
            StringUiText stringUiText3 = vch0.a;
            bVar = new tjq.b(new ResourceUiText(R.string.bet_history__settled), ojqVar);
        }
        return new qjq.b(bVar, ojqVar2 == ojqVar);
    }
}
