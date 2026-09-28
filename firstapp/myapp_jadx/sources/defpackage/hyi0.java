package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class hyi0<K, V> extends h5<K, V, b<K>> {
    public static final a e = new a();
    public final boolean d;

    public class a extends ThreadLocal<b<?>> {
        @Override // java.lang.ThreadLocal
        public final b<?> initialValue() {
            return new b<>();
        }
    }

    public static final class b<K> {
        public K a;
        public int b;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return ((b) obj).a == this.a;
            }
            return ((h5.c) obj).get() == this.a;
        }

        public final int hashCode() {
            return this.b;
        }
    }

    public static class c<K, V> extends hyi0<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        public final b b(Object obj) {
            b<?> bVar = this.d ? hyi0.e.get() : new b<>();
            bVar.a = obj;
            bVar.b = System.identityHashCode(obj);
            return bVar;
        }

        public final void c(b bVar) {
            bVar.a = null;
            bVar.b = 0;
        }

        @Override // defpackage.h5, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            h5.a();
            return super.iterator();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public hyi0() {
        boolean z;
        super(new ConcurrentHashMap());
        ClassLoader classLoader = b.class.getClassLoader();
        if (classLoader != null) {
            z = false;
            try {
                if (classLoader == ClassLoader.getSystemClassLoader() || classLoader == ClassLoader.getSystemClassLoader().getParent()) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
        } else {
            z = true;
        }
        this.d = z;
    }
}
