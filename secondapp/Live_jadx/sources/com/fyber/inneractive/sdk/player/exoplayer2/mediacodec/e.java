package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46739b;

    public e(boolean z10, String str) {
        this.f46738a = str;
        this.f46739b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == e.class) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f46738a, eVar.f46738a) && this.f46739b == eVar.f46739b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f46738a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f46739b ? 1231 : 1237);
    }
}
