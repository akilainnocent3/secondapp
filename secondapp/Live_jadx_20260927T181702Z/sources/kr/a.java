package kr;

import cs.j;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import ur.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j(name = "LocksKt")
@s1({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class a {
    @f
    public static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, ds.a<? extends T> action) {
        m0.p(reentrantReadWriteLock, "<this>");
        m0.p(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            return action.invoke();
        } finally {
            j0.d(1);
            lock.unlock();
            j0.c(1);
        }
    }

    @f
    public static final <T> T b(Lock lock, ds.a<? extends T> action) {
        m0.p(lock, "<this>");
        m0.p(action, "action");
        lock.lock();
        try {
            return action.invoke();
        } finally {
            j0.d(1);
            lock.unlock();
            j0.c(1);
        }
    }

    @f
    public static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, ds.a<? extends T> action) {
        m0.p(reentrantReadWriteLock, "<this>");
        m0.p(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.invoke();
        } finally {
            j0.d(1);
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            j0.c(1);
        }
    }
}
