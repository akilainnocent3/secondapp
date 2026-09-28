package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n50 {
    public static final n50 a = new n50();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(m50.a);
    }
}
