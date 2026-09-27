package com.startapp.sdk.triggeredlinks;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class PeriodicAppEventMetadata implements Serializable {
    private static final long serialVersionUID = -3371103410620683752L;
    private int intervalInSeconds;

    @Nullable
    private String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) obj;
            if (this.intervalInSeconds != periodicAppEventMetadata.intervalInSeconds) {
                return false;
            }
            String str = this.url;
            String str2 = periodicAppEventMetadata.url;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.url;
        return ((str != null ? str.hashCode() : 0) * 31) + this.intervalInSeconds;
    }
}
