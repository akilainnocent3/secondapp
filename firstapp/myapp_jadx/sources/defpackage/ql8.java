package defpackage;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ql8 implements Comparator<Size> {
    public final boolean a;

    public ql8(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int iSignum = Long.signum((((long) size3.getWidth()) * ((long) size3.getHeight())) - (((long) size4.getWidth()) * ((long) size4.getHeight())));
        return this.a ? iSignum * (-1) : iSignum;
    }
}
