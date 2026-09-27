package com.startapp.sdk.adsbase.mraid.bridge;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum MraidState {
    LOADING,
    DEFAULT,
    EXPANDED,
    RESIZED,
    HIDDEN;

    @Override // java.lang.Enum
    public final String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
