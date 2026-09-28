package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ejh implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final AppCompatImageView c;

    public ejh(AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = appCompatImageView;
    }

    public static ejh a(View view) {
        int i = R.id.ivArrow;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.ivArrow, view);
        if (constraintLayout != null) {
            i = R.id.iv_arrow_image;
            if (((AppCompatImageView) h5e.a(R.id.iv_arrow_image, view)) != null) {
                i = R.id.ivTarget;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.ivTarget, view);
                if (appCompatImageView != null) {
                    return new ejh(appCompatImageView, (ConstraintLayout) view, constraintLayout);
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
