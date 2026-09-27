package yt;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class x extends AbstractList<String> implements RandomAccess, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f159974b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListIterator<String> f159975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f159976c;

        public a(int i10) {
            this.f159976c = i10;
            this.f159975b = x.this.f159974b.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f159975b.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f159975b.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f159975b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f159975b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f159975b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f159975b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<String> f159978b;

        public b() {
            this.f159978b = x.this.f159974b.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f159978b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159978b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x(o oVar) {
        this.f159974b = oVar;
    }

    @Override // yt.o
    public void O(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f159974b.get(i10);
    }

    @Override // yt.o
    public d getByteString(int i10) {
        return this.f159974b.getByteString(i10);
    }

    @Override // yt.o
    public List<?> getUnderlyingElements() {
        return this.f159974b.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f159974b.size();
    }

    @Override // yt.o
    public o getUnmodifiableView() {
        return this;
    }
}
