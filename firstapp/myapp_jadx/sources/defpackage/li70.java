package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class li70 {
    public final rdd0 a;
    public final wwd0 b;
    public final wwd0 c;
    public final wwd0 d;

    public li70(rdd0 rdd0Var) {
        this.a = rdd0Var;
        m2g m2gVar = m2g.a;
        this.b = xwd0.a(m2gVar);
        this.c = xwd0.a(new d880(0, 0));
        this.d = xwd0.a(m2gVar);
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, m2g.a));
    }

    public final void b(long j) {
        wwd0 wwd0Var;
        Object value;
        ArrayList arrayList;
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!((bi70) obj).c.a(j)) {
                    arrayList.add(obj);
                }
            }
        } while (!wwd0Var.g(value, arrayList));
    }

    public final void c(String str) {
        wwd0 wwd0Var;
        Object value;
        Collection collectionG0;
        Object next;
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
            collectionG0 = (List) value;
            Iterator it = collectionG0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((bi70) next).f.a.equals(str));
            bi70 bi70Var = (bi70) next;
            if (bi70Var != null) {
                collectionG0 = CollectionsKt.g0(collectionG0, bi70Var);
            }
        } while (!wwd0Var.g(value, collectionG0));
    }

    public final int d() {
        return ((List) this.b.getValue()).size();
    }
}
