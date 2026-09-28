package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class dwo implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageButton c;
    public final TextView d;
    public final ClearEditText e;
    public final TextView f;
    public final TextView i;
    public final ProgressButton v;
    public final TextView w;
    public final PasswordEditText y;
    public final TextView z;

    public dwo(ConstraintLayout constraintLayout, TextView textView, ImageButton imageButton, TextView textView2, ClearEditText clearEditText, TextView textView3, TextView textView4, ProgressButton progressButton, TextView textView5, PasswordEditText passwordEditText, TextView textView6) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageButton;
        this.d = textView2;
        this.e = clearEditText;
        this.f = textView3;
        this.i = textView4;
        this.v = progressButton;
        this.w = textView5;
        this.y = passwordEditText;
        this.z = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
