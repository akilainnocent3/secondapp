package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.Coefficients;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class xy50 extends RecyclerView.f<a> {
    public final Context a;
    public final List<Coefficients> b;
    public final c28 c;
    public final ibs d;
    public final int e;

    public static final class a extends RecyclerView.d0 {
        public final TextView a;
        public final LinearLayout b;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.coefficient);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.coefficient_layout);
            viewFindViewById2.getClass();
            this.b = (LinearLayout) viewFindViewById2;
        }
    }

    public xy50(Context context, List<Coefficients> list, c28 c28Var, ibs ibsVar, int i) {
        context.getClass();
        list.getClass();
        c28Var.getClass();
        ibsVar.getClass();
        this.a = context;
        this.b = list;
        this.c = c28Var;
        this.d = ibsVar;
        this.e = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<Coefficients> list = this.b;
        if (!list.isEmpty()) {
            int size = list.size();
            int i = this.e;
            if (size > i) {
                return i;
            }
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        TextView textView = aVar.a;
        List<Coefficients> list = this.b;
        Object[] objArr = {list.get(i).getHouseCoefficientStr()};
        Context context = this.a;
        textView.setText(context.getString(R.string.coeff, objArr));
        Map<Double, Integer> map = m18.a;
        textView.setTextColor(th50.a(m18.b(list.get(i).getHouseCoefficient()), context.getTheme(), context.getResources()));
        aVar.b.setOnClickListener(new View.OnClickListener() { // from class: uy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                xy50 xy50Var = this.a;
                new et80(xy50Var.a, xy50Var.c, xy50Var.d, String.valueOf(xy50Var.b.get(i2).getId())).a();
                wz.a("FairnessClicked", "Sporty Hero", "Round History Dailog");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.sh_round_history_item_v2, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
