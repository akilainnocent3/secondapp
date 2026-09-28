package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class go80 implements g6i0 {
    public final CoordinatorLayout a;
    public final AppCompatImageView b;
    public final TextView c;

    public go80(CoordinatorLayout coordinatorLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.a = coordinatorLayout;
        this.b = appCompatImageView;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
