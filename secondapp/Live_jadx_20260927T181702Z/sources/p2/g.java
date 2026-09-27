package p2;

import android.widget.CalendarView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:date", type = CalendarView.class)})
@y0({y0.a.LIBRARY})
public class g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements CalendarView.OnDateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CalendarView.OnDateChangeListener f120341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120342b;

        public a(CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
            this.f120341a = onDateChangeListener;
            this.f120342b = oVar;
        }

        @Override // android.widget.CalendarView.OnDateChangeListener
        public void onSelectedDayChange(CalendarView calendarView, int i10, int i11, int i12) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f120341a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i10, i11, i12);
            }
            this.f120342b.a();
        }
    }

    @androidx.databinding.d({"android:date"})
    public static void a(CalendarView calendarView, long j10) {
        if (calendarView.getDate() != j10) {
            calendarView.setDate(j10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void b(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new a(onDateChangeListener, oVar));
        }
    }
}
