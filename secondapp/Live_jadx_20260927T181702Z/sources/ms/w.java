package ms;

import dr.h2;
import dr.l1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public final class w implements Iterator<h2>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115169e;

    public /* synthetic */ w(int i10, int i11, int i12, kotlin.jvm.internal.x xVar) {
        this(i10, i11, i12);
    }

    public int a() {
        int i10 = this.f115169e;
        if (i10 != this.f115166b) {
            this.f115169e = h2.h(this.f115168d + i10);
            return i10;
        }
        if (!this.f115167c) {
            throw new NoSuchElementException();
        }
        this.f115167c = false;
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f115167c;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ h2 next() {
        return h2.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public w(int i10, int i11, int i12) {
        this.f115166b = i11;
        boolean z10 = false;
        int iCompare = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        if (i12 <= 0 ? iCompare >= 0 : iCompare <= 0) {
            z10 = true;
        }
        this.f115167c = z10;
        this.f115168d = h2.h(i12);
        this.f115169e = this.f115167c ? i10 : i11;
    }
}
