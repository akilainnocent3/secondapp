package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class hec implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final ConstraintLayout d;
    public final View e;
    public final View f;

    public hec(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, View view, View view2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatTextView;
        this.d = constraintLayout2;
        this.e = view;
        this.f = view2;
    }

    public static hec a(View view) {
        int i = R.id.categoryImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.categoryImg, view);
        if (appCompatImageView != null) {
            i = R.id.categoryName;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.categoryName, view);
            if (appCompatTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.view;
                View viewA = h5e.a(R.id.view, view);
                if (viewA != null) {
                    i = R.id.view1;
                    View viewA2 = h5e.a(R.id.view1, view);
                    if (viewA2 != null) {
                        return new hec(constraintLayout, appCompatImageView, appCompatTextView, constraintLayout, viewA, viewA2);
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
