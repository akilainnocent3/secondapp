package defpackage;

import android.widget.Scroller;

/* JADX INFO: loaded from: classes7.dex */
public final class pgf extends Scroller {
    public double a;

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, (int) (((double) i5) * this.a));
    }
}
