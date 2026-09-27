package p2;

import android.widget.CompoundButton;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @androidx.databinding.g(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checked", type = CompoundButton.class)})
@y0({y0.a.LIBRARY})
public class k {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f120351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120352b;

        public a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f120351a = onCheckedChangeListener;
            this.f120352b = oVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f120351a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
            }
            this.f120352b.a();
        }
    }

    @androidx.databinding.d({"android:checked"})
    public static void a(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isChecked() != z10) {
            compoundButton.setChecked(z10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
