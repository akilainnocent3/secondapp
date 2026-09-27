package yads;

import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rs3 implements em3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstreamAdRequestConfiguration f155141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ga1 f155142b;

    public rs3(InstreamAdRequestConfiguration instreamAdRequestConfiguration, ga1 ga1Var) {
        this.f155141a = instreamAdRequestConfiguration;
        this.f155142b = ga1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs3)) {
            return false;
        }
        rs3 rs3Var = (rs3) obj;
        return kotlin.jvm.internal.m0.g(this.f155141a, rs3Var.f155141a) && this.f155142b == rs3Var.f155142b;
    }

    public final int hashCode() {
        return this.f155142b.hashCode() + (this.f155141a.hashCode() * 31);
    }

    public final String toString() {
        return "YandexInstreamAdRequestConfigurationAdapter(adRequestConfiguration=" + this.f155141a + ", instreamLoaderType=" + this.f155142b + gi.j.f86771d;
    }
}
