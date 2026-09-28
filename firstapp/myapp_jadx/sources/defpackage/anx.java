package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class anx {
    public static final anx b = new anx(kpu.l(new a().a));
    public final Map<String, List<String>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public anx(Map<String, ? extends List<String>> map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = this.a.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.d0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anx) && Intrinsics.g(this.a, ((anx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ')';
    }

    public static final class a {
        public final LinkedHashMap a;

        public a(anx anxVar) {
            Map<String, List<String>> map = anxVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), CollectionsKt.C0((Collection) entry.getValue()));
            }
            this.a = linkedHashMap;
        }

        public final void a(String str, String str2) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            LinkedHashMap linkedHashMap = this.a;
            Object objA = linkedHashMap.get(lowerCase);
            if (objA == null) {
                objA = r9i.a(lowerCase, linkedHashMap);
            }
            ((List) objA).add(str2);
        }

        public final void b(String str) {
            String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.a.put(lowerCase, b.l(str));
        }

        public a() {
            this.a = new LinkedHashMap();
        }
    }
}
