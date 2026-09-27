package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nr3 implements l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitializationListener f153128a;

    public nr3(InitializationListener initializationListener) {
        this.f153128a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nr3) && kotlin.jvm.internal.m0.g(((nr3) obj).f153128a, this.f153128a);
    }

    public final int hashCode() {
        return this.f153128a.hashCode();
    }

    @Override // yads.l00
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new mr3(this));
    }
}
