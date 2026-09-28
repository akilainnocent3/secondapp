package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: loaded from: classes6.dex */
public final class ro80 implements g6i0 {
    public final SpinKitView A;
    public final TextView B;
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final FrameLayout c;
    public final TextView d;
    public final TextView e;
    public final AppCompatImageView f;
    public final AppCompatImageView i;
    public final AppCompatTextView v;
    public final AppCompatImageView w;
    public final TextView y;
    public final AppCompatImageView z;

    public ro80(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, FrameLayout frameLayout, TextView textView, TextView textView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3, TextView textView3, AppCompatImageView appCompatImageView4, SpinKitView spinKitView, TextView textView4) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = frameLayout;
        this.d = textView;
        this.e = textView2;
        this.f = appCompatImageView;
        this.i = appCompatImageView2;
        this.v = appCompatTextView2;
        this.w = appCompatImageView3;
        this.y = textView3;
        this.z = appCompatImageView4;
        this.A = spinKitView;
        this.B = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
