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
public final class djd0 implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final LinearLayout c;
    public final ImageButton d;
    public final LinearLayout e;
    public final LinearLayout f;
    public final AppCompatImageView i;
    public final ComposeView v;
    public final ComposeView w;
    public final TextView y;

    public djd0(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatImageView appCompatImageView, ComposeView composeView, ComposeView composeView2, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = linearLayout;
        this.d = imageButton;
        this.e = linearLayout2;
        this.f = linearLayout3;
        this.i = appCompatImageView;
        this.v = composeView;
        this.w = composeView2;
        this.y = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
