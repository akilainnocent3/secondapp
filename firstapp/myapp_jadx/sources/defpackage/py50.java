package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pingpong.remote.models.Coefficients;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class py50 extends RecyclerView.f<a> {
    public final Context a;
    public final List<Coefficients> b;
    public final y720 c;
    public final ibs d;
    public boolean e;

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

    public py50(Context context, ArrayList arrayList, y720 y720Var, ibs ibsVar) {
        arrayList.getClass();
        y720Var.getClass();
        ibsVar.getClass();
        this.a = context;
        this.b = arrayList;
        this.c = y720Var;
        this.d = ibsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        final a aVar = (a) d0Var;
        aVar.getClass();
        LinearLayout linearLayout = aVar.b;
        if (this.e) {
            if (i == 0) {
                linearLayout.setAnimation(AnimationUtils.loadAnimation(linearLayout.getContext(), R.anim.animation_trans_alpha));
            } else {
                linearLayout.setAnimation(AnimationUtils.loadAnimation(linearLayout.getContext(), R.anim.animation_translate));
            }
        }
        TextView textView = aVar.a;
        List<Coefficients> list = this.b;
        r97.a(textView, list.get(i).getHouseCoefficientStr(), "x");
        Map<Double, Integer> map = k18.a;
        linearLayout.setBackgroundTintList(o0b.b(this.a, k18.a(list.get(i).getHouseCoefficient())));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: oy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                py50 py50Var = this.a;
                new dt80(py50Var.a, py50Var.c, py50Var.d, String.valueOf(py50Var.b.get(i).getId()), new i5j(aVar, 1)).a();
                wz.a("FairnessClicked", "Sporty Hero", "Round History");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.sh_round_history_item_home, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
