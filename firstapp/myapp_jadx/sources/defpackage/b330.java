package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class b330 {
    public static final void a(ProgressButton progressButton, c330 c330Var) {
        progressButton.getClass();
        c330Var.getClass();
        if (!(c330Var instanceof c330.a)) {
            if (!c330Var.equals(c330.b.a)) {
                uhc.a();
                return;
            } else {
                progressButton.setEnabled(true);
                progressButton.setLoading(true);
                return;
            }
        }
        progressButton.setLoading(false);
        c330.a aVar = (c330.a) c330Var;
        progressButton.setEnabled(aVar.a);
        UiText uiText = aVar.b;
        if (uiText != null) {
            Context context = progressButton.getContext();
            context.getClass();
            progressButton.setButtonText(uiText.e(context));
        }
    }
}
