package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ngd0 implements g6i0 {
    public final ConstraintLayout a;
    public final Button b;
    public final ProgressBar c;
    public final Button d;
    public final LinearLayout e;
    public final Button f;
    public final ProgressBar i;
    public final TextView v;
    public final TextView w;
    public final FrameLayout y;
    public final Button z;

    public ngd0(ConstraintLayout constraintLayout, Button button, ProgressBar progressBar, Button button2, LinearLayout linearLayout, Button button3, ProgressBar progressBar2, TextView textView, TextView textView2, FrameLayout frameLayout, Button button4) {
        this.a = constraintLayout;
        this.b = button;
        this.c = progressBar;
        this.d = button2;
        this.e = linearLayout;
        this.f = button3;
        this.i = progressBar2;
        this.v = textView;
        this.w = textView2;
        this.y = frameLayout;
        this.z = button4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
