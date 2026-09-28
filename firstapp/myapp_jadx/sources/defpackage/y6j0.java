package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class y6j0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final FrameLayout c;
    public final AppCompatEditText d;
    public final ConstraintLayout e;
    public final AppCompatTextView f;
    public final AppCompatTextView i;

    public y6j0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, FrameLayout frameLayout, AppCompatEditText appCompatEditText, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = frameLayout;
        this.d = appCompatEditText;
        this.e = constraintLayout2;
        this.f = appCompatTextView2;
        this.i = appCompatTextView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
