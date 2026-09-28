package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class syb0 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (i9 == i8 - i6 || i9 <= 0) {
            return;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            if (i9 / view2.getHeight() >= 0.38f) {
                ytw<Boolean> ytwVar = xag0.i;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar).setValue(bool);
                ((x5a0) xag0.h).setValue(bool);
                return;
            }
            ytw<Boolean> ytwVar2 = xag0.i;
            Boolean bool2 = Boolean.TRUE;
            ((x5a0) ytwVar2).setValue(bool2);
            ((x5a0) xag0.h).setValue(bool2);
        }
    }
}
