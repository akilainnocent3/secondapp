package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class cru extends RecyclerView.f<a> {
    public ble0 a;
    public ArrayList b;

    public class a extends RecyclerView.d0 {
        public ArrayList a;
        public ArrayList b;
        public View c;
        public View d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        dru druVar = (dru) this.b.get(i);
        int size = druVar.a.size();
        for (int i2 = 0; i2 < aVar.a.size(); i2++) {
            View view = (View) aVar.a.get(i2);
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (iIntValue > size - 1) {
                view.setVisibility(8);
            } else {
                SwipeBetOptions swipeBetOptions = druVar.a.get(iIntValue);
                view.setVisibility(0);
                view.setSelected(swipeBetOptions.isPreferred);
                TextView textView = (TextView) aVar.b.get(i2);
                textView.setText(swipeBetOptions.name);
                textView.setOnClickListener(new bru(this, swipeBetOptions, aVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = dzc.a(viewGroup, R.layout.item_swipe_bet_market_setting, viewGroup, false);
        a aVar = new a(viewA);
        ArrayList arrayList = new ArrayList();
        aVar.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        aVar.b = arrayList2;
        TextView textView = (TextView) viewA.findViewById(R.id.market_1);
        TextView textView2 = (TextView) viewA.findViewById(R.id.market_2);
        View viewFindViewById = viewA.findViewById(R.id.item_1);
        aVar.c = viewFindViewById;
        viewFindViewById.setTag(0);
        View viewFindViewById2 = viewA.findViewById(R.id.item_2);
        aVar.d = viewFindViewById2;
        viewFindViewById2.setTag(1);
        arrayList.add(viewFindViewById);
        arrayList.add(viewFindViewById2);
        arrayList2.add(textView);
        arrayList2.add(textView2);
        return aVar;
    }
}
