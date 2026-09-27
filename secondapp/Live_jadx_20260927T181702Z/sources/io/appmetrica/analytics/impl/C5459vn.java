package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5459vn implements TempCacheStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f98497d;

    public C5459vn(long j10, @oy.l String str, long j11, @oy.l byte[] bArr) {
        this.f98494a = j10;
        this.f98495b = str;
        this.f98496c = j11;
        this.f98497d = bArr;
    }

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(C5459vn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C5459vn c5459vn = (C5459vn) obj;
        if (this.f98494a == c5459vn.f98494a && kotlin.jvm.internal.m0.g(this.f98495b, c5459vn.f98495b) && this.f98496c == c5459vn.f98496c) {
            return Arrays.equals(this.f98497d, c5459vn.f98497d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @oy.l
    public final byte[] getData() {
        return this.f98497d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f98494a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @oy.l
    public final String getScope() {
        return this.f98495b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f98496c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f98497d) + ((f0.p.a(this.f98496c) + ((this.f98495b.hashCode() + (f0.p.a(this.f98494a) * 31)) * 31)) * 31);
    }

    @oy.l
    public final String toString() {
        return "TempCacheEntry(id=" + this.f98494a + ", scope='" + this.f98495b + "', timestamp=" + this.f98496c + ", data=array[" + this.f98497d.length + "])";
    }
}
