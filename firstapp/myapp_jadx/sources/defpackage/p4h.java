package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p4h {
    public static final p4h b = new p4h(h58.b(new a().a));
    public final Map<b<?>, Object> a;

    public static final class b<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }
    }

    public p4h(Map<b<?>, ? extends Object> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4h) && Intrinsics.g(this.a, ((p4h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.a + ')';
    }

    public static final class a {
        public final LinkedHashMap a;

        public a(p4h p4hVar) {
            this.a = kpu.m(p4hVar.a);
        }

        public final void a(b bVar, Object obj) {
            LinkedHashMap linkedHashMap = this.a;
            if (obj != null) {
                linkedHashMap.put(bVar, obj);
            } else {
                linkedHashMap.remove(bVar);
            }
        }

        public a() {
            this.a = new LinkedHashMap();
        }
    }
}
