package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class cp80 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final ConstraintLayout d;
    public final TextView e;

    public cp80(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = constraintLayout2;
        this.e = textView3;
    }

    public static cp80 a(View view) {
        int i = R.id.active_rain_text;
        TextView textView = (TextView) h5e.a(R.id.active_rain_text, view);
        if (textView != null) {
            i = R.id.black_arrow;
            if (((ImageView) h5e.a(R.id.black_arrow, view)) != null) {
                i = R.id.claim_rain;
                TextView textView2 = (TextView) h5e.a(R.id.claim_rain, view);
                if (textView2 != null) {
                    i = R.id.guideline1;
                    if (((Guideline) h5e.a(R.id.guideline1, view)) != null) {
                        i = R.id.guideline2;
                        if (((Guideline) h5e.a(R.id.guideline2, view)) != null) {
                            i = R.id.layout_claim_button;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.layout_claim_button, view);
                            if (constraintLayout != null) {
                                i = R.id.rain_icon_cloud;
                                if (((ImageView) h5e.a(R.id.rain_icon_cloud, view)) != null) {
                                    i = R.id.rain_icon_half_cloud;
                                    if (((ImageView) h5e.a(R.id.rain_icon_half_cloud, view)) != null) {
                                        i = R.id.upcoming_rain_text;
                                        TextView textView3 = (TextView) h5e.a(R.id.upcoming_rain_text, view);
                                        if (textView3 != null) {
                                            return new cp80((ConstraintLayout) view, textView, textView2, constraintLayout, textView3);
                                        }
                                    }
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
