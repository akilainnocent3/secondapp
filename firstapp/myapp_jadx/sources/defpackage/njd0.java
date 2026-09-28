package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class njd0 implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageButton c;
    public final AppCompatImageView d;
    public final LinearLayout e;
    public final ComposeView f;
    public final ComposeView i;
    public final TextView v;

    public njd0(ConstraintLayout constraintLayout, ImageView imageView, ImageButton imageButton, AppCompatImageView appCompatImageView, LinearLayout linearLayout, ComposeView composeView, ComposeView composeView2, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageButton;
        this.d = appCompatImageView;
        this.e = linearLayout;
        this.f = composeView;
        this.i = composeView2;
        this.v = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
