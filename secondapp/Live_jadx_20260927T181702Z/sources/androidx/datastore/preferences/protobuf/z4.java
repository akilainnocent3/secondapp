package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class z4 extends AbstractList<String> implements g2, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f10493b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListIterator<String> f10494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10495c;

        public a(final int val$index) {
            this.f10495c = val$index;
            this.f10494b = z4.this.f10493b.listIterator(val$index);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f10494b.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f10494b.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String o10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10494b.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10494b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10494b.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f10494b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<String> f10497b;

        public b() {
            this.f10497b = z4.this.f10493b.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f10497b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10497b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public z4(g2 list) {
        this.f10493b = list;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void P0(int index, u element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void add(byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public boolean addAllByteArray(Collection<byte[]> element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public boolean addAllByteString(Collection<? extends u> element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.f10493b.asByteArrayList());
    }

    @Override // androidx.datastore.preferences.protobuf.r3
    public List<u> asByteStringList() {
        return Collections.unmodifiableList(this.f10493b.asByteStringList());
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int index) {
        return this.f10493b.get(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void d1(g2 other) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public byte[] getByteArray(int index) {
        return this.f10493b.getByteArray(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public u getByteString(int index) {
        return this.f10493b.getByteString(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public Object getRaw(int index) {
        return this.f10493b.getRaw(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public List<?> getUnderlyingElements() {
        return this.f10493b.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int index) {
        return new a(index);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void o0(u element) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public void set(int index, byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10493b.size();
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public g2 getUnmodifiableView() {
        return this;
    }
}
