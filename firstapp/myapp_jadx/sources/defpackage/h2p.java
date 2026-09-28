package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class h2p implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;

    public h2p(ConstraintLayout constraintLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static h2p a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_booking_code_single_bb_outcome, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        TextView textView = (TextView) h5e.a(R.id.tvOutcomeDesc, viewInflate);
        if (textView != null) {
            return new h2p(constraintLayout, textView);
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvOutcomeDesc)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
