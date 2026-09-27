package yt;

import com.ironsource.C4235d4;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<v<K, V>.c> f159959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<K, V> f159960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f159961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile v<K, V>.e f159962f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<FieldDescriptorType> extends v<FieldDescriptorType, Object> {
        public a(int i10) {
            super(i10, null);
        }

        @Override // yt.v
        public void n() {
            if (!m()) {
                for (int i10 = 0; i10 < j(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryH = h(i10);
                    if (((h.b) entryH.getKey()).isRepeated()) {
                        entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : k()) {
                    if (((h.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // yt.v, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((h.b) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f159963a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f159964b = new C1561b();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: yt.v$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1561b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f159963a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) f159964b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Comparable<v<K, V>.c>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f159965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V f159966c;

        public c(v vVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(v<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f159965b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f159965b, entry.getKey()) && b(this.f159966c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f159966c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f159965b;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f159966c;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            v.this.f();
            V v11 = this.f159966c;
            this.f159966c = v10;
            return v11;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f159965b);
            String strValueOf2 = String.valueOf(this.f159966c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(C4235d4.j.f61456b);
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        public c(K k10, V v10) {
            this.f159965b = k10;
            this.f159966c = v10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            v.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = v.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            v.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.size();
        }

        public /* synthetic */ e(v vVar, a aVar) {
            this();
        }
    }

    public /* synthetic */ v(int i10, a aVar) {
        this(i10);
    }

    public static <FieldDescriptorType extends h.b<FieldDescriptorType>> v<FieldDescriptorType, Object> p(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f159959c.isEmpty()) {
            this.f159959c.clear();
        }
        if (this.f159960d.isEmpty()) {
            return;
        }
        this.f159960d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f159960d.containsKey(comparable);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int e(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f159959c.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f159959c.get(i12).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = k10.compareTo(this.f159959c.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f159959c.get(i12).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f159962f == null) {
            this.f159962f = new e(this, null);
        }
        return this.f159962f;
    }

    public final void f() {
        if (this.f159961e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g() {
        f();
        if (!this.f159959c.isEmpty() || (this.f159959c instanceof ArrayList)) {
            return;
        }
        this.f159959c = new ArrayList(this.f159958b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? this.f159959c.get(iE).getValue() : this.f159960d.get(comparable);
    }

    public Map.Entry<K, V> h(int i10) {
        return this.f159959c.get(i10);
    }

    public int j() {
        return this.f159959c.size();
    }

    public Iterable<Map.Entry<K, V>> k() {
        return this.f159960d.isEmpty() ? b.b() : this.f159960d.entrySet();
    }

    public final SortedMap<K, V> l() {
        f();
        if (this.f159960d.isEmpty() && !(this.f159960d instanceof TreeMap)) {
            this.f159960d = new TreeMap();
        }
        return (SortedMap) this.f159960d;
    }

    public boolean m() {
        return this.f159961e;
    }

    public void n() {
        if (this.f159961e) {
            return;
        }
        this.f159960d = this.f159960d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f159960d);
        this.f159961e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        f();
        int iE = e(k10);
        if (iE >= 0) {
            return this.f159959c.get(iE).setValue(v10);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f159958b) {
            return l().put(k10, v10);
        }
        int size = this.f159959c.size();
        int i11 = this.f159958b;
        if (size == i11) {
            v<K, V>.c cVarRemove = this.f159959c.remove(i11 - 1);
            l().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f159959c.add(i10, new c(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return s(iE);
        }
        if (this.f159960d.isEmpty()) {
            return null;
        }
        return this.f159960d.remove(comparable);
    }

    public final V s(int i10) {
        f();
        V value = this.f159959c.remove(i10).getValue();
        if (!this.f159960d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = l().entrySet().iterator();
            this.f159959c.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f159959c.size() + this.f159960d.size();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f159968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f159969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f159970d;

        public d() {
            this.f159968b = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f159970d == null) {
                this.f159970d = v.this.f159960d.entrySet().iterator();
            }
            return this.f159970d;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f159969c = true;
            int i10 = this.f159968b + 1;
            this.f159968b = i10;
            return i10 < v.this.f159959c.size() ? (Map.Entry) v.this.f159959c.get(this.f159968b) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f159968b + 1 < v.this.f159959c.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f159969c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f159969c = false;
            v.this.f();
            if (this.f159968b >= v.this.f159959c.size()) {
                a().remove();
                return;
            }
            v vVar = v.this;
            int i10 = this.f159968b;
            this.f159968b = i10 - 1;
            vVar.s(i10);
        }

        public /* synthetic */ d(v vVar, a aVar) {
            this();
        }
    }

    public v(int i10) {
        this.f159958b = i10;
        this.f159959c = Collections.EMPTY_LIST;
        this.f159960d = Collections.EMPTY_MAP;
    }
}
