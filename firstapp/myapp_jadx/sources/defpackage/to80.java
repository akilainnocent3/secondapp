package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes8.dex */
public final class to80 implements g6i0 {
    public final ConstraintLayout a;
    public final FloatingActionButton b;
    public final TextView c;
    public final WebView d;

    public to80(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, WebView webView) {
        this.a = constraintLayout;
        this.b = floatingActionButton;
        this.c = textView;
        this.d = webView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
