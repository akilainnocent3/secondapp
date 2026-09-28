package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class w1t extends RecyclerView.f<a> {

    public static final class a extends RecyclerView.d0 {
        public final ImageView a;
        public final CardView b;

        public a(wo80 wo80Var) {
            super(wo80Var.a);
            ImageView imageView = wo80Var.c;
            imageView.getTag();
            this.a = imageView;
            this.b = wo80Var.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return 10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        aVar.b.setBackgroundResource(R.drawable.shimmer_light_bg_lobby);
        ImageView imageView = aVar.a;
        l7i0.a(imageView);
        l7i0.b(imageView, new x1t(this, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.sg_lobby_items_shimmer, viewGroup, false);
        int i2 = R.id.card;
        CardView cardView = (CardView) h5e.a(R.id.card, viewA);
        if (cardView != null) {
            i2 = R.id.shimmer_black_line;
            ImageView imageView = (ImageView) h5e.a(R.id.shimmer_black_line, viewA);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
                wo80 wo80Var = new wo80(constraintLayout, cardView, imageView);
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.getClass();
                GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = viewGroup.getMeasuredWidth() / 2;
                constraintLayout.setLayoutParams(layoutParams2);
                return new a(wo80Var);
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
