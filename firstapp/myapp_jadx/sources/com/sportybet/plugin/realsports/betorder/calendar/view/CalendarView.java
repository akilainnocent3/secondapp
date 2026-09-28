package com.sportybet.plugin.realsports.betorder.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;
import com.sportybet.plugin.realsports.betorder.calendar.view.customviews.SquareTextView;
import defpackage.a980;
import defpackage.au5;
import defpackage.boy;
import defpackage.bre;
import defpackage.f040;
import defpackage.f7l;
import defpackage.g7l;
import defpackage.hb5;
import defpackage.koy;
import defpackage.kua;
import defpackage.lu5;
import defpackage.mih;
import defpackage.nu0;
import defpackage.o0b;
import defpackage.rk30;
import defpackage.u4w;
import defpackage.uyc;
import defpackage.v4w;
import defpackage.w4w;
import defpackage.xsc;
import defpackage.xyc;
import defpackage.y52;
import defpackage.yl80;
import defpackage.zyc;
import f7l.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public class CalendarView extends RelativeLayout implements boy {
    public static final /* synthetic */ int E = 0;
    public int A;
    public mih B;
    public boolean C;
    public final a D;
    public SlowdownRecyclerView a;
    public v4w b;
    public FrameLayout c;
    public LinearLayout d;
    public LinearLayout e;
    public FrameLayout f;
    public ImageView i;
    public ImageView v;
    public yl80 w;
    public y52 y;
    public g7l z;

    public class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(RecyclerView recyclerView, int i) {
            CalendarView calendarView = CalendarView.this;
            RecyclerView.o layoutManager = calendarView.a.getLayoutManager();
            RecyclerView.o layoutManager2 = calendarView.a.getLayoutManager();
            if (!(layoutManager2 instanceof LinearLayoutManager)) {
                hb5.a("Unsupported Layout Manager");
                return;
            }
            View viewF = layoutManager.F(((LinearLayoutManager) layoutManager2).f1());
            if (viewF != null) {
                viewF.requestLayout();
            }
            if (calendarView.getCalendarOrientation() == 0) {
                boolean z = i != 1;
                calendarView.i.setVisibility(z ? 0 : 8);
                calendarView.v.setVisibility(z ? 0 : 8);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
            CalendarView calendarView = CalendarView.this;
            RecyclerView.o layoutManager = calendarView.a.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                hb5.a("Unsupported Layout Manager");
                return;
            }
            int iF1 = ((LinearLayoutManager) layoutManager).f1();
            calendarView.A = iF1;
            if (iF1 >= 2 || calendarView.C) {
                return;
            }
            mih mihVar = calendarView.B;
            if (mihVar == null || !(mihVar.getStatus() == AsyncTask.Status.PENDING || calendarView.B.getStatus() == AsyncTask.Status.RUNNING)) {
                calendarView.B = new mih();
                calendarView.B.execute(new mih.a((u4w) calendarView.b.a.get(0), calendarView.w, calendarView.b));
            }
        }
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = 6;
        this.D = new a();
        f(attributeSet, 0);
    }

    public static boolean b(int i, int i2) {
        return (i2 | i) == i;
    }

    public final void a() {
        this.a.setOnFlingListener(null);
        g7l g7lVar = this.z;
        yl80 yl80Var = this.w;
        if (g7lVar != null) {
            g7lVar.f.c = yl80Var.a.w == 1 ? 48 : 8388611;
            return;
        }
        int i = yl80Var.a.w == 1 ? 48 : 8388611;
        g7l g7lVar2 = new g7l();
        f7l f7lVar = new f7l();
        f7lVar.h = f7lVar.new a();
        if (i != 8388611 && i != 80 && i != 48) {
            hb5.a("Invalid gravity value. Use START | END | BOTTOM | TOP constants");
            return;
        }
        f7lVar.e = true;
        f7lVar.c = i;
        f7lVar.f = this;
        g7lVar2.f = f7lVar;
        this.z = g7lVar2;
        g7lVar2.a(this.a);
    }

    public final void c() {
        LinearLayout linearLayout = this.e;
        int i = 0;
        boolean z = linearLayout != null;
        if (z) {
            linearLayout.removeAllViews();
        } else {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.e = linearLayout2;
            linearLayout2.setOrientation(0);
            this.e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        int i2 = this.w.b.a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEEE", Locale.getDefault());
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, i2);
        do {
            arrayList.add(simpleDateFormat.format(calendar.getTime()));
            calendar.add(5, 1);
        } while (calendar.get(7) != i2);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            SquareTextView squareTextView = new SquareTextView(getContext());
            squareTextView.setText((String) obj);
            squareTextView.setLayoutParams(layoutParams);
            squareTextView.setGravity(17);
            this.e.addView(squareTextView);
        }
        this.e.setBackgroundResource(R.drawable.spr_border_top_bottom);
        if (z) {
            return;
        }
        addView(this.e);
    }

    public final void d(uyc uycVar) {
        ArrayList arrayList = this.b.a;
        int i = uycVar.a.get(2);
        int i2 = uycVar.a.get(1);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int i4 = ((u4w) arrayList.get(i3)).b.a.get(2);
            int i5 = ((u4w) arrayList.get(i3)).b.a.get(1);
            if (i4 == i && i5 == i2) {
                this.a.s0(i3);
                return;
            }
        }
    }

    public final void e(TypedArray typedArray) {
        int integer = typedArray.getInteger(1, 0);
        int integer2 = typedArray.getInteger(10, 1);
        int integer3 = typedArray.getInteger(22, 1);
        boolean z = integer != 0;
        boolean z2 = integer == 0;
        int color = typedArray.getColor(0, getContext().getColor(R.color.background_general_primary));
        int color2 = typedArray.getColor(11, getContext().getColor(R.color.calendar_default_month_text_color));
        int color3 = typedArray.getColor(14, getContext().getColor(R.color.calendar_default_other_day_text_color));
        int color4 = typedArray.getColor(8, getContext().getColor(R.color.calendar_default_day_text_color));
        int color5 = typedArray.getColor(24, getContext().getColor(R.color.calendar_default_weekend_day_text_color));
        int color6 = typedArray.getColor(23, getContext().getColor(R.color.calendar_default_week_day_title_text_color));
        int color7 = typedArray.getColor(20, getContext().getColor(R.color.calendar_default_selected_day_text_color));
        int color8 = typedArray.getColor(17, getContext().getColor(R.color.calendar_default_selected_day_background_color));
        int color9 = typedArray.getColor(19, getContext().getColor(R.color.calendar_default_selected_day_background_start_color));
        boolean z3 = z;
        int color10 = typedArray.getColor(18, getContext().getColor(R.color.calendar_default_selected_day_background_end_color));
        boolean z4 = z2;
        int color11 = typedArray.getColor(7, getContext().getColor(R.color.calendar_default_day_text_color));
        int resourceId = typedArray.getResourceId(5, R.drawable.spr_ic_triangle_green);
        int resourceId2 = typedArray.getResourceId(6, R.drawable.spr_ic_triangle_white);
        int resourceId3 = typedArray.getResourceId(3, 0);
        int resourceId4 = typedArray.getResourceId(4, 0);
        int integer4 = typedArray.getInteger(2, 0);
        int color12 = typedArray.getColor(9, getContext().getColor(R.color.calendar_default_disabled_day_text_color));
        int color13 = typedArray.getColor(21, getContext().getColor(R.color.calendar_default_selection_bar_month_title_text_color));
        int resourceId5 = typedArray.getResourceId(15, R.drawable.spr_ic_chevron_left_gray);
        int resourceId6 = typedArray.getResourceId(12, R.drawable.spr_ic_chevron_right_gray);
        int resourceId7 = typedArray.getResourceId(16, R.color.text_type1_primary);
        int resourceId8 = typedArray.getResourceId(13, R.color.text_type1_primary);
        setBackgroundColor(color);
        yl80 yl80Var = this.w;
        nu0 nu0Var = yl80Var.a;
        nu0Var.a = color;
        nu0Var.b = color2;
        nu0Var.c = color3;
        nu0Var.d = color4;
        nu0Var.e = color5;
        nu0Var.f = color6;
        nu0Var.g = color7;
        nu0Var.h = color8;
        nu0Var.i = color9;
        nu0Var.j = color10;
        nu0Var.n = resourceId3;
        nu0Var.o = resourceId4;
        nu0Var.p = integer4;
        nu0Var.q = color12;
        nu0Var.r = color13;
        nu0Var.k = color11;
        nu0Var.l = resourceId;
        nu0Var.m = resourceId2;
        nu0Var.w = integer;
        yl80Var.b.a = integer2;
        nu0Var.x = z4;
        nu0Var.y = z3;
        yl80Var.d.a = integer3;
        nu0Var.s = resourceId5;
        nu0Var.t = resourceId6;
        nu0Var.u = resourceId7;
        nu0Var.v = resourceId8;
    }

    public final void f(AttributeSet attributeSet, int i) {
        yl80 yl80Var = new yl80();
        yl80Var.a = new nu0();
        yl80Var.b = new xsc();
        au5 au5Var = new au5();
        au5Var.a = new TreeSet();
        kua kuaVar = kua.a;
        if (kuaVar == null) {
            kuaVar = new kua();
            kua.a = kuaVar;
        }
        au5Var.b = kuaVar;
        au5.a aVar = new au5.a();
        aVar.add(1);
        au5Var.c = aVar;
        yl80Var.c = au5Var;
        yl80Var.d = new a980();
        this.w = yl80Var;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, rk30.f, i, 0);
        try {
            e(typedArrayObtainStyledAttributes);
            g(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            h();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void g(TypedArray typedArray) {
        if (typedArray.hasValue(25)) {
            TreeSet treeSet = new TreeSet();
            int integer = typedArray.getInteger(25, 64);
            if (b(integer, 1)) {
                treeSet.add(2L);
            }
            if (b(integer, 2)) {
                treeSet.add(3L);
            }
            if (b(integer, 4)) {
                treeSet.add(4L);
            }
            if (b(integer, 8)) {
                treeSet.add(5L);
            }
            if (b(integer, 16)) {
                treeSet.add(6L);
            }
            if (b(integer, 32)) {
                treeSet.add(7L);
            }
            if (b(integer, 64)) {
                treeSet.add(1L);
            }
            this.w.c.c = treeSet;
        }
    }

    public int getCalendarBackgroundColor() {
        return this.w.a.a;
    }

    public int getCalendarOrientation() {
        return this.w.a.w;
    }

    public int getConnectedDayIconPosition() {
        return this.w.a.p;
    }

    public int getConnectedDayIconRes() {
        return this.w.a.n;
    }

    public int getConnectedDaySelectedIconRes() {
        return this.w.a.o;
    }

    public kua getConnectedDaysManager() {
        return this.w.c.b;
    }

    public int getCurrentDayIconRes() {
        return this.w.a.l;
    }

    public int getCurrentDaySelectedIconRes() {
        return this.w.a.m;
    }

    public int getCurrentDayTextColor() {
        return this.w.a.k;
    }

    public int getDayTextColor() {
        return this.w.a.d;
    }

    public int getDisabledDayTextColor() {
        return this.w.a.q;
    }

    public Set<Long> getDisabledDays() {
        return this.w.c.a;
    }

    public bre getDisabledDaysCriteria() {
        this.w.c.getClass();
        return null;
    }

    public int getFirstDayOfWeek() {
        return this.w.b.a;
    }

    public int getMonthTextColor() {
        return this.w.a.b;
    }

    public int getNextMonthIconRes() {
        return this.w.a.t;
    }

    public int getNextMonthIconTint() {
        return this.w.a.v;
    }

    public int getOtherDayTextColor() {
        return this.w.a.c;
    }

    public int getPreviousMonthIconRes() {
        return this.w.a.s;
    }

    public int getPreviousMonthIconTint() {
        return this.w.a.u;
    }

    public int getSelectedDayBackgroundColor() {
        return this.w.a.h;
    }

    public int getSelectedDayBackgroundEndColor() {
        return this.w.a.j;
    }

    public int getSelectedDayBackgroundStartColor() {
        return this.w.a.i;
    }

    public int getSelectedDayTextColor() {
        return this.w.a.g;
    }

    public List<uyc> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            u4w u4wVar = (u4w) obj;
            u4wVar.getClass();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(u4wVar.b.a.getTime());
            int i2 = calendar.get(2);
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = u4wVar.a;
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList4.get(i3);
                i3++;
                uyc uycVar = (uyc) obj2;
                calendar.setTime(uycVar.a.getTime());
                if (!(uycVar instanceof zyc) && calendar.get(2) == i2) {
                    arrayList3.add(uycVar);
                }
            }
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                uyc uycVar2 = (uyc) obj3;
                if (this.y.c(uycVar2)) {
                    arrayList.add(uycVar2);
                }
            }
        }
        return arrayList;
    }

    public int getSelectionBarMonthTextColor() {
        return this.w.a.r;
    }

    public int getSelectionType() {
        return this.w.d.a;
    }

    public yl80 getSettingsManager() {
        return this.w;
    }

    public int getWeekDayTitleTextColor() {
        return this.w.a.f;
    }

    public int getWeekendDayTextColor() {
        return this.w.a.e;
    }

    public Set<Long> getWeekendDays() {
        return this.w.c.c;
    }

    public final void h() {
        j();
        f040 f040Var = new f040();
        f040Var.a = this;
        this.y = f040Var;
        SlowdownRecyclerView slowdownRecyclerView = new SlowdownRecyclerView(getContext());
        this.a = slowdownRecyclerView;
        slowdownRecyclerView.setHasFixedSize(true);
        this.a.setNestedScrollingEnabled(false);
        ((i0) this.a.getItemAnimator()).g = false;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.e.getId());
        this.a.setLayoutParams(layoutParams);
        SlowdownRecyclerView slowdownRecyclerView2 = this.a;
        getContext();
        slowdownRecyclerView2.setLayoutManager(new GridLayoutManager(1, this.w.a.w));
        ArrayList arrayListB = lu5.b(this.w);
        yl80 yl80Var = this.w;
        w4w w4wVar = new w4w();
        w4wVar.a = yl80Var;
        this.b = new v4w(arrayListB, w4wVar, this, this.y);
        a();
        this.a.setAdapter(this.b);
        this.a.o0(6);
        this.a.k(this.D);
        RecyclerView.t.a aVarA = this.a.getRecycledViewPool().a(0);
        aVarA.b = 10;
        ArrayList<RecyclerView.d0> arrayList = aVarA.a;
        while (arrayList.size() > 10) {
            arrayList.remove(arrayList.size() - 1);
        }
        addView(this.a);
        this.c = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.a.getId());
        this.c.setLayoutParams(layoutParams2);
        this.c.setBackgroundResource(R.drawable.spr_border_top_bottom);
        this.c.setVisibility(this.w.a.w == 0 ? 0 : 8);
        addView(this.c);
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.spr_view_selection_bar_range, (ViewGroup) null);
        this.d = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.d.setVisibility(8);
        this.c.addView(this.d);
        if (this.w.a.w == 0) {
            this.f = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.spr_calendar_navigation_buttons, (ViewGroup) this, false);
            l();
            k();
            addView(this.f);
        }
        HashSet hashSet = new HashSet();
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        for (int actualMaximum = calendar.getActualMaximum(5); actualMaximum >= 0; actualMaximum--) {
            calendar.set(5, actualMaximum);
            if (calendar.getTimeInMillis() <= timeInMillis) {
                break;
            }
            hashSet.add(Long.valueOf(calendar.getTimeInMillis()));
        }
        setDisabledDays(hashSet);
    }

    public final void i() {
        this.b.a.clear();
        this.b.a.addAll(lu5.b(this.w));
        this.A = 3;
    }

    public final void j() {
        nu0 nu0Var = this.w.a;
        int i = nu0Var.w;
        nu0Var.y = i != 0;
        nu0Var.x = i == 0;
        if (this.e == null) {
            c();
        }
        boolean z = this.w.a.y;
        LinearLayout linearLayout = this.e;
        if (z) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public final void k() {
        ImageView imageView = (ImageView) this.f.findViewById(R.id.iv_next_month);
        this.v = imageView;
        imageView.setImageResource(this.w.a.t);
        this.v.setImageTintList(o0b.b(getContext(), this.w.a.v));
        this.v.setOnClickListener(new View.OnClickListener() { // from class: mu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CalendarView.E;
                this.a.n(1);
            }
        });
    }

    public final void l() {
        ImageView imageView = (ImageView) this.f.findViewById(R.id.iv_previous_month);
        this.i = imageView;
        imageView.setImageResource(this.w.a.s);
        this.i.setImageTintList(o0b.b(getContext(), this.w.a.u));
        this.i.setOnClickListener(new View.OnClickListener() { // from class: nu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CalendarView.E;
                this.a.n(-1);
            }
        });
    }

    public final void m() {
        int i = 8;
        this.c.setVisibility(getCalendarOrientation() == 0 ? 0 : 8);
        LinearLayout linearLayout = this.d;
        if (getCalendarOrientation() == 0 && getSelectionType() == 1) {
            y52 y52Var = this.y;
            if ((y52Var instanceof f040) && ((f040) y52Var).b != null) {
                i = 0;
            }
        }
        linearLayout.setVisibility(i);
    }

    public final void n(int i) {
        if (i != 0 && (this.a.getLayoutManager() instanceof GridLayoutManager)) {
            int iF1 = ((GridLayoutManager) this.a.getLayoutManager()).f1();
            int iMax = Math.max(Math.min(i + iF1, this.b.a.size() - 1), 0);
            if (iMax == iF1) {
                return;
            }
            this.a.s0(iMax);
        }
    }

    public final void o() {
        v4w v4wVar = this.b;
        if (v4wVar != null) {
            v4wVar.notifyDataSetChanged();
            this.a.o0(this.A);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mih mihVar = this.B;
        if (mihVar == null || mihVar.isCancelled()) {
            return;
        }
        this.B.cancel(false);
    }

    public void setCalendarBackgroundColor(int i) {
        this.w.a.a = i;
        setBackgroundColor(i);
    }

    public void setCalendarOrientation(int i) {
        this.y.a();
        m();
        o();
        this.w.a.w = i;
        j();
        i();
        SlowdownRecyclerView slowdownRecyclerView = this.a;
        getContext();
        slowdownRecyclerView.setLayoutManager(new GridLayoutManager(1, getCalendarOrientation()));
        a();
        int calendarOrientation = getCalendarOrientation();
        FrameLayout frameLayout = this.f;
        if (calendarOrientation == 0) {
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            } else {
                this.f = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.spr_calendar_navigation_buttons, (ViewGroup) this, false);
                l();
                k();
                addView(this.f);
            }
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        m();
        o();
    }

    public void setConnectedDayIconPosition(int i) {
        this.w.a.p = i;
        o();
    }

    public void setConnectedDayIconRes(int i) {
        this.w.a.n = i;
        o();
    }

    public void setConnectedDaySelectedIconRes(int i) {
        this.w.a.o = i;
        o();
    }

    public void setCurrentDayIconRes(int i) {
        this.w.a.l = i;
        o();
    }

    public void setCurrentDaySelectedIconRes(int i) {
        this.w.a.m = i;
        o();
    }

    public void setCurrentDayTextColor(int i) {
        this.w.a.k = i;
        o();
    }

    public void setDayTextColor(int i) {
        this.w.a.d = i;
        o();
    }

    public void setDisabledDayTextColor(int i) {
        this.w.a.q = i;
        o();
    }

    public void setDisabledDays(Set<Long> set) {
        this.w.c.a = set;
        this.b.i(set, xyc.a);
    }

    public void setFirstDayOfWeek(int i) {
        if (i <= 0 || i >= 8) {
            hb5.a("First day of week must be 1 - 7");
            return;
        }
        this.w.b.a = i;
        i();
        c();
    }

    public void setMinimumDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            if (((u4w) it.next()).b.a.before(calendar)) {
                it.remove();
            }
        }
        this.A = Math.max(0, this.b.a.size() - 1);
        this.b.notifyDataSetChanged();
        this.a.o0(this.A);
    }

    public void setMonthTextColor(int i) {
        this.w.a.b = i;
        o();
    }

    public void setNextMonthIconRes(int i) {
        this.w.a.t = i;
        k();
    }

    public void setNextMonthIconTint(int i) {
        this.w.a.v = i;
        o();
    }

    public void setOnlySix(boolean z) {
        this.C = z;
    }

    public void setOtherDayTextColor(int i) {
        this.w.a.c = i;
        o();
    }

    public void setPreviousMonthIconRes(int i) {
        this.w.a.s = i;
        l();
    }

    public void setPreviousMonthIconTint(int i) {
        this.w.a.u = i;
        o();
    }

    public void setSelectedDayBackgroundColor(int i) {
        this.w.a.h = i;
        o();
    }

    public void setSelectedDayBackgroundEndColor(int i) {
        this.w.a.j = i;
        o();
    }

    public void setSelectedDayBackgroundStartColor(int i) {
        this.w.a.i = i;
        o();
    }

    public void setSelectedDayTextColor(int i) {
        this.w.a.g = i;
        o();
    }

    public void setSelectionBarMonthTextColor(int i) {
        this.w.a.r = i;
        o();
    }

    public void setSelectionManager(y52 y52Var) {
        this.y = y52Var;
        this.b.d = y52Var;
        o();
    }

    public void setSelectionType(int i) {
        this.w.d.a = i;
        f040 f040Var = new f040();
        f040Var.a = this;
        this.y = f040Var;
        this.b.d = f040Var;
        m();
        this.y.a();
        o();
    }

    public void setShowDaysOfWeek(boolean z) {
        this.w.a.x = z;
        i();
    }

    public void setShowDaysOfWeekTitle(boolean z) {
        this.w.a.y = z;
        LinearLayout linearLayout = this.e;
        if (z) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void setWeekDayTitleTextColor(int i) {
        this.w.a.f = i;
        for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
            ((SquareTextView) this.e.getChildAt(i2)).setTextColor(i);
        }
        o();
    }

    public void setWeekendDayTextColor(int i) {
        this.w.a.e = i;
        o();
    }

    public void setWeekendDays(Set<Long> set) {
        this.w.c.c = set;
        this.b.i(set, xyc.b);
    }

    public CalendarView(Context context) {
        super(context);
        this.A = 6;
        this.D = new a();
        h();
    }

    public CalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = 6;
        this.D = new a();
        f(attributeSet, i);
    }

    @Override // defpackage.boy
    public final void I() {
    }

    public void setOnMonthChangeListener(koy koyVar) {
    }
}
