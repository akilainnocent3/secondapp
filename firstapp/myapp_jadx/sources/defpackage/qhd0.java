package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;

/* JADX INFO: loaded from: classes7.dex */
public final class qhd0 implements g6i0 {
    public final LinearLayout a;
    public final TextView b;
    public final KeyboardView c;
    public final EditText d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;

    public qhd0(LinearLayout linearLayout, TextView textView, KeyboardView keyboardView, EditText editText, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = linearLayout;
        this.b = textView;
        this.c = keyboardView;
        this.d = editText;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
