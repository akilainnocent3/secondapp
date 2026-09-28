package androidx.compose.foundation.layout;

import defpackage.gnn;
import defpackage.ht;
import defpackage.k7f;
import defpackage.k7k0;
import defpackage.n54;
import defpackage.p9l;
import defpackage.rqe;
import defpackage.wy7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        rqe rqeVar = rqe.b;
        a = new FillElement(rqeVar, 1.0f);
        rqe rqeVar2 = rqe.a;
        b = new FillElement(rqeVar2, 1.0f);
        rqe rqeVar3 = rqe.c;
        c = new FillElement(rqeVar3, 1.0f);
        n54.a aVar = ht.a.n;
        int i2 = 2;
        d = new WrapContentElement(rqeVar, false, new p9l(aVar, i2), aVar);
        n54.a aVar2 = ht.a.m;
        e = new WrapContentElement(rqeVar, false, new p9l(aVar2, i2), aVar2);
        n54.b bVar = ht.a.k;
        f = new WrapContentElement(rqeVar2, false, new k7k0(bVar), bVar);
        n54.b bVar2 = ht.a.j;
        g = new WrapContentElement(rqeVar2, false, new k7k0(bVar2), bVar2);
        n54 n54Var = ht.a.e;
        h = new WrapContentElement(rqeVar3, false, new wy7(n54Var, i2), n54Var);
        n54 n54Var2 = ht.a.a;
        i = new WrapContentElement(rqeVar3, false, new wy7(n54Var2, i2), n54Var2);
    }

    public static androidx.compose.ui.d A(androidx.compose.ui.d dVar, n54.b bVar, int i2) {
        if ((i2 & 1) != 0) {
            bVar = ht.a.k;
        }
        return z(dVar, bVar, (i2 & 2) == 0);
    }

    public static final androidx.compose.ui.d B(androidx.compose.ui.d dVar, ht htVar, boolean z) {
        WrapContentElement wrapContentElement;
        if (!Intrinsics.g(htVar, ht.a.e) || z) {
            wrapContentElement = (!Intrinsics.g(htVar, ht.a.a) || z) ? new WrapContentElement(rqe.c, z, new wy7(htVar, 2), htVar) : i;
        } else {
            wrapContentElement = h;
        }
        return dVar.n(wrapContentElement);
    }

    public static androidx.compose.ui.d C(androidx.compose.ui.d dVar, n54 n54Var, int i2) {
        if ((i2 & 1) != 0) {
            n54Var = ht.a.e;
        }
        return B(dVar, n54Var, (i2 & 2) == 0);
    }

    public static androidx.compose.ui.d D(androidx.compose.ui.d dVar, n54.a aVar, int i2) {
        WrapContentElement wrapContentElement;
        int i3 = i2 & 1;
        n54.a aVar2 = ht.a.n;
        if (i3 != 0) {
            aVar = aVar2;
        }
        int i4 = 2;
        boolean z = (i2 & 2) == 0;
        if (!aVar.equals(aVar2) || z) {
            wrapContentElement = (!aVar.equals(ht.a.m) || z) ? new WrapContentElement(rqe.b, z, new p9l(aVar, i4), aVar) : e;
        } else {
            wrapContentElement = d;
        }
        return dVar.n(wrapContentElement);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f2, float f3) {
        return dVar.n(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(dVar, f2, f3);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(f2 == 1.0f ? b : new FillElement(rqe.a, f2));
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(f2 == 1.0f ? c : new FillElement(rqe.c, f2));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(f2 == 1.0f ? a : new FillElement(rqe.b, f2));
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(new SizeElement(0.0f, f2, 0.0f, f2, true, gnn.a, 5));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f2, float f3) {
        return dVar.n(new SizeElement(0.0f, f2, 0.0f, f3, true, gnn.a, 5));
    }

    public static androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return j(dVar, f2, f3);
    }

    public static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(new SizeElement(0.0f, f2, 0.0f, f2, false, gnn.a, 5));
    }

    public static final androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f2, float f3) {
        return dVar.n(new SizeElement(0.0f, f2, 0.0f, f3, false, gnn.a, 5));
    }

    public static final androidx.compose.ui.d n(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(new SizeElement(f2, f2, f2, f2, false, gnn.a));
    }

    public static final androidx.compose.ui.d o(androidx.compose.ui.d dVar, float f2, float f3) {
        return dVar.n(new SizeElement(f2, f3, f2, f3, false, gnn.a));
    }

    public static androidx.compose.ui.d p(androidx.compose.ui.d dVar, float f2, float f3, float f4, float f5, int i2) {
        return dVar.n(new SizeElement(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false, gnn.a));
    }

    public static final androidx.compose.ui.d q(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(new SizeElement(f2, 0.0f, f2, 0.0f, false, gnn.a, 10));
    }

    public static final androidx.compose.ui.d r(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(new SizeElement(f2, f2, f2, f2, true, gnn.a));
    }

    public static final androidx.compose.ui.d s(long j, androidx.compose.ui.d dVar) {
        return t(dVar, k7f.c(j), k7f.b(j));
    }

    public static final androidx.compose.ui.d t(androidx.compose.ui.d dVar, float f2, float f3) {
        return dVar.n(new SizeElement(f2, f3, f2, f3, true, gnn.a));
    }

    public static final androidx.compose.ui.d u(androidx.compose.ui.d dVar, float f2, float f3, float f4, float f5) {
        return dVar.n(new SizeElement(f2, f3, f4, f5, true, gnn.a));
    }

    public static androidx.compose.ui.d v(androidx.compose.ui.d dVar, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return u(dVar, f2, f3, f4, (i2 & 8) == 0 ? 24.0f : Float.NaN);
    }

    public static final androidx.compose.ui.d w(androidx.compose.ui.d dVar, float f2) {
        return dVar.n(new SizeElement(f2, 0.0f, f2, 0.0f, true, gnn.a, 10));
    }

    public static final androidx.compose.ui.d x(androidx.compose.ui.d dVar, float f2, float f3) {
        return dVar.n(new SizeElement(f2, 0.0f, f3, 0.0f, true, gnn.a, 10));
    }

    public static androidx.compose.ui.d y(androidx.compose.ui.d dVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return x(dVar, f2, f3);
    }

    public static final androidx.compose.ui.d z(androidx.compose.ui.d dVar, ht.c cVar, boolean z) {
        WrapContentElement wrapContentElement;
        if (!Intrinsics.g(cVar, ht.a.k) || z) {
            wrapContentElement = (!Intrinsics.g(cVar, ht.a.j) || z) ? new WrapContentElement(rqe.a, z, new k7k0(cVar), cVar) : g;
        } else {
            wrapContentElement = f;
        }
        return dVar.n(wrapContentElement);
    }
}
