package zu;

import dr.d2;
import dr.h2;
import dr.l1;
import dr.l2;
import dr.r2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class v0 {
    @cs.j(name = "sumOfUByte")
    @l1(version = "1.5")
    public static final int a(@oy.l m<d2> mVar) {
        kotlin.jvm.internal.m0.p(mVar, "<this>");
        Iterator<d2> it = mVar.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = h2.h(iH + h2.h(it.next().k0() & 255));
        }
        return iH;
    }

    @cs.j(name = "sumOfUInt")
    @l1(version = "1.5")
    public static final int b(@oy.l m<h2> mVar) {
        kotlin.jvm.internal.m0.p(mVar, "<this>");
        Iterator<h2> it = mVar.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = h2.h(iH + it.next().m0());
        }
        return iH;
    }

    @cs.j(name = "sumOfULong")
    @l1(version = "1.5")
    public static final long c(@oy.l m<l2> mVar) {
        kotlin.jvm.internal.m0.p(mVar, "<this>");
        Iterator<l2> it = mVar.iterator();
        long jH = 0;
        while (it.hasNext()) {
            jH = l2.h(jH + it.next().m0());
        }
        return jH;
    }

    @cs.j(name = "sumOfUShort")
    @l1(version = "1.5")
    public static final int d(@oy.l m<r2> mVar) {
        kotlin.jvm.internal.m0.p(mVar, "<this>");
        Iterator<r2> it = mVar.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = h2.h(iH + h2.h(it.next().k0() & r2.f79504e));
        }
        return iH;
    }
}
