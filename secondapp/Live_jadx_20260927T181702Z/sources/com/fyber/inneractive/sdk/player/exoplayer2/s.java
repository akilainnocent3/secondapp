package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f46811d = new s(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f46812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f46813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46814c;

    public s(float f10, float f11) {
        this.f46812a = f10;
        this.f46813b = f11;
        this.f46814c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f46812a == sVar.f46812a && this.f46813b == sVar.f46813b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f46813b) + ((Float.floatToRawIntBits(this.f46812a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
