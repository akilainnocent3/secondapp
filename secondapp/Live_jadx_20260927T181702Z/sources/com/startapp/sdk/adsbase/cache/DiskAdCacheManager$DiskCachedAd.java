package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.f;
import com.startapp.sdk.internal.m8;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class DiskAdCacheManager$DiskCachedAd implements Serializable {
    private static final long serialVersionUID = -9194311006094821018L;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private f f74311ad;
    private String html;

    /* JADX WARN: Multi-variable type inference failed */
    public DiskAdCacheManager$DiskCachedAd(f fVar) {
        this.f74311ad = fVar;
        if (fVar == 0 || !(fVar instanceof m8)) {
            return;
        }
        this.html = ((m8) fVar).f75169b;
    }

    public final f a() {
        return this.f74311ad;
    }

    public final String b() {
        return this.html;
    }
}
