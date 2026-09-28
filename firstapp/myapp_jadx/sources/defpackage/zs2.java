package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class zs2 extends RecyclerView.d0 {
    public static final /* synthetic */ int b = 0;
    public final uo40 a;

    public static final class a {
        public static zs2 a(ViewGroup viewGroup) {
            View viewA = u540.a(viewGroup, R.layout.redblack_bethistory_viewmore, viewGroup, false);
            TextView textView = (TextView) h5e.a(R.id.viewmore, viewA);
            if (textView != null) {
                return new zs2(new uo40((CardView) viewA, textView));
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.viewmore)));
            return null;
        }
    }

    public zs2(uo40 uo40Var) {
        super(uo40Var.a);
        this.a = uo40Var;
    }
}
