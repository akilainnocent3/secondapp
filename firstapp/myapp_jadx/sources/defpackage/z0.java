package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.AZTournamentActivity;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Popular;
import com.sportybet.plugin.realsports.data.Tournaments;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.widget.AZBannerAdImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 extends RecyclerView.f<f> {
    public List<j0> a;
    public String b;
    public int c;

    public class a extends f implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final View c;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.az_live_text);
            this.b = (TextView) view.findViewById(R.id.az_live_count);
            View viewFindViewById = view.findViewById(R.id.az_live_root);
            this.c = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
        }

        @Override // z0.f
        public final void a(int i) {
            j0 j0Var = z0.this.a.get(i);
            this.a.setText(j0Var.d);
            this.b.setText(String.valueOf(j0Var.a.eventSize));
            this.c.setTag(Integer.valueOf(i));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Categories categories;
            int iIntValue = ((Integer) view.getTag()).intValue();
            z0 z0Var = z0.this;
            if (iIntValue >= z0Var.a.size() || (categories = z0Var.a.get(iIntValue).a) == null) {
                return;
            }
            Intent intent = new Intent(view.getContext(), (Class<?>) AZTournamentActivity.class);
            intent.putExtra("key_sport_id", z0Var.b);
            intent.putExtra("key_category_name", categories.name);
            intent.putExtra("key_category_id", categories.id);
            intent.putExtra("key_product_id", z0Var.c);
            List<Tournaments> list = categories.tournaments;
            if (list != null && list.size() > 0) {
                intent.putParcelableArrayListExtra("key_tournament_list", (ArrayList) categories.tournaments);
            }
            if (categories.eventSize > 0) {
                yrh0.s(view.getContext(), intent, true);
            }
        }
    }

    public class b extends f implements View.OnClickListener {
        public final TextView a;

        public b(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.az_popular_text);
            this.a = textView;
            textView.setOnClickListener(this);
        }

        @Override // z0.f
        public final void a(int i) {
            String str = z0.this.a.get(i).c.text;
            TextView textView = this.a;
            textView.setText(str);
            textView.setTag(Integer.valueOf(i));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Popular popular;
            if (view instanceof TextView) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                z0 z0Var = z0.this;
                if (iIntValue >= z0Var.a.size() || z0Var.a.get(iIntValue) == null || (popular = z0Var.a.get(iIntValue).c) == null) {
                    return;
                }
                sh8.c().e(popular.linkUrl);
            }
        }
    }

    public class c extends f {
        public TextView a;

        @Override // z0.f
        public final void a(int i) {
            TextView textView = this.a;
            textView.setText(sn5.c(textView, R.string.common_functions__a_z, new Object[0]));
        }
    }

    public class d extends f implements View.OnClickListener {
        public final TextView a;

        public d(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.az_sport_name);
            TextView textView = (TextView) view.findViewById(R.id.az_menu_all);
            Drawable drawableA = gr0.a(textView.getContext(), R.drawable.spr_ic_keyboard_arrow_right_black_24dp);
            drawableA.mutate();
            drawableA.setTint(Color.parseColor("#33000000"));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
            view.findViewById(R.id.az_menu_right_title).setOnClickListener(this);
        }

        @Override // z0.f
        public final void a(int i) {
            this.a.setText(z0.this.a.get(i).d);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof RelativeLayout) {
                Context context = view.getContext();
                z0 z0Var = z0.this;
                Intent intent = new Intent(context, (Class<?>) (z0Var.c == 1 ? LivePageActivity.class : PreMatchSportActivity.class));
                intent.putExtra("key_sport_id", z0Var.b);
                yrh0.s(view.getContext(), intent, true);
            }
        }
    }

    public class e extends f {
        public final AZBannerAdImageView a;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e eVar = e.this;
                z0 z0Var = z0.this;
                int adapterPosition = eVar.getAdapterPosition();
                if (adapterPosition < 0 || z0Var.a.size() <= adapterPosition || z0Var.a.get(adapterPosition).c == null) {
                    return;
                }
                sh8.c().e(z0Var.a.get(adapterPosition).c.linkUrl);
                HashMap map = new HashMap();
                map.put("type", z0Var.a.get(adapterPosition).c.text);
                map.put(AnalyticsParam.EVENT_PARAM_ID, z0Var.a.get(adapterPosition).c.linkUrl);
                f00 f00Var = vgb0.a;
                vgb0.c("AZ_Banner", map, false);
            }
        }

        public class b implements j5f0<Bitmap> {
            public b() {
            }

            @Override // defpackage.j5f0
            public final void a(Drawable drawable) {
                e.this.a.setVisibility(8);
            }

            @Override // defpackage.j5f0
            public final void b(Bitmap bitmap) {
                AZBannerAdImageView aZBannerAdImageView = e.this.a;
                if (bitmap.isRecycled()) {
                    return;
                }
                aZBannerAdImageView.setVisibility(0);
                aZBannerAdImageView.setImageBitmap(bitmap);
            }
        }

        public e(View view) {
            super(view);
            AZBannerAdImageView aZBannerAdImageView = (AZBannerAdImageView) view.findViewById(R.id.az_img);
            this.a = aZBannerAdImageView;
            aZBannerAdImageView.setBannerRatio(0.3809524f);
            aZBannerAdImageView.setOnClickListener(new a());
        }

        @Override // z0.f
        public final void a(int i) {
            sh8.a().c(z0.this.a.get(i).c.iconUrl, new b());
        }
    }

    public static abstract class f extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return this.a.get(i).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((f) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new d(dzc.a(viewGroup, R.layout.spr_az_menu_title_item, viewGroup, false));
        }
        if (i == 1) {
            View viewA = dzc.a(viewGroup, R.layout.spr_az_menu_live_az, viewGroup, false);
            c cVar = new c(viewA);
            cVar.a = (TextView) viewA.findViewById(R.id.az_text);
            return cVar;
        }
        if (i == 2) {
            return new a(dzc.a(viewGroup, R.layout.spr_az_menu_live_item, viewGroup, false));
        }
        if (i == 3) {
            return new b(dzc.a(viewGroup, R.layout.spr_az_menu_popular_item, viewGroup, false));
        }
        if (i == 4) {
            return new e(dzc.a(viewGroup, R.layout.spr_az_menu_ads_img_item, viewGroup, false));
        }
        eub.a("AzMenuRecyclerAdapter viewHolder return null,type:" + i);
        return null;
    }
}
