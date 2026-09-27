package yads;

import com.yandex.mobile.ads.common.AdError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wp3 implements AdError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157476a;

    public wp3(String str) {
        this.f157476a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp3) && kotlin.jvm.internal.m0.g(this.f157476a, ((wp3) obj).f157476a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f157476a;
    }

    public final int hashCode() {
        return this.f157476a.hashCode();
    }

    public final String toString() {
        return "YandexAdError(description=" + this.f157476a + gi.j.f86771d;
    }
}
