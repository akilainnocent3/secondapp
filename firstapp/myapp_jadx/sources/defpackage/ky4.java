package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationSet;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ky4 extends RecyclerView.d0 {
    public final d2p a;
    public final gcb b;
    public final hcb c;
    public final d0z d;
    public final mpe0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ky4(d2p d2pVar, gcb gcbVar, hcb hcbVar, d0z d0zVar, e0z e0zVar) {
        CardView cardView = d2pVar.a;
        super(cardView);
        this.a = d2pVar;
        this.b = gcbVar;
        this.c = hcbVar;
        this.d = d0zVar;
        qy4 qy4Var = new qy4(e0zVar);
        mpe0 mpe0VarB = hwr.b(new os(1));
        this.e = mpe0VarB;
        AnimationSet animationSet = (AnimationSet) mpe0VarB.getValue();
        hy4 hy4Var = new hy4(this, 0);
        iy4 iy4Var = new iy4(this, 0);
        jy4 jy4Var = new jy4(this);
        RecyclerView recyclerView = d2pVar.f;
        Context context = cardView.getContext();
        context.getClass();
        if (r0b.d(context)) {
            recyclerView.setBackgroundColor(context.getColor(R.color.background_general_primary));
            d2pVar.E.setBackgroundColor(context.getColor(R.color.brand_secondary_variable_type1));
            d2pVar.D.setTextColor(context.getColor(R.color.custom_brand_tertiary_type4));
            d2pVar.c.getDrawable().setTint(context.getColor(R.color.custom_brand_tertiary_type4));
        }
        d2pVar.F.setOnClickListener(new ay4(new cq40(), hy4Var));
        d2pVar.v.setOnClickListener(new by4(new cq40(), iy4Var));
        d2pVar.b.setOnClickListener(new cy4(new cq40(), jy4Var));
        View view = d2pVar.H;
        recyclerView.setAdapter(qy4Var);
        recyclerView.j(new zx4());
        recyclerView.k(new yx4(view, animationSet, recyclerView));
    }
}
