package androidx.datastore.preferences.protobuf;

import com.ironsource.C4235d4;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class z3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10474h = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<z3<K, V>.d> f10475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<K, V> f10476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile z3<K, V>.f f10478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<K, V> f10479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile z3<K, V>.c f10480g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a<FieldDescriptorType> extends z3<FieldDescriptorType, Object> {
        public a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.z3, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object key, Object value) {
            return super.put((Comparable) key, value);
        }

        @Override // androidx.datastore.preferences.protobuf.z3
        public void s() {
            if (!r()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i10);
                    if (((f1.c) entryK.getKey()).isRepeated()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((f1.c) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends z3<K, V>.f {
        public c() {
            super(z3.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.z3.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(z3.this, null);
        }

        public /* synthetic */ c(z3 z3Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Map.Entry<K, V>, Comparable<z3<K, V>.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f10485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V f10486c;

        public d(final z3 this$0, Map.Entry<K, V> copy) {
            this(copy.getKey(), copy.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(z3<K, V>.d other) {
            return getKey().compareTo(other.getKey());
        }

        public final boolean b(Object o10, Object o11) {
            if (o10 == null) {
                return o11 == null;
            }
            return o10.equals(o11);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f10485b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object o10) {
            if (o10 == this) {
                return true;
            }
            if (!(o10 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o10;
            return b(this.f10485b, entry.getKey()) && b(this.f10486c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10486c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f10485b;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f10486c;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            z3.this.g();
            V v10 = this.f10486c;
            this.f10486c = newValue;
            return v10;
        }

        public String toString() {
            return this.f10485b + C4235d4.j.f61456b + this.f10486c;
        }

        public d(K key, V value) {
            this.f10485b = key;
            this.f10486c = value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            z3.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            Object obj = z3.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj != value) {
                return obj != null && obj.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(z3.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o10) {
            Map.Entry entry = (Map.Entry) o10;
            if (!contains(entry)) {
                return false;
            }
            z3.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z3.this.size();
        }

        public /* synthetic */ f(z3 z3Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ z3(a aVar) {
        this();
    }

    public static <FieldDescriptorType extends f1.c<FieldDescriptorType>> z3<FieldDescriptorType, Object> t() {
        return new a();
    }

    public static <K extends Comparable<K>, V> z3<K, V> u() {
        return new z3<>();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f10475b.isEmpty()) {
            this.f10475b.clear();
        }
        if (this.f10476c.isEmpty()) {
            return;
        }
        this.f10476c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object o10) {
        Comparable comparable = (Comparable) o10;
        return f(comparable) >= 0 || this.f10476c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f10478e == null) {
            this.f10478e = new f(this, null);
        }
        return this.f10478e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof z3)) {
            return super.equals(o10);
        }
        z3 z3Var = (z3) o10;
        int size = size();
        if (size != z3Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != z3Var.l()) {
            return entrySet().equals(z3Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(z3Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f10476c.equals(z3Var.f10476c);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int f(K key) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f10475b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = key.compareTo(this.f10475b.get(i12).getKey());
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
            int iCompareTo2 = key.compareTo(this.f10475b.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = key.compareTo(this.f10475b.get(i12).getKey());
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

    public final void g() {
        if (this.f10477d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object o10) {
        Comparable comparable = (Comparable) o10;
        int iF = f(comparable);
        return iF >= 0 ? this.f10475b.get(iF).getValue() : this.f10476c.get(comparable);
    }

    public Set<Map.Entry<K, V>> h() {
        if (this.f10480g == null) {
            this.f10480g = new c(this, null);
        }
        return this.f10480g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += this.f10475b.get(i10).hashCode();
        }
        return m() > 0 ? iHashCode + this.f10476c.hashCode() : iHashCode;
    }

    public final void j() {
        g();
        if (!this.f10475b.isEmpty() || (this.f10475b instanceof ArrayList)) {
            return;
        }
        this.f10475b = new ArrayList(16);
    }

    public Map.Entry<K, V> k(int index) {
        return this.f10475b.get(index);
    }

    public int l() {
        return this.f10475b.size();
    }

    public int m() {
        return this.f10476c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f10476c.isEmpty() ? Collections.EMPTY_SET : this.f10476c.entrySet();
    }

    public final SortedMap<K, V> p() {
        g();
        if (this.f10476c.isEmpty() && !(this.f10476c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10476c = treeMap;
            this.f10479f = treeMap.descendingMap();
        }
        return (SortedMap) this.f10476c;
    }

    public boolean r() {
        return this.f10477d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object o10) {
        g();
        Comparable comparable = (Comparable) o10;
        int iF = f(comparable);
        if (iF >= 0) {
            return w(iF);
        }
        if (this.f10476c.isEmpty()) {
            return null;
        }
        return this.f10476c.remove(comparable);
    }

    public void s() {
        if (this.f10477d) {
            return;
        }
        this.f10476c = this.f10476c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10476c);
        this.f10479f = this.f10479f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10479f);
        this.f10477d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f10475b.size() + this.f10476c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f10475b.get(iF).setValue(v10);
        }
        j();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return p().put(k10, v10);
        }
        if (this.f10475b.size() == 16) {
            z3<K, V>.d dVarRemove = this.f10475b.remove(15);
            p().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f10475b.add(i10, new d(k10, v10));
        return null;
    }

    public final V w(int index) {
        g();
        V value = this.f10475b.remove(index).getValue();
        if (!this.f10476c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.f10475b.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f10482c;

        public b() {
            this.f10481b = z3.this.f10475b.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f10482c == null) {
                this.f10482c = z3.this.f10479f.entrySet().iterator();
            }
            return this.f10482c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = z3.this.f10475b;
            int i10 = this.f10481b - 1;
            this.f10481b = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f10481b;
            return (i10 > 0 && i10 <= z3.this.f10475b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(z3 z3Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f10490d;

        public e() {
            this.f10488b = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f10490d == null) {
                this.f10490d = z3.this.f10476c.entrySet().iterator();
            }
            return this.f10490d;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f10489c = true;
            int i10 = this.f10488b + 1;
            this.f10488b = i10;
            return i10 < z3.this.f10475b.size() ? (Map.Entry) z3.this.f10475b.get(this.f10488b) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10488b + 1 < z3.this.f10475b.size() || (!z3.this.f10476c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10489c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f10489c = false;
            z3.this.g();
            if (this.f10488b >= z3.this.f10475b.size()) {
                a().remove();
                return;
            }
            z3 z3Var = z3.this;
            int i10 = this.f10488b;
            this.f10488b = i10 - 1;
            z3Var.w(i10);
        }

        public /* synthetic */ e(z3 z3Var, a aVar) {
            this();
        }
    }

    public z3() {
        this.f10475b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f10476c = map;
        this.f10479f = map;
    }
}
