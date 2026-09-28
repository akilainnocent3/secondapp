package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class quh<T> {
    public int a;
    public int b;
    public final gx0<msg0<T>> c = new gx0<>();
    public final tsw d = new tsw();
    public jxs e;
    public boolean f;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(xmz<T> xmzVar) {
        xmzVar.getClass();
        this.f = true;
        boolean z = xmzVar instanceof xmz.b;
        int i = 0;
        gx0<msg0<T>> gx0Var = this.c;
        tsw tswVar = this.d;
        if (z) {
            xmz.b bVar = (xmz.b) xmzVar;
            jxs jxsVar = bVar.e;
            int i2 = bVar.c;
            int i3 = bVar.d;
            List<msg0<T>> list = bVar.b;
            tswVar.b(jxsVar);
            this.e = bVar.f;
            int iOrdinal = bVar.a.ordinal();
            if (iOrdinal == 0) {
                gx0Var.clear();
                this.b = i3;
                this.a = i2;
                gx0Var.addAll(list);
                return;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    return;
                }
                this.b = i3;
                gx0Var.addAll(list);
                return;
            }
            this.a = i2;
            Iterator<Integer> it = f.j(list.size() - 1, 0).iterator();
            while (((mwo) it).c) {
                gx0Var.addFirst(list.get(((zvo) it).nextInt()));
            }
            return;
        }
        if (!(xmzVar instanceof xmz.a)) {
            if (xmzVar instanceof xmz.c) {
                xmz.c cVar = (xmz.c) xmzVar;
                tswVar.b(cVar.a);
                this.e = cVar.b;
                return;
            } else {
                if (xmzVar instanceof xmz.d) {
                    gx0Var.clear();
                    this.b = 0;
                    this.a = 0;
                    gx0Var.addLast(new msg0<>(0, ((xmz.d) xmzVar).a));
                    return;
                }
                return;
            }
        }
        xmz.a aVar = (xmz.a) xmzVar;
        kxs kxsVar = aVar.a;
        int i4 = aVar.d;
        tswVar.c(kxsVar, hxs.c.c);
        int iOrdinal2 = kxsVar.ordinal();
        if (iOrdinal2 == 1) {
            this.a = i4;
            int iC = aVar.c();
            while (i < iC) {
                gx0Var.removeFirst();
                i++;
            }
            return;
        }
        if (iOrdinal2 != 2) {
            hb5.a("Page drop type must be prepend or append");
            return;
        }
        this.b = i4;
        int iC2 = aVar.c();
        while (i < iC2) {
            gx0Var.removeLast();
            i++;
        }
    }

    public final List<xmz<T>> b() {
        if (!this.f) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        jxs jxsVarD = this.d.d();
        gx0<msg0<T>> gx0Var = this.c;
        if (gx0Var.isEmpty()) {
            arrayList.add(new xmz.c(jxsVarD, this.e));
            return arrayList;
        }
        xmz.b<Object> bVar = xmz.b.g;
        arrayList.add(xmz.b.a.a(CollectionsKt.A0(gx0Var), this.a, this.b, jxsVarD, this.e));
        return arrayList;
    }
}
