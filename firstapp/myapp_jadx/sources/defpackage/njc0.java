package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class njc0 implements ljc0 {
    public final wwd0 a = xwd0.a(m2g.a);
    public final wwd0 b = xwd0.a(new d880(0, 0));

    @Override // defpackage.ljc0
    public final void a(et7 et7Var) {
        kzh.d(new g1i(this.a, new mjc0(this, null)), et7Var);
    }

    @Override // defpackage.ljc0
    public final int b() {
        return ((List) this.a.getValue()).size();
    }

    @Override // defpackage.ljc0
    public final boolean c(kjc0 kjc0Var) {
        wwd0 wwd0Var;
        Object value;
        Collection collectionJ0;
        boolean z = false;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            collectionJ0 = (List) value;
            if (collectionJ0 != null && collectionJ0.isEmpty()) {
                collectionJ0 = CollectionsKt.j0(collectionJ0, kjc0Var);
                break;
            }
            Iterator it = collectionJ0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    collectionJ0 = CollectionsKt.j0(collectionJ0, kjc0Var);
                    break;
                }
                if (((kjc0) it.next()).c.a.equals(kjc0Var.c.a)) {
                    z = true;
                    break;
                }
            }
        } while (!wwd0Var.g(value, collectionJ0));
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ljc0
    public final void d(String str, String str2, List list) {
        wwd0 wwd0Var;
        Object value;
        Collection collectionG0;
        Object next;
        Pair pair;
        Object next2;
        Object next3;
        list.getClass();
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            collectionG0 = (List) value;
            Iterator it = collectionG0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                kjc0 kjc0Var = (kjc0) next;
                if (Intrinsics.g(kjc0Var.b.a, str) && kjc0Var.c.a.equals(str2)) {
                    break;
                }
            }
            kjc0 kjc0Var2 = (kjc0) next;
            if (kjc0Var2 != null) {
                collectionG0 = CollectionsKt.g0(collectionG0, kjc0Var2);
            } else {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        pair = null;
                        break;
                    }
                    icc0 icc0Var = (icc0) it2.next();
                    Iterator<T> it3 = icc0Var.d.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!Intrinsics.g(((sdc0) next3).a, str));
                    sdc0 sdc0Var = (sdc0) next3;
                    pair = sdc0Var != null ? new Pair(icc0Var, sdc0Var) : null;
                } while (pair == null);
                if (pair != null) {
                    icc0 icc0Var2 = (icc0) pair.a;
                    sdc0 sdc0Var2 = (sdc0) pair.b;
                    Iterator<T> it4 = sdc0Var2.i.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                    } while (!((gfc0) next2).a.equals(str2));
                    gfc0 gfc0Var = (gfc0) next2;
                    Collection collectionJ0 = gfc0Var != null ? CollectionsKt.j0(collectionG0, new kjc0(icc0Var2, sdc0Var2, gfc0Var)) : null;
                    if (collectionJ0 != null) {
                        collectionG0 = collectionJ0;
                    }
                }
            }
        } while (!wwd0Var.g(value, collectionG0));
    }

    @Override // defpackage.ljc0
    public final void e() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, m2g.a));
    }

    @Override // defpackage.ljc0
    public final v340 f() {
        return e1i.b(this.a);
    }

    @Override // defpackage.ljc0
    public final void g(String str) {
        wwd0 wwd0Var;
        Object value;
        Collection collectionG0;
        Object next;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            collectionG0 = (List) value;
            Iterator it = collectionG0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((kjc0) next).c.a.equals(str));
            kjc0 kjc0Var = (kjc0) next;
            if (kjc0Var != null) {
                collectionG0 = CollectionsKt.g0(collectionG0, kjc0Var);
            }
        } while (!wwd0Var.g(value, collectionG0));
    }

    @Override // defpackage.ljc0
    public final v340 h() {
        return e1i.b(this.b);
    }

    @Override // defpackage.ljc0
    public final boolean i() {
        return ((List) this.a.getValue()).isEmpty();
    }
}
