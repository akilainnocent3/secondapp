package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class hid0 implements g6i0 {
    public final FrameLayout a;
    public final WebView b;
    public final FrameLayout c;
    public final View d;

    public hid0(FrameLayout frameLayout, WebView webView, FrameLayout frameLayout2, View view) {
        this.a = frameLayout;
        this.b = webView;
        this.c = frameLayout2;
        this.d = view;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
