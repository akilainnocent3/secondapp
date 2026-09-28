package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class dtr implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final ImageView c;
    public final TextView d;
    public final View e;

    public dtr(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, TextView textView, View view) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = imageView;
        this.d = textView;
        this.e = view;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
