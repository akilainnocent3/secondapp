package d1;

import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.t0(26)
    @oy.m
    public Configuration f77639b;

    public s0(boolean z10) {
        this.f77638a = z10;
    }

    @k.t0(26)
    @oy.l
    public final Configuration a() {
        Configuration configuration = this.f77639b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean b() {
        return this.f77638a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k.t0(26)
    public s0(boolean z10, @oy.l Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.m0.p(newConfig, "newConfig");
        this.f77639b = newConfig;
    }
}
