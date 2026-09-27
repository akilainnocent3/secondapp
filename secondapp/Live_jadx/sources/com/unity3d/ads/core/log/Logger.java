package com.unity3d.ads.core.log;

import ds.a;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Logger {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.error(str, th2);
        }

        public static /* synthetic */ void trace$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            logger.trace(str, th2);
        }
    }

    void debug(@l a<String> aVar);

    void debug(@l String str);

    void error(@l String str, @m Throwable th2);

    @l
    LogLevelInternal getLogLevel();

    void info(@l String str);

    void setLogLevel(@l LogLevelInternal logLevelInternal);

    void trace(@l String str, @m Throwable th2);
}
