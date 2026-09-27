package eo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sports.live.football.tv.horizontalcalendar.HorizontalCalendarView;
import com.sports.live.football.tv.horizontalcalendar.HorizontalLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HorizontalCalendarView f81435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fo.d f81436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Calendar f81437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Calendar f81438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f81439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ho.b f81441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f81442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final go.b f81443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final go.b f81444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final go.c f81445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ho.c f81446l = new c();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Calendar f81447b;

        public a(final Calendar val$defaultSelectedDate) {
            this.f81447b = val$defaultSelectedDate;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.b(bVar.s(this.f81447b));
        }
    }

    /* JADX INFO: renamed from: eo.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class RunnableC0797b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f81449b;

        public RunnableC0797b(final int val$oldSelectedItem) {
            this.f81449b = val$oldSelectedItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.v(b.this.f81435a.getPositionOfCenterItem(), this.f81449b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements ho.c {
        public c() {
        }

        @Override // ho.c
        public boolean a(Calendar date) {
            return ho.e.e(date, b.this.f81437c) || ho.e.d(date, b.this.f81438d);
        }

        @Override // ho.c
        public go.b b() {
            return new go.b(-7829368, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81462a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f81463b = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int positionOfCenterItem = b.this.f81435a.getPositionOfCenterItem();
                e eVar = e.this;
                int i10 = eVar.f81462a;
                if (i10 == -1 || i10 != positionOfCenterItem) {
                    b.this.v(positionOfCenterItem, new int[0]);
                    e eVar2 = e.this;
                    int i11 = eVar2.f81462a;
                    if (i11 != -1) {
                        b.this.v(i11, new int[0]);
                    }
                    e.this.f81462a = positionOfCenterItem;
                }
            }
        }

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            b.this.t(this.f81463b);
            b bVar = b.this;
            ho.b bVar2 = bVar.f81441g;
            if (bVar2 != null) {
                bVar2.a(bVar.f81435a, dx2, dy2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum f {
        DAYS,
        MONTHS
    }

    public b(d builder, go.c config, go.b defaultStyle, go.b selectedItemStyle) {
        this.f81440f = builder.f81458g;
        this.f81442h = builder.f81452a;
        this.f81437c = builder.f81454c;
        this.f81438d = builder.f81455d;
        this.f81445k = config;
        this.f81443i = defaultStyle;
        this.f81444j = selectedItemStyle;
        this.f81439e = builder.f81457f;
    }

    public void A() {
        this.f81435a.setVisibility(0);
    }

    public void a(final int position) {
        int iB;
        if (position == -1 || (iB = ho.e.b(position, this.f81435a.getPositionOfCenterItem(), this.f81440f / 2)) == position) {
            return;
        }
        this.f81435a.smoothScrollToPosition(iB);
    }

    public void b(final int position) {
        int positionOfCenterItem;
        int iB;
        if (position == -1 || (iB = ho.e.b(position, (positionOfCenterItem = this.f81435a.getPositionOfCenterItem()), this.f81440f / 2)) == position) {
            return;
        }
        this.f81435a.scrollToPosition(iB);
        this.f81435a.post(new RunnableC0797b(positionOfCenterItem));
    }

    public boolean c(Calendar date) {
        return s(date) != -1;
    }

    public ho.b d() {
        return this.f81441g;
    }

    public HorizontalCalendarView e() {
        return this.f81435a;
    }

    public go.c f() {
        return this.f81445k;
    }

    public Context g() {
        return this.f81435a.getContext();
    }

    public Calendar h(int position) throws IndexOutOfBoundsException {
        return this.f81436b.h(position);
    }

    public go.b i() {
        return this.f81443i;
    }

    public int j() {
        return this.f81440f;
    }

    public Calendar k() {
        return this.f81436b.h(this.f81435a.getPositionOfCenterItem());
    }

    public int l() {
        return this.f81435a.getPositionOfCenterItem();
    }

    public go.b m() {
        return this.f81444j;
    }

    public int n() {
        return this.f81440f / 2;
    }

    public void o(boolean immediate) {
        w(Calendar.getInstance(), immediate);
    }

    public void p() {
        this.f81435a.setVisibility(4);
    }

    public void q(View rootView, final Calendar defaultSelectedDate, ho.c disablePredicate, ho.a eventsPredicate) {
        b bVar;
        HorizontalCalendarView horizontalCalendarView = (HorizontalCalendarView) rootView.findViewById(this.f81442h);
        this.f81435a = horizontalCalendarView;
        horizontalCalendarView.setHasFixedSize(true);
        this.f81435a.setHorizontalScrollBarEnabled(false);
        this.f81435a.b(this);
        new ho.d().h(this);
        ho.c aVar = disablePredicate == null ? this.f81446l : new ho.c.a(disablePredicate, this.f81446l);
        if (this.f81439e == f.MONTHS) {
            bVar = this;
            bVar.f81436b = new fo.e(bVar, this.f81437c, this.f81438d, aVar, eventsPredicate);
        } else {
            bVar = this;
            bVar.f81436b = new fo.b(bVar, bVar.f81437c, bVar.f81438d, aVar, eventsPredicate);
        }
        bVar.f81435a.setAdapter(bVar.f81436b);
        HorizontalCalendarView horizontalCalendarView2 = bVar.f81435a;
        horizontalCalendarView2.setLayoutManager(new HorizontalLayoutManager(horizontalCalendarView2.getContext(), false));
        bVar.f81435a.addOnScrollListener(new e());
        t(new a(defaultSelectedDate));
    }

    public boolean r(int position) {
        return this.f81436b.j(position);
    }

    public int s(Calendar date) {
        if (ho.e.e(date, this.f81437c) || ho.e.d(date, this.f81438d)) {
            return -1;
        }
        int iH = 0;
        if (this.f81439e == f.DAYS) {
            if (!ho.e.f(date, this.f81437c)) {
                iH = ho.e.c(this.f81437c, date);
            }
        } else if (!ho.e.g(date, this.f81437c)) {
            iH = ho.e.h(this.f81437c, date);
        }
        return iH + (this.f81440f / 2);
    }

    public void t(Runnable runnable) {
        this.f81435a.post(runnable);
    }

    public void u() {
        this.f81436b.notifyDataSetChanged();
    }

    public void v(int position1, int... positions) {
        this.f81436b.notifyItemChanged(position1, "UPDATE_SELECTOR");
        if (positions == null || positions.length <= 0) {
            return;
        }
        for (int i10 : positions) {
            this.f81436b.notifyItemChanged(i10, "UPDATE_SELECTOR");
        }
    }

    public void w(Calendar date, boolean immediate) {
        int iS = s(date);
        if (!immediate) {
            this.f81435a.setSmoothScrollSpeed(90.0f);
            a(iS);
            return;
        }
        b(iS);
        ho.b bVar = this.f81441g;
        if (bVar != null) {
            bVar.c(date, iS);
        }
    }

    public void x(ho.b calendarListener) {
        this.f81441g = calendarListener;
    }

    @TargetApi(21)
    public void y(float elevation) {
        this.f81435a.setElevation(elevation);
    }

    public void z(Calendar startDate, Calendar endDate) {
        this.f81437c = startDate;
        this.f81438d = endDate;
        this.f81436b.m(startDate, endDate, false);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f81453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Calendar f81454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Calendar f81455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Calendar f81456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f f81457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f81458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ho.c f81459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ho.a f81460i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public eo.a f81461j;

        public d(View rootView, int viewId) {
            this.f81453b = rootView;
            this.f81452a = viewId;
        }

        public d a(ho.a predicate) {
            this.f81460i = predicate;
            return this;
        }

        public b b() throws IllegalStateException {
            g();
            if (this.f81461j == null) {
                eo.a aVar = new eo.a(this);
                this.f81461j = aVar;
                aVar.g();
            }
            b bVar = new b(this, this.f81461j.d(), this.f81461j.e(), this.f81461j.f());
            bVar.q(this.f81453b, this.f81456e, this.f81459h, this.f81460i);
            return bVar;
        }

        public eo.a c() {
            if (this.f81461j == null) {
                this.f81461j = new eo.a(this);
            }
            return this.f81461j;
        }

        public d d(int numberOfItemsOnScreen) {
            this.f81458g = numberOfItemsOnScreen;
            return this;
        }

        public d e(Calendar date) {
            this.f81456e = date;
            return this;
        }

        public d f(ho.c predicate) {
            this.f81459h = predicate;
            return this;
        }

        public final void g() throws IllegalStateException {
            if (this.f81454c == null || this.f81455d == null) {
                throw new IllegalStateException("HorizontalCalendar range was not specified, either startDate or endDate is null!");
            }
            if (this.f81457f == null) {
                this.f81457f = f.DAYS;
            }
            if (this.f81458g <= 0) {
                this.f81458g = 5;
            }
            if (this.f81456e == null) {
                this.f81456e = Calendar.getInstance();
            }
        }

        public d h(f mode) {
            this.f81457f = mode;
            return this;
        }

        public d i(Calendar startDate, Calendar endDate) {
            this.f81454c = startDate;
            this.f81455d = endDate;
            return this;
        }

        public d(Activity activity, int viewId) {
            this.f81453b = activity.getWindow().getDecorView();
            this.f81452a = viewId;
        }
    }
}
