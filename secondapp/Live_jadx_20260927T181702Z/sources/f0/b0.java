package f0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,51:1\n45#2,5:52\n*S KotlinDebug\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n*L\n44#1:52,5\n*E\n"})
public abstract class b0<T> implements Iterator<T>, es.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81830d;

    public b0(int i10) {
        this.f81828b = i10;
    }

    public abstract T a(int i10);

    public abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81829c < this.f81828b;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tA = a(this.f81829c);
        this.f81829c++;
        this.f81830d = true;
        return tA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f81830d) {
            g0.f.d("Call next() before removing an element.");
        }
        int i10 = this.f81829c - 1;
        this.f81829c = i10;
        b(i10);
        this.f81828b--;
        this.f81830d = false;
    }
}
