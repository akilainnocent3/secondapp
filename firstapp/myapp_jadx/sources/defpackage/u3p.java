package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class u3p extends j3<Object> {
    public final /* synthetic */ Iterator d;
    public final /* synthetic */ om20 e;

    public u3p(Iterator it, om20 om20Var) {
        this.d = it;
        this.e = om20Var;
    }

    @Override // defpackage.j3
    public final Object a() {
        Object next;
        do {
            Iterator it = this.d;
            if (!it.hasNext()) {
                this.b = j3.a.c;
                return null;
            }
            next = it.next();
        } while (!this.e.apply(next));
        return next;
    }
}
