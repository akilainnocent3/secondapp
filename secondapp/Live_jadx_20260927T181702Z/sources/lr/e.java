package lr;

import dr.l1;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class e {
    @l1(version = "2.1")
    @g
    public static final int a(@l AtomicInteger atomicInteger) {
        m0.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(-1);
    }

    @l1(version = "2.1")
    @g
    public static final long b(@l AtomicLong atomicLong) {
        m0.p(atomicLong, "<this>");
        return atomicLong.addAndGet(-1L);
    }

    @l1(version = "2.1")
    @g
    public static final int c(@l AtomicInteger atomicInteger) {
        m0.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(-1);
    }

    @l1(version = "2.1")
    @g
    public static final long d(@l AtomicLong atomicLong) {
        m0.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(-1L);
    }

    @l1(version = "2.1")
    @g
    public static final int e(@l AtomicInteger atomicInteger) {
        m0.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(1);
    }

    @l1(version = "2.1")
    @g
    public static final long f(@l AtomicLong atomicLong) {
        m0.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(1L);
    }

    @l1(version = "2.1")
    @g
    public static final int g(@l AtomicInteger atomicInteger) {
        m0.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(1);
    }

    @l1(version = "2.1")
    @g
    public static final long h(@l AtomicLong atomicLong) {
        m0.p(atomicLong, "<this>");
        return atomicLong.addAndGet(1L);
    }

    @l1(version = "2.1")
    @g
    public static final void i(@l AtomicInteger atomicInteger, int i10) {
        m0.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(-i10);
    }

    @l1(version = "2.1")
    @g
    public static final void j(@l AtomicLong atomicLong, long j10) {
        m0.p(atomicLong, "<this>");
        atomicLong.addAndGet(-j10);
    }

    @l1(version = "2.1")
    @g
    public static final void k(@l AtomicInteger atomicInteger, int i10) {
        m0.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(i10);
    }

    @l1(version = "2.1")
    @g
    public static final void l(@l AtomicLong atomicLong, long j10) {
        m0.p(atomicLong, "<this>");
        atomicLong.addAndGet(j10);
    }
}
