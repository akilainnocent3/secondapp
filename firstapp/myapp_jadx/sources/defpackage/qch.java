package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.featuredGames.model.FeaturedResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qch extends RecyclerView.f<a> {
    public final List<FeaturedResponse> a;
    public final Context b;
    public final RecyclerView c;
    public rch d;
    public final ssw<Integer> e;
    public final ssw<Integer> f;

    public final class a extends RecyclerView.d0 {
        public final rch a;
        public final /* synthetic */ qch b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qch qchVar, rch rchVar) {
            super(rchVar.a);
            rchVar.getClass();
            this.b = qchVar;
            this.a = rchVar;
        }
    }

    public qch(Context context, RecyclerView recyclerView, ArrayList arrayList) {
        context.getClass();
        this.a = arrayList;
        this.b = context;
        this.c = recyclerView;
        this.e = new ssw<>();
        this.f = new ssw<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<FeaturedResponse> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int i(int i) {
        try {
            return (int) TypedValue.applyDimension(1, i, this.b.getResources().getDisplayMetrics());
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void j(int i, boolean z) {
        RecyclerView recyclerView = this.c;
        RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
        d0VarQ.getClass();
        a aVar = (a) d0VarQ;
        Context context = this.b;
        try {
            if (z) {
                aVar.itemView.findViewById(R.id.name).setVisibility(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i(18), i(18));
                layoutParams.gravity = 17;
                layoutParams.setMargins(0, 0, i(4), 0);
                ((ImageView) aVar.itemView.findViewById(R.id.category_icon)).setLayoutParams(layoutParams);
                aVar.itemView.findViewById(R.id.category_background).setBackground(context.getDrawable(R.drawable.category_dark));
                aVar.itemView.findViewById(R.id.category_background).getLayoutParams().height = i(34);
                ((ImageView) aVar.itemView.findViewById(R.id.category_icon)).setAlpha(1.0f);
                ViewGroup.LayoutParams layoutParams2 = aVar.itemView.findViewById(R.id.category_image_layout).getLayoutParams();
                layoutParams2.getClass();
                ((ConstraintLayout.LayoutParams) layoutParams2).setMargins(0, 0, 0, i(4));
                return;
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i(18), i(18));
            layoutParams3.gravity = 17;
            layoutParams3.setMargins(0, 0, i(10), i(2));
            ((ImageView) aVar.itemView.findViewById(R.id.category_icon)).setLayoutParams(layoutParams3);
            aVar.itemView.findViewById(R.id.name).setVisibility(8);
            aVar.itemView.findViewById(R.id.category_background).setBackground(context.getDrawable(R.drawable.card_category_unselected));
            aVar.itemView.findViewById(R.id.category_background).getLayoutParams().height = i(30);
            ((ImageView) aVar.itemView.findViewById(R.id.category_icon)).setAlpha(0.5f);
            ViewGroup.LayoutParams layoutParams4 = aVar.itemView.findViewById(R.id.category_image_layout).getLayoutParams();
            layoutParams4.getClass();
            ((ConstraintLayout.LayoutParams) layoutParams4).setMargins(0, 0, 0, 0);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        List<FeaturedResponse> list = this.a;
        final FeaturedResponse featuredResponse = list != null ? list.get(i) : null;
        if (featuredResponse != null) {
            final qch qchVar = aVar.b;
            rch rchVar = aVar.a;
            try {
                Context context = qchVar.b;
                context.getClass();
                xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
                xa50VarC.getClass();
                String widgetImageUrl = featuredResponse.getWidgetImageUrl();
                ea50 ea50VarP = xa50VarC.f(Drawable.class).P(widgetImageUrl);
                ea50VarP.getClass();
                po80 po80Var = new po80(xa50VarC, widgetImageUrl, ea50VarP, lo80.a);
                po80Var.a(hb50.E());
                ImageView imageView = rchVar.c;
                LinearLayout linearLayout = rchVar.d;
                TextView textView = rchVar.f;
                View view = rchVar.b;
                po80Var.e(imageView);
                textView.setText(featuredResponse.getName());
                op5.r(op5.a, b.f(textView), null, 4);
                rchVar.e.setOnClickListener(new View.OnClickListener() { // from class: pch
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.a.e.j(Integer.valueOf(i));
                        wz.a("FeaturedCategoryClicked", null, String.valueOf(featuredResponse.getName()));
                    }
                });
                if (i == 0) {
                    textView.setVisibility(0);
                    view.setBackground(context.getDrawable(R.drawable.category_dark));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qchVar.i(18), qchVar.i(18));
                    layoutParams.gravity = 17;
                    layoutParams.setMargins(0, 0, qchVar.i(4), 0);
                    imageView.setLayoutParams(layoutParams);
                    imageView.setAlpha(1.0f);
                    view.getLayoutParams().height = qchVar.i(34);
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    layoutParams2.getClass();
                    ((ConstraintLayout.LayoutParams) layoutParams2).setMargins(0, 0, 0, qchVar.i(4));
                    return;
                }
                textView.setVisibility(8);
                imageView.setAlpha(0.5f);
                view.setBackground(context.getDrawable(R.drawable.card_category_unselected));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(qchVar.i(18), qchVar.i(18));
                layoutParams3.gravity = 17;
                layoutParams3.setMargins(0, 0, qchVar.i(10), qchVar.i(2));
                imageView.setLayoutParams(layoutParams3);
                view.getLayoutParams().height = qchVar.i(30);
                ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                layoutParams4.getClass();
                ((ConstraintLayout.LayoutParams) layoutParams4).setMargins(0, 0, 0, 0);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.featured_category_item, viewGroup, false);
        int i2 = R.id.category_background;
        View viewA2 = h5e.a(R.id.category_background, viewA);
        if (viewA2 != null) {
            i2 = R.id.category_icon;
            ImageView imageView = (ImageView) h5e.a(R.id.category_icon, viewA);
            if (imageView != null) {
                i2 = R.id.category_image_layout;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.category_image_layout, viewA);
                if (linearLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
                    i2 = R.id.name;
                    TextView textView = (TextView) h5e.a(R.id.name, viewA);
                    if (textView != null) {
                        this.d = new rch(constraintLayout, viewA2, imageView, linearLayout, constraintLayout, textView);
                        rch rchVar = this.d;
                        if (rchVar != null) {
                            return new a(this, rchVar);
                        }
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
