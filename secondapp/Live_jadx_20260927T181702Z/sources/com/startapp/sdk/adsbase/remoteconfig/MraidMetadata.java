package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class MraidMetadata implements Serializable {
    private static final long serialVersionUID = 1347811483134629452L;
    private double deferImpression;

    @Nullable
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    @Nullable
    private String scriptUrl;

    @Nullable
    private String ttl;

    public final double a() {
        return this.deferImpression;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final String c() {
        return this.scriptUrl;
    }

    public final String d() {
        return this.ttl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MraidMetadata mraidMetadata = (MraidMetadata) obj;
            if (Double.compare(this.deferImpression, mraidMetadata.deferImpression) == 0 && si.a((Object) this.scriptUrl, (Object) mraidMetadata.scriptUrl) && si.a((Object) this.ttl, (Object) mraidMetadata.ttl) && si.a((Object) this.infoEvents, (Object) mraidMetadata.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.scriptUrl, this.ttl, Double.valueOf(this.deferImpression), this.infoEvents};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
