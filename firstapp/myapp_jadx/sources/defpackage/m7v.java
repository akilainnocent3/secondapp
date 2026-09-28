package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.cashoutphase3.CashOutTeamInfoView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class m7v extends gi6 {
    public final ghd0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public m7v(ghd0 ghd0Var, ArrayList arrayList, vh6 vh6Var) {
        arrayList.getClass();
        RelativeLayout relativeLayout = ghd0Var.a;
        relativeLayout.getClass();
        super(relativeLayout, arrayList);
        this.b = ghd0Var;
        TextView textView = ghd0Var.c;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_drop_down_green_24dp), (Drawable) null);
        textView.setOnClickListener(new k7v(new cq40(), vh6Var));
    }

    @Override // defpackage.gi6
    public final void a(int i) {
        pl6 pl6VarB = b(i);
        if (pl6VarB == null) {
            return;
        }
        ghd0 ghd0Var = this.b;
        LinearLayout linearLayout = ghd0Var.b;
        TextView textView = ghd0Var.d;
        linearLayout.removeAllViews();
        for (Pair<? extends CharSequence, ? extends CharSequence> pair : ((LinkedHashMap) pl6VarB.b(this.itemView.getContext())).values()) {
            Context context = this.itemView.getContext();
            context.getClass();
            CashOutTeamInfoView cashOutTeamInfoView = new CashOutTeamInfoView(context, null, 6, 0);
            pair.getClass();
            cashOutTeamInfoView.setData(pair);
            ghd0Var.b.addView(cashOutTeamInfoView);
        }
        ghd0Var.c.setTag(pl6VarB);
        int i2 = pl6VarB.f;
        if (i2 <= 0) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        if (i2 > 1) {
            Context context2 = textView.getContext();
            context2.getClass();
            textView.setText(sn5.b(context2, R.string.bet_history__and_vcount_other_matches, String.valueOf(i2)));
        } else {
            Context context3 = textView.getContext();
            context3.getClass();
            textView.setText(sn5.b(context3, R.string.bet_history__and_1_other_match, new Object[0]));
        }
    }
}
