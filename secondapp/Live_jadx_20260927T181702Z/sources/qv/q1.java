package qv;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class q1 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final q1 f123030a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final ReentrantReadWriteLock f123031b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final WeakHashMap<Class<? extends Throwable>, ds.l<Throwable, Throwable>> f123032c = new WeakHashMap<>();

    @Override // qv.k
    @oy.l
    public ds.l<Throwable, Throwable> a(@oy.l Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f123031b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            ds.l<Throwable, Throwable> lVar = f123032c.get(cls);
            lock.unlock();
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, ds.l<Throwable, Throwable>> weakHashMap = f123032c;
                ds.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                    return lVar2;
                }
                ds.l<Throwable, Throwable> lVarG = u.g(cls);
                weakHashMap.put(cls, lVarG);
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return lVarG;
            } catch (Throwable th2) {
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
