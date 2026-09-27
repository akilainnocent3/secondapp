package wb;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import wb.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h<K extends n, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f142645a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f142646b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f142647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f142648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f142649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f142650d;

        public a() {
            this(null);
        }

        public void a(V v10) {
            if (this.f142648b == null) {
                this.f142648b = new ArrayList();
            }
            this.f142648b.add(v10);
        }

        @Nullable
        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f142648b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f142648b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k10) {
            this.f142650d = this;
            this.f142649c = this;
            this.f142647a = k10;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f142650d;
        aVar2.f142649c = aVar.f142649c;
        aVar.f142649c.f142650d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f142649c.f142650d = aVar;
        aVar.f142650d.f142649c = aVar;
    }

    @Nullable
    public V a(K k10) {
        a<K, V> aVar = this.f142646b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f142646b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f142645a;
        aVar.f142650d = aVar2;
        aVar.f142649c = aVar2.f142649c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f142645a;
        aVar.f142650d = aVar2.f142650d;
        aVar.f142649c = aVar2;
        g(aVar);
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f142646b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f142646b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    @Nullable
    public V f() {
        for (a aVar = this.f142645a.f142650d; !aVar.equals(this.f142645a); aVar = aVar.f142650d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f142646b.remove(aVar.f142647a);
            ((n) aVar.f142647a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f142645a.f142649c;
        boolean z10 = false;
        while (!aVar.equals(this.f142645a)) {
            sb2.append(fw.b.f85382i);
            sb2.append(aVar.f142647a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f142649c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
