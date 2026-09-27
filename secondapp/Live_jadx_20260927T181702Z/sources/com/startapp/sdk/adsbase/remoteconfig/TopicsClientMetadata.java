package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class TopicsClientMetadata implements Serializable {
    private static final long serialVersionUID = -3156048165050662402L;
    private double enabled = 0.0d;

    @Nullable
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final double a() {
        return this.enabled;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TopicsClientMetadata topicsClientMetadata = (TopicsClientMetadata) obj;
            if (Double.compare(this.enabled, topicsClientMetadata.enabled) == 0 && si.a((Object) this.infoEvents, (Object) topicsClientMetadata.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), this.infoEvents};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
