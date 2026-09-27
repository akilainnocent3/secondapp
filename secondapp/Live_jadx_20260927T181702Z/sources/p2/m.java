package p2;

import android.widget.DatePicker;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:year", type = DatePicker.class), @androidx.databinding.p(attribute = "android:month", type = DatePicker.class), @androidx.databinding.p(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
@y0({y0.a.LIBRARY})
public class m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements DatePicker.OnDateChangedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DatePicker.OnDateChangedListener f120358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.databinding.o f120359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.databinding.o f120360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.databinding.o f120361e;

        public b() {
        }

        public void a(DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
            this.f120358b = onDateChangedListener;
            this.f120359c = oVar;
            this.f120360d = oVar2;
            this.f120361e = oVar3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f120358b;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i10, i11, i12);
            }
            androidx.databinding.o oVar = this.f120359c;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f120360d;
            if (oVar2 != null) {
                oVar2.a();
            }
            androidx.databinding.o oVar3 = this.f120361e;
            if (oVar3 != null) {
                oVar3.a();
            }
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void a(DatePicker datePicker, int i10, int i11, int i12, DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
        if (i10 == 0) {
            i10 = datePicker.getYear();
        }
        if (i12 == 0) {
            i12 = datePicker.getDayOfMonth();
        }
        if (oVar == null && oVar2 == null && oVar3 == null) {
            datePicker.init(i10, i11, i12, onDateChangedListener);
            return;
        }
        b bVar = (b) r.a(datePicker, s2.b.a.f128370b);
        if (bVar == null) {
            bVar = new b();
            r.b(datePicker, bVar, s2.b.a.f128370b);
        }
        bVar.a(onDateChangedListener, oVar, oVar2, oVar3);
        datePicker.init(i10, i11, i12, bVar);
    }
}
