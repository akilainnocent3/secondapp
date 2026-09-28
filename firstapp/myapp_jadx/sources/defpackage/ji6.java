package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ji6 extends gi6 {
    public final rgd0 b;
    public boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ji6(rgd0 rgd0Var, ArrayList arrayList) {
        ConstraintLayout constraintLayout = rgd0Var.a;
        constraintLayout.getClass();
        super(constraintLayout, arrayList);
        this.b = rgd0Var;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ii6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ji6 ji6Var = this.a;
                boolean z = ji6Var.c;
                ji6Var.c = !z;
                rgd0 rgd0Var2 = ji6Var.b;
                rgd0Var2.b.setVisibility(!z ? 0 : 8);
                rgd0Var2.d.setCompoundDrawablesRelativeWithIntrinsicBounds(ji6Var.c ? R.drawable.ic_arrow_up_1 : R.drawable.ic_arrow_down_1, 0, 0, 0);
            }
        };
        rgd0Var.d.setOnClickListener(onClickListener);
        rgd0Var.c.setOnClickListener(onClickListener);
    }

    @Override // defpackage.gi6
    public final void a(int i) {
        String string;
        List<BetSelection> list;
        pl6 pl6VarB = b(i);
        if (pl6VarB == null) {
            return;
        }
        rgd0 rgd0Var = this.b;
        Context context = rgd0Var.a.getContext();
        Bet bet = pl6VarB.a;
        TextView textView = rgd0Var.c;
        if (bet == null || !bet.isCashable) {
            string = context.getString(R.string.cashout__cashout_unavailable);
        } else {
            String str = pl6VarB.C;
            string = (str == null || str.length() == 0) ? context.getString(R.string.common_functions__loading) : inm.a("lite: ", pl6VarB.C);
        }
        textView.setText(string);
        TextView textView2 = rgd0Var.b;
        StringBuilder sb = new StringBuilder(inm.a("betId: ", bet != null ? bet.id : null));
        if (bet != null && (list = bet.selections) != null) {
            for (BetSelection betSelection : list) {
                String str2 = betSelection.eventId;
                int i2 = betSelection.eventStatus;
                int i3 = betSelection.marketStatus;
                int i4 = betSelection.status;
                StringBuilder sbA = ml5.a(i2, "\nevent=", str2, "  eventStatus=", "  market=");
                sbA.append(i3);
                sbA.append("  selectionStatus=");
                sbA.append(i4);
                sb.append(sbA.toString());
            }
        }
        textView2.setText(sb.toString());
    }
}
