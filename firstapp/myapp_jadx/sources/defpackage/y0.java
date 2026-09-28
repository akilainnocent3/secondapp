package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 extends RecyclerView.f<b> {
    public List<x0> a;
    public tjl0 b;
    public int c = 0;
    public final a d = new a();

    public class a implements c {
        public a() {
        }
    }

    public static class b extends RecyclerView.d0 implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final c c;

        public b(LayoutInflater layoutInflater, ViewGroup viewGroup, a aVar) {
            super(layoutInflater.inflate(R.layout.spr_az_menu_list_view, viewGroup, false));
            this.a = (TextView) this.itemView.findViewById(R.id.az_menu_sports_item_text);
            this.b = (TextView) this.itemView.findViewById(R.id.az_menu_sports_item_count);
            this.c = aVar;
            this.itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            y0 y0Var = y0.this;
            y0Var.c = iIntValue;
            y0Var.notifyDataSetChanged();
            tjl0 tjl0Var = y0Var.b;
            if (tjl0Var != null) {
                String str = y0Var.a.get(y0Var.c).b;
                int i = y0Var.c;
                v0 v0Var = (v0) tjl0Var.a;
                if (v0Var.G) {
                    v0Var.I = i;
                    v0Var.J = str;
                    v0Var.r0();
                } else {
                    v0Var.H = i;
                    v0Var.K = str;
                    v0Var.p0();
                }
            }
        }
    }

    public interface c {
    }

    public y0(List<x0> list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        x0 x0Var = this.a.get(i);
        TextView textView = bVar.a;
        TextView textView2 = bVar.b;
        textView.setText(x0Var.a);
        bVar.itemView.setTag(Integer.valueOf(i));
        boolean z = this.c == i;
        int color = textView.getResources().getColor(R.color.brand_secondary);
        int color2 = textView.getResources().getColor(R.color.text_type1_primary);
        if (x0Var.c > 0) {
            textView2.setVisibility(0);
            textView2.setText(String.valueOf(x0Var.c));
            textView2.setTextColor(z ? color : color2);
        } else {
            textView2.setVisibility(8);
        }
        if (!z) {
            color = color2;
        }
        textView.setTextColor(color);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()), viewGroup, this.d);
    }
}
