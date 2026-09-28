package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class i3d0 {
    public static h3d0 a(x5d0 x5d0Var) {
        h5d0 h5d0Var = x5d0Var.e;
        h3d0.a aVarB = b(h5d0Var.a, h5d0Var.b);
        h5d0 h5d0Var2 = x5d0Var.i;
        h3d0.a aVarB2 = b(h5d0Var2.a, h5d0Var2.b);
        r2d0.a.getClass();
        return new h3d0(r2d0.a.b.c, r3d0.a, aVarB, aVarB2);
    }

    public static h3d0.a b(String str, String str2) {
        IntRange intRangeN = f.n(0, 5);
        ArrayList arrayList = new ArrayList(l48.r(intRangeN, 10));
        Iterator<Integer> it = intRangeN.iterator();
        while (((mwo) it).c) {
            arrayList.add(new h3d0.a.AbstractC0619a.b(((zvo) it).nextInt() + 1));
        }
        return new h3d0.a(str, str2, 0, a4h.b(arrayList));
    }

    public static h3d0.a.AbstractC0619a c(nwc0 nwc0Var, int i) {
        return nwc0Var.b ? new h3d0.a.AbstractC0619a.c(i + 1) : new h3d0.a.AbstractC0619a.C0620a(i + 1);
    }

    public static r3d0 d(m5d0 m5d0Var) {
        int iOrdinal = m5d0Var.ordinal();
        if (iOrdinal == 0) {
            return r3d0.a;
        }
        if (iOrdinal == 1) {
            return r3d0.b;
        }
        uhc.a();
        return null;
    }

    public static h3d0.a e(h3d0.a aVar, nwc0 nwc0Var, f2d0 f2d0Var, int i) {
        int iOrdinal = f2d0Var.ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayListC0 = CollectionsKt.C0(aVar.d);
            if (i < aVar.d.size()) {
                arrayListC0.set(i, new h3d0.a.AbstractC0619a.d(i + 1));
            } else {
                arrayListC0.add(new h3d0.a.AbstractC0619a.d(i + 1));
            }
            return h3d0.a.a(aVar, 0, a4h.b(arrayListC0), 7);
        }
        if (iOrdinal != 1) {
            uhc.a();
            return null;
        }
        boolean z = nwc0Var.b;
        h3d0.a.AbstractC0619a abstractC0619aC = c(nwc0Var, i);
        int i2 = aVar.c + (z ? 1 : 0);
        ArrayList arrayListC1 = CollectionsKt.C0(aVar.d);
        arrayListC1.set(i, abstractC0619aC);
        return h3d0.a.a(aVar, i2, a4h.b(arrayListC1), 3);
    }
}
