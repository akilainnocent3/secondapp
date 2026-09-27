package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f46931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46932c;

    public h(b... bVarArr) {
        this.f46931b = bVarArr;
        this.f46930a = bVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f46931b, ((h) obj).f46931b);
    }

    public final int hashCode() {
        if (this.f46932c == 0) {
            this.f46932c = Arrays.hashCode(this.f46931b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f46932c;
    }
}
