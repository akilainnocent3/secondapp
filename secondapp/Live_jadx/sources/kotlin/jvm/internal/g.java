package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends fr.f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final int[] f102728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102729c;

    public g(@oy.l int[] array) {
        m0.p(array, "array");
        this.f102728b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102729c < this.f102728b.length;
    }

    @Override // fr.f1
    public int nextInt() {
        try {
            int[] iArr = this.f102728b;
            int i10 = this.f102729c;
            this.f102729c = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102729c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
