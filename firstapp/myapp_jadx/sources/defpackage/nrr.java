package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nrr implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;

    public nrr(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
    }

    public static nrr a(View view) {
        int i = R.id.bore_draw_icon;
        if (((AppCompatImageView) h5e.a(R.id.bore_draw_icon, view)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            if (((TextView) h5e.a(R.id.bore_draw_title, view)) != null) {
                return new nrr(constraintLayout, constraintLayout);
            }
            i = R.id.bore_draw_title;
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
