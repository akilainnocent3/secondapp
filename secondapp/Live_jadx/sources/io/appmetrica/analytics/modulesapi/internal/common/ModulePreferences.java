package io.appmetrica.analytics.modulesapi.internal.common;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ModulePreferences {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String str, int i10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return modulePreferences.getInt(str, i10);
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String str, long j10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i10 & 2) != 0) {
                j10 = 0;
            }
            return modulePreferences.getLong(str, j10);
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return modulePreferences.getString(str, str2);
        }
    }

    boolean getBoolean(@l String str, boolean z10);

    int getInt(@l String str, int i10);

    long getLong(@l String str, long j10);

    @m
    String getString(@l String str, @m String str2);

    void putBoolean(@l String str, boolean z10);

    void putInt(@l String str, int i10);

    void putLong(@l String str, long j10);

    void putString(@l String str, @m String str2);
}
