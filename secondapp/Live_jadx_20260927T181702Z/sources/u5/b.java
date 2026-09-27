package u5;

import java.util.NoSuchElementException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class b implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f139164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f139165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f139166d;

    public b(long j10, long j11) {
        this.f139164b = j10;
        this.f139165c = j11;
        reset();
    }

    public final void d() {
        long j10 = this.f139166d;
        if (j10 < this.f139164b || j10 > this.f139165c) {
            throw new NoSuchElementException();
        }
    }

    public final long e() {
        return this.f139166d;
    }

    @Override // u5.q
    public boolean isEnded() {
        return this.f139166d > this.f139165c;
    }

    @Override // u5.q
    public boolean next() {
        this.f139166d++;
        return !isEnded();
    }

    @Override // u5.q
    public void reset() {
        this.f139166d = this.f139164b - 1;
    }
}
