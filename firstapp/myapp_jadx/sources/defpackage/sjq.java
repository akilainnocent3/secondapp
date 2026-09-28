package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class sjq {
    public static tjq a(ojq ojqVar) {
        ojqVar.getClass();
        int iOrdinal = ojqVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            StringUiText stringUiText = vch0.a;
            return new tjq.b(new ResourceUiText(R.string.bet_history__bet_result), ojqVar);
        }
        if (iOrdinal == 3) {
            StringUiText stringUiText2 = vch0.a;
            return new tjq.a(new ResourceUiText(R.string.bet_history__won), R.drawable.ic__feature__won, ojqVar);
        }
        if (iOrdinal == 4) {
            StringUiText stringUiText3 = vch0.a;
            return new tjq.a(new ResourceUiText(R.string.bet_history__lost), R.drawable.ic_close_24dp, ojqVar);
        }
        if (iOrdinal == 5) {
            StringUiText stringUiText4 = vch0.a;
            return new tjq.a(new ResourceUiText(R.string.bet_history__void), R.drawable.icon_void_with_padding, ojqVar);
        }
        uhc.a();
        return null;
    }
}
