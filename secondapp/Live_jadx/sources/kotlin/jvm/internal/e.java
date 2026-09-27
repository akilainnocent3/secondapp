package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends fr.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final double[] f102724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102725c;

    public e(@oy.l double[] array) {
        m0.p(array, "array");
        this.f102724b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102725c < this.f102724b.length;
    }

    @Override // fr.s0
    public double nextDouble() {
        try {
            double[] dArr = this.f102724b;
            int i10 = this.f102725c;
            this.f102725c = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102725c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
