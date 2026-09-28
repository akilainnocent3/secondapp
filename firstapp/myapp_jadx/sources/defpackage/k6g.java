package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.redblack.remote.models.EndRoundStatsItem;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k6g extends RecyclerView.f<l6g> {
    public final ArrayList a;

    public k6g(e eVar, ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String strGroup;
        l6g l6gVar = (l6g) d0Var;
        l6gVar.getClass();
        EndRoundStatsItem endRoundStatsItem = (EndRoundStatsItem) this.a.get(i);
        wo40 wo40Var = l6gVar.a;
        endRoundStatsItem.getClass();
        int i2 = 0;
        int i3 = 8;
        if (Intrinsics.g(endRoundStatsItem.getStatKey(), "note")) {
            i3 = 0;
            i2 = 8;
        } else {
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(2);
            decimalFormat.setDecimalFormatSymbols(SportyGamesManager.decimalFormatSymbols);
            wo40Var.e.setText(endRoundStatsItem.getStatKey());
            wo40Var.b.setText(decimalFormat.format(Double.parseDouble(endRoundStatsItem.getStatValue())));
        }
        HashMap map = new HashMap();
        op5 op5Var = op5.a;
        String statKey = endRoundStatsItem.getStatKey();
        Pattern patternCompile = Pattern.compile("\\(([^}]+)\\)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(statKey);
        if (matcher.find()) {
            strGroup = matcher.group(1);
            strGroup.getClass();
        } else {
            strGroup = "";
        }
        op5Var.getClass();
        map.put("{currency}", op5.i(strGroup));
        TextView textView = wo40Var.e;
        TextView textView2 = wo40Var.c;
        op5.q(b.f(textView, textView2), map, Boolean.TRUE);
        wo40Var.e.setVisibility(i2);
        wo40Var.b.setVisibility(i2);
        wo40Var.d.setVisibility(i2);
        textView2.setVisibility(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = l6g.b;
        View viewA = dzc.a(viewGroup, R.layout.redblack_end_round_stats_listitem, viewGroup, false);
        int i3 = R.id.redblack_stats_amt;
        TextView textView = (TextView) h5e.a(R.id.redblack_stats_amt, viewA);
        if (textView != null) {
            i3 = R.id.redblack_stats_dialog_footer;
            TextView textView2 = (TextView) h5e.a(R.id.redblack_stats_dialog_footer, viewA);
            if (textView2 != null) {
                i3 = R.id.redblack_stats_star;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.redblack_stats_star, viewA);
                if (appCompatImageView != null) {
                    i3 = R.id.redblack_stats_txt;
                    TextView textView3 = (TextView) h5e.a(R.id.redblack_stats_txt, viewA);
                    if (textView3 != null) {
                        return new l6g(new wo40((LinearLayoutCompat) viewA, textView, textView2, appCompatImageView, textView3));
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
        return null;
    }
}
