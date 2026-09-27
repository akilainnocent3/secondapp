package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends fr.g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final long[] f102732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102733c;

    public k(@oy.l long[] array) {
        m0.p(array, "array");
        this.f102732b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102733c < this.f102732b.length;
    }

    @Override // fr.g1
    public long nextLong() {
        try {
            long[] jArr = this.f102732b;
            int i10 = this.f102733c;
            this.f102733c = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102733c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
