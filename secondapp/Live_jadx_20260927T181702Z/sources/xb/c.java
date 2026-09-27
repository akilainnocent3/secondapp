package xb;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, a> f144766a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f144767b = new b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lock f144768a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f144769b;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f144770b = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<a> f144771a = new ArrayDeque();

        public a a() {
            a aVarPoll;
            synchronized (this.f144771a) {
                aVarPoll = this.f144771a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        public void b(a aVar) {
            synchronized (this.f144771a) {
                try {
                    if (this.f144771a.size() < 10) {
                        this.f144771a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f144766a.get(str);
                if (aVarA == null) {
                    aVarA = this.f144767b.a();
                    this.f144766a.put(str, aVarA);
                }
                aVarA.f144769b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f144768a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) pc.m.e(this.f144766a.get(str));
                int i10 = aVar.f144769b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f144769b);
                }
                int i11 = i10 - 1;
                aVar.f144769b = i11;
                if (i11 == 0) {
                    a aVarRemove = this.f144766a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f144767b.b(aVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f144768a.unlock();
    }
}
