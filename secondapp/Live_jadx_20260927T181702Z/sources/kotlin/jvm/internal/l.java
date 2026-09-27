package kotlin.jvm.internal;

import fr.a2;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final short[] f102739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102740c;

    public l(@oy.l short[] array) {
        m0.p(array, "array");
        this.f102739b = array;
    }

    @Override // fr.a2
    public short b() {
        try {
            short[] sArr = this.f102739b;
            int i10 = this.f102740c;
            this.f102740c = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f102740c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102740c < this.f102739b.length;
    }
}
