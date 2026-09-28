package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class yc implements g6i0 {
    public final LinearLayout a;
    public final ConstraintLayout b;
    public final FrameLayout c;
    public final AppCompatButton d;
    public final ConstraintLayout e;

    public yc(LinearLayout linearLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2) {
        this.a = linearLayout;
        this.b = constraintLayout;
        this.c = frameLayout;
        this.d = appCompatButton;
        this.e = constraintLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
