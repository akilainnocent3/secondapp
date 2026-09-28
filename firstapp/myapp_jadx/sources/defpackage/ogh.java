package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.FeaturedTab;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ogh extends x<FeaturedTab, sgh> {
    public ndh b;

    public final class a extends n.e<FeaturedTab> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(FeaturedTab featuredTab, FeaturedTab featuredTab2) {
            FeaturedTab featuredTab3 = featuredTab;
            FeaturedTab featuredTab4 = featuredTab2;
            featuredTab3.getClass();
            featuredTab4.getClass();
            return Intrinsics.g(featuredTab3, featuredTab4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(FeaturedTab featuredTab, FeaturedTab featuredTab2) {
            FeaturedTab featuredTab3 = featuredTab;
            FeaturedTab featuredTab4 = featuredTab2;
            featuredTab3.getClass();
            featuredTab4.getClass();
            return Intrinsics.g(featuredTab3.getId(), featuredTab4.getId());
        }

        @Override // androidx.recyclerview.widget.n.e
        public final Object getChangePayload(FeaturedTab featuredTab, FeaturedTab featuredTab2) {
            FeaturedTab featuredTab3 = featuredTab2;
            featuredTab.getClass();
            featuredTab3.getClass();
            return Boolean.valueOf(featuredTab3.isSelected());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        sgh sghVar = (sgh) d0Var;
        sghVar.getClass();
        FeaturedTab item = getItem(i);
        item.getClass();
        FeaturedTab featuredTab = item;
        pgh pghVar = sghVar.a;
        pghVar.a.setTag(featuredTab.getId());
        ((gbn) sghVar.c.getValue()).e(featuredTab.getIcon(), pghVar.b, R.drawable.ic_sport_default, R.drawable.ic_sport_default);
        pghVar.c.setText(featuredTab.getName());
        sghVar.a(featuredTab.isSelected());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.featured_tab_item, viewGroup, false);
        int i2 = R.id.guide_left;
        if (((Guideline) h5e.a(R.id.guide_left, viewA)) != null) {
            i2 = R.id.guide_right;
            if (((Guideline) h5e.a(R.id.guide_right, viewA)) != null) {
                i2 = R.id.guide_top;
                if (((Guideline) h5e.a(R.id.guide_top, viewA)) != null) {
                    i2 = R.id.img_sim;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.img_sim, viewA);
                    if (appCompatImageView != null) {
                        i2 = R.id.title;
                        TextView textView = (TextView) h5e.a(R.id.title, viewA);
                        if (textView != null) {
                            return new sgh(new pgh(textView, appCompatImageView, (ConstraintLayout) viewA), this.b);
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        sgh sghVar = (sgh) d0Var;
        sghVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            super.onBindViewHolder(sghVar, i, list);
            return;
        }
        Object obj = list.get(0);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            sghVar.a(bool.booleanValue());
        }
    }
}
