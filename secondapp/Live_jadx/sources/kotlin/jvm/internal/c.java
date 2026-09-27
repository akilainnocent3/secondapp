package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends fr.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final byte[] f102713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102714c;

    public c(@oy.l byte[] array) {
        m0.p(array, "array");
        this.f102713b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102714c < this.f102713b.length;
    }

    @Override // fr.d0
    public byte nextByte() {
        try {
            byte[] bArr = this.f102713b;
            int i10 = this.f102714c;
            this.f102714c = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102714c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
