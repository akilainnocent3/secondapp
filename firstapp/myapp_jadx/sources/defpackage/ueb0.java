package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ueb0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final TextView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final TextView f;
    public final TextView i;

    public ueb0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = textView;
        this.d = appCompatImageView2;
        this.e = appCompatImageView3;
        this.f = textView2;
        this.i = textView3;
    }

    public static ueb0 a(View view) {
        int i = R.id.article_blur_bg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.article_blur_bg, view);
        if (appCompatImageView != null) {
            i = R.id.article_date;
            TextView textView = (TextView) h5e.a(R.id.article_date, view);
            if (textView != null) {
                i = R.id.article_image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.article_image, view);
                if (appCompatImageView2 != null) {
                    i = R.id.article_play;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.article_play, view);
                    if (appCompatImageView3 != null) {
                        i = R.id.article_title;
                        TextView textView2 = (TextView) h5e.a(R.id.article_title, view);
                        if (textView2 != null) {
                            i = R.id.article_type;
                            TextView textView3 = (TextView) h5e.a(R.id.article_type, view);
                            if (textView3 != null) {
                                i = R.id.guideline;
                                if (((Guideline) h5e.a(R.id.guideline, view)) != null) {
                                    return new ueb0((ConstraintLayout) view, appCompatImageView, textView, appCompatImageView2, appCompatImageView3, textView2, textView3);
                                }
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
