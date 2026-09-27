package ff;

import af.n;
import af.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83960c;

    public c(n nVar, long j10) {
        super(nVar);
        eh.a.a(nVar.getPosition() >= j10);
        this.f83960c = j10;
    }

    @Override // af.x, af.n
    public long getLength() {
        return super.getLength() - this.f83960c;
    }

    @Override // af.x, af.n
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f83960c;
    }

    @Override // af.x, af.n
    public long getPosition() {
        return super.getPosition() - this.f83960c;
    }

    @Override // af.x, af.n
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        super.setRetryPosition(j10 + this.f83960c, e10);
    }
}
