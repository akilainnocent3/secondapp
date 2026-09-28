package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class wh7 implements g6i0 {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final AppCompatImageView f;

    public wh7(ConstraintLayout constraintLayout, ComposeView composeView, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = appCompatImageView;
    }

    public static wh7 a(View view) {
        int i = R.id.trans_compose_banner;
        ComposeView composeView = (ComposeView) h5e.a(R.id.trans_compose_banner, view);
        if (composeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.trans_grey_details;
            TextView textView = (TextView) h5e.a(R.id.trans_grey_details, view);
            if (textView != null) {
                i = R.id.trans_grey_title;
                TextView textView2 = (TextView) h5e.a(R.id.trans_grey_title, view);
                if (textView2 != null) {
                    i = R.id.trans_verify_btn;
                    TextView textView3 = (TextView) h5e.a(R.id.trans_verify_btn, view);
                    if (textView3 != null) {
                        i = R.id.trans_warn;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.trans_warn, view);
                        if (appCompatImageView != null) {
                            return new wh7(constraintLayout, composeView, textView, textView2, textView3, appCompatImageView);
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
