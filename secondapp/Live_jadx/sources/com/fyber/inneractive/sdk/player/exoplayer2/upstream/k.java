package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C4235d4;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f47032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47037f;

    public k(Uri uri, long j10, long j11, long j12, String str, int i10) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        if (j12 <= 0 && j12 != -1) {
            throw new IllegalArgumentException();
        }
        this.f47032a = uri;
        this.f47033b = j10;
        this.f47034c = j11;
        this.f47035d = j12;
        this.f47036e = str;
        this.f47037f = i10;
    }

    public final String toString() {
        return "DataSpec[" + this.f47032a + ", " + Arrays.toString((byte[]) null) + ", " + this.f47033b + ", " + this.f47034c + ", " + this.f47035d + ", " + this.f47036e + ", " + this.f47037f + C4235d4.j.f61462e;
    }
}
