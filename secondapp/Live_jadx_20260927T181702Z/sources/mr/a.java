package mr;

import androidx.lifecycle.y;
import dr.f1;
import dr.l1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.m0;
import nj.z2;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    @f1
    @l1(version = "2.1")
    public static final int a(@l AtomicInteger atomicInteger, int i10, int i11) {
        m0.p(atomicInteger, "<this>");
        do {
            int i12 = atomicInteger.get();
            if (i10 != i12) {
                return i12;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    @f1
    @l1(version = "2.1")
    public static final int b(@l AtomicIntegerArray atomicIntegerArray, int i10, int i11, int i12) {
        m0.p(atomicIntegerArray, "<this>");
        do {
            int i13 = atomicIntegerArray.get(i10);
            if (i11 != i13) {
                return i13;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i11, i12));
        return i11;
    }

    @f1
    @l1(version = "2.1")
    public static final long c(@l AtomicLong atomicLong, long j10, long j11) {
        m0.p(atomicLong, "<this>");
        do {
            long j12 = atomicLong.get();
            if (j10 != j12) {
                return j12;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        return j10;
    }

    @f1
    @l1(version = "2.1")
    public static final long d(@l AtomicLongArray atomicLongArray, int i10, long j10, long j11) {
        m0.p(atomicLongArray, "<this>");
        do {
            long j12 = atomicLongArray.get(i10);
            if (j10 != j12) {
                return j12;
            }
        } while (!atomicLongArray.compareAndSet(i10, j10, j11));
        return j10;
    }

    @f1
    @l1(version = "2.1")
    public static final <T> T e(@l AtomicReference<T> atomicReference, T t10, T t11) {
        m0.p(atomicReference, "<this>");
        do {
            T t12 = atomicReference.get();
            if (t10 != t12) {
                return t12;
            }
        } while (!y.a(atomicReference, t10, t11));
        return t10;
    }

    @f1
    @l1(version = "2.1")
    public static final <T> T f(@l AtomicReferenceArray<T> atomicReferenceArray, int i10, T t10, T t11) {
        m0.p(atomicReferenceArray, "<this>");
        do {
            T t12 = atomicReferenceArray.get(i10);
            if (t10 != t12) {
                return t12;
            }
        } while (!z2.a(atomicReferenceArray, i10, t10, t11));
        return t10;
    }

    @f1
    @l1(version = "2.1")
    public static final boolean g(@l AtomicBoolean atomicBoolean, boolean z10, boolean z11) {
        m0.p(atomicBoolean, "<this>");
        do {
            boolean z12 = atomicBoolean.get();
            if (z10 != z12) {
                return z12;
            }
        } while (!atomicBoolean.compareAndSet(z10, z11));
        return z10;
    }
}
