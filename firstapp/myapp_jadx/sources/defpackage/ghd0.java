package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ghd0 implements g6i0 {
    public final RelativeLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;

    public ghd0(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
