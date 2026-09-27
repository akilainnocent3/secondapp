package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface CachedDataProvider {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class CachedData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f95306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f95307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f95308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f95309d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f95310e = null;

        public CachedData(long j10, long j11, @NonNull String str) {
            this.f95306a = String.format("[CachedData-%s]", str);
            this.f95307b = j10;
            this.f95308c = j11;
        }

        @Nullable
        public T getData() {
            return (T) this.f95310e;
        }

        @h1
        public long getExpiryTime() {
            return this.f95308c;
        }

        @h1
        public long getRefreshTime() {
            return this.f95307b;
        }

        public final boolean isEmpty() {
            return this.f95310e == null;
        }

        public void setData(@Nullable T t10) {
            this.f95310e = t10;
            this.f95309d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j10, long j11) {
            this.f95307b = j10;
            this.f95308c = j11;
        }

        public final boolean shouldClearData() {
            if (this.f95309d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f95309d;
            return jCurrentTimeMillis > this.f95308c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f95309d;
            return jCurrentTimeMillis > this.f95307b || jCurrentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f95306a + "', refreshTime=" + this.f95307b + ", expiryTime=" + this.f95308c + ", mCachedTime=" + this.f95309d + ", mCachedData=" + this.f95310e + fw.b.f85383j;
        }
    }
}
