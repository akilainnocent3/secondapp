package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerSport;

/* JADX INFO: loaded from: classes4.dex */
public final class zhw extends x<MultiMakerSport, eiw> {
    public final bfw b;

    public zhw(bfw bfwVar) {
        super(new yhw());
        this.b = bfwVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        eiw eiwVar = (eiw) d0Var;
        eiwVar.getClass();
        MultiMakerSport item = getItem(i);
        item.getClass();
        MultiMakerSport multiMakerSport = item;
        sid0 sid0Var = eiwVar.a;
        ConstraintLayout constraintLayout = sid0Var.a;
        View view = sid0Var.c;
        constraintLayout.getClass();
        constraintLayout.setOnClickListener(new ciw(new cq40(), multiMakerSport, eiwVar));
        TextView textView = sid0Var.d;
        textView.setText(multiMakerSport.b.g(eiwVar.a()));
        boolean z = multiMakerSport.d;
        textView.setTextColor(z ? ((Number) eiwVar.e.getValue()).intValue() : ((Number) eiwVar.f.getValue()).intValue());
        m9n m9nVarA = qw90.a(eiwVar.a());
        nan.a aVar = new nan.a(eiwVar.a());
        aVar.c = multiMakerSport.c;
        aVar.e(bqe.a(24.0f));
        aVar.d = new diw(eiwVar, sid0Var, multiMakerSport);
        m9nVarA.a(aVar.a());
        view.setBackgroundColor(z ? ((Number) eiwVar.i.getValue()).intValue() : ((Number) eiwVar.v.getValue()).intValue());
        view.setVisibility(multiMakerSport.e ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.spr_multi_maker_sport_view, viewGroup, false);
        int i2 = R.id.sport_icon;
        ImageView imageView = (ImageView) h5e.a(R.id.sport_icon, viewA);
        if (imageView != null) {
            i2 = R.id.sport_indicator;
            View viewA2 = h5e.a(R.id.sport_indicator, viewA);
            if (viewA2 != null) {
                i2 = R.id.sport_title;
                TextView textView = (TextView) h5e.a(R.id.sport_title, viewA);
                if (textView != null) {
                    return new eiw(new sid0(viewA2, imageView, textView, (ConstraintLayout) viewA), this.b);
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
