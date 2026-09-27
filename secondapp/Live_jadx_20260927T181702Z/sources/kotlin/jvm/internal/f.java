package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends fr.x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final float[] f102726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102727c;

    public f(@oy.l float[] array) {
        m0.p(array, "array");
        this.f102726b = array;
    }

    @Override // fr.x0
    public float b() {
        try {
            float[] fArr = this.f102726b;
            int i10 = this.f102727c;
            this.f102727c = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102727c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102727c < this.f102726b.length;
    }
}
