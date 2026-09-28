package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class f320 extends RecyclerView.f<b> {
    public final ArrayList a;
    public final float b;
    public final ffm c;

    public interface a {
    }

    public static class b extends RecyclerView.d0 implements View.OnClickListener {
        public final int[] a;
        public final TextView b;
        public final View c;
        public final a d;

        public b(View view, Float f, ffm ffmVar) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.title);
            this.b = textView;
            textView.setTextSize(f.floatValue());
            textView.setGravity(16);
            this.c = view.findViewById(R.id.title_img);
            view.setOnClickListener(this);
            this.a = view.getResources().getIntArray(R.array.spr_popular_item_color_list);
            this.d = ffmVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f00 f00Var = vgb0.a;
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("type", "" + view.getTag(R.id.title))};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
            mapUnmodifiableMap.getClass();
            vgb0.c("Home_Popular", mapUnmodifiableMap, false);
            String string = this.b.getText().toString();
            int bindingAdapterPosition = getBindingAdapterPosition();
            ohm ohmVar = ((ffm) this.d).a.a.C1;
            thm.h hVar = new thm.h(string, bindingAdapterPosition);
            Object[] objArr = {k00.d, k00.c};
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                Object obj = objArr[i];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            ohmVar.y1(new zgm.d(hVar, Collections.unmodifiableList(arrayList)));
            sh8.c().f((String) view.getTag(), null, Sender.HOMEPAGE_POPULAR_BANNER);
        }
    }

    public f320(ArrayList arrayList, ffm ffmVar) {
        ArrayList arrayList2 = new ArrayList();
        this.a = arrayList2;
        this.b = 12.0f;
        this.c = ffmVar;
        arrayList2.addAll(arrayList);
        hug0.a aVar = hug0.a;
        aVar.getClass();
        Context applicationContext = hp0.A.getApplicationContext();
        applicationContext.getClass();
        aVar.getClass();
        if (hug0.a.a(applicationContext) == hug0.e) {
            this.b = 11.0f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        RealSportsAds realSportsAds = (RealSportsAds) this.a.get(i);
        bVar.b.setText(realSportsAds.getText());
        bVar.itemView.setTag(realSportsAds.getLinkUrl());
        bVar.itemView.setTag(R.id.title, Integer.valueOf(i));
        boolean zD = r0b.d(bVar.itemView.getContext());
        View view = bVar.c;
        if (zD) {
            view.setBackgroundColor(c8i0.c(R.color.brand_primary, view));
        } else {
            int[] iArr = bVar.a;
            view.setBackgroundColor(iArr[i % iArr.length]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(dzc.a(viewGroup, R.layout.spr_popular_item, viewGroup, false), Float.valueOf(this.b), this.c);
    }
}
