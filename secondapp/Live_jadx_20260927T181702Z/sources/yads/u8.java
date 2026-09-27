package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u8 implements v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityVerificationBlockingReasons f156309a;

    public u8(AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
        this.f156309a = adQualityVerificationBlockingReasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8) && kotlin.jvm.internal.m0.g(this.f156309a, ((u8) obj).f156309a);
    }

    public final int hashCode() {
        return this.f156309a.hashCode();
    }

    public final String toString() {
        return "AdQualityVerifierControllerBlockedResult(reasons=" + this.f156309a + gi.j.f86771d;
    }
}
