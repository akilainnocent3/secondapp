package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z3s implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xr5 xr5Var = (xr5) obj;
        xr5 xr5Var2 = (xr5) obj2;
        long j = xr5Var.f;
        long j2 = xr5Var2.f;
        if (j - j2 == 0) {
            return xr5Var.compareTo(xr5Var2);
        }
        return j < j2 ? -1 : 1;
    }
}
