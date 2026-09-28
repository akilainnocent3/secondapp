package defpackage;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class v7k {
    public final Object a;
    public final Object b;

    public v7k() {
        this.a = xwd0.a(null);
        this.b = xwd0.a(Boolean.TRUE);
    }

    public static yzh a(lyh lyhVar) {
        return new yzh(new q7k(lyhVar), new r7k(3, null));
    }

    public yzh b() {
        i6u i6uVar = (i6u) this.a;
        Collection collectionK = b.k(a(i6uVar.k.a()), a(i6uVar.i.a()));
        if (((mgb0) this.b).isLogin()) {
            collectionK = CollectionsKt.j0(collectionK, a(i6uVar.h.a()));
        }
        return bm50.a(new n1i(new u7k((lyh[]) CollectionsKt.A0(collectionK).toArray(new lyh[0])), new s7k(i6uVar.f.a(), this), new t7k(3, null)));
    }

    public v7k(i6u i6uVar, mgb0 mgb0Var) {
        i6uVar.getClass();
        mgb0Var.getClass();
        this.a = i6uVar;
        this.b = mgb0Var;
    }
}
