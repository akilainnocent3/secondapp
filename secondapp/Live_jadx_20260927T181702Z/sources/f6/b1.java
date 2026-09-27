package f6;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class b1 extends g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83355b;

    public b1(v vVar, long j10) {
        super(vVar);
        zi.l0.d(vVar.getPosition() >= j10);
        this.f83355b = j10;
    }

    @Override // f6.g0, f6.v
    public long getLength() {
        return super.getLength() - this.f83355b;
    }

    @Override // f6.g0, f6.v
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f83355b;
    }

    @Override // f6.g0, f6.v
    public long getPosition() {
        return super.getPosition() - this.f83355b;
    }

    @Override // f6.g0, f6.v
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        super.setRetryPosition(j10 + this.f83355b, e10);
    }
}
