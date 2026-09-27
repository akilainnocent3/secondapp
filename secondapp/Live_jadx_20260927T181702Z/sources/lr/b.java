package lr;

import dr.l1;
import ds.l;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    @l1(version = "2.1")
    @g
    public static final /* synthetic */ <T> AtomicReferenceArray<T> a(int i10, l<? super Integer, ? extends T> init) {
        m0.p(init, "init");
        m0.y(0, "T");
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = init.invoke(Integer.valueOf(i11));
        }
        return new AtomicReferenceArray<>(objArr);
    }

    @oy.l
    @l1(version = "2.1")
    @g
    public static final AtomicIntegerArray b(int i10, @oy.l l<? super Integer, Integer> init) {
        m0.p(init, "init");
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = init.invoke(Integer.valueOf(i11)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @oy.l
    @l1(version = "2.1")
    @g
    public static final AtomicLongArray c(int i10, @oy.l l<? super Integer, Long> init) {
        m0.p(init, "init");
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = init.invoke(Integer.valueOf(i11)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @l1(version = "2.1")
    @g
    public static final int d(@oy.l AtomicIntegerArray atomicIntegerArray, int i10) {
        m0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i10, -1);
    }

    @l1(version = "2.1")
    @g
    public static final long e(@oy.l AtomicLongArray atomicLongArray, int i10) {
        m0.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i10, -1L);
    }

    @l1(version = "2.1")
    @g
    public static final int f(@oy.l AtomicIntegerArray atomicIntegerArray, int i10) {
        m0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i10, -1);
    }

    @l1(version = "2.1")
    @g
    public static final long g(@oy.l AtomicLongArray atomicLongArray, int i10) {
        m0.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i10, -1L);
    }

    @l1(version = "2.1")
    @g
    public static final int h(@oy.l AtomicIntegerArray atomicIntegerArray, int i10) {
        m0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i10, 1);
    }

    @l1(version = "2.1")
    @g
    public static final long i(@oy.l AtomicLongArray atomicLongArray, int i10) {
        m0.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i10, 1L);
    }

    @l1(version = "2.1")
    @g
    public static final int j(@oy.l AtomicIntegerArray atomicIntegerArray, int i10) {
        m0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i10, 1);
    }

    @l1(version = "2.1")
    @g
    public static final long k(@oy.l AtomicLongArray atomicLongArray, int i10) {
        m0.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i10, 1L);
    }
}
