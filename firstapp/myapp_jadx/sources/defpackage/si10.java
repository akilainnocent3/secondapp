package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class si10 {
    public final AutofillManager a;

    public si10(AutofillManager autofillManager) {
        this.a = autofillManager;
    }

    public final void a() {
        this.a.commit();
    }

    public final void b(AndroidComposeView androidComposeView, int i, AutofillValue autofillValue) {
        this.a.notifyValueChanged(androidComposeView, i, autofillValue);
    }

    public final void c(AndroidComposeView androidComposeView, int i, Rect rect) {
        this.a.notifyViewEntered(androidComposeView, i, rect);
    }

    public final void d(AndroidComposeView androidComposeView, int i) {
        this.a.notifyViewExited(androidComposeView, i);
    }

    public final void e(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ql1.a(view, this.a, i, z);
        }
    }

    public final void f(AndroidComposeView androidComposeView, int i, Rect rect) {
        this.a.requestAutofill(androidComposeView, i, rect);
    }
}
