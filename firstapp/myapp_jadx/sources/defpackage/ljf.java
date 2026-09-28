package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ljf implements g6i0 {
    public final ConstraintLayout a;
    public final CheckBox b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final View f;
    public final View i;

    public ljf(ConstraintLayout constraintLayout, CheckBox checkBox, TextView textView, TextView textView2, ImageView imageView, View view, View view2) {
        this.a = constraintLayout;
        this.b = checkBox;
        this.c = textView;
        this.d = textView2;
        this.e = imageView;
        this.f = view;
        this.i = view2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
