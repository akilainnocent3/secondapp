package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class m170 {
    public static ru3 a(bi70 bi70Var, boolean z) {
        z370 z370Var = bi70Var.d;
        ad70 ad70Var = bi70Var.f;
        int i = z ? R.color.icon_disable : R.color.icon_primary;
        int i2 = z ? R.color.text_disabled_action : R.color.text_primary;
        int i3 = z ? R.color.text_disabled_action : R.color.text_primary;
        int i4 = z ? R.color.text_disabled_action : R.color.text_secondary;
        String str = z370Var.c;
        StringUiText stringUiText = vch0.a;
        Iterator it = b.k(new ColoredUiText(new StringUiText(str), Integer.valueOf(i3), null), new StringUiText(" "), new ColoredUiText(new ResourceUiText(R.string.bet_history__vs), Integer.valueOf(i4), null), new StringUiText(" "), new ColoredUiText(new StringUiText(z370Var.f), Integer.valueOf(i3), null)).iterator();
        if (!it.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((UiText) next).h((UiText) it.next());
        }
        UiText uiText = (UiText) next;
        int i5 = z ? R.color.text_disabled_action : R.color.text_primary;
        String string = ad70Var.b.toString();
        string.getClass();
        return new ru3(gky.a.a(string, false), i5, i, ad70Var.d, i2, uiText);
    }
}
