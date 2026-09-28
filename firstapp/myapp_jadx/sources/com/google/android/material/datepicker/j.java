package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.dzc;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.q6i0;
import defpackage.r6i0;
import defpackage.rqh0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends RecyclerView.f<a> {
    public final CalendarConstraints a;
    public final DateSelector<?> b;
    public final DayViewDecorator c;
    public final c.C0195c d;
    public final int e;

    public static class a extends RecyclerView.d0 {
        public final TextView a;
        public final MaterialCalendarGridView b;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.a = textView;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            new q6i0(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public j(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, c.C0195c c0195c) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.a.compareTo(month3.a) > 0) {
            hb5.a("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.a.compareTo(month2.a) > 0) {
            hb5.a("currentPage cannot be after lastPage");
            throw null;
        }
        this.e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * h.i) + (g.n0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.a = calendarConstraints;
        this.b = dateSelector;
        this.c = dayViewDecorator;
        this.d = c0195c;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        Calendar calendarC = rqh0.c(this.a.a.a);
        calendarC.add(2, i);
        return new Month(calendarC).a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        CalendarConstraints calendarConstraints = this.a;
        Calendar calendarC = rqh0.c(calendarConstraints.a.a);
        calendarC.add(2, i);
        Month month = new Month(calendarC);
        aVar.a.setText(month.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().a)) {
            h hVar = new h(month, this.b, calendarConstraints, this.c);
            materialCalendarGridView.setNumColumns(month.d);
            materialCalendarGridView.setAdapter((ListAdapter) hVar);
        } else {
            materialCalendarGridView.invalidate();
            h hVarA = materialCalendarGridView.a();
            DateSelector<?> dateSelector = hVarA.b;
            Iterator<Long> it = hVarA.c.iterator();
            while (it.hasNext()) {
                hVarA.f(materialCalendarGridView, it.next().longValue());
            }
            if (dateSelector != null) {
                ArrayList arrayListT1 = dateSelector.t1();
                int size = arrayListT1.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListT1.get(i2);
                    i2++;
                    hVarA.f(materialCalendarGridView, ((Long) obj).longValue());
                }
                hVarA.c = dateSelector.t1();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new i(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) dzc.a(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!g.n0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.e));
        return new a(linearLayout, true);
    }
}
