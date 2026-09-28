package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class gey extends WebView {
    public boolean a;

    public final boolean a() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent() + 1;
    }

    public final int b() {
        return computeVerticalScrollExtent();
    }

    public final int c() {
        return computeVerticalScrollOffset();
    }

    public final int d() {
        return computeVerticalScrollRange();
    }
}
