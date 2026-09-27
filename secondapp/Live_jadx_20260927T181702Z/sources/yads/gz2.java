package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gz2 implements u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f149837b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f149838a;

    public gz2(v9 v9Var) {
        this.f149838a = v9Var;
    }

    @Override // yads.u2
    public final long a() {
        Long l10 = this.f149838a.f156840s;
        return l10 != null ? l10.longValue() : f149837b;
    }

    @Override // yads.u2
    public final long a(long j10) {
        Long l10 = this.f149838a.f156840s;
        return l10 != null ? Math.min(j10, l10.longValue()) : j10;
    }
}
