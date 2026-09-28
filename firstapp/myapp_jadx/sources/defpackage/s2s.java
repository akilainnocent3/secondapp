package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class s2s extends RecyclerView.f<a> {
    public ble0 a;
    public ArrayList b;

    public class a extends RecyclerView.d0 {
        public ArrayList a;
        public ArrayList b;
        public ArrayList c;
        public View d;
        public View e;
        public View f;
        public View i;
        public View v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        gbn gbnVarA = sh8.a();
        t2s t2sVar = (t2s) this.b.get(i);
        int size = t2sVar.a.size();
        for (int i2 = 0; i2 < aVar.a.size(); i2++) {
            View view = (View) aVar.a.get(i2);
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (iIntValue > size - 1) {
                view.setVisibility(8);
            } else {
                SwipeBetOptions swipeBetOptions = t2sVar.a.get(iIntValue);
                view.setVisibility(0);
                view.setSelected(swipeBetOptions.isPreferred);
                view.setOnClickListener(new r2s(this, swipeBetOptions, aVar));
                ((TextView) aVar.b.get(i2)).setText(swipeBetOptions.name);
                gbnVarA.e(swipeBetOptions.leagueIcon, (ImageView) aVar.c.get(i2), R.drawable.ic_swipebet_default_league, R.drawable.ic_swipebet_default_league);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = dzc.a(viewGroup, R.layout.item_swipe_bet_league_setting, viewGroup, false);
        a aVar = new a(viewA);
        ArrayList arrayList = new ArrayList();
        aVar.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        aVar.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        aVar.c = arrayList3;
        View viewFindViewById = viewA.findViewById(R.id.item_1);
        aVar.d = viewFindViewById;
        viewFindViewById.setTag(0);
        View viewFindViewById2 = viewA.findViewById(R.id.item_2);
        aVar.e = viewFindViewById2;
        viewFindViewById2.setTag(1);
        View viewFindViewById3 = viewA.findViewById(R.id.item_3);
        aVar.f = viewFindViewById3;
        viewFindViewById3.setTag(2);
        View viewFindViewById4 = viewA.findViewById(R.id.item_4);
        aVar.i = viewFindViewById4;
        viewFindViewById4.setTag(3);
        View viewFindViewById5 = viewA.findViewById(R.id.item_5);
        aVar.v = viewFindViewById5;
        viewFindViewById5.setTag(4);
        arrayList.add(viewFindViewById);
        arrayList.add(viewFindViewById2);
        arrayList.add(viewFindViewById3);
        arrayList.add(viewFindViewById4);
        arrayList.add(viewFindViewById5);
        TextView textView = (TextView) viewA.findViewById(R.id.league_1);
        TextView textView2 = (TextView) viewA.findViewById(R.id.league_2);
        TextView textView3 = (TextView) viewA.findViewById(R.id.league_3);
        TextView textView4 = (TextView) viewA.findViewById(R.id.league_4);
        TextView textView5 = (TextView) viewA.findViewById(R.id.league_5);
        arrayList2.add(textView);
        arrayList2.add(textView2);
        arrayList2.add(textView3);
        arrayList2.add(textView4);
        arrayList2.add(textView5);
        ImageView imageView = (ImageView) viewA.findViewById(R.id.league_icon_1);
        ImageView imageView2 = (ImageView) viewA.findViewById(R.id.league_icon_2);
        ImageView imageView3 = (ImageView) viewA.findViewById(R.id.league_icon_3);
        ImageView imageView4 = (ImageView) viewA.findViewById(R.id.league_icon_4);
        ImageView imageView5 = (ImageView) viewA.findViewById(R.id.league_icon_5);
        arrayList3.add(imageView);
        arrayList3.add(imageView2);
        arrayList3.add(imageView3);
        arrayList3.add(imageView4);
        arrayList3.add(imageView5);
        return aVar;
    }
}
