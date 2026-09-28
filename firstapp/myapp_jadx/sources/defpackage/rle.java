package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class rle implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final View c;
    public final WebView d;

    public rle(ConstraintLayout constraintLayout, ImageButton imageButton, View view, WebView webView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = view;
        this.d = webView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
