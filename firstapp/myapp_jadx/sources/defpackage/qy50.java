package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.Coefficients;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class qy50 extends RecyclerView.f<a> {
    public final Context a;
    public final List<Coefficients> b;
    public final c28 c;
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

    public qy50(Context context, ArrayList arrayList, c28 c28Var, ibs ibsVar) {
        arrayList.getClass();
        c28Var.getClass();
        ibsVar.getClass();
        this.a = context;
        this.b = arrayList;
        this.c = c28Var;
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
        TextView textView = aVar.a;
        LinearLayout linearLayout = aVar.b;
        if (this.e) {
            if (i == 0) {
                linearLayout.setAnimation(AnimationUtils.loadAnimation(linearLayout.getContext(), R.anim.animation_trans_alpha));
            } else {
                linearLayout.setAnimation(AnimationUtils.loadAnimation(linearLayout.getContext(), R.anim.animation_translate));
            }
        }
        List<Coefficients> list = this.b;
        r97.a(textView, list.get(i).getHouseCoefficientStr(), "x");
        Map<Double, Integer> map = m18.a;
        textView.setTextColor(o0b.b(this.a, m18.b(list.get(i).getHouseCoefficient())));
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: ny50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qy50 qy50Var = this.a;
                new et80(qy50Var.a, qy50Var.c, qy50Var.d, String.valueOf(qy50Var.b.get(i).getId()), new h5j(aVar, 1)).a();
                wz.a("FairnessClicked", "Sporty Hero", "Round History");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.sh_round_history_item_home_v2, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
