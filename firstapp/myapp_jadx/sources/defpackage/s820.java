package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class s820 implements g6i0 {
    public final AppCompatImageView A;
    public final AppCompatImageView B;
    public final SeekBar C;
    public final ConstraintLayout D;
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;
    public final ConstraintLayout e;
    public final LinearLayout f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public s820(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, SeekBar seekBar, ConstraintLayout constraintLayout5) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = constraintLayout2;
        this.d = constraintLayout3;
        this.e = constraintLayout4;
        this.f = linearLayout;
        this.i = textView;
        this.v = textView2;
        this.w = textView3;
        this.y = textView4;
        this.z = textView5;
        this.A = appCompatImageView2;
        this.B = appCompatImageView3;
        this.C = seekBar;
        this.D = constraintLayout5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
