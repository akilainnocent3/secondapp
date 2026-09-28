package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class mjy extends x<njy, bky> {
    public aem b;

    public final class a extends n.e<njy> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(njy njyVar, njy njyVar2) {
            njy njyVar3 = njyVar;
            njy njyVar4 = njyVar2;
            njyVar3.getClass();
            njyVar4.getClass();
            return njyVar3.b == njyVar4.b;
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(njy njyVar, njy njyVar2) {
            njy njyVar3 = njyVar;
            njy njyVar4 = njyVar2;
            njyVar3.getClass();
            njyVar4.getClass();
            return njyVar3.a == njyVar4.a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        bky bkyVar = (bky) d0Var;
        bkyVar.getClass();
        njy item = getItem(i);
        item.getClass();
        njy njyVar = item;
        ojy ojyVar = bkyVar.a;
        ojyVar.a.setTag(njyVar);
        TextView textView = ojyVar.b;
        ConstraintLayout constraintLayout = ojyVar.a;
        Context context = constraintLayout.getContext();
        context.getClass();
        ljy ljyVar = njyVar.a;
        textView.setText(sn5.b(context, ljyVar.a, new Object[0]));
        Context context2 = constraintLayout.getContext();
        boolean z = njyVar.b;
        textView.setTextColor(context2.getColor(z ? R.color.brand_secondary : R.color.text_type1_primary));
        ojyVar.c.setText(ljyVar.b);
        ojyVar.d.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.odds_format_item, viewGroup, false);
        int i2 = R.id.odds_format;
        TextView textView = (TextView) h5e.a(R.id.odds_format, viewA);
        if (textView != null) {
            i2 = R.id.odds_format_example;
            TextView textView2 = (TextView) h5e.a(R.id.odds_format_example, viewA);
            if (textView2 != null) {
                i2 = R.id.selected_odds_format;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.selected_odds_format, viewA);
                if (appCompatImageView != null) {
                    return new bky(new ojy((ConstraintLayout) viewA, textView, textView2, appCompatImageView), this.b);
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
