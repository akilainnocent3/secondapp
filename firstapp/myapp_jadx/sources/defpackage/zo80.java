package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class zo80 implements g6i0 {
    public final ConstraintLayout a;

    public zo80(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public static zo80 a(View view) {
        int i = R.id.image1;
        if (((ImageView) h5e.a(R.id.image1, view)) != null) {
            i = R.id.image2;
            if (((ImageView) h5e.a(R.id.image2, view)) != null) {
                i = R.id.rain_claim_result;
                if (((TextView) h5e.a(R.id.rain_claim_result, view)) != null) {
                    return new zo80((ConstraintLayout) view);
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
