package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class dsp implements g6i0 {
    public final ConstraintLayout a;
    public final WebView b;

    public dsp(ConstraintLayout constraintLayout, WebView webView) {
        this.a = constraintLayout;
        this.b = webView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
