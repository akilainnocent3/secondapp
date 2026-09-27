package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class CacheResult {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Failure extends CacheResult {

        @l
        private final CacheError error;

        @m
        private final Throwable reason;

        @l
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@l CacheError error, @l CacheSource source, @m Throwable th2) {
            super(null);
            m0.p(error, "error");
            m0.p(source, "source");
            this.error = error;
            this.source = source;
            this.reason = th2;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i10 & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i10 & 4) != 0) {
                th2 = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th2);
        }

        @l
        public final CacheError component1() {
            return this.error;
        }

        @l
        public final CacheSource component2() {
            return this.source;
        }

        @m
        public final Throwable component3() {
            return this.reason;
        }

        @l
        public final Failure copy(@l CacheError error, @l CacheSource source, @m Throwable th2) {
            m0.p(error, "error");
            m0.p(source, "source");
            return new Failure(error, source, th2);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source && m0.g(this.reason, failure.reason);
        }

        @l
        public final CacheError getError() {
            return this.error;
        }

        @m
        public final Throwable getReason() {
            return this.reason;
        }

        @l
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = ((this.error.hashCode() * 31) + this.source.hashCode()) * 31;
            Throwable th2 = this.reason;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @l
        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th2, int i10, x xVar) {
            this(cacheError, (i10 & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i10 & 4) != 0 ? null : th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Success extends CacheResult {

        @l
        private final CachedFile cachedFile;

        @l
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@l CachedFile cachedFile, @l CacheSource source) {
            super(null);
            m0.p(cachedFile, "cachedFile");
            m0.p(source, "source");
            this.cachedFile = cachedFile;
            this.source = source;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i10 & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        @l
        public final CachedFile component1() {
            return this.cachedFile;
        }

        @l
        public final CacheSource component2() {
            return this.source;
        }

        @l
        public final Success copy(@l CachedFile cachedFile, @l CacheSource source) {
            m0.p(cachedFile, "cachedFile");
            m0.p(source, "source");
            return new Success(cachedFile, source);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return m0.g(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        @l
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @l
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        @l
        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    public /* synthetic */ CacheResult(x xVar) {
        this();
    }

    private CacheResult() {
    }
}
