package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class vch0 {
    public static final StringUiText a = new StringUiText("");
    public static final ResourceUiText b = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again);
    public static final ResourceUiText c = new ResourceUiText(R.string.common_feedback__network_issue_please_check_your_network_and_try_again);

    public static final String a(UiText uiText, a aVar) {
        uiText.getClass();
        return uiText.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b));
    }

    public static final ResourceUiText b(int i) {
        return new ResourceUiText(i);
    }

    public static final ResourceUiText c(int i, Object... objArr) {
        return new ResourceUiText(i, ay0.S(objArr));
    }

    public static final StringUiText d(CharSequence charSequence) {
        charSequence.getClass();
        return new StringUiText(charSequence);
    }

    public static final StringUiText e(CharSequence charSequence) {
        if (charSequence != null) {
            return new StringUiText(charSequence);
        }
        return null;
    }

    public static ColoredUiText f(UiText uiText, Integer num) {
        uiText.getClass();
        return new ColoredUiText(uiText, num, null);
    }
}
