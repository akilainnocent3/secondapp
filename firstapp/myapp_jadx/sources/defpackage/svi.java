package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class svi implements g6i0 {
    public final RelativeLayout a;
    public final ImageButton b;
    public final TextView c;
    public final ProgressButton d;
    public final ClearEditText e;
    public final TextView f;
    public final TextView i;
    public final TextView v;

    public svi(RelativeLayout relativeLayout, ImageButton imageButton, TextView textView, ProgressButton progressButton, ClearEditText clearEditText, TextView textView2, TextView textView3, TextView textView4) {
        this.a = relativeLayout;
        this.b = imageButton;
        this.c = textView;
        this.d = progressButton;
        this.e = clearEditText;
        this.f = textView2;
        this.i = textView3;
        this.v = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
