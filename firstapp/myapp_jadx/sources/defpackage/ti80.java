package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ti80 extends j3<Object> {
    public final Iterator<Object> d;
    public final /* synthetic */ ui80 e;

    public ti80(ui80 ui80Var) {
        this.e = ui80Var;
        this.d = ui80Var.a.iterator();
    }

    @Override // defpackage.j3
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.d;
            if (!it.hasNext()) {
                this.b = j3.a.c;
                return null;
            }
            next = it.next();
        } while (!this.e.b.contains(next));
        return next;
    }
}
