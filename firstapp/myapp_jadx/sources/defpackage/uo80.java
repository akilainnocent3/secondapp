package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportygames.commons.components.SGToggle;

/* JADX INFO: loaded from: classes7.dex */
public final class uo80 implements g6i0 {
    public final ConstraintLayout a;
    public final SGToggle b;
    public final AppCompatImageView c;
    public final TextView d;
    public final TextView e;
    public final SpinKitView f;

    public uo80(ConstraintLayout constraintLayout, SGToggle sGToggle, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, SpinKitView spinKitView) {
        this.a = constraintLayout;
        this.b = sGToggle;
        this.c = appCompatImageView;
        this.d = textView;
        this.e = textView2;
        this.f = spinKitView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
