package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.bi;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AppSessionConfig implements Serializable {
    private static final long serialVersionUID = 2463582211707601660L;

    @TypeInfo(name = "backgroundTimeout", parser = bi.class)
    private long timeoutMillis = 600000;

    public final long a() {
        return this.timeoutMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.timeoutMillis == ((AppSessionConfig) obj).timeoutMillis;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.timeoutMillis)};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
