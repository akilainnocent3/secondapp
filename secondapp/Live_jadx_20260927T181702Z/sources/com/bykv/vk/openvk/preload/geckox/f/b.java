package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f31814a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f31815b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f31817d;

    private b(String str, FileLock fileLock) {
        this.f31816c = str;
        this.f31817d = fileLock;
    }

    public static b a(String str) throws Exception {
        f31815b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f31814a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f31815b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f31817d.a();
            this.f31817d.b();
            Lock lock = f31814a.get(this.f31816c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f31815b.unlock();
        }
    }
}
