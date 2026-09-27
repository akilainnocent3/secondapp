package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f46912d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f46914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46915c;

    static {
        new z(new y[0]);
    }

    public z(y... yVarArr) {
        this.f46914b = yVarArr;
        this.f46913a = yVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f46913a == zVar.f46913a && Arrays.equals(this.f46914b, zVar.f46914b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f46915c == 0) {
            this.f46915c = Arrays.hashCode(this.f46914b);
        }
        return this.f46915c;
    }
}
