package bg;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21226d;

    public b(long j10, long j11) {
        this.f21224b = j10;
        this.f21225c = j11;
        reset();
    }

    public final void d() {
        long j10 = this.f21226d;
        if (j10 < this.f21224b || j10 > this.f21225c) {
            throw new NoSuchElementException();
        }
    }

    public final long e() {
        return this.f21226d;
    }

    @Override // bg.o
    public boolean isEnded() {
        return this.f21226d > this.f21225c;
    }

    @Override // bg.o
    public boolean next() {
        this.f21226d++;
        return !isEnded();
    }

    @Override // bg.o
    public void reset() {
        this.f21226d = this.f21224b - 1;
    }
}
