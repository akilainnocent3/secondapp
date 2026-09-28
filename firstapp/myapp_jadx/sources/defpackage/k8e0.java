package defpackage;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class k8e0 {
    public static final Range<Integer> a = new Range<>(0, 0);

    public static abstract class a {
    }

    public static xk1.a a(Size size) {
        xk1.a aVar = new xk1.a();
        if (size == null) {
            bmy.a("Null resolution");
            return null;
        }
        aVar.a = size;
        aVar.b = size;
        aVar.d = 0;
        Range<Integer> range = a;
        if (range == null) {
            bmy.a("Null expectedFrameRateRange");
            return null;
        }
        aVar.e = range;
        aVar.c = dhf.d;
        aVar.g = Boolean.FALSE;
        return aVar;
    }

    public abstract dhf b();

    public abstract Range<Integer> c();

    public abstract hoa d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract xk1.a i();
}
