package yads;

import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lr3 implements ImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5 f152099a;

    public lr3(j5 j5Var) {
        this.f152099a = j5Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lr3) && kotlin.jvm.internal.m0.g(((lr3) obj).f152099a, this.f152099a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f152099a.f150935b;
    }

    public final int hashCode() {
        return this.f152099a.f150935b.hashCode();
    }
}
