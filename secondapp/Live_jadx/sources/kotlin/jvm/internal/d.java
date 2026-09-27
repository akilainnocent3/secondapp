package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends fr.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final char[] f102718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102719c;

    public d(@oy.l char[] array) {
        m0.p(array, "array");
        this.f102718b = array;
    }

    @Override // fr.e0
    public char b() {
        try {
            char[] cArr = this.f102718b;
            int i10 = this.f102719c;
            this.f102719c = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102719c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102719c < this.f102718b.length;
    }
}
