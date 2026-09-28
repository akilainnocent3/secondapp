package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class rid0 implements g6i0 {
    public final ConstraintLayout a;
    public final View b;

    public rid0(ConstraintLayout constraintLayout, View view) {
        this.a = constraintLayout;
        this.b = view;
    }

    public static rid0 a(View view) {
        View viewA = h5e.a(R.id.shimmer_item, view);
        if (viewA != null) {
            return new rid0((ConstraintLayout) view, viewA);
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.shimmer_item)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
