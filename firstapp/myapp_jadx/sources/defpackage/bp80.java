package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class bp80 implements g6i0 {
    public final ConstraintLayout a;

    public bp80(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public static bp80 a(View view) {
        int i = R.id.active_rain_text;
        if (((TextView) h5e.a(R.id.active_rain_text, view)) != null) {
            i = R.id.black_arrow;
            if (((ImageView) h5e.a(R.id.black_arrow, view)) != null) {
                i = R.id.claim_rain;
                if (((TextView) h5e.a(R.id.claim_rain, view)) != null) {
                    i = R.id.layout_claim_button;
                    if (((ConstraintLayout) h5e.a(R.id.layout_claim_button, view)) != null) {
                        i = R.id.rain_icon_cloud;
                        if (((ImageView) h5e.a(R.id.rain_icon_cloud, view)) != null) {
                            i = R.id.rain_icon_half_cloud;
                            if (((ImageView) h5e.a(R.id.rain_icon_half_cloud, view)) != null) {
                                i = R.id.upcoming_rain_text;
                                if (((TextView) h5e.a(R.id.upcoming_rain_text, view)) != null) {
                                    return new bp80((ConstraintLayout) view);
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
