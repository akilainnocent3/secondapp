package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ujh0 implements g6i0 {
    public final Button A;
    public final TextView B;
    public final TextView C;
    public final ConstraintLayout a;
    public final ImageView b;
    public final CheckBox c;
    public final Button d;
    public final TextView e;
    public final AppCompatImageView f;
    public final ScrollView i;
    public final View v;
    public final View w;
    public final TextView y;
    public final TextView z;

    public ujh0(ConstraintLayout constraintLayout, ImageView imageView, CheckBox checkBox, Button button, TextView textView, AppCompatImageView appCompatImageView, ScrollView scrollView, View view, View view2, TextView textView2, TextView textView3, Button button2, TextView textView4, TextView textView5) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = checkBox;
        this.d = button;
        this.e = textView;
        this.f = appCompatImageView;
        this.i = scrollView;
        this.v = view;
        this.w = view2;
        this.y = textView2;
        this.z = textView3;
        this.A = button2;
        this.B = textView4;
        this.C = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
