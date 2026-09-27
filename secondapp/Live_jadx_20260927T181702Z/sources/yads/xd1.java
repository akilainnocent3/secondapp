package yads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xd1 extends ja3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f157793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157794c;

    public xd1(Object obj) {
        this.f157794c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f157793b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f157793b) {
            throw new NoSuchElementException();
        }
        this.f157793b = true;
        return this.f157794c;
    }
}
