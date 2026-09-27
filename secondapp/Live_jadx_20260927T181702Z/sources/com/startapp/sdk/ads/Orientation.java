package com.startapp.sdk.ads;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public enum Orientation {
    PORTRAIT(1),
    LANDSCAPE(2),
    AUTO(3);

    private final int index;

    Orientation(int i10) {
        this.index = i10;
    }

    @NonNull
    public static Orientation getByName(@Nullable String str) {
        if (str != null) {
            try {
                return valueOf(str);
            } catch (RuntimeException unused) {
            }
        }
        return AUTO;
    }

    public int getIndex() {
        return this.index;
    }
}
