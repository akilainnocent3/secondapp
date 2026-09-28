package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ksb0 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height = view.getHeight();
        if (height == i8 - i6 || height <= 0) {
            return;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            if (height / view2.getHeight() >= 0.38f) {
                ytw<Boolean> ytwVar = wag0.i;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar).setValue(bool);
                ((x5a0) wag0.h).setValue(bool);
                return;
            }
            ytw<Boolean> ytwVar2 = wag0.i;
            Boolean bool2 = Boolean.TRUE;
            ((x5a0) ytwVar2).setValue(bool2);
            ((x5a0) wag0.h).setValue(bool2);
        }
    }
}
