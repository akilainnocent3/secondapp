package p2;

import android.widget.TimePicker;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class g0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements TimePicker.OnTimeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f120343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120345c;

        public a(TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
            this.f120343a = onTimeChangedListener;
            this.f120344b = oVar;
            this.f120345c = oVar2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f120343a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i10, i11);
            }
            androidx.databinding.o oVar = this.f120344b;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f120345c;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
    }

    @androidx.databinding.n(attribute = "android:hour")
    public static int a(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @androidx.databinding.n(attribute = "android:minute")
    public static int b(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @androidx.databinding.d({"android:hour"})
    public static void c(TimePicker timePicker, int i10) {
        if (timePicker.getHour() != i10) {
            timePicker.setHour(i10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
        if (oVar == null && oVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, oVar, oVar2));
        }
    }

    @androidx.databinding.d({"android:minute"})
    public static void e(TimePicker timePicker, int i10) {
        if (timePicker.getMinute() != i10) {
            timePicker.setMinute(i10);
        }
    }
}
