package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class y5h extends RecyclerView.d0 {
    public static final /* synthetic */ int b = 0;
    public final xih a;

    public static final class a {
        public static y5h a(ViewGroup viewGroup) {
            View viewA = u540.a(viewGroup, R.layout.fh_bethistory_more, viewGroup, false);
            TextView textView = (TextView) h5e.a(R.id.viewmore, viewA);
            if (textView != null) {
                return new y5h(new xih((ConstraintLayout) viewA, textView));
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.viewmore)));
            return null;
        }
    }

    public y5h(xih xihVar) {
        super(xihVar.a);
        this.a = xihVar;
    }
}
