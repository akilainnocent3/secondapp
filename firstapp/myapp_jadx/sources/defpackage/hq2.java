package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.model.response.BetHistoryItem;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hq2 extends RecyclerView.f<a> {
    public final ArrayList<BetHistoryItem.IndividualBetDetails> a;
    public final Context b;
    public iq2 c;

    public final class a extends RecyclerView.d0 {
        public final iq2 a;
        public final /* synthetic */ hq2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hq2 hq2Var, iq2 iq2Var) {
            super(iq2Var.a);
            iq2Var.getClass();
            this.b = hq2Var;
            this.a = iq2Var;
        }
    }

    public hq2(Context context, ArrayList arrayList) {
        context.getClass();
        this.a = arrayList;
        this.b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList<BetHistoryItem.IndividualBetDetails> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        ArrayList<BetHistoryItem.IndividualBetDetails> arrayList = this.a;
        BetHistoryItem.IndividualBetDetails individualBetDetails = arrayList != null ? arrayList.get(i) : null;
        if (individualBetDetails != null) {
            pfd pfdVar = fse.a;
            j1b j1bVarA = w5b.a(gku.a);
            hq2 hq2Var = aVar.b;
            ej5.c(j1bVarA, null, null, new gq2(hq2Var, aVar, null), 3);
            iq2 iq2Var = aVar.a;
            iq2Var.d.setText("x" + ((int) individualBetDetails.getBetConfig().getPayout()));
            iq2Var.d.setTextColor(hq2Var.b.getColor(individualBetDetails.getBetConfig().getColourCode()));
            ConstraintLayout constraintLayout = iq2Var.c;
            String strValueOf = String.valueOf(individualBetDetails.getBetConfig().getColourCode());
            strValueOf.getClass();
            int i2 = Integer.parseInt(strValueOf);
            if (i2 != R.color.white) {
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(constraintLayout.getContext().getColor(i2)));
            }
            TextView textView = iq2Var.b;
            TreeMap treeMap = pw.a;
            textView.setText(pw.d(individualBetDetails.getStakeAmount()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.bet_history_config_item, viewGroup, false);
        int i2 = R.id.coeff;
        TextView textView = (TextView) h5e.a(R.id.coeff, viewA);
        if (textView != null) {
            i2 = R.id.parentLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.parentLayout, viewA);
            if (constraintLayout != null) {
                i2 = R.id.payout_amount;
                TextView textView2 = (TextView) h5e.a(R.id.payout_amount, viewA);
                if (textView2 != null) {
                    this.c = new iq2((ConstraintLayout) viewA, textView, constraintLayout, textView2);
                    iq2 iq2Var = this.c;
                    if (iq2Var != null) {
                        return new a(this, iq2Var);
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
