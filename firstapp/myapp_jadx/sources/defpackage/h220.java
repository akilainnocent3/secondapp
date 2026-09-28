package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h220 extends BaseAdapter {
    public List<g1f0> a;
    public LayoutInflater b;
    public b c;
    public f220 d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h220 h220Var = h220.this;
            if (h220Var.d != null) {
                int iIntValue = ((Integer) ((TextView) view).getTag()).intValue();
                PopOneListView popOneListView = h220Var.d.a;
                int i = PopOneListView.v;
                PopOneListView.a aVar = popOneListView.c;
                if (aVar != null) {
                    aVar.a(iIntValue);
                }
            }
        }
    }

    public static class b {
        public TextView a;
        public ImageView b;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.spr_expand_tab_pop_one_list_view_layout, viewGroup, false);
            b bVar = new b();
            this.c = bVar;
            bVar.a = (TextView) view.findViewById(R.id.tv);
            this.c.b = (ImageView) view.findViewById(R.id.item_selected_check);
            view.setTag(this.c);
        } else {
            this.c = (b) view.getTag();
        }
        g1f0 g1f0Var = this.a.get(i);
        this.c.a.setText(g1f0Var.b);
        this.c.a.setTextColor(view.getContext().getResources().getColor(g1f0Var.c ? R.color.brand_quaternary : R.color.text_type1_primary));
        this.c.a.setTag(Integer.valueOf(i));
        this.c.b.setVisibility(g1f0Var.c ? 0 : 8);
        this.c.a.setOnClickListener(new a());
        return view;
    }
}
