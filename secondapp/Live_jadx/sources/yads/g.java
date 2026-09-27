package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g extends ja3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149315b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f149316c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f149315b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = hg0.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA != 2) {
            this.f149315b = 4;
            this.f149316c = a();
            if (this.f149315b != 3) {
                this.f149315b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f149315b = 2;
        Object obj = this.f149316c;
        this.f149316c = null;
        return obj;
    }
}
