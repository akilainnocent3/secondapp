package io.appmetrica.analytics.modulesapi.internal.common;

import java.util.Map;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ModuleSelfReporter {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            moduleSelfReporter.reportError(str, th2);
        }

        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            moduleSelfReporter.reportError(str, str2);
        }
    }

    void reportError(@l String str, @m String str2);

    void reportError(@l String str, @m Throwable th2);

    void reportEvent(int i10, @l String str, @m String str2);

    void reportEvent(@l String str);

    void reportEvent(@l String str, @m String str2);

    void reportEvent(@l String str, @m Map<String, ? extends Object> map);
}
