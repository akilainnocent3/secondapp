package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.n;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pingpong.remote.models.TopBets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class yx50 extends RecyclerView.f<a> {
    public final Context a;
    public final List<TopBets> b;

    public static final class a extends RecyclerView.d0 {
        public final TextView a;
        public final ImageView b;
        public final TextView c;
        public final TextView d;
        public final ConstraintLayout e;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.name);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.you_image);
            viewFindViewById2.getClass();
            this.b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.bet);
            viewFindViewById3.getClass();
            this.c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.coeff_item);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.top_bets_layout);
            viewFindViewById5.getClass();
            this.e = (ConstraintLayout) viewFindViewById5;
        }
    }

    public yx50(Context context, ArrayList arrayList) {
        context.getClass();
        this.a = context;
        this.b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<TopBets> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void i(List<TopBets> list) {
        n.d dVarA;
        list.getClass();
        List<TopBets> list2 = this.b;
        if (list2 != null) {
            try {
                dVarA = n.a(new p1g0(list2, list), true);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            dVarA = null;
        }
        if (list2 != null) {
            list2.clear();
        }
        if (list2 != null) {
            list2.addAll(list);
        }
        if (dVarA != null) {
            dVarA.b(new b(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        TopBets topBets;
        String string;
        TopBets topBets2;
        TopBets topBets3;
        TopBets topBets4;
        a aVar = (a) d0Var;
        aVar.getClass();
        ImageView imageView = aVar.b;
        TextView textView = aVar.a;
        try {
            String userId = SportyGamesManager.getInstance().getUserId();
            String cashoutCoefficient = null;
            List<TopBets> list = this.b;
            boolean zEquals = userId.equals((list == null || (topBets4 = list.get(i)) == null) ? null : topBets4.getUserId());
            Context context = this.a;
            if (zEquals) {
                op5 op5Var = op5.a;
                String string2 = context.getString(R.string.you_text_cms);
                string2.getClass();
                String string3 = context.getString(R.string.you);
                string3.getClass();
                op5Var.getClass();
                textView.setText(op5.b(string2, string3, null));
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                textView.setText((list == null || (topBets = list.get(i)) == null) ? null : topBets.getNickName());
            }
            TextView textView2 = aVar.c;
            ConstraintLayout constraintLayout = aVar.e;
            TextView textView3 = aVar.d;
            if (list == null || (topBets3 = list.get(i)) == null) {
                string = null;
            } else {
                double stakeAmount = topBets3.getStakeAmount();
                TreeMap treeMap = pw.a;
                string = context.getString(R.string.round_bet, pw.l(stakeAmount));
            }
            textView2.setText(string);
            if (list != null && (topBets2 = list.get(i)) != null) {
                cashoutCoefficient = topBets2.getCashoutCoefficient();
            }
            if (cashoutCoefficient == null || list.get(i).getCashoutCoefficient().length() <= 0) {
                textView.setTextColor(context.getColor(R.color.pp_color_back_red));
                textView3.setTextColor(context.getColor(R.color.pp_color_back_red));
                textView2.setTextColor(context.getColor(R.color.pp_color_back_red));
                constraintLayout.setBackground(context.getDrawable(R.drawable.pp_top_bets));
                textView3.setVisibility(8);
                return;
            }
            textView3.setVisibility(0);
            constraintLayout.setBackground(context.getDrawable(R.drawable.pp_top_bets_green));
            textView3.setText(context.getString(R.string.coeff, new DecimalFormat("0.##").format(Double.parseDouble(list.get(i).getCashoutCoefficient()))));
            double payoutAmount = list.get(i).getPayoutAmount();
            TreeMap treeMap2 = pw.a;
            textView2.setText(context.getString(R.string.round_bet_cashout, pw.l(list.get(i).getStakeAmount()), pw.l(payoutAmount)));
            textView3.setBackgroundTintList(th50.a(k18.a(Double.parseDouble(list.get(i).getCashoutCoefficient())), context.getTheme(), context.getResources()));
            textView.setTextColor(context.getColor(R.color.white));
            textView3.setTextColor(context.getColor(R.color.white));
            textView2.setTextColor(context.getColor(R.color.white));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.pp_round_bet_item, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
