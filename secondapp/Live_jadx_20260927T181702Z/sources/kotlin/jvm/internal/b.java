package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends fr.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final boolean[] f102703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102704c;

    public b(@oy.l boolean[] array) {
        m0.p(array, "array");
        this.f102703b = array;
    }

    @Override // fr.c0
    public boolean b() {
        try {
            boolean[] zArr = this.f102703b;
            int i10 = this.f102704c;
            this.f102704c = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102704c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102704c < this.f102703b.length;
    }
}
