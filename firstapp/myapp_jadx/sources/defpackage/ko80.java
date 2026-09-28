package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: loaded from: classes8.dex */
public final class ko80 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final SpinKitView i;
    public final ImageView v;
    public final AppCompatImageView w;
    public final TextView y;
    public final FrameLayout z;

    public ko80(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, SpinKitView spinKitView, ImageView imageView, AppCompatImageView appCompatImageView4, TextView textView, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = appCompatImageView3;
        this.f = appCompatTextView2;
        this.i = spinKitView;
        this.v = imageView;
        this.w = appCompatImageView4;
        this.y = textView;
        this.z = frameLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
