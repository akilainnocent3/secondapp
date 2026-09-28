package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class qr60<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> a;
    public c<K, V> b;
    public final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    public int d = 0;

    public static class a<K, V> extends e<K, V> {
        @Override // qr60.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // qr60.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    public static class b<K, V> extends e<K, V> {
        @Override // qr60.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // qr60.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {
        public final K a;
        public final V b;
        public c<K, V> c;
        public c<K, V> d;

        public c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> a;
        public boolean b = true;

        public d() {
        }

        @Override // qr60.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.a = cVar3;
                this.b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b) {
                return qr60.this.a != null;
            }
            c<K, V> cVar = this.a;
            return (cVar == null || cVar.c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.b) {
                this.b = false;
                c<K, V> cVar = qr60.this.a;
                this.a = cVar;
                return cVar;
            }
            c<K, V> cVar2 = this.a;
            c<K, V> cVar3 = cVar2 != null ? cVar2.c : null;
            this.a = cVar3;
            return cVar3;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> a;
        public c<K, V> b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        @Override // qr60.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            c<K, V> cVarC = null;
            if (cVar2 == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
                cVar2 = null;
            }
            c<K, V> cVarB = cVar2;
            if (cVar2 == cVar) {
                cVarB = b(cVar2);
                this.a = cVarB;
            }
            c<K, V> cVar3 = this.b;
            if (cVar3 == cVar) {
                if (cVar3 != cVarB && cVarB != null) {
                    cVarC = c(cVar3);
                }
                this.b = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            this.b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public V b(K k) {
        c<K, V> cVarA = a(k);
        if (cVarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.d;
        c<K, V> cVar2 = cVarA.c;
        if (cVar != null) {
            cVar.c = cVar2;
        } else {
            this.a = cVar2;
        }
        c<K, V> cVar3 = cVarA.c;
        if (cVar3 != null) {
            cVar3.d = cVar;
        } else {
            this.b = cVar;
        }
        cVarA.c = null;
        cVarA.d = null;
        return cVarA.b;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qr60)) {
            return false;
        }
        qr60 qr60Var = (qr60) obj;
        if (this.d != qr60Var.d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = qr60Var.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
