package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class cmn {
    public final View a;
    public final ttr b = hwr.a(a1s.c, new amn(this, 0));

    public cmn(View view) {
        this.a = view;
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.b.getValue();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.a, i, i2, i3, i4);
    }
}
