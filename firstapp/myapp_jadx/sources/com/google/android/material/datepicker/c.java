package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import com.google.android.material.button.MaterialButton;
import defpackage.c7;
import defpackage.e6;
import defpackage.ezc;
import defpackage.ku5;
import defpackage.n2a0;
import defpackage.nbv;
import defpackage.obv;
import defpackage.pbv;
import defpackage.qbv;
import defpackage.r6i0;
import defpackage.ut00;

/* JADX INFO: loaded from: classes4.dex */
public final class c<S> extends ut00<S> {
    public View A;
    public View B;
    public View C;
    public MaterialButton D;
    public AccessibilityManager E;
    public int b;
    public DateSelector<S> c;
    public CalendarConstraints d;
    public DayViewDecorator e;
    public Month f;
    public d i;
    public ku5 v;
    public RecyclerView w;
    public RecyclerView y;
    public View z;

    public class a extends e6 {
        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
            c7Var.m(null);
        }
    }

    public class b extends n2a0 {
        public final /* synthetic */ int T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(i, false);
            this.T = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void U0(RecyclerView.z zVar, int[] iArr) {
            c cVar = c.this;
            RecyclerView recyclerView = cVar.y;
            if (this.T == 0) {
                iArr[0] = recyclerView.getWidth();
                iArr[1] = cVar.y.getWidth();
            } else {
                iArr[0] = recyclerView.getHeight();
                iArr[1] = cVar.y.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$c, reason: collision with other inner class name */
    public class C0195c {
        public C0195c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final /* synthetic */ d[] c;

        static {
            d dVar = new d("DAY", 0);
            a = dVar;
            d dVar2 = new d("YEAR", 1);
            b = dVar2;
            c = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    @Override // defpackage.ut00
    public final void j0(g.a aVar) {
        this.a.add(aVar);
    }

    public final void m0(Month month) {
        j jVar = (j) this.y.getAdapter();
        int i = jVar.a.a.i(month);
        AccessibilityManager accessibilityManager = this.E;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int i2 = i - jVar.a.a.i(this.f);
            boolean z = Math.abs(i2) > 3;
            boolean z2 = i2 > 0;
            this.f = month;
            if (z && z2) {
                this.y.o0(i - 3);
                this.y.post(new nbv(this, i));
            } else {
                RecyclerView recyclerView = this.y;
                if (z) {
                    recyclerView.o0(i + 3);
                    this.y.post(new nbv(this, i));
                } else {
                    recyclerView.post(new nbv(this, i));
                }
            }
        } else {
            this.f = month;
            this.y.o0(i);
        }
        o0(i);
    }

    public final void n0(d dVar) {
        this.i = dVar;
        if (dVar == d.b) {
            this.w.getLayoutManager().H0(this.f.c - ((l) this.w.getAdapter()).a.d.a.c);
            this.B.setVisibility(0);
            this.C.setVisibility(8);
            this.z.setVisibility(8);
            this.A.setVisibility(8);
            return;
        }
        if (dVar == d.a) {
            this.B.setVisibility(8);
            this.C.setVisibility(0);
            this.z.setVisibility(0);
            this.A.setVisibility(0);
            m0(this.f);
        }
    }

    public final void o0(int i) {
        this.A.setEnabled(i + 1 < this.y.getAdapter().getItemCount());
        this.z.setEnabled(i - 1 >= 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.b);
        this.v = new ku5(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.E = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.d.a;
        if (g.n0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.sportybet.android.gp.tz.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.sportybet.android.gp.tz.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = h.i;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.sportybet.android.gp.tz.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.mtrl_calendar_days_of_week);
        r6i0.p(gridView, new a());
        int i4 = this.d.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new ezc(i4) : new ezc()));
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.y = (RecyclerView) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.mtrl_calendar_months);
        getContext();
        this.y.setLayoutManager(new b(i2, i2));
        this.y.setTag("MONTHS_VIEW_GROUP_TAG");
        j jVar = new j(contextThemeWrapper, this.c, this.d, this.e, new C0195c());
        this.y.setAdapter(jVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.sportybet.android.gp.tz.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.mtrl_calendar_year_selector_frame);
        this.w = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.w.setLayoutManager(new GridLayoutManager(integer, 1));
            this.w.setAdapter(new l(this));
            this.w.i(new com.google.android.material.datepicker.d(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.month_navigation_fragment_toggle);
        CalendarConstraints calendarConstraints = jVar.a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.month_navigation_fragment_toggle);
            this.D = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            r6i0.p(this.D, new pbv(this));
            View viewFindViewById2 = viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.month_navigation_previous);
            this.z = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.month_navigation_next);
            this.A = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.B = viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.mtrl_calendar_year_selector_frame);
            this.C = viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.mtrl_calendar_day_selector_frame);
            n0(d.a);
            this.D.setText(this.f.h());
            this.y.k(new e(this, jVar));
            this.D.setOnClickListener(new qbv(this));
            this.A.setOnClickListener(new f(this, jVar));
            this.z.setOnClickListener(new com.google.android.material.datepicker.b(this, jVar));
            o0(calendarConstraints.a.i(this.f));
        }
        if (!g.n0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new d0().a(this.y);
        }
        this.y.o0(calendarConstraints.a.i(this.f));
        r6i0.p(this.y, new obv());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f);
    }
}
