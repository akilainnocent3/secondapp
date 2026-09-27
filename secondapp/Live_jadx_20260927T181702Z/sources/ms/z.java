package ms;

import dr.l1;
import dr.l2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public final class z implements Iterator<l2>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f115178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f115179e;

    public /* synthetic */ z(long j10, long j11, long j12, kotlin.jvm.internal.x xVar) {
        this(j10, j11, j12);
    }

    public long a() {
        long j10 = this.f115179e;
        if (j10 != this.f115176b) {
            this.f115179e = l2.h(this.f115178d + j10);
            return j10;
        }
        if (!this.f115177c) {
            throw new NoSuchElementException();
        }
        this.f115177c = false;
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f115177c;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ l2 next() {
        return l2.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public z(long j10, long j11, long j12) {
        this.f115176b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 : Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0) {
            z10 = true;
        }
        this.f115177c = z10;
        this.f115178d = l2.h(j12);
        this.f115179e = this.f115177c ? j10 : j11;
    }
}
