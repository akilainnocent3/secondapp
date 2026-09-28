package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class tp2 extends RecyclerView.d0 {
    public static final /* synthetic */ int b = 0;
    public final so40 a;

    public static final class a {
        public static tp2 a(ViewGroup viewGroup) {
            View viewA = u540.a(viewGroup, R.layout.redblack_bethistory_archive_viewmore, viewGroup, false);
            CardView cardView = (CardView) viewA;
            TextView textView = (TextView) h5e.a(R.id.archive_viewmore_btn, viewA);
            if (textView != null) {
                return new tp2(new so40(cardView, cardView, textView));
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.archive_viewmore_btn)));
            return null;
        }
    }

    public tp2(so40 so40Var) {
        super(so40Var.a);
        this.a = so40Var;
    }
}
