package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pingpong.remote.models.Coefficients;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class wy50 extends RecyclerView.f<a> {
    public final Context a;
    public final List<Coefficients> b;
    public final y720 c;
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

    public wy50(Context context, List<Coefficients> list, y720 y720Var, ibs ibsVar, int i) {
        context.getClass();
        list.getClass();
        y720Var.getClass();
        ibsVar.getClass();
        this.a = context;
        this.b = list;
        this.c = y720Var;
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
        LinearLayout linearLayout = aVar.b;
        Map<Double, Integer> map = k18.a;
        linearLayout.setBackgroundTintList(th50.a(k18.a(list.get(i).getHouseCoefficient()), context.getTheme(), context.getResources()));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: vy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                wy50 wy50Var = this.a;
                new dt80(wy50Var.a, wy50Var.c, wy50Var.d, String.valueOf(wy50Var.b.get(i2).getId())).a();
                wz.a("FairnessClicked", "Sporty Hero", "Round History Dailog");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.sh_round_history_item, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
