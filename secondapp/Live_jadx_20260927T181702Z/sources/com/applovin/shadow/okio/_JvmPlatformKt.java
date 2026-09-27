package com.applovin.shadow.okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class _JvmPlatformKt {
    @oy.l
    public static final byte[] asUtf8ToByteArray(@oy.l String str) {
        m0.p(str, "<this>");
        byte[] bytes = str.getBytes(cv.g.f77202b);
        m0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @oy.l
    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    @oy.l
    public static final String toUtf8String(@oy.l byte[] bArr) {
        m0.p(bArr, "<this>");
        return new String(bArr, cv.g.f77202b);
    }

    public static final <T> T withLock(@oy.l ReentrantLock reentrantLock, @oy.l ds.a<? extends T> action) {
        m0.p(reentrantLock, "<this>");
        m0.p(action, "action");
        reentrantLock.lock();
        try {
            return action.invoke();
        } finally {
            j0.d(1);
            reentrantLock.unlock();
            j0.c(1);
        }
    }
}
