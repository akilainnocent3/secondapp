package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e4<K, V> implements gmw<K, V> {
    public transient Set<K> a;
    public transient Collection<V> b;
    public transient Map<K, Collection<V>> c;

    public class a extends AbstractCollection<V> {
        public final /* synthetic */ x3 a;

        public a(x3 x3Var) {
            this.a = x3Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.a.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<Collection<V>> it = this.a.a().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new w3();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.a.e;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gmw) {
            return a().equals(((gmw) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
