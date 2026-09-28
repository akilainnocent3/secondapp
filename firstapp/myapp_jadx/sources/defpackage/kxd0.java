package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class kxd0<K, V> {
    public final m6a0<K, V> a;
    public final Iterator<Map.Entry<K, V>> b;
    public int c;
    public Map.Entry<? extends K, ? extends V> d;
    public Map.Entry<? extends K, ? extends V> e;

    /* JADX WARN: Multi-variable type inference failed */
    public kxd0(m6a0<K, V> m6a0Var, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.a = m6a0Var;
        this.b = it;
        this.c = m6a0Var.c().d;
        b();
    }

    public final void b() {
        this.d = this.e;
        Iterator<Map.Entry<K, V>> it = this.b;
        this.e = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.e != null;
    }

    public final void remove() {
        m6a0<K, V> m6a0Var = this.a;
        if (m6a0Var.c().d != this.c) {
            sx0.a();
            return;
        }
        Map.Entry<? extends K, ? extends V> entry = this.d;
        if (entry == null) {
            fm20.a();
            return;
        }
        m6a0Var.remove(entry.getKey());
        this.d = null;
        Unit unit = Unit.a;
        this.c = m6a0Var.c().d;
    }
}
