package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchPCBBView;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class weh extends x<FeaturedMatch, RecyclerView.d0> {
    public final FeaturedContainer b;
    public final boolean c;

    public weh(FeaturedContainer featuredContainer, boolean z) {
        super(new veh());
        this.b = featuredContainer;
        this.c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return u5y.d(getItem(i).getMarket()) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        FeaturedMatch item = getItem(i);
        if (d0Var instanceof jfh) {
            item.getClass();
            ((jfh) d0Var).a.a(item);
        } else if (d0Var instanceof dgh) {
            item.getClass();
            ((dgh) d0Var).a.a(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
        FeaturedContainer featuredContainer = this.b;
        boolean z = this.c;
        if (i == 1) {
            Context context = viewGroup.getContext();
            context.getClass();
            FeaturedMatchPCBBView featuredMatchPCBBView = new FeaturedMatchPCBBView(context, z, featuredContainer);
            featuredMatchPCBBView.setLayoutParams(layoutParams);
            return new jfh(featuredMatchPCBBView);
        }
        Context context2 = viewGroup.getContext();
        context2.getClass();
        FeaturedMatchView featuredMatchView = new FeaturedMatchView(context2, z, featuredContainer);
        featuredMatchView.setLayoutParams(layoutParams);
        return new dgh(featuredMatchView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onDetachedFromRecyclerView(recyclerView);
        int size = this.a.f.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.d0 d0VarK = recyclerView.K(i);
            if (d0VarK instanceof dgh) {
                FeaturedMatchView featuredMatchView = ((dgh) d0VarK).a;
                featuredMatchView.getClass();
                iu2.q(featuredMatchView);
                PopupWindow popupWindow = featuredMatchView.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                jvd0 jvd0Var = featuredMatchView.B;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
            } else if (d0VarK instanceof jfh) {
                FeaturedMatchPCBBView featuredMatchPCBBView = ((jfh) d0VarK).a;
                featuredMatchPCBBView.getClass();
                iu2.q(featuredMatchPCBBView);
            }
        }
    }
}
