package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zaz extends x<fbz, z72> {

    public static final class a extends n.e<fbz> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(fbz fbzVar, fbz fbzVar2) {
            fbz fbzVar3 = fbzVar;
            fbz fbzVar4 = fbzVar2;
            fbzVar3.getClass();
            fbzVar4.getClass();
            return Intrinsics.g(fbzVar3, fbzVar4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(fbz fbzVar, fbz fbzVar2) {
            fbz fbzVar3 = fbzVar;
            fbz fbzVar4 = fbzVar2;
            fbzVar3.getClass();
            fbzVar4.getClass();
            return Intrinsics.g(fbzVar3.b, fbzVar4.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        z72 z72Var = (z72) d0Var;
        z72Var.getClass();
        fbz item = getItem(i);
        item.getClass();
        z72Var.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == -1) {
            View viewA = dzc.a(viewGroup, R.layout.outright_header_item, viewGroup, false);
            int i2 = R.id.market_status;
            TextView textView = (TextView) h5e.a(R.id.market_status, viewA);
            if (textView != null) {
                i2 = R.id.market_status_date;
                TextView textView2 = (TextView) h5e.a(R.id.market_status_date, viewA);
                if (textView2 != null) {
                    return new ebz(new dbz((ConstraintLayout) viewA, textView, textView2));
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
            return null;
        }
        View viewA2 = dzc.a(viewGroup, R.layout.outright_item, viewGroup, false);
        int i3 = R.id.outcome;
        OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.outcome, viewA2);
        if (outcomeButton != null) {
            i3 = R.id.outcome_title;
            TextView textView3 = (TextView) h5e.a(R.id.outcome_title, viewA2);
            if (textView3 != null) {
                return new nbz(new gbz((ConstraintLayout) viewA2, outcomeButton, textView3));
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i3)));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return i;
    }
}
