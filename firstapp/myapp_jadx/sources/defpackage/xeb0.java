package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.RangeSlider;

/* JADX INFO: loaded from: classes5.dex */
public final class xeb0 implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final web0 c;
    public final RangeSlider d;
    public final TextView e;
    public final TextView f;

    public xeb0(ConstraintLayout constraintLayout, View view, web0 web0Var, RangeSlider rangeSlider, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = web0Var;
        this.d = rangeSlider;
        this.e = textView;
        this.f = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
