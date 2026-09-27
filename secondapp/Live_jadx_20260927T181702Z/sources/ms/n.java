package ms;

import fr.g1;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class n extends g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f115153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f115154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f115155e;

    public n(long j10, long j11, long j12) {
        this.f115152b = j12;
        this.f115153c = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f115154d = z10;
        this.f115155e = z10 ? j10 : j11;
    }

    public final long a() {
        return this.f115152b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f115154d;
    }

    @Override // fr.g1
    public long nextLong() {
        long j10 = this.f115155e;
        if (j10 != this.f115153c) {
            this.f115155e = this.f115152b + j10;
            return j10;
        }
        if (!this.f115154d) {
            throw new NoSuchElementException();
        }
        this.f115154d = false;
        return j10;
    }
}
