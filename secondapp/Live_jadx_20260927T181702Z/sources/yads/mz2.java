package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mz2 implements ic0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f152788b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f152789a;

    public mz2(v9 v9Var) {
        this.f152789a = v9Var;
    }

    @Override // yads.ic0
    public final long a() {
        Long l10 = this.f152789a.f156840s;
        return l10 != null ? l10.longValue() : f152788b;
    }
}
