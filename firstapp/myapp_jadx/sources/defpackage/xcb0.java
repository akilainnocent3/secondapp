package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class xcb0 extends RecyclerView.f<a> {
    public ArrayList a;

    public class a extends RecyclerView.d0 {
        public TextView a;
        public TextView b;
        public View c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        ArrayList arrayList = this.a;
        wcb0 wcb0Var = (wcb0) arrayList.get(i);
        aVar.a.setText(wcb0Var.a);
        aVar.b.setText(wcb0Var.b);
        aVar.c.setVisibility(i == arrayList.size() + (-1) ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = dzc.a(viewGroup, R.layout.spr_results_spinner_item, viewGroup, false);
        a aVar = new a(viewA);
        aVar.a = (TextView) viewA.findViewById(R.id.score_name);
        aVar.b = (TextView) viewA.findViewById(R.id.score_value);
        aVar.c = viewA.findViewById(R.id.divider_line);
        return aVar;
    }
}
