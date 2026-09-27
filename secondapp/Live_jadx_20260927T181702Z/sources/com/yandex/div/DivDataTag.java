package com.yandex.div;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class DivDataTag {
    public static final DivDataTag INVALID = new DivDataTag("");

    @NonNull
    private final String mId;

    public DivDataTag(@NonNull String str) {
        this.mId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mId.equals(((DivDataTag) obj).mId);
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    public int hashCode() {
        return this.mId.hashCode();
    }
}
