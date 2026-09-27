package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class qr1 {
    public static final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sr1 sr1Var = (sr1) it.next();
            int iOrdinal = sr1Var.f155535b.ordinal();
            if (iOrdinal == 0) {
                lc1.b(sr1Var.f155534a, new Object[0]);
            } else if (iOrdinal == 1) {
                lc1.a(sr1Var.f155534a, new Object[0]);
            }
        }
    }
}
