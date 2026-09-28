package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class g260 implements g6i0 {
    public final CardView a;
    public final CardView b;
    public final TextView c;

    public g260(CardView cardView, CardView cardView2, TextView textView) {
        this.a = cardView;
        this.b = cardView2;
        this.c = textView;
    }

    public static g260 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.rush_bethistory_archive_viewmore, viewGroup, false);
        CardView cardView = (CardView) viewInflate;
        TextView textView = (TextView) h5e.a(R.id.archive_viewmore_btn, viewInflate);
        if (textView != null) {
            return new g260(cardView, cardView, textView);
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.archive_viewmore_btn)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
