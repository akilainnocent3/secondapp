package p2;

import android.widget.NumberPicker;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @androidx.databinding.g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:value", type = NumberPicker.class)})
@y0({y0.a.LIBRARY})
public class s {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements NumberPicker.OnValueChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NumberPicker.OnValueChangeListener f120363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120364b;

        public a(NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
            this.f120363a = onValueChangeListener;
            this.f120364b = oVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i10, int i11) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f120363a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i10, i11);
            }
            this.f120364b.a();
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, oVar));
        }
    }

    @androidx.databinding.d({"android:value"})
    public static void b(NumberPicker numberPicker, int i10) {
        if (numberPicker.getValue() != i10) {
            numberPicker.setValue(i10);
        }
    }
}
