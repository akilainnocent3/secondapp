package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class srz extends urz<Iterable<Object>> {
    public final /* synthetic */ urz a;

    public srz(urz urzVar) {
        this.a = urzVar;
    }

    @Override // defpackage.urz
    public final void a(fa50 fa50Var, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.a.a(fa50Var, it.next());
        }
    }
}
