package d1;

import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.t0(26)
    @oy.m
    public Configuration f77692b;

    public x(boolean z10) {
        this.f77691a = z10;
    }

    @k.t0(26)
    @oy.l
    public final Configuration a() {
        Configuration configuration = this.f77692b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean b() {
        return this.f77691a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k.t0(26)
    public x(boolean z10, @oy.l Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.m0.p(newConfig, "newConfig");
        this.f77692b = newConfig;
    }
}
