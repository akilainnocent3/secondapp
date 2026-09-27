package ms;

import fr.f1;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f115144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115145e;

    public k(int i10, int i11, int i12) {
        this.f115142b = i12;
        this.f115143c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f115144d = z10;
        this.f115145e = z10 ? i10 : i11;
    }

    public final int a() {
        return this.f115142b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f115144d;
    }

    @Override // fr.f1
    public int nextInt() {
        int i10 = this.f115145e;
        if (i10 != this.f115143c) {
            this.f115145e = this.f115142b + i10;
            return i10;
        }
        if (!this.f115144d) {
            throw new NoSuchElementException();
        }
        this.f115144d = false;
        return i10;
    }
}
