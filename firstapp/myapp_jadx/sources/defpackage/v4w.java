package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import com.sportybet.plugin.realsports.betorder.calendar.view.MonthView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class v4w extends RecyclerView.f<x4w> {
    public final ArrayList a;
    public final w4w b;
    public final CalendarView c;
    public y52 d;

    public v4w(ArrayList arrayList, w4w w4wVar, CalendarView calendarView, y52 y52Var) {
        setHasStableIds(true);
        this.a = arrayList;
        this.b = w4wVar;
        this.c = calendarView;
        this.d = y52Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        return ((u4w) this.a.get(i)).b.a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return 0;
    }

    public final void i(Set<Long> set, xyc xycVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((u4w) obj).a;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                uyc uycVar = (uyc) obj2;
                int iOrdinal = xycVar.ordinal();
                if (iOrdinal == 0) {
                    uycVar.d = lu5.e(uycVar, set);
                } else if (iOrdinal == 1) {
                    uycVar.e = set.contains(Integer.valueOf(uycVar.a.get(7)));
                } else if (iOrdinal == 2) {
                    uycVar.f = lu5.e(uycVar, set);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        x4w x4wVar = (x4w) d0Var;
        u4w u4wVar = (u4w) this.a.get(i);
        this.b.getClass();
        TextView textView = x4wVar.b;
        u4wVar.getClass();
        textView.setText(new SimpleDateFormat("MMMM yyyy", Locale.getDefault()).format(u4wVar.b.a.getTime()));
        yl80 yl80Var = x4wVar.f;
        textView.setTextColor(yl80Var.a.b);
        View view = x4wVar.c;
        nu0 nu0Var = yl80Var.a;
        view.setVisibility(nu0Var.w == 0 ? 4 : 0);
        x4wVar.d.setVisibility(nu0Var.w != 0 ? 0 : 4);
        x4wVar.a.setBackgroundResource(nu0Var.w == 0 ? R.drawable.spr_border_top_bottom : 0);
        czc adapter = x4wVar.e.getAdapter();
        adapter.a = u4wVar;
        adapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        azc azcVar = new azc();
        CalendarView calendarView = this.c;
        azcVar.a = calendarView;
        n3z n3zVar = new n3z();
        n3zVar.a = calendarView;
        wyc wycVar = new wyc();
        wycVar.a = calendarView;
        wycVar.b = this;
        czc czcVar = new czc();
        czcVar.setHasStableIds(false);
        czcVar.a = null;
        czcVar.b = azcVar;
        czcVar.c = wycVar;
        czcVar.d = n3zVar;
        czcVar.e = calendarView;
        w4w w4wVar = this.b;
        w4wVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_view_month, viewGroup, false);
        yl80 yl80Var = w4wVar.a;
        x4w x4wVar = new x4w(viewInflate);
        x4wVar.a = (LinearLayout) viewInflate.findViewById(R.id.ll_month_header);
        MonthView monthView = (MonthView) viewInflate.findViewById(R.id.month_view);
        x4wVar.e = monthView;
        x4wVar.b = (TextView) viewInflate.findViewById(R.id.tv_month_name);
        x4wVar.c = viewInflate.findViewById(R.id.view_left_line);
        x4wVar.d = viewInflate.findViewById(R.id.view_right_line);
        x4wVar.f = yl80Var;
        monthView.setAdapter(czcVar);
        return x4wVar;
    }
}
