package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;

/* JADX INFO: loaded from: classes.dex */
public final class q4p implements g6i0 {
    public final ActionBar a;
    public final ImageButton b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final ImageView i;
    public final TextView v;
    public final TextView w;
    public final ConstraintLayout y;

    public q4p(ActionBar actionBar, ImageButton imageButton, View view, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout) {
        this.a = actionBar;
        this.b = imageButton;
        this.c = view;
        this.d = imageView;
        this.e = textView;
        this.f = textView2;
        this.i = imageView2;
        this.v = textView3;
        this.w = textView4;
        this.y = constraintLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
