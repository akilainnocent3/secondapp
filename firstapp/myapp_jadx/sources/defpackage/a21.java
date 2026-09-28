package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a21 {
    public abstract List<tnh0.b> a();

    public abstract dhf b();

    public abstract int c();

    public abstract hoa d();

    public abstract int e();

    public abstract Size f();

    public abstract vge0 g();

    public abstract Range<Integer> h();

    public abstract boolean i();

    public final xk1 j(jz5 jz5Var) {
        xk1.a aVarA = k8e0.a(f());
        aVarA.d = Integer.valueOf(e());
        Range<Integer> rangeH = h();
        if (rangeH == null) {
            bmy.a("Null expectedFrameRateRange");
            return null;
        }
        aVarA.e = rangeH;
        dhf dhfVarB = b();
        if (dhfVarB == null) {
            bmy.a("Null dynamicRange");
            return null;
        }
        aVarA.c = dhfVarB;
        aVarA.f = jz5Var;
        return aVarA.a();
    }
}
