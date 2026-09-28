package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class mid0 implements g6i0 {
    public final FilterTabLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ConstraintLayout i;

    public mid0(FilterTabLayout filterTabLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout2) {
        this.a = filterTabLayout;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = constraintLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
