package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.rush.model.response.BetHistoryItem;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gp80 extends mp2 {
    public Context e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final Context context = this.e;
        d0Var.getClass();
        if (!(d0Var instanceof vs2)) {
            if (d0Var instanceof f260) {
                final f260 f260Var = (f260) d0Var;
                i260 i260Var = f260Var.a;
                AppCompatButton appCompatButton = i260Var.b;
                AppCompatButton appCompatButton2 = i260Var.b;
                appCompatButton.setEnabled(true);
                appCompatButton2.setAlpha(1.0f);
                appCompatButton2.setClickable(true);
                op5 op5Var = op5.a;
                String string = context.getString(R.string.more_cms);
                appCompatButton2.setText(at6.a(string, context, R.string.more, op5Var, string));
                appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: ep80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.l();
                        i260 i260Var2 = f260Var.a;
                        i260Var2.b.setAlpha(0.5f);
                        i260Var2.b.setClickable(false);
                        i260Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            if (d0Var instanceof e260) {
                final e260 e260Var = (e260) d0Var;
                g260 g260Var = e260Var.a;
                CardView cardView = g260Var.b;
                CardView cardView2 = g260Var.b;
                cardView.setEnabled(true);
                cardView2.setAlpha(1.0f);
                cardView2.setClickable(true);
                TextView textView = g260Var.c;
                op5 op5Var2 = op5.a;
                String string2 = context.getString(R.string.more_cms);
                textView.setText(at6.a(string2, context, R.string.more, op5Var2, string2));
                cardView2.setOnClickListener(new View.OnClickListener() { // from class: fp80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                        g260 g260Var2 = e260Var.a;
                        g260Var2.b.setAlpha(0.5f);
                        g260Var2.b.setClickable(false);
                        g260Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            return;
        }
        ipc item = getItem(i);
        item.getClass();
        BetHistoryItem betHistoryItem = ((ipc.j) item).a;
        final vs2 vs2Var = (vs2) d0Var;
        h260 h260Var = vs2Var.a;
        betHistoryItem.getClass();
        context.getClass();
        vs2Var.b = betHistoryItem;
        h260Var.d.setOnClickListener(new View.OnClickListener() { // from class: xr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wz.a("BetHistoryDetailClicked", "Rush", new String[0]);
                vs2 vs2Var2 = vs2Var;
                BetHistoryItem betHistoryItem2 = vs2Var2.b;
                if (betHistoryItem2 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                BetHistoryItem betHistoryItem3 = vs2Var2.b;
                if (betHistoryItem3 != null) {
                    vs2Var2.a(betHistoryItem3, context);
                } else {
                    Intrinsics.n("dataItem");
                    throw null;
                }
            }
        });
        TextView textView2 = h260Var.J;
        AppCompatImageView appCompatImageView = h260Var.R;
        TextView textView3 = h260Var.H;
        String createdAt = betHistoryItem.getCreatedAt();
        if (createdAt == null) {
            createdAt = "";
        }
        textView2.setText(kt2.d(createdAt));
        TextView textView4 = h260Var.G;
        Double stakeAmount = betHistoryItem.getStakeAmount();
        textView4.setText(kt2.b(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
        Double payoutAmount = betHistoryItem.getPayoutAmount();
        if ((payoutAmount != null ? payoutAmount.doubleValue() : 0.0d) <= 0.0d) {
            textView3.setText("Lost");
            appCompatImageView.setVisibility(8);
            op5.r(op5.a, b.f(textView3), null, 4);
        } else {
            appCompatImageView.setVisibility(0);
            Double payoutAmount2 = betHistoryItem.getPayoutAmount();
            textView3.setText(kt2.b(payoutAmount2 != null ? payoutAmount2.doubleValue() : 0.0d));
        }
        AppCompatImageView appCompatImageView2 = h260Var.y;
        Double giftAmount = betHistoryItem.getGiftAmount();
        appCompatImageView2.setVisibility((giftAmount != null ? giftAmount.doubleValue() : 0.0d) <= 0.0d ? 8 : 0);
        vs2Var.a(betHistoryItem, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = f260.b;
            return new f260(i260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i == 2) {
            int i3 = e260.b;
            return new e260(g260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i != 6) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = vs2.c;
        return new vs2(h260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
