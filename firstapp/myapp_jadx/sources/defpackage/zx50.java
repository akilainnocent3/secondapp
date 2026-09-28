package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.n;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.remote.models.TopBets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zx50 extends RecyclerView.f<a> {
    public final Context a;
    public final List<TopBets> b;

    public static final class a extends RecyclerView.d0 {
        public final LinearLayout a;
        public final TextView b;
        public final ImageView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.top_most_layout);
            viewFindViewById.getClass();
            this.a = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_name);
            viewFindViewById2.getClass();
            this.b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.account_icon);
            viewFindViewById3.getClass();
            this.c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tv_bet_win);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.tv_coeff);
            viewFindViewById5.getClass();
            this.e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.tv_win);
            viewFindViewById6.getClass();
            this.f = (TextView) viewFindViewById6;
        }
    }

    public zx50(Context context, ArrayList arrayList) {
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
        list.getClass();
        List<TopBets> list2 = this.b;
        n.d dVarA = list2 != null ? n.a(new o1g0(list2, list), true) : null;
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
        String strL;
        TopBets topBets;
        TopBets topBets2;
        TopBets topBets3;
        TopBets topBets4;
        a aVar = (a) d0Var;
        aVar.getClass();
        try {
            Context context = this.a;
            if (context != null) {
                ImageView imageView = aVar.c;
                TextView textView = aVar.f;
                TextView textView2 = aVar.e;
                TextView textView3 = aVar.b;
                imageView.setVisibility(8);
                String userId = null;
                List<TopBets> list = this.b;
                textView3.setText((list == null || (topBets4 = list.get(i)) == null) ? null : topBets4.getNickName());
                TextView textView4 = aVar.d;
                if (list == null || (topBets3 = list.get(i)) == null) {
                    strL = null;
                } else {
                    double stakeAmount = topBets3.getStakeAmount();
                    TreeMap treeMap = pw.a;
                    strL = pw.l(stakeAmount);
                }
                textView4.setText(strL);
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 1.5f, textView3.getContext().getResources().getDisplayMetrics());
                    textView3.setLayoutParams(marginLayoutParams);
                }
                if (((list == null || (topBets2 = list.get(i)) == null) ? null : topBets2.getCashoutCoefficient()) == null || list.get(i).getCashoutCoefficient().length() <= 0) {
                    textView2.setText("--");
                    textView.setText("0");
                } else {
                    textView2.setText(context.getString(R.string.coeff, list.get(i).getCashoutCoefficient()));
                    double payoutAmount = list.get(i).getPayoutAmount();
                    TreeMap treeMap2 = pw.a;
                    textView.setText(pw.l(payoutAmount));
                }
                if (list != null && (topBets = list.get(i)) != null) {
                    userId = topBets.getUserId();
                }
                boolean zG = Intrinsics.g(userId, SportyGamesManager.getInstance().getUserId());
                LinearLayout linearLayout = aVar.a;
                if (zG) {
                    linearLayout.setBackground(context.getDrawable(R.drawable.sh_bg_user_bets));
                } else {
                    linearLayout.setBackground(context.getDrawable(R.drawable.sh_bg_all_bets_v2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.sh_item_all_bets_v2, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
