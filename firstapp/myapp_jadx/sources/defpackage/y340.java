package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class y340 extends ixs<b440> {
    public final w440 b;
    public final x440 c;

    public y340(w440 w440Var, x440 x440Var) {
        this.a = new hxs.c(false);
        this.b = w440Var;
        this.c = x440Var;
    }

    @Override // defpackage.ixs
    public final void i(RecyclerView.d0 d0Var, hxs hxsVar) {
        b440 b440Var = (b440) d0Var;
        b440Var.getClass();
        hxsVar.getClass();
        lgd0 lgd0Var = b440Var.a;
        if (hxsVar.equals(hxs.b.b)) {
            FrameLayout frameLayout = lgd0Var.a;
            TextView textView = lgd0Var.c;
            frameLayout.getClass();
            frameLayout.setVisibility(0);
            lgd0Var.d.setVisibility(0);
            textView.setVisibility(8);
            textView.setClickable(false);
            lgd0Var.e.setVisibility(8);
            return;
        }
        if (!(hxsVar instanceof hxs.a)) {
            if (!(hxsVar instanceof hxs.c)) {
                uhc.a();
                return;
            }
            FrameLayout frameLayout2 = lgd0Var.a;
            frameLayout2.getClass();
            frameLayout2.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = lgd0Var.a;
        RelativeLayout relativeLayout = lgd0Var.e;
        TextView textView2 = lgd0Var.c;
        frameLayout3.getClass();
        frameLayout3.setVisibility(0);
        boolean z = ((hxs.a) hxsVar).b instanceof wmy;
        ProgressBar progressBar = lgd0Var.d;
        if (z) {
            progressBar.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setClickable(false);
            relativeLayout.setVisibility(0);
            Context context = lgd0Var.a.getContext();
            context.getClass();
            textView2.setText(sn5.b(context, R.string.bet_history__show_only_tickets_in_the_last_6_months, new Object[0]));
            return;
        }
        progressBar.setVisibility(8);
        textView2.setVisibility(0);
        textView2.setClickable(true);
        relativeLayout.setVisibility(8);
        Context context2 = lgd0Var.a.getContext();
        context2.getClass();
        textView2.setText(sn5.b(context2, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
    }

    @Override // defpackage.ixs
    public final b440 j(ViewGroup viewGroup, hxs hxsVar) {
        viewGroup.getClass();
        hxsVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_bets_load_more_item, viewGroup, false);
        int i = R.id.diver_line;
        View viewA = h5e.a(R.id.diver_line, viewInflate);
        if (viewA != null) {
            i = R.id.results_load_more;
            TextView textView = (TextView) h5e.a(R.id.results_load_more, viewInflate);
            if (textView != null) {
                i = R.id.results_loading_progress;
                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.results_loading_progress, viewInflate);
                if (progressBar != null) {
                    i = R.id.view_older_order;
                    RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.view_older_order, viewInflate);
                    if (relativeLayout != null) {
                        i = R.id.view_older_order_text;
                        if (((TextView) h5e.a(R.id.view_older_order_text, viewInflate)) != null) {
                            return new b440(new lgd0((FrameLayout) viewInflate, viewA, textView, progressBar, relativeLayout), this.b, this.c);
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
