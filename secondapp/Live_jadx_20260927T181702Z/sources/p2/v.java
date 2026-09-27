package p2;

import android.widget.RadioGroup;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
@y0({y0.a.LIBRARY})
public class v {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f120373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120374b;

        public a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f120373a = onCheckedChangeListener;
            this.f120374b = oVar;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f120373a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i10);
            }
            this.f120374b.a();
        }
    }

    @androidx.databinding.d({"android:checkedButton"})
    public static void a(RadioGroup radioGroup, int i10) {
        if (i10 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
