package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class ap80 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;

    public ap80(ConstraintLayout constraintLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static ap80 a(View view) {
        int i = R.id.rain_claim_result;
        TextView textView = (TextView) h5e.a(R.id.rain_claim_result, view);
        if (textView != null) {
            i = R.id.rain_icon_half_cloud;
            if (((ImageView) h5e.a(R.id.rain_icon_half_cloud, view)) != null) {
                return new ap80((ConstraintLayout) view, textView);
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
