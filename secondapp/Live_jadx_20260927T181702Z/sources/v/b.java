package v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f139803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c<K, V> f139804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f139805d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f139806e = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // v.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f139810e;
        }

        @Override // v.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f139809d;
        }
    }

    /* JADX INFO: renamed from: v.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1458b<K, V> extends e<K, V> {
        public C1458b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // v.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f139809d;
        }

        @Override // v.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f139810e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final K f139807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final V f139808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f139809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c<K, V> f139810e;

        public c(@NonNull K k10, @NonNull V v10) {
            this.f139807b = k10;
            this.f139808c = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f139807b.equals(cVar.f139807b) && this.f139808c.equals(cVar.f139808c);
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.f139807b;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.f139808c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f139807b.hashCode() ^ this.f139808c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f139807b + C4235d4.j.f61456b + this.f139808c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f139811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f139812c = true;

        public d() {
        }

        @Override // v.b.f
        public void a(@NonNull c<K, V> cVar) {
            c<K, V> cVar2 = this.f139811b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f139810e;
                this.f139811b = cVar3;
                this.f139812c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f139812c) {
                this.f139812c = false;
                this.f139811b = b.this.f139803b;
            } else {
                c<K, V> cVar = this.f139811b;
                this.f139811b = cVar != null ? cVar.f139809d : null;
            }
            return this.f139811b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f139812c) {
                return b.this.f139803b != null;
            }
            c<K, V> cVar = this.f139811b;
            return (cVar == null || cVar.f139809d == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f139814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f139815c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f139814b = cVar2;
            this.f139815c = cVar;
        }

        @Override // v.b.f
        public void a(@NonNull c<K, V> cVar) {
            if (this.f139814b == cVar && cVar == this.f139815c) {
                this.f139815c = null;
                this.f139814b = null;
            }
            c<K, V> cVar2 = this.f139814b;
            if (cVar2 == cVar) {
                this.f139814b = b(cVar2);
            }
            if (this.f139815c == cVar) {
                this.f139815c = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f139815c;
            this.f139815c = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f139815c;
            c<K, V> cVar2 = this.f139814b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f139815c != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        public abstract void a(@NonNull c<K, V> cVar);
    }

    @Nullable
    public Map.Entry<K, V> d() {
        return this.f139803b;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C1458b c1458b = new C1458b(this.f139804c, this.f139803b);
        this.f139805d.put(c1458b, Boolean.FALSE);
        return c1458b;
    }

    @Nullable
    public c<K, V> e(K k10) {
        c<K, V> cVar = this.f139803b;
        while (cVar != null && !cVar.f139807b.equals(k10)) {
            cVar = cVar.f139809d;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @NonNull
    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f139805d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @Nullable
    public Map.Entry<K, V> g() {
        return this.f139804c;
    }

    public c<K, V> h(@NonNull K k10, @NonNull V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f139806e++;
        c<K, V> cVar2 = this.f139804c;
        if (cVar2 == null) {
            this.f139803b = cVar;
            this.f139804c = cVar;
            return cVar;
        }
        cVar2.f139809d = cVar;
        cVar.f139810e = cVar2;
        this.f139804c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public V i(@NonNull K k10, @NonNull V v10) {
        c<K, V> cVarE = e(k10);
        if (cVarE != null) {
            return cVarE.f139808c;
        }
        h(k10, v10);
        return null;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f139803b, this.f139804c);
        this.f139805d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(@NonNull K k10) {
        c<K, V> cVarE = e(k10);
        if (cVarE == null) {
            return null;
        }
        this.f139806e--;
        if (!this.f139805d.isEmpty()) {
            Iterator<f<K, V>> it = this.f139805d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarE);
            }
        }
        c<K, V> cVar = cVarE.f139810e;
        if (cVar != null) {
            cVar.f139809d = cVarE.f139809d;
        } else {
            this.f139803b = cVarE.f139809d;
        }
        c<K, V> cVar2 = cVarE.f139809d;
        if (cVar2 != null) {
            cVar2.f139810e = cVar;
        } else {
            this.f139804c = cVar;
        }
        cVarE.f139809d = null;
        cVarE.f139810e = null;
        return cVarE.f139808c;
    }

    public int size() {
        return this.f139806e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4235d4.j.f61460d);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }
}
