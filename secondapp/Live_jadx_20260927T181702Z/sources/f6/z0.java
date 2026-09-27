package f6;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class z0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83677b;

    public z0(long j10) {
        this(j10, 0L);
    }

    @Override // f6.w0
    public /* synthetic */ boolean e() {
        return v0.a(this);
    }

    @Override // f6.w0
    public long getDurationUs() {
        return this.f83676a;
    }

    @Override // f6.w0
    public w0.a getSeekPoints(long j10) {
        return new w0.a(new x0(j10, this.f83677b));
    }

    @Override // f6.w0
    public boolean isSeekable() {
        return true;
    }

    public z0(long j10, long j11) {
        this.f83676a = j10;
        this.f83677b = j11;
    }
}
