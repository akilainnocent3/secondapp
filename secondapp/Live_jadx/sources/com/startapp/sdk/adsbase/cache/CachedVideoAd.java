package com.startapp.sdk.adsbase.cache;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class CachedVideoAd implements Serializable {
    private static final long serialVersionUID = 3148951403251951818L;
    private String filename;
    private long lastUseTimestamp;
    private String videoLocation;

    public CachedVideoAd(String str) {
        this.filename = str;
    }

    public final String a() {
        return this.videoLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedVideoAd cachedVideoAd = (CachedVideoAd) obj;
        String str = this.filename;
        if (str == null) {
            if (cachedVideoAd.filename != null) {
                return false;
            }
        } else if (!str.equals(cachedVideoAd.filename)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.filename;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final void a(String str) {
        this.videoLocation = str;
    }

    public final void a(long j10) {
        this.lastUseTimestamp = j10;
    }
}
