package com.bytedance.adsdk.tq;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
abstract class weu<K, V> {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    weu<K, V>.tq f32357tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class hww<T> implements Iterator<T> {
        final int hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        int f32359sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        int f32360tq;
        boolean vy = false;

        public hww(int i10) {
            this.hww = i10;
            this.f32360tq = weu.this.hww();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32359sd < this.f32360tq;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) weu.this.hww(this.f32359sd, this.hww);
            this.f32359sd++;
            this.vy = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.vy) {
                throw new IllegalStateException();
            }
            int i10 = this.f32359sd - 1;
            this.f32359sd = i10;
            this.f32360tq--;
            this.vy = false;
            weu.this.hww(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class tq implements Set<K> {
        public tq() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            weu.this.sd();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return weu.this.hww(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return weu.hww(weu.this.tq(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return weu.hww(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iHww = weu.this.hww() - 1; iHww >= 0; iHww--) {
                Object objHww = weu.this.hww(iHww, 0);
                iHashCode += objHww == null ? 0 : objHww.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return weu.this.hww() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new hww(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iHww = weu.this.hww(obj);
            if (iHww < 0) {
                return false;
            }
            weu.this.hww(iHww);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return weu.tq(weu.this.tq(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return weu.sd(weu.this.tq(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return weu.this.hww();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return weu.this.tq(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) weu.this.hww(tArr, 0);
        }
    }

    public static <K, V> boolean hww(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean sd(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean tq(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public abstract int hww();

    public abstract int hww(Object obj);

    public abstract Object hww(int i10, int i11);

    public abstract void hww(int i10);

    public abstract void sd();

    public abstract Map<K, V> tq();

    public Set<K> vy() {
        if (this.f32357tq == null) {
            this.f32357tq = new tq();
        }
        return this.f32357tq;
    }

    public <T> T[] hww(T[] tArr, int i10) {
        int iHww = hww();
        if (tArr.length < iHww) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iHww));
        }
        for (int i11 = 0; i11 < iHww; i11++) {
            tArr[i11] = hww(i11, i10);
        }
        if (tArr.length > iHww) {
            tArr[iHww] = null;
        }
        return tArr;
    }

    public Object[] tq(int i10) {
        int iHww = hww();
        Object[] objArr = new Object[iHww];
        for (int i11 = 0; i11 < iHww; i11++) {
            objArr[i11] = hww(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean hww(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
