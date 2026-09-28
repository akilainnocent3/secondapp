package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ugd0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;

    public ugd0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatTextView;
        this.d = appCompatImageView2;
    }

    public static ugd0 a(View view) {
        int i = R.id.close_button;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close_button, view);
        if (appCompatImageView != null) {
            i = R.id.hint_text_view;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.hint_text_view, view);
            if (appCompatTextView != null) {
                i = R.id.info_button;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.info_button, view);
                if (appCompatImageView2 != null) {
                    return new ugd0((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatImageView2);
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
