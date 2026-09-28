package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pn80 extends mp2 {
    public e e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final e eVar = this.e;
        d0Var.getClass();
        if (d0Var instanceof rs2) {
            ipc item = getItem(i);
            item.getClass();
            BetHistoryItem betHistoryItem = ((ipc.c) item).a;
            final rs2 rs2Var = (rs2) d0Var;
            h260 h260Var = rs2Var.a;
            betHistoryItem.getClass();
            eVar.getClass();
            rs2Var.b = betHistoryItem;
            h260Var.d.setBackgroundResource(R.drawable.crash_initiated_details_button);
            h260Var.b.setBackgroundColor(eVar.getColor(R.color.color_180e15));
            h260Var.d.setOnClickListener(new View.OnClickListener() { // from class: hr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wz.a(LGxrN.rJiFjXFGNQsHf, "Rush", new String[0]);
                    rs2 rs2Var2 = rs2Var;
                    BetHistoryItem betHistoryItem2 = rs2Var2.b;
                    if (betHistoryItem2 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                    BetHistoryItem betHistoryItem3 = rs2Var2.b;
                    if (betHistoryItem3 != null) {
                        rs2Var2.a(betHistoryItem3, eVar);
                    } else {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                }
            });
            TextView textView = h260Var.J;
            AppCompatImageView appCompatImageView = h260Var.R;
            TextView textView2 = h260Var.H;
            String createdAt = betHistoryItem.getCreatedAt();
            if (createdAt == null) {
                createdAt = "";
            }
            textView.setText(kt2.d(createdAt));
            TextView textView3 = h260Var.G;
            Double stakeAmount = betHistoryItem.getStakeAmount();
            textView3.setText(kt2.b(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
            Double payoutAmount = betHistoryItem.getPayoutAmount();
            if ((payoutAmount != null ? payoutAmount.doubleValue() : 0.0d) <= 0.0d) {
                textView2.setText("Lost");
                appCompatImageView.setVisibility(8);
                op5.r(op5.a, b.f(textView2), null, 4);
            } else {
                appCompatImageView.setVisibility(0);
                Double payoutAmount2 = betHistoryItem.getPayoutAmount();
                textView2.setText(kt2.b(payoutAmount2 != null ? payoutAmount2.doubleValue() : 0.0d));
            }
            AppCompatImageView appCompatImageView2 = h260Var.y;
            Double giftAmount = betHistoryItem.getGiftAmount();
            appCompatImageView2.setVisibility((giftAmount != null ? giftAmount.doubleValue() : 0.0d) <= 0.0d ? 8 : 0);
            rs2Var.a(betHistoryItem, eVar);
            return;
        }
        if (d0Var instanceof khb) {
            final khb khbVar = (khb) d0Var;
            i260 i260Var = khbVar.a;
            AppCompatButton appCompatButton = i260Var.b;
            AppCompatButton appCompatButton2 = i260Var.b;
            appCompatButton.setEnabled(true);
            appCompatButton2.setAlpha(1.0f);
            appCompatButton2.setClickable(true);
            op5 op5Var = op5.a;
            String string = eVar.getString(R.string.more_cms);
            string.getClass();
            String string2 = eVar.getString(R.string.more);
            string2.getClass();
            appCompatButton2.setText(op5.c(op5Var, string, string2));
            appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: nn80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l();
                    i260 i260Var2 = khbVar.a;
                    i260Var2.b.setAlpha(0.5f);
                    i260Var2.b.setClickable(false);
                    i260Var2.b.setEnabled(false);
                }
            });
            return;
        }
        if (d0Var instanceof jhb) {
            final jhb jhbVar = (jhb) d0Var;
            g260 g260Var = jhbVar.a;
            CardView cardView = g260Var.b;
            CardView cardView2 = g260Var.b;
            cardView.setEnabled(true);
            cardView2.setAlpha(1.0f);
            cardView2.setClickable(true);
            TextView textView4 = g260Var.c;
            op5 op5Var2 = op5.a;
            String string3 = eVar.getString(R.string.more_cms);
            string3.getClass();
            String string4 = eVar.getString(R.string.more);
            string4.getClass();
            textView4.setText(op5.c(op5Var2, string3, string4));
            cardView2.setOnClickListener(new View.OnClickListener() { // from class: on80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.k();
                    g260 g260Var2 = jhbVar.a;
                    g260Var2.b.setAlpha(0.5f);
                    g260Var2.b.setClickable(false);
                    g260Var2.b.setEnabled(false);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = khb.b;
            return new khb(i260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i == 2) {
            int i3 = jhb.b;
            return new jhb(g260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i != 13) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = rs2.c;
        return new rs2(h260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
