package yads;

import com.yandex.mobile.ads.rewarded.Reward;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wt3 implements Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq2 f157508a;

    public wt3(pq2 pq2Var) {
        this.f157508a = pq2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wt3) && kotlin.jvm.internal.m0.g(((wt3) obj).f157508a, this.f157508a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return ((bw2) this.f157508a).f147382a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return ((bw2) this.f157508a).f147383b;
    }

    public final int hashCode() {
        return this.f157508a.hashCode();
    }
}
