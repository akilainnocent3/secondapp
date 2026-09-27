package fr;

import dr.h2;
import dr.i2;
import dr.l2;
import dr.m2;
import dr.r2;
import dr.s2;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class g2 {
    @cs.j(name = "sumOfUByte")
    @dr.l1(version = "1.5")
    public static final int a(@oy.l Iterable<dr.d2> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        Iterator<dr.d2> it = iterable.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = h2.h(iH + h2.h(it.next().k0() & 255));
        }
        return iH;
    }

    @cs.j(name = "sumOfUInt")
    @dr.l1(version = "1.5")
    public static final int b(@oy.l Iterable<h2> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        Iterator<h2> it = iterable.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = h2.h(iH + it.next().m0());
        }
        return iH;
    }

    @cs.j(name = "sumOfULong")
    @dr.l1(version = "1.5")
    public static final long c(@oy.l Iterable<l2> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        Iterator<l2> it = iterable.iterator();
        long jH = 0;
        while (it.hasNext()) {
            jH = l2.h(jH + it.next().m0());
        }
        return jH;
    }

    @cs.j(name = "sumOfUShort")
    @dr.l1(version = "1.5")
    public static final int d(@oy.l Iterable<r2> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        Iterator<r2> it = iterable.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH = h2.h(iH + h2.h(it.next().k0() & r2.f79504e));
        }
        return iH;
    }

    @oy.l
    @dr.l1(version = "1.3")
    @dr.x
    public static final byte[] e(@oy.l Collection<dr.d2> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        byte[] bArrD = dr.e2.d(collection.size());
        Iterator<dr.d2> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dr.e2.t(bArrD, i10, it.next().k0());
            i10++;
        }
        return bArrD;
    }

    @oy.l
    @dr.l1(version = "1.3")
    @dr.x
    public static final int[] f(@oy.l Collection<h2> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        int[] iArrF = i2.f(collection.size());
        Iterator<h2> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i2.v(iArrF, i10, it.next().m0());
            i10++;
        }
        return iArrF;
    }

    @oy.l
    @dr.l1(version = "1.3")
    @dr.x
    public static final long[] g(@oy.l Collection<l2> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        long[] jArrD = m2.d(collection.size());
        Iterator<l2> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            m2.t(jArrD, i10, it.next().m0());
            i10++;
        }
        return jArrD;
    }

    @oy.l
    @dr.l1(version = "1.3")
    @dr.x
    public static final short[] h(@oy.l Collection<r2> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        short[] sArrD = s2.d(collection.size());
        Iterator<r2> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s2.t(sArrD, i10, it.next().k0());
            i10++;
        }
        return sArrD;
    }
}
