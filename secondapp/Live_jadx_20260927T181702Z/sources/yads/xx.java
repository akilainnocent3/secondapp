package yads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xx implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f158036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f158038d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy f158039e;

    public xx(cy cyVar) {
        this.f158039e = cyVar;
        this.f158036b = cyVar.f147943f;
        this.f158037c = cyVar.b();
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f158037c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f158039e.f147943f != this.f158036b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f158037c;
        this.f158038d = i10;
        Object objA = a(i10);
        cy cyVar = this.f158039e;
        int i11 = this.f158037c + 1;
        if (i11 >= cyVar.f147944g) {
            i11 = -1;
        }
        this.f158037c = i11;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        cy cyVar = this.f158039e;
        int i10 = cyVar.f147943f;
        int i11 = this.f158036b;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f158038d;
        if (!(i12 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f158036b = i11 + 32;
        cyVar.remove(cyVar.b(i12));
        cy cyVar2 = this.f158039e;
        int i13 = this.f158037c;
        cyVar2.getClass();
        this.f158037c = i13 - 1;
        this.f158038d = -1;
    }
}
