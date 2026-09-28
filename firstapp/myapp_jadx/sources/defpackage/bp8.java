package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class bp8<V> {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Object e = new Object();
    public final Set<V> f = Collections.newSetFromMap(new IdentityHashMap());
    public final Function<oso, V> g;

    public bp8(Function<oso, V> function) {
        this.g = function;
    }

    public final Object a(ej1 ej1Var) {
        V vApply = this.g.apply(ej1Var);
        synchronized (this.e) {
            this.f.add(vApply);
        }
        return vApply;
    }

    public final V b(final String str, final String str2, String str3, final m21 m21Var) {
        if (str2 != null && str3 != null) {
            return (V) ((Map) ((Map) this.d.computeIfAbsent(str, new mo8())).computeIfAbsent(str2, new oo8())).computeIfAbsent(str3, new Function() { // from class: qo8
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    int i = oso.a;
                    m21 m21Var2 = m21Var;
                    if (m21Var2 == null) {
                        m21Var2 = vw0.d;
                    }
                    return this.a.a(oso.a(str, str2, str4, m21Var2));
                }
            });
        }
        if (str2 != null) {
            return (V) ((Map) this.b.computeIfAbsent(str, new ro8())).computeIfAbsent(str2, new Function() { // from class: so8
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    int i = oso.a;
                    m21 m21Var2 = m21Var;
                    if (m21Var2 == null) {
                        m21Var2 = vw0.d;
                    }
                    return this.a.a(oso.a(str, str4, null, m21Var2));
                }
            });
        }
        if (str3 != null) {
            return (V) ((Map) this.c.computeIfAbsent(str, new to8())).computeIfAbsent(str3, new Function() { // from class: uo8
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str4 = (String) obj;
                    int i = oso.a;
                    m21 m21Var2 = m21Var;
                    if (m21Var2 == null) {
                        m21Var2 = vw0.d;
                    }
                    return this.a.a(oso.a(str, null, str4, m21Var2));
                }
            });
        }
        return (V) this.a.computeIfAbsent(str, new Function() { // from class: vo8
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str4 = (String) obj;
                int i = oso.a;
                m21 m21Var2 = m21Var;
                if (m21Var2 == null) {
                    m21Var2 = vw0.d;
                }
                return this.a.a(oso.a(str4, null, null, m21Var2));
            }
        });
    }
}
