package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class yn80 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final ConstraintLayout f;
    public final AppCompatButton i;

    public yn80(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, AppCompatButton appCompatButton) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
        this.f = constraintLayout2;
        this.i = appCompatButton;
    }

    public static yn80 a(View view) {
        int i = R.id.empty_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.empty_image, view);
        if (appCompatImageView != null) {
            i = R.id.error_image;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.error_image, view);
            if (appCompatImageView2 != null) {
                i = R.id.error_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.error_title, view);
                if (appCompatTextView != null) {
                    i = R.id.error_txt;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.error_txt, view);
                    if (appCompatTextView2 != null) {
                        i = R.id.img_layout;
                        if (((RelativeLayout) h5e.a(R.id.img_layout, view)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = R.id.retry_button;
                            AppCompatButton appCompatButton = (AppCompatButton) h5e.a(R.id.retry_button, view);
                            if (appCompatButton != null) {
                                return new yn80(constraintLayout, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, constraintLayout, appCompatButton);
                            }
                        }
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
